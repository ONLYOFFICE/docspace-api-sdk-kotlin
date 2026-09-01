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
 * Union of all 17 built-in AI provider type identifiers.  The `external` provider has no built-in transport — it delegates every HTTP request to `PlatformAdapter.externalFetch` and parses the response with the inner provider selected by `Profile.basedOn`.
 *
 * Values: anthropic,ollama,openai,openaicompatible,together,openrouter,genai,deepseek,xai,lmMinusStudio,mistral,groq,zhipu,stabilityai,gpt4all,onlyoffice,`external`
 */

@JsonClass(generateAdapter = false)
enum class AiBuiltinProviderType(val value: kotlin.String) {

    @Json(name = "anthropic")
    anthropic("anthropic"),

    @Json(name = "ollama")
    ollama("ollama"),

    @Json(name = "openai")
    openai("openai"),

    @Json(name = "openaicompatible")
    openaicompatible("openaicompatible"),

    @Json(name = "together")
    together("together"),

    @Json(name = "openrouter")
    openrouter("openrouter"),

    @Json(name = "genai")
    genai("genai"),

    @Json(name = "deepseek")
    deepseek("deepseek"),

    @Json(name = "xai")
    xai("xai"),

    @Json(name = "lm-studio")
    lmMinusStudio("lm-studio"),

    @Json(name = "mistral")
    mistral("mistral"),

    @Json(name = "groq")
    groq("groq"),

    @Json(name = "zhipu")
    zhipu("zhipu"),

    @Json(name = "stabilityai")
    stabilityai("stabilityai"),

    @Json(name = "gpt4all")
    gpt4all("gpt4all"),

    @Json(name = "onlyoffice")
    onlyoffice("onlyoffice"),

    @Json(name = "external")
    `external`("external");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AiBuiltinProviderType) "$data" else null

        /**
         * Returns a valid [AiBuiltinProviderType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AiBuiltinProviderType? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

