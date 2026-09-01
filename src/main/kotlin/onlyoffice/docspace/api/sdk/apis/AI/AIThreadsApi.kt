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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsGetById Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-by-id/
     *
     *
     * @param threadId 
     * @return [AiThread]
     */
    @GET("api/2.0/ai/threads/get-by-id")
    suspend fun aiThreadsGetById(@Query("threadId") threadId: kotlin.String): Response<AiThread>

    /**
     * GET api/2.0/ai/threads/get-message-by-id
     * Get message by id
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsGetMessageById Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-message-by-id/
     *
     *
     * @param messageId 
     * @return [AiThreadMessageLike]
     */
    @GET("api/2.0/ai/threads/get-message-by-id")
    suspend fun aiThreadsGetMessageById(@Query("messageId") messageId: kotlin.String): Response<AiThreadMessageLike>

    /**
     * GET api/2.0/ai/threads/list
     * List
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsList Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-list/
     *
     *
     * @param entityId 
     * @param count 
     * @param cursor 
     * @param query 
     * @return [kotlin.collections.List<AiThread>]
     */
    @GET("api/2.0/ai/threads/list")
    suspend fun aiThreadsList(@Query("entityId") entityId: kotlin.String, @Query("count") count: kotlin.String, @Query("cursor") cursor: kotlin.String, @Query("query") query: kotlin.String): Response<kotlin.collections.List<AiThread>>

    /**
     * POST api/2.0/ai/threads/open-or-create
     * Open or create
     * 
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
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiThreadsReadMessages Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-read-messages/
     *
     *
     * @param threadId 
     * @param count 
     * @param cursor 
     * @param direction 
     * @return [kotlin.collections.List<AiThreadMessageLike>]
     */
    @GET("api/2.0/ai/threads/read-messages")
    suspend fun aiThreadsReadMessages(@Query("threadId") threadId: kotlin.String, @Query("count") count: kotlin.String, @Query("cursor") cursor: kotlin.String, @Query("direction") direction: kotlin.String): Response<kotlin.collections.List<AiThreadMessageLike>>

    /**
     * POST api/2.0/ai/threads/regenerate-title
     * Regenerate title
     * 
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
     * 
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
     * 
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
     * 
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
