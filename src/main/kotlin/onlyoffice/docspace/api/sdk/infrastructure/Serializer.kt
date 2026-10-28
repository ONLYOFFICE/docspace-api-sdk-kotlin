package onlyoffice.docspace.api.sdk.infrastructure

import com.squareup.moshi.Moshi
import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Types
import java.lang.reflect.Type
import java.time.OffsetDateTime
import java.time.ZoneOffset
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

object Serializer {
    @JvmStatic
    val moshiBuilder: Moshi.Builder = Moshi.Builder()
        .add(ValueEnumJsonAdapterFactory())
        .add(ApiDateTimeAdapterFactory())
        .add(OffsetDateTimeAdapter())
        .add(LocalDateTimeAdapter())
        .add(LocalDateAdapter())
        .add(UUIDAdapter())
        .add(ByteArrayAdapter())
        .add(URIAdapter())
        .add(KotlinJsonAdapterFactory())
        .add(BigDecimalAdapter())
        .add(BigIntegerAdapter())

    @JvmStatic
    val moshi: Moshi by lazy {
        moshiBuilder.build()
    }
}

/**
 * Moshi adapter factory for the generated value-backed enums.
 *
 * The API represents these enums by their underlying value (e.g. the integer `1`), while
 * Moshi's default [com.squareup.moshi.adapters.EnumJsonAdapter] only matches the `@Json`
 * string name and therefore fails when the server sends the value as a JSON number.
 *
 * This factory targets every enum that exposes a `value` property (all generated enums do)
 * and resolves the constant by that value, accepting both numeric and string JSON tokens on
 * input and emitting the value in its natural JSON type on output.
 */
class ValueEnumJsonAdapterFactory : JsonAdapter.Factory {
    override fun create(type: Type, annotations: Set<Annotation>, moshi: Moshi): JsonAdapter<*>? {
        val rawType = Types.getRawType(type)
        if (!rawType.isEnum) {
            return null
        }
        val valueGetter = try {
            rawType.getMethod("getValue")
        } catch (e: NoSuchMethodException) {
            return null
        }
        val constants = rawType.enumConstants ?: return null

        val constantByKey = LinkedHashMap<String, Any>()
        val valueByConstant = LinkedHashMap<Any, Any?>()
        var numeric = true
        for (constant in constants) {
            val value = valueGetter.invoke(constant)
            if (value !is Number) {
                numeric = false
            }
            constantByKey[normalizeKey(value)] = constant
            valueByConstant[constant] = value
        }
        val isNumeric = numeric

        return object : JsonAdapter<Any>() {
            override fun fromJson(reader: JsonReader): Any? {
                if (reader.peek() == JsonReader.Token.NULL) {
                    return reader.nextNull()
                }
                val raw = reader.readJsonValue() ?: return null
                val key = normalizeKey(raw)
                return constantByKey[key]
                    ?: throw JsonDataException(
                        "Unknown value '$raw' for enum ${rawType.name} at ${reader.path}"
                    )
            }

            override fun toJson(writer: JsonWriter, value: Any?) {
                if (value == null) {
                    writer.nullValue()
                    return
                }
                val raw = valueByConstant[value]
                if (isNumeric && raw is Number) {
                    writer.value(raw.toLong())
                } else {
                    writer.value(raw?.toString())
                }
            }
        }
    }

    private fun normalizeKey(value: Any?): String = when (value) {
        is Number -> {
            val asDouble = value.toDouble()
            if (asDouble % 1.0 == 0.0) value.toLong().toString() else value.toString()
        }
        else -> value.toString()
    }
}

/**
 * Moshi adapter factory for the `ApiDateTime` models.
 *
 * The specification describes these models as an object with `utcTime` and `timeZoneOffset`,
 * while the server sends the date as a plain ISO-8601 string
 * (e.g. `2026-03-06T11:22:42.0000000+03:00`). A string is converted into the object form
 * (`utcTime` in UTC, `timeZoneOffset` taken from the string) and handed to the standard
 * model adapter; an object is passed to that adapter unchanged.
 */
class ApiDateTimeAdapterFactory : JsonAdapter.Factory {
    private val apiDateTimeTypes: Set<Class<*>> = setOf(
        onlyoffice.docspace.api.sdk.models.AiApiDateTime::class.java,
        onlyoffice.docspace.api.sdk.models.ApiDateTime::class.java,
    )

    override fun create(type: Type, annotations: Set<Annotation>, moshi: Moshi): JsonAdapter<*>? {
        if (Types.getRawType(type) !in apiDateTimeTypes) {
            return null
        }
        val delegate = moshi.nextAdapter<Any>(this, type, annotations)

        return object : JsonAdapter<Any>() {
            override fun fromJson(reader: JsonReader): Any? {
                if (reader.peek() != JsonReader.Token.STRING) {
                    return delegate.fromJson(reader)
                }
                val raw = reader.nextString()
                if (raw.isEmpty()) {
                    return null
                }
                val dateTime = try {
                    OffsetDateTime.parse(raw)
                } catch (e: java.time.format.DateTimeParseException) {
                    throw JsonDataException("Invalid date-time '$raw' at ${reader.path}", e)
                }
                return delegate.fromJsonValue(
                    mapOf(
                        "utcTime" to dateTime.withOffsetSameInstant(ZoneOffset.UTC).toString(),
                        "timeZoneOffset" to dateTime.offset.toString()
                    )
                )
            }

            override fun toJson(writer: JsonWriter, value: Any?) {
                delegate.toJson(writer, value)
            }
        }
    }
}
