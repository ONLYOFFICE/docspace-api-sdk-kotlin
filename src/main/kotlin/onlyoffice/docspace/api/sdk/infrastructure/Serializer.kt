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
import onlyoffice.docspace.api.sdk.models.ApiDateTime
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

object Serializer {
    @JvmStatic
    val moshiBuilder: Moshi.Builder = Moshi.Builder()
        .add(ValueEnumJsonAdapterFactory())
        .add(ApiDateTimeAdapter())
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
 * Moshi adapter for the DocSpace `ApiDateTime` type.
 *
 * The API serializes `ApiDateTime` as a single ISO-8601 string (e.g. `2024-01-31T12:00:00+00:00`),
 * while the generated model is an object (`utcTime` + `timeZoneOffset`). This adapter bridges the
 * two: it parses the string into its components on input and emits the UTC instant on output.
 * An empty or blank string is treated as `null`.
 */
class ApiDateTimeAdapter {
    @FromJson
    fun fromJson(value: kotlin.String?): ApiDateTime? {
        if (value.isNullOrBlank()) {
            return null
        }
        val odt = OffsetDateTime.parse(value)
        return ApiDateTime(
            utcTime = odt.withOffsetSameInstant(ZoneOffset.UTC),
            timeZoneOffset = odt.offset.toString()
        )
    }

    @ToJson
    fun toJson(value: ApiDateTime?): kotlin.String? = value?.utcTime?.toString()
}
