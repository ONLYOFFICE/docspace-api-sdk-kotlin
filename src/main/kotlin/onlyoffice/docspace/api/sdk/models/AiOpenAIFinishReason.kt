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
 * OpenAI Chat Completions streaming shapes.   `toOpenAIChatCompletionStream` maps the engine's transport-agnostic `ChatEvent` stream onto these chunks so a host can expose an OpenAI-compatible `POST /v1/chat/completions` (`stream: true`) endpoint backed by the same chat pipeline as the in-app widget. Only the subset of fields the engine can populate is emitted; everything else an OpenAI client tolerates as absent.
 *
 * Values: stop,length,tool_calls,content_filter
 */

@JsonClass(generateAdapter = false)
enum class AiOpenAIFinishReason(val value: kotlin.String) {

    @Json(name = "stop")
    stop("stop"),

    @Json(name = "length")
    length("length"),

    @Json(name = "tool_calls")
    tool_calls("tool_calls"),

    @Json(name = "content_filter")
    content_filter("content_filter");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AiOpenAIFinishReason) "$data" else null

        /**
         * Returns a valid [AiOpenAIFinishReason] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AiOpenAIFinishReason? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

