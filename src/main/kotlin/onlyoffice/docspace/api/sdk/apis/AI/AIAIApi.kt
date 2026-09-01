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
     * 
     * Responses:
     *  - 200: Newline-delimited stream of chat events — one JSON `ChatEvent` object per line.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * 
     * Responses:
     *  - 200: Newline-delimited stream of chat events — one JSON `ChatEvent` object per line.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * 
     * Responses:
     *  - 200: Newline-delimited stream of chat events — one JSON `ChatEvent` object per line.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * Send
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * 
     * Responses:
     *  - 200: Newline-delimited stream of chat events — one JSON `ChatEvent` object per line.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * Send with stream open ai
     * 
     * Responses:
     *  - 200: Server-sent events stream of OpenAI `chat.completion.chunk` objects, terminated by a `[DONE]` sentinel.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
