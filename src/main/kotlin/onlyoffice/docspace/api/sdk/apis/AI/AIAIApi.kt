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


package onlyoffice.docspace.api.sdk.apis.AI

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AiAiApproveToolCallRequest
import onlyoffice.docspace.api.sdk.models.AiAiRegenerateStreamRequest
import onlyoffice.docspace.api.sdk.models.AiAiSendCustomRequest
import onlyoffice.docspace.api.sdk.models.AiAiSendRequest
import onlyoffice.docspace.api.sdk.models.AiAiSendStreamBody
import onlyoffice.docspace.api.sdk.models.AiAiToolCallData
import onlyoffice.docspace.api.sdk.models.AiChatEvent
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiOpenAIStreamChunk
import onlyoffice.docspace.api.sdk.models.AiThreadMessageLike

interface AIAIApi {
    /**
     * POST api/2.0/ai/ai/approve-tool-call
     * Approve tool call
     * Resumes a chat round that a tool call has paused, and streams the continuation as newline-delimited `ChatEvent` objects. The result supplied in the request is persisted onto the assistant message that issued the call, so the tool is not executed here - the caller runs it and reports the outcome. The round continues against the augmented history and may pause again on a further tool call. Call `POST api/2.0/ai/ai/deny-tool-call` instead to refuse the call and let the model answer without it.
     * Responses:
     *  - 200: Newline-delimited stream of chat events — one JSON `ChatEvent` object per line.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAiApproveToolCall Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-approve-tool-call/
     *
     *
     * @param aiAiApproveToolCallRequest 
     * @return [AiChatEvent]
     */
    @POST("api/2.0/ai/ai/approve-tool-call")
    suspend fun aiAiApproveToolCall(@Body aiAiApproveToolCallRequest: AiAiApproveToolCallRequest): Response<AiChatEvent>

    /**
     * POST api/2.0/ai/ai/deny-tool-call
     * Deny tool call
     * Refuses the tool call a chat round is paused on and resumes it immediately, streaming the continuation as newline-delimited `ChatEvent` objects. The literal `User deny tool call` is persisted in place of the tool result, so the model sees an explicit refusal rather than a missing answer and may reply without the tool or ask for something else. Nothing is executed and no result is accepted from the caller. Use `POST api/2.0/ai/ai/approve-tool-call` to supply a result instead.
     * Responses:
     *  - 200: Newline-delimited stream of chat events — one JSON `ChatEvent` object per line.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAiDenyToolCall Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-deny-tool-call/
     *
     *
     * @param aiAiToolCallData 
     * @return [AiChatEvent]
     */
    @POST("api/2.0/ai/ai/deny-tool-call")
    suspend fun aiAiDenyToolCall(@Body aiAiToolCallData: AiAiToolCallData): Response<AiChatEvent>

    /**
     * POST api/2.0/ai/ai/regenerate-stream
     * Regenerate stream
     * Re-rolls the last assistant reply of an existing thread: every message after the last user message - the previous reply and any tool-call hops - is dropped, and a fresh reply is streamed as newline-delimited `ChatEvent` objects against the unchanged prompt. The thread has to exist already, `threadId` is required, and no title is generated. The dropped messages are gone for good, so this is a destructive operation on the thread's tail rather than a retry that keeps both answers. Unlike `send-with-stream` the profile is not verified before the stream opens, so an unusable model surfaces as an error frame inside the 200 rather than as a 4xx.
     * Responses:
     *  - 200: Newline-delimited stream of chat events — one JSON `ChatEvent` object per line.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAiRegenerateStream Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-regenerate-stream/
     *
     *
     * @param aiAiRegenerateStreamRequest 
     * @return [AiChatEvent]
     */
    @POST("api/2.0/ai/ai/regenerate-stream")
    suspend fun aiAiRegenerateStream(@Body aiAiRegenerateStreamRequest: AiAiRegenerateStreamRequest): Response<AiChatEvent>

    /**
     * POST api/2.0/ai/ai/send
     * Run an AI action
     * Runs one AI action and returns the whole answer as a single JSON document. The model is the profile bound to `actionType`, falling back to the `Default` assignment slot, so this operation accepts no `profileId` of its own. Nothing is persisted - no thread is opened, no message is stored and no title is generated - which makes it the one to use for a stand-alone completion rather than for a conversation. `entityId` and `contextEntityId` set the scope of the round, which decides the workspace context and the custom MCP servers it may reach. For a conversation that keeps its history, use `POST api/2.0/ai/ai/send-with-stream` instead.
     * Responses:
     *  - 200: The assistant's reply as one message. Nothing was persisted.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAiSend Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send/
     *
     *
     * @param aiAiSendRequest 
     * @return [AiThreadMessageLike]
     */
    @POST("api/2.0/ai/ai/send")
    suspend fun aiAiSend(@Body aiAiSendRequest: AiAiSendRequest): Response<AiThreadMessageLike>

