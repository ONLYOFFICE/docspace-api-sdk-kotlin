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
import onlyoffice.docspace.api.sdk.models.AiThreadsAppendUserMessage200Response
import onlyoffice.docspace.api.sdk.models.AiThreadsAppendUserMessageRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsCreateRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsOpenOrCreateRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsRegenerateTitle200Response
import onlyoffice.docspace.api.sdk.models.AiThreadsRegenerateTitleRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsRenameRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsTouchRequest
import onlyoffice.docspace.api.sdk.models.AiThreadsUpdateMessageRequest

interface AIThreadsApi {
    /**
     * POST api/2.0/ai/threads/append-user-message
     * Append user message
     * Stores a user message in a thread and bumps its last-edit date so the thread resurfaces at the top of the list. The per-kind attachment cap of the composer is enforced here as well, so a direct API call cannot exceed what the UI allows. Passing `profileId` rebinds the thread to another model, which is how a mid-conversation model switch is recorded. The answer carries the new message's ID; the message is stored as sent and no reply is generated - run a round with `POST api/2.0/ai/ai/send-with-stream` for that.
     * Responses:
     *  - 200: The stored message, with the ID storage assigned to it.
     *  - 400: The message is longer than the limit allows.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiThreadsAppendUserMessage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-append-user-message/
     *
     *
     * @param aiThreadsAppendUserMessageRequest 
     * @return [AiThreadsAppendUserMessage200Response]
     */
    @POST("api/2.0/ai/threads/append-user-message")
    suspend fun aiThreadsAppendUserMessage(@Body aiThreadsAppendUserMessageRequest: AiThreadsAppendUserMessageRequest): Response<AiThreadsAppendUserMessage200Response>

