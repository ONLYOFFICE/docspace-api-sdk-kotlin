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

import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiOpenOrCreateResult
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse
import onlyoffice.docspace.api.sdk.models.AiThread
import onlyoffice.docspace.api.sdk.models.AiThreadMessageLike
import onlyoffice.docspace.api.sdk.models.AiThreadsAppendUserMessageRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsCreateRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsOpenOrCreateRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsRegenerateTitleRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsRenameRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsTouchRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsUpdateMessageRequest

interface AIThreadsApi {
    /**
     * POST api/2.0/ai/threads/append-user-message
     * Append user message
     * Persists a user message in a thread and bumps the thread's last-edit date so it resurfaces in the sidebar. Optionally rebinds the thread to another profile when the model changed mid-conversation.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsAppendUserMessage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-append-user-message/
     *
     *
     * @param aiThreadsAppendUserMessageRequest 
     * @return [AiThreadMessageLike]
     */
    @POST("api/2.0/ai/threads/append-user-message")
    suspend fun aiThreadsAppendUserMessage(@Body aiThreadsAppendUserMessageRequest: AiThreadsAppendUserMessageRequest): Response<AiThreadMessageLike>

    /**
     * DELETE api/2.0/ai/threads/clear-messages
     * Clear messages
     * Drops every message of a thread while keeping the thread itself, and bumps its last-edit date.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsClearMessages Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-clear-messages/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/threads/clear-messages", hasBody = true)
    suspend fun aiThreadsClearMessages(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * POST api/2.0/ai/threads/create
     * Create
     * Creates a chat thread with a caller-supplied title. Use `open-or-create` instead when the title should be generated from the first user message.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsCreate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-create/
     *
     *
     * @param aiThreadsCreateRequest 
     * @return [AiThread]
     */
    @POST("api/2.0/ai/threads/create")
    suspend fun aiThreadsCreate(@Body aiThreadsCreateRequest: AiThreadsCreateRequest): Response<AiThread>

    /**
     * DELETE api/2.0/ai/threads/delete
     * Delete
     * Deletes a chat thread together with its messages.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/threads/delete", hasBody = true)
    suspend fun aiThreadsDelete(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * DELETE api/2.0/ai/threads/delete-message
     * Delete message
     * Deletes one chat message, leaving the rest of the thread untouched.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsDeleteMessage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete-message/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/threads/delete-message", hasBody = true)
    suspend fun aiThreadsDeleteMessage(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/threads/get-by-id
     * Get by id
     * Returns one chat thread, or an empty result when the identifier is unknown.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsGetById Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-by-id/
     *
     *
     * @param threadId The chat thread identifier.
     * @return [AiThread]
     */
    @GET("api/2.0/ai/threads/get-by-id")
    suspend fun aiThreadsGetById(@Query("threadId") threadId: kotlin.String): Response<AiThread>

    /**
     * GET api/2.0/ai/threads/get-message-by-id
     * Get message by id
     * Returns one chat message by its globally unique identifier.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsGetMessageById Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-message-by-id/
     *
     *
     * @param messageId The globally unique chat message identifier.
     * @return [AiThreadMessageLike]
     */
    @GET("api/2.0/ai/threads/get-message-by-id")
    suspend fun aiThreadsGetMessageById(@Query("messageId") messageId: kotlin.String): Response<AiThreadMessageLike>

    /**
     * GET api/2.0/ai/threads/list
     * List
     * Lists the chat threads of the scope, most recently edited first. Supports cursor pagination and a server-side case-insensitive title search.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsList Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-list/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @param count The maximum number of items to return in one page. (optional)
     * @param cursor The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. (optional)
     * @param query The full-text query the thread list is filtered by. (optional)
     * @return [kotlin.collections.List<AiThread>]
     */
    @GET("api/2.0/ai/threads/list")
    suspend fun aiThreadsList(@Query("entityId") entityId: kotlin.String? = null, @Query("count") count: kotlin.String? = null, @Query("cursor") cursor: kotlin.String? = null, @Query("query") query: kotlin.String? = null): Response<kotlin.collections.List<AiThread>>

