 /*
 * (c) Copyright Ascensio System SIA 2026
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
 * [0 - PortalAi, 1 - OpenAi, 2 - TogetherAi, 3 - OpenAiCompatible, 4 - Anthropic, 5 - OpenRouter, 6 - DeepSeek, 7 - XAi, 8 - GoogleAi]
 *
 * Values: PortalAi,OpenAi,TogetherAi,OpenAiCompatible,Anthropic,OpenRouter,DeepSeek,XAi,GoogleAi
 */

@JsonClass(generateAdapter = false)
enum class ProviderType(val value: kotlin.Int) {

    @Json(name = "0")
    PortalAi(0),

    @Json(name = "1")
    OpenAi(1),

    @Json(name = "2")
    TogetherAi(2),

    @Json(name = "3")
    OpenAiCompatible(3),

    @Json(name = "4")
    Anthropic(4),

    @Json(name = "5")
    OpenRouter(5),

    @Json(name = "6")
    DeepSeek(6),

    @Json(name = "7")
    XAi(7),

    @Json(name = "8")
    GoogleAi(8);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ProviderType) "$data" else null

        /**
         * Returns a valid [ProviderType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ProviderType? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