    /**
     * DELETE api/2.0/ai/threads/clear-messages
     * Clear messages
     * Removes every message of a thread while keeping the thread, its title and its model binding, and bumps its last-edit date. The messages are gone for good. Unlike `delete` this does not verify that the thread exists, so clearing an unknown `threadId` reports success rather than 404. The answer only confirms the write.
     * Responses:
     *  - 200: Confirms the request was accepted. It does not mean the thread existed.
     *  - 400: `threadId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiThreadsClearMessages Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-clear-messages/
     *
     *
     * @param body The ID of the thread to empty, as a bare JSON string.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/threads/clear-messages", hasBody = true)
    suspend fun aiThreadsClearMessages(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * POST api/2.0/ai/threads/create
     * Create a chat thread
     * Creates a chat thread with a title supplied by the caller and returns it. A scoped thread requires that `entityId` names a room the caller can open, and a model has to resolve for the scope - an explicit `profileId`, or the room's `Chat` assignment - otherwise there is nothing to run the thread against and the call answers 404. In an agent room the agent's own assignment overrides any `profileId` sent with the request, so a thread there always starts on the agent's model. Use `POST api/2.0/ai/threads/open-or-create` instead when the title should be generated from the first user message.
     * Responses:
     *  - 200: The created thread.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The `entityId` names a room the caller cannot open, or no live AI profile is bound to it, so there is no model to run the thread against.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Delete a chat thread
     * Deletes a thread together with every message in it. The thread has to exist: unlike the other operations that take a `threadId`, this one checks first and answers 404 for an unknown or already-deleted thread rather than reporting success. The deletion is permanent and the messages cannot be recovered. To empty a thread but keep it, use `DELETE api/2.0/ai/threads/clear-messages`.
     * Responses:
     *  - 200: Confirms the thread and its messages are gone.
     *  - 400: `threadId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: No thread has this ID.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiThreadsDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete/
     *
     *
     * @param body The ID of the thread to delete, as a bare JSON string.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/threads/delete", hasBody = true)
    suspend fun aiThreadsDelete(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * DELETE api/2.0/ai/threads/delete-message
     * Delete message
     * Deletes one message and leaves the rest of the thread untouched. `messageId` is required and may be sent either in the body or as a query parameter. An unknown ID is not reported: the call answers success without having deleted anything, so verify with `GET api/2.0/ai/threads/read-messages` when it matters. The deletion is permanent.
     * Responses:
     *  - 200: Confirms the request was accepted, whether or not a message was deleted.
     *  - 400: `messageId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiThreadsDeleteMessage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete-message/
     *
     *
     * @param body The ID of the message to delete, as a bare JSON string.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/threads/delete-message", hasBody = true)
    suspend fun aiThreadsDeleteMessage(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/threads/get-by-id
     * Get a chat thread
     * Returns one thread by its ID, without its messages - read those with `GET api/2.0/ai/threads/read-messages`. `threadId` is required and an unknown one answers 404, so the result is never an empty body. The answer carries the thread's title, its model binding and its last-edit date. This is a read-only operation and does not bump that date.
     * Responses:
     *  - 200: The thread, without its messages.
     *  - 400: `threadId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: No thread has this ID.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Get one chat message
     * Returns one message by its ID, wherever it sits, without needing the thread it belongs to. `messageId` is required. Unlike `GET api/2.0/ai/threads/get-by-id` an unknown ID is not reported as 404: the answer is an empty body with status 200, so a client has to treat a missing payload as no such message. Message IDs come from the thread history or from the answer of `POST api/2.0/ai/threads/append-user-message`.
     * Responses:
     *  - 200: The message, or an empty body when no message has that ID.
     *  - 400: `messageId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * List chat threads
     * Lists the threads of a scope, most recently edited first, and searches their titles case-insensitively when `query` is given. Every parameter is optional: omitting `entityId` lists the global scope, and omitting `count` lets the engine apply its own page size. Pagination is by cursor, and the cursor is a JSON object passed as a string in the query - `{id: <last thread id>, lastEditDate: <its date>}` - taken from the last entry of the previous page. A cursor that is not valid JSON, or that lacks an `id`, is ignored rather than rejected, and the read silently starts from the first page again.
     * Responses:
     *  - 200: The threads of the scope, most recently edited first.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
    suspend fun aiThreadsList(@Query("entityId") entityId: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("cursor") cursor: kotlin.String? = null, @Query("query") query: kotlin.String? = null): Response<kotlin.collections.List<AiThread>>

    /**
     * POST api/2.0/ai/threads/open-or-create
     * Open or create
     * Opens a chat thread and returns it with its history, or creates one whose title is generated from the first message supplied in the request. That first message is not persisted: follow up with `POST api/2.0/ai/threads/append-user-message` to store it, or start the round directly with `POST api/2.0/ai/ai/send-with-stream`. Unlike `create` this takes a whole resolved `profile` object rather than an ID, and a request without one answers 404 because no model could be bound. A supplied `entityId` has to be a room the caller can open; anything that is not an agent room folds to the global scope instead of being rejected.
     * Responses:
     *  - 200: The thread that was opened or created, with its prior messages. A created one carries the generated title.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The `entityId` names a room the caller cannot open, or no live AI profile is bound to it.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Reads the messages of one thread, oldest first, with the same string-encoded JSON cursor as the thread list. `direction` turns the read around, and only the exact value `desc` does so - anything else, including a misspelling, reads forward. Omitting `threadId` is not an error: the call answers 200 with an empty list, so an empty result does not distinguish a thread with no messages from a request that forgot the ID. A malformed cursor is ignored and the read starts from the beginning.
     * Responses:
     *  - 200: The thread's messages, oldest first unless `direction` reversed them. An empty list also means the request carried no thread ID.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
    suspend fun aiThreadsReadMessages(@Query("threadId") threadId: kotlin.String, @Query("count") count: kotlin.Int? = null, @Query("cursor") cursor: kotlin.String? = null, @Query("direction") direction: kotlin.String? = null): Response<kotlin.collections.List<AiThreadMessageLike>>

    /**
     * POST api/2.0/ai/threads/regenerate-title
     * Regenerate title
     * Asks the model to produce a title from the thread's first user message, stores it, and returns the new title. Both `threadId` and a resolved `profile` object are required; a thread with no user message yet has nothing to title and fails. This costs a model call, unlike `POST api/2.0/ai/threads/rename`, which just stores the string it is given. An `entityMeta` sent with the request is only read for its `entityId` hint - the source itself is resolved server-side under the caller's credentials, so a client cannot attribute the call to somebody else's room.
     * Responses:
     *  - 200: The newly generated title, already stored on the thread.
     *  - 400: `threadId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiThreadsRegenerateTitle Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-regenerate-title/
     *
     *
     * @param aiThreadsRegenerateTitleRequest 
     * @return [AiThreadsRegenerateTitle200Response]
     */
    @POST("api/2.0/ai/threads/regenerate-title")
    suspend fun aiThreadsRegenerateTitle(@Body aiThreadsRegenerateTitleRequest: AiThreadsRegenerateTitleRequest): Response<AiThreadsRegenerateTitle200Response>

    /**
     * PUT api/2.0/ai/threads/rename
     * Rename a chat thread
     * Replaces a thread's title with the one supplied and bumps its last-edit date. Both `threadId` and a title with at least one non-whitespace character are required - a blank title is rejected rather than silently stored, so a thread cannot end up nameless. The answer only confirms the write. To have the model produce a title instead of supplying one, use `POST api/2.0/ai/threads/regenerate-title`.
     * Responses:
     *  - 200: Confirms the new title was stored.
     *  - 400: `threadId` or the new title is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Bump a thread's activity
     * Bumps a thread's last-edit date without adding a message, which resurfaces it in the list. Passing `profileId` also rebinds the thread to another model, so this is the operation to call when a model switch alone should count as activity. Nothing else about the thread changes and the answer only confirms the write. It is idempotent: repeating it simply moves the date forward again.
     * Responses:
     *  - 200: Confirms the thread's activity date moved forward.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Replaces the content of one stored message, which is how the edit and regenerate flows change a message outside the streaming lifecycle. The whole message is overwritten by the one supplied rather than merged, so send a complete object. Neither the ID nor the payload is validated here, so a malformed request surfaces as an error relayed from storage rather than as a 400. The answer only confirms the write.
     * Responses:
     *  - 200: Confirms the replacement was stored.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
