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

import onlyoffice.docspace.api.sdk.models.AiActionArgsPrompt
import onlyoffice.docspace.api.sdk.models.AiContextRoomRef
import onlyoffice.docspace.api.sdk.models.AiFolderContextRef
import onlyoffice.docspace.api.sdk.models.AiKnowledgeRoomRef
import onlyoffice.docspace.api.sdk.models.AiMCPItem
import onlyoffice.docspace.api.sdk.models.AiReasoningLevel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Per-request options of an AI round: extra tools, the depth of reasoning, a system prompt override and the rooms and folder connected as context.
 *
 * @param tools Extra tools offered to the model for this request.
 * @param isReasoning Legacy extended-thinking switch; stands for `medium`. `reasoningLevel` wins when both are set.
 * @param reasoningLevel Depth of extended thinking for the round; providers clamp it to what the model accepts.
 * @param prompt 
 * @param toolInstructions Usage notes of the MCP servers the caller holds the connection to, keyed by server type; folded into the system prompt as advisory text.
 * @param contextRooms Instructions rooms connected to the chat as context, each with the skills the round may use.
 * @param knowledgeRooms Knowledge rooms connected to the chat; the knowledge search tool of the round is limited to them. Each `id` has to be a DocSpace room id.
 * @param knowledgeRoom A single knowledge room, as an older client sends it. Read only when `knowledgeRooms` is absent; send `knowledgeRooms` instead.
 * @param folderContext The folder connected to the chat as the round's context. It becomes the location the model is told the user works in, and the entry the round is attributed to.
 * @param entityId The entry the round is attributed to. A hint, resolved against the caller's own access.
 */


data class AiActionArgs (

    @Json(name = "tools")
    val tools: kotlin.collections.List<AiMCPItem>? = null,

    @Json(name = "isReasoning")
    val isReasoning: kotlin.Boolean? = null,

    @Json(name = "reasoningLevel")
    val reasoningLevel: AiReasoningLevel? = null,

    @Json(name = "prompt")
    val prompt: AiActionArgsPrompt? = null,

    @Json(name = "toolInstructions")
    val toolInstructions: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Json(name = "contextRooms")
    val contextRooms: kotlin.collections.List<AiContextRoomRef>? = null,

    @Json(name = "knowledgeRooms")
    val knowledgeRooms: kotlin.collections.List<AiKnowledgeRoomRef>? = null,

    @Json(name = "knowledgeRoom")
    @Deprecated(message = "This property is deprecated.")
    val knowledgeRoom: AiKnowledgeRoomRef? = null,

    @Json(name = "folderContext")
    val folderContext: AiFolderContextRef? = null,

    @Json(name = "entityId")
    val entityId: kotlin.String? = null

) {


}