    /**
     * POST api/2.0/ai/ai/send-custom
     * Send custom
     * Runs a free-form one-turn call against a system prompt supplied in the request, with no thread, no history and nothing persisted. The model is the explicit `profileId` when it resolves, otherwise the `Default` assignment slot. The shape of the answer depends on the body rather than on the route: with `isStream` set it arrives as a newline-delimited stream of chat events, and without it as a single JSON document, so a client has to handle both. Use `POST api/2.0/ai/ai/send` when the prompt should come from the portal's own action configuration instead of from the caller.
     * Responses:
     *  - 200: The assistant's reply as one message, or a newline-delimited stream of chat events when `isStream` was set. Nothing was persisted.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAiSendCustom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-custom/
     *
     *
     * @param aiAiSendCustomRequest 
     * @return [AiThreadMessageLike]
     */
    @POST("api/2.0/ai/ai/send-custom")
    suspend fun aiAiSendCustom(@Body aiAiSendCustomRequest: AiAiSendCustomRequest): Response<AiThreadMessageLike>

    /**
     * POST api/2.0/ai/ai/send-with-stream
     * Send with stream
     * Runs one chat round and streams it back as newline-delimited `ChatEvent` objects. Omitting `threadId` opens a new thread, which requires that `entityId` names a room the caller can open and that a profile resolves for it; the user message and the reply are persisted either way, and a new thread also gets a generated title. The model is settled in a fixed order - an agent's assignment in scope overrides everything, then the explicit `profileId`, then the one stored on the thread, then the `Chat` assignment - and the effective profile is checked before the stream opens, so an unknown one fails with 400 rather than as an error buried in a 200. A tool call pauses the round and ends the stream; resume it with `POST api/2.0/ai/ai/approve-tool-call` or `POST api/2.0/ai/ai/deny-tool-call`.
     * Responses:
     *  - 200: Newline-delimited stream of chat events — one JSON `ChatEvent` object per line.
     *  - 400: The prompt is empty, more attachments were sent than the limit allows, or no AI profile could be resolved for the requested action.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 402: The portal has no paid AI quota left, so the profile bound to this action cannot be dispatched.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The `entityId` names a room the caller cannot open, or no live profile is bound to it.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAiSendWithStream Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream/
     *
     *
     * @param aiAiSendStreamBody 
     * @return [AiChatEvent]
     */
    @POST("api/2.0/ai/ai/send-with-stream")
    suspend fun aiAiSendWithStream(@Body aiAiSendStreamBody: AiAiSendStreamBody): Response<AiChatEvent>

    /**
     * POST api/2.0/ai/ai/send-with-stream-openai
     * Stream a chat in OpenAI format
     * The same chat round as `send-with-stream`, re-encoded as a server-sent-events stream of OpenAI `chat.completion.chunk` objects terminated by a `[DONE]` sentinel. Thread handling, persistence, title generation and the profile pre-flight are identical, and a tool call ends the stream with `finish_reason: tool_calls` instead of a pause event - resume it through the same approve and deny operations. Unlike `send-with-stream` it does not reject an empty user message and does not enforce the per-kind attachment cap, so validate both before calling. Choose this route only for a client that already speaks the OpenAI wire format; `POST api/2.0/ai/ai/send-with-stream` is the native one.
     * Responses:
     *  - 200: Server-sent events stream of OpenAI `chat.completion.chunk` objects, terminated by a `[DONE]` sentinel.
     *  - 400: The prompt is empty, or no AI profile could be resolved for the requested action.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 402: The portal has no paid AI quota left, so the profile bound to this action cannot be dispatched.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAiSendWithStreamOpenAI Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream-open-ai/
     *
     *
     * @param aiAiSendStreamBody 
     * @return [AiOpenAIStreamChunk]
     */
    @POST("api/2.0/ai/ai/send-with-stream-openai")
    suspend fun aiAiSendWithStreamOpenAI(@Body aiAiSendStreamBody: AiAiSendStreamBody): Response<AiOpenAIStreamChunk>

}
