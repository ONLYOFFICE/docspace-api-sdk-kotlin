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

import onlyoffice.docspace.api.sdk.models.AiAiActionArgs
import onlyoffice.docspace.api.sdk.models.AiThreadMessageLike

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param result 
 * @param threadId Thread the assistant message belongs to.
 * @param messageId Storage id of the assistant message holding the tool call.
 * @param idx Index of the tool-call content part inside `message.content`.
 * @param message Snapshot of the assistant message at the time the tool call surfaced.
 * @param allowAlways Persist auto-approve for this tool's name.
 * @param actionArgs Per-request engine options: extra tools, reasoning, prompt override.
 * @param entityId Optional entity (room) scope for profile resolution.
 * @param profileId Session-level profile override for this request only.
 */


data class AiAiApproveToolCallRequest (

    @Json(name = "result")
    val result: kotlin.Any?,

    @Json(name = "threadId")
    val threadId: kotlin.String,

    @Json(name = "messageId")
    val messageId: kotlin.String,

    @Json(name = "idx")
    val idx: java.math.BigDecimal,

    @Json(name = "message")
    val message: AiThreadMessageLike,

    @Json(name = "allowAlways")
    val allowAlways: kotlin.Boolean? = null,

    @Json(name = "actionArgs")
    val actionArgs: AiAiActionArgs? = null,

    @Json(name = "entityId")
    val entityId: kotlin.String? = null,

    @Json(name = "profileId")
    val profileId: kotlin.String? = null

) {


}

