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

import onlyoffice.docspace.api.sdk.models.AiThreadMessageLike

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One event of a chat stream, told apart by `type`: `message-start`, `message-delta` and `message-end` frame the assistant reply, `message-incomplete` reports a provider error or an unfinished answer, `thread-title` carries a generated title, and `tool-call-pending` pauses the round until the call is approved (`POST api/2.0/ai/ai/approve-tool-call`) or denied (`POST api/2.0/ai/ai/deny-tool-call`).
 *
 * @param type Emitted once per `sendWithStream` call, immediately after the user message has been persisted by storage and before the assistant stream starts. Carries the storage-assigned `id` and `createdAt`. The UI uses it to render the user bubble — no client-side optimistic placeholder is needed, which keeps the runtime tree free of phantom nodes from index-fallback ids.
 * @param message The message the event is about, in the state it has reached.
 * @param messageId The storage identifier of that message.
 * @param idx The zero-based position of the pending tool call within the message.
 * @param threadId The thread the event belongs to.
 * @param autoAllow The tool runs without asking the user, as the user's tool permission mode decides: under `ask` never - the always-allow list, `requireApproval` and the annotations are all ignored; under `auto` a tool on the always-allow list, one with `requireApproval: false`, or one annotated `readOnlyHint: true` or `destructiveHint: false`; under `allow` every tool.
 * @param serverExecuted The tool is run by the service itself: the client must not run it, only ask for approval (unless `autoAllow`) and approve or deny the call - an approval needs no `result`.
 * @param title The generated thread title.
 * @param profileId The profile that generated the title, when one was used.
 */


data class AiChatEvent (

    @Json(name = "type")
    val type: AiChatEvent.Type,

    @Json(name = "message")
    val message: AiThreadMessageLike? = null,

    @Json(name = "messageId")
    val messageId: kotlin.String? = null,

    @Json(name = "idx")
    val idx: java.math.BigDecimal? = null,

    @Json(name = "threadId")
    val threadId: kotlin.String? = null,

    @Json(name = "autoAllow")
    val autoAllow: kotlin.Boolean? = null,

    @Json(name = "serverExecuted")
    val serverExecuted: kotlin.Boolean? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "profileId")
    val profileId: kotlin.String? = null

) {

    /**
     * Emitted once per `sendWithStream` call, immediately after the user message has been persisted by storage and before the assistant stream starts. Carries the storage-assigned `id` and `createdAt`. The UI uses it to render the user bubble — no client-side optimistic placeholder is needed, which keeps the runtime tree free of phantom nodes from index-fallback ids.
     *
     * Values: userMinusMessageMinusStored,messageMinusStart,messageMinusDelta,messageMinusEnd,messageMinusIncomplete,toolMinusCallMinusPending,threadMinusTitle
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "user-message-stored") userMinusMessageMinusStored("user-message-stored"),
        @Json(name = "message-start") messageMinusStart("message-start"),
        @Json(name = "message-delta") messageMinusDelta("message-delta"),
        @Json(name = "message-end") messageMinusEnd("message-end"),
        @Json(name = "message-incomplete") messageMinusIncomplete("message-incomplete"),
        @Json(name = "tool-call-pending") toolMinusCallMinusPending("tool-call-pending"),
        @Json(name = "thread-title") threadMinusTitle("thread-title");
    }

}

