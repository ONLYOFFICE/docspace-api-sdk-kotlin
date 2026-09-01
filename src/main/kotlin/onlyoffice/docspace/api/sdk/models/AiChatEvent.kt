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
 * Discriminated event emitted by the streaming methods of `AIEngine`. The engine never invokes user-supplied middleware or callbacks directly — every observable side-effect is encoded as a `ChatEvent` so the same stream can be replayed over SSE, WebSocket, or in-process.  Pause point: `tool-call-pending` is the only stop. The UI must execute the tool itself (consulting `autoAllow` to decide between the silent path and the approve dialog) and resume via `AIEngine.approveToolCall` or `AIEngine.denyToolCall`.  Other variants are pure data:  - `message-start` / `message-delta` / `message-end` — assistant reply lifecycle. - `message-incomplete` — the provider returned an error or incomplete status. - `thread-title` — auto-generated title ready for a new thread.
 *
 * @param type Emitted once per `sendWithStream` call, immediately after the user message has been persisted by storage and before the assistant stream starts. Carries the storage-assigned `id` and `createdAt`. The UI uses it to render the user bubble — no client-side optimistic placeholder is needed, which keeps the runtime tree free of phantom nodes from index-fallback ids.
 * @param message The message the event is about, in the state it has reached.
 * @param messageId The storage identifier of that message.
 * @param idx The zero-based position of the pending tool call within the message.
 * @param threadId The thread the event belongs to.
 * @param autoAllow The consumer should execute the tool without prompting the user. True when the tool is in the persisted always-allow list, or the tool itself opts in via `TMCPItem.requireApproval === false` (host tools default to this). For a client-side tool with a server-side engine, this lets the engine return the pending call already flagged auto-allow so the client runs it and streams the result back without a dialog round-trip.
 * @param serverExecuted Set when the tool is served by a server-side system source: the consumer must NOT execute it locally — only show the approval UI (unless `autoAllow`) and resume via `approveToolCall` (no `result` needed) / `denyToolCall`. The engine runs it in-engine.
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