    /**
     * POST api/2.0/ai/threads/open-or-create
     * Open or create
     * Opens a chat thread and returns its history, or creates one with a title generated from the supplied first message. That first message is not persisted - the caller decides whether to follow up with `append-user-message`.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsOpenOrCreate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-open-or-create/
     *
     *
     * @param aiThreadsOpenOrCreateRequest 
     * @return [AiOpenOrCreateResult]
     */
    @POST("api/2.0/ai/threads/open-or-create")
    suspend fun aiThreadsOpenOrCreate(@Body aiThreadsOpenOrCreateRequest: AiThreadsOpenOrCreateRequest): Response<AiOpenOrCreateResult>

    /**
     * GET api/2.0/ai/threads/read-messages
     * Read messages
     * Reads the messages of a thread, with the same cursor pagination as the thread list.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsReadMessages Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-read-messages/
     *
     *
     * @param threadId The chat thread identifier.
     * @param count The maximum number of items to return in one page. (optional)
     * @param cursor The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. (optional)
     * @param direction The order the message page is read in. Only desc turns the read around and pages back from the newest message; omit for the forward read. (optional)
     * @return [kotlin.collections.List<AiThreadMessageLike>]
     */
    @GET("api/2.0/ai/threads/read-messages")
    suspend fun aiThreadsReadMessages(@Query("threadId") threadId: kotlin.String, @Query("count") count: kotlin.String? = null, @Query("cursor") cursor: kotlin.String? = null, @Query("direction") direction: kotlin.String? = null): Response<kotlin.collections.List<AiThreadMessageLike>>

    /**
     * POST api/2.0/ai/threads/regenerate-title
     * Regenerate title
     * Generates a fresh title from the thread's first user message and persists it. Fails when the thread has no user message yet.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsRegenerateTitle Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-regenerate-title/
     *
     *
     * @param aiThreadsRegenerateTitleRequest 
     * @return [kotlin.String]
     */
    @POST("api/2.0/ai/threads/regenerate-title")
    suspend fun aiThreadsRegenerateTitle(@Body aiThreadsRegenerateTitleRequest: AiThreadsRegenerateTitleRequest): Response<kotlin.String>

    /**
     * PUT api/2.0/ai/threads/rename
     * Rename
     * Renames a chat thread and bumps its last-edit date so the new title shows up in the sidebar.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsRename Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-rename/
     *
     *
     * @param aiThreadsRenameRequest 
     * @return [AiSuccessResponse]
     */
    @PUT("api/2.0/ai/threads/rename")
    suspend fun aiThreadsRename(@Body aiThreadsRenameRequest: AiThreadsRenameRequest): Response<AiSuccessResponse>

    /**
     * POST api/2.0/ai/threads/touch
     * Touch
     * Bumps a thread's last-edit date, and optionally rebinds it to another profile, when something other than a new message - a model switch, say - should resurface it.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsTouch Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-touch/
     *
     *
     * @param aiThreadsTouchRequest 
     * @return [AiSuccessResponse]
     */
    @POST("api/2.0/ai/threads/touch")
    suspend fun aiThreadsTouch(@Body aiThreadsTouchRequest: AiThreadsTouchRequest): Response<AiSuccessResponse>

    /**
     * PUT api/2.0/ai/threads/update-message
     * Update message
     * Replaces the content of a chat message - used by the edit and regenerate flows that change a message outside the streaming lifecycle.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsUpdateMessage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-update-message/
     *
     *
     * @param aiThreadsUpdateMessageRequest 
     * @return [AiSuccessResponse]
     */
    @PUT("api/2.0/ai/threads/update-message")
    suspend fun aiThreadsUpdateMessage(@Body aiThreadsUpdateMessageRequest: AiThreadsUpdateMessageRequest): Response<AiSuccessResponse>

}
