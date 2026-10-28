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

import onlyoffice.docspace.api.sdk.models.AiOpenAIToolCallDelta

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The incremental part of one choice - what this chunk adds to the assistant message.
 *
 * @param role Sent on the first chunk only, always `assistant`.
 * @param content The text this chunk appends. Null when the chunk carries no text.
 * @param toolCalls The tool calls the model requested, emitted in place of text.
 */


data class AiOpenAIChoiceDelta (

    @Json(name = "role")
    val role: AiOpenAIChoiceDelta.Role? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "tool_calls")
    val toolCalls: kotlin.collections.List<AiOpenAIToolCallDelta>? = null

) {

    /**
     * Sent on the first chunk only, always `assistant`.
     *
     * Values: assistant
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "assistant") assistant("assistant");
    }

}

