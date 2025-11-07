 /*
 * (c) Copyright Ascensio System SIA 2025
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package onlyoffice.docspace.api.sdk.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * Values: _1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11,_12,_13,_14,_15,_16
 */

@JsonClass(generateAdapter = false)
enum class WhiteLabelLogoType(val value: kotlin.Int) {

    @Json(name = 1)
    _1(1),

    @Json(name = 2)
    _2(2),

    @Json(name = 3)
    _3(3),

    @Json(name = 4)
    _4(4),

    @Json(name = 5)
    _5(5),

    @Json(name = 6)
    _6(6),

    @Json(name = 7)
    _7(7),

    @Json(name = 8)
    _8(8),

    @Json(name = 9)
    _9(9),

    @Json(name = 10)
    _10(10),

    @Json(name = 11)
    _11(11),

    @Json(name = 12)
    _12(12),

    @Json(name = 13)
    _13(13),

    @Json(name = 14)
    _14(14),

    @Json(name = 15)
    _15(15),

    @Json(name = 16)
    _16(16);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is WhiteLabelLogoType) "$data" else null

        /**
         * Returns a valid [WhiteLabelLogoType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): WhiteLabelLogoType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

