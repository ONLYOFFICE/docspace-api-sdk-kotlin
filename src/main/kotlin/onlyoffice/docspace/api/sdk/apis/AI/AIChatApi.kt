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

import onlyoffice.docspace.api.sdk.models.ChatArrayWrapper
import onlyoffice.docspace.api.sdk.models.ChatWrapper
import onlyoffice.docspace.api.sdk.models.ContinueChatBody
import onlyoffice.docspace.api.sdk.models.EditorToolDecisionRequestBody
import onlyoffice.docspace.api.sdk.models.ExportChatRequestBody
import onlyoffice.docspace.api.sdk.models.GeneratedFileWrapper
import onlyoffice.docspace.api.sdk.models.MessageArrayWrapper
import onlyoffice.docspace.api.sdk.models.ModelArrayWrapper
import onlyoffice.docspace.api.sdk.models.RenameChatBody
import onlyoffice.docspace.api.sdk.models.SetUserChatSettingsRequestBody
import onlyoffice.docspace.api.sdk.models.StartNewChatBody
import onlyoffice.docspace.api.sdk.models.ToolDecisionRequestBody
import onlyoffice.docspace.api.sdk.models.UserChatSettingsWrapper

interface AIChatApi {
    /**
     * POST api/2.0/ai/chats/{chatId}/messages
     * Send a message to an existing AI chat
     * Appends a new user message to an existing chat session and streams the AI assistant's response.  The full conversation history of the chat is sent to the AI provider to maintain context.  The response is delivered as a Server-Sent Events (SSE) stream with periodic keep-alive pings.  File references can optionally be attached to provide additional context.
     * Responses:
     *  - 200: SSE stream of ChatCompletion events (text/event-stream)
     *  - 400: The message is empty or one or more file attachments could not be processed
     *  - 403: You don't have enough permission to access the chat in this room
     *  - 404: The specified chat, room, or AI provider was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for continueChat Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/continue-chat/
     *
     *
     * @param chatId The unique identifier of the existing AI chat session to continue.
     * @param continueChatBody The message and optional file attachments.
     * @return [Unit]
     */
    @POST("api/2.0/ai/chats/{chatId}/messages")
    suspend fun continueChat(@Path("chatId") chatId: java.util.UUID, @Body continueChatBody: ContinueChatBody): Response<Unit>

    /**
     * DELETE api/2.0/ai/chats/{chatId}
     * Delete an AI chat
     * Permanently deletes an AI chat session along with all of its messages.  Only the chat owner can delete their own chat sessions. This action cannot be undone.
     * Responses:
     *  - 204: The chat was successfully deleted
     *  - 404: The chat with the specified ID was not found or does not belong to the current user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteChat Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-chat/
     *
     *
     * @param chatId The unique identifier of the AI chat session to delete.
     * @return [Unit]
     */
    @DELETE("api/2.0/ai/chats/{chatId}")
    suspend fun deleteChat(@Path("chatId") chatId: java.util.UUID): Response<Unit>

    /**
     * POST api/2.0/ai/chats/{chatId}/messages/export
     * Export AI chat messages to a file
     * Exports the entire message history of an AI chat session and saves it as a document in the specified folder.  The exported file is created with the provided title. Only the chat owner can export their own chat sessions.
     * Responses:
     *  - 200: The chat messages were successfully exported to the specified folder
     *  - 404: The chat with the specified ID was not found or does not belong to the current user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for exportChat Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/export-chat/
     *
     *
     * @param chatId The unique identifier of the AI chat session to export.
     * @param exportChatRequestBody The export parameters including destination folder and file title.
     * @return [Unit]
     */
    @POST("api/2.0/ai/chats/{chatId}/messages/export")
    suspend fun exportChat(@Path("chatId") chatId: java.util.UUID, @Body exportChatRequestBody: ExportChatRequestBody): Response<Unit>

    /**
     * GET api/2.0/ai/chats/{chatId}
     * Get an AI chat by ID
     * Retrieves the metadata of a single AI chat session, including its title, creation date, and the user who created it.  Only the chat owner can access their own chat sessions.
     * Responses:
     *  - 200: Chat session details
     *  - 404: The chat with the specified ID was not found or does not belong to the current user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getChat Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chat/
     *
     *
     * @param chatId The unique identifier of the AI chat session to retrieve.
     * @return [ChatWrapper]
     */
    @GET("api/2.0/ai/chats/{chatId}")
    suspend fun getChat(@Path("chatId") chatId: java.util.UUID): Response<ChatWrapper>

    /**
     * GET api/2.0/ai/chats/models
     * Get available AI models
     * Returns the list of AI models available for chat conversations.  Optionally filters the results to models from a specific provider when the provider query parameter is specified.  Each model entry includes the provider ID, provider display name, and the model identifier.
     * Responses:
     *  - 200: List of available AI models
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getChatModels Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chat-models/
     *
     *
     * @param provider The optional AI provider identifier to filter models by. When set to 0, models from all providers are returned. (optional)
     * @return [ModelArrayWrapper]
     */
    @GET("api/2.0/ai/chats/models")
    suspend fun getChatModels(@Query("provider") provider: kotlin.Int? = null): Response<ModelArrayWrapper>

    /**
     * GET api/2.0/ai/rooms/{roomId}/chats
     * Get AI chats in a room
     * Returns a paginated list of AI chat sessions that belong to the current user within the specified room.  Supports pagination via the startIndex and count query parameters. The total number of chats is included in the response metadata.
     * Responses:
     *  - 200: Paginated list of chat sessions in the room
     *  - 403: You don't have enough permission to access chats in this room
     *  - 404: The room with the specified ID was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getChats Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chats/
     *
     *
     * @param roomId The identifier of the room whose AI chat sessions are to be listed.
     * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
     * @param count The maximum number of items to return per page. Defaults to 100. (optional)
     * @return [ChatArrayWrapper]
     */
    @GET("api/2.0/ai/rooms/{roomId}/chats")
    suspend fun getChats(@Path("roomId") roomId: kotlin.Int, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Response<ChatArrayWrapper>

    /**
     * GET api/2.0/ai/chats/{chatId}/messages
     * Get messages of an AI chat
     * Returns a paginated list of messages from an AI chat session owned by the current user.  Each message includes its role (user or assistant), content blocks (text, tool calls, attachments), and timestamp.  Supports pagination via the startIndex and count query parameters. The total number of messages is included in the response metadata.
     * Responses:
     *  - 200: Paginated list of messages in the chat
     *  - 404: The chat with the specified ID was not found or does not belong to the current user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getMessages Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-messages/
     *
     *
     * @param chatId The unique identifier of the AI chat session whose messages are to be listed.
     * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
     * @param count The maximum number of items to return per page. Defaults to 100. (optional)
     * @return [MessageArrayWrapper]
     */
    @GET("api/2.0/ai/chats/{chatId}/messages")
    suspend fun getMessages(@Path("chatId") chatId: java.util.UUID, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Response<MessageArrayWrapper>

    /**
     * GET api/2.0/ai/rooms/{roomId}/chats/config
     * Get user chat settings for a room
     * Retrieves the current user's personal AI chat preferences for the specified room,  including whether web search is enabled for AI-assisted responses.
     * Responses:
     *  - 200: Current user chat settings
     *  - 403: You don't have enough permission to access chats in this room
     *  - 404: The room with the specified ID was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getUserChatsSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-chats-settings/
     *
     *
     * @param roomId The identifier of the room whose chat settings are to be retrieved.
     * @return [UserChatSettingsWrapper]
     */
    @GET("api/2.0/ai/rooms/{roomId}/chats/config")
    suspend fun getUserChatsSettings(@Path("roomId") roomId: kotlin.Int): Response<UserChatSettingsWrapper>

    /**
     * POST api/2.0/ai/chats/tool-permissions/{callId}/decision
     * Submit a tool execution permission decision
     * Provides the user's approval or denial decision for a pending MCP (Model Context Protocol) tool execution request.  When an AI assistant attempts to invoke an external tool that requires explicit user consent,  the client receives a permission prompt via the SSE stream. This endpoint is used to submit the user's decision  so that the AI chat session can proceed accordingly.
     * Responses:
     *  - 200: The permission decision was successfully recorded
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for providePermission Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/provide-permission/
     *
     *
     * @param callId The unique identifier of the pending tool execution call awaiting a permission decision.
     * @param toolDecisionRequestBody The permission decision parameters.
     * @return [Unit]
     */
    @POST("api/2.0/ai/chats/tool-permissions/{callId}/decision")
    suspend fun providePermission(@Path("callId") callId: kotlin.String, @Body toolDecisionRequestBody: ToolDecisionRequestBody): Response<Unit>

    /**
     * PUT api/2.0/ai/chats/{chatId}
     * Rename an AI chat
     * Updates the display title of an existing AI chat session owned by the current user.  The new name must not exceed 255 characters.
     * Responses:
     *  - 200: Updated chat session details
     *  - 404: The chat with the specified ID was not found or does not belong to the current user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for renameChat Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-chat/
     *
     *
     * @param chatId The unique identifier of the AI chat session to rename.
     * @param renameChatBody The new chat name.
     * @return [ChatWrapper]
     */
    @PUT("api/2.0/ai/chats/{chatId}")
    suspend fun renameChat(@Path("chatId") chatId: java.util.UUID, @Body renameChatBody: RenameChatBody): Response<ChatWrapper>

    /**
     * POST api/2.0/ai/chats/tool-files/{callId}/decision
     * Resolve a pending editor file-generation tool
     * Submits the user's approval or denial for a pending editor generation tool call (docx, form, presentation).  On approval the file is created from the original tool arguments and information about it is returned,  while the suspended chat tool is resumed with the same result so the AI session can continue.
     * Responses:
     *  - 200: Information about the created file, or empty if the request was declined or has expired
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for resolveEditorTool Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/resolve-editor-tool/
     *
     *
     * @param callId The unique identifier of the pending tool call awaiting the user's decision.
     * @param editorToolDecisionRequestBody The decision parameters.
     * @return [GeneratedFileWrapper]
     */
    @POST("api/2.0/ai/chats/tool-files/{callId}/decision")
    suspend fun resolveEditorTool(@Path("callId") callId: kotlin.String, @Body editorToolDecisionRequestBody: EditorToolDecisionRequestBody): Response<GeneratedFileWrapper>

    /**
     * PUT api/2.0/ai/rooms/{roomId}/chats/config
     * Update user chat settings for a room
     * Saves the current user's personal AI chat preferences for the specified room.  Currently supports toggling the web search capability, which allows the AI assistant to search the internet when generating responses.
     * Responses:
     *  - 200: Updated user chat settings
     *  - 403: You don't have enough permission to access chats in this room
     *  - 404: The room with the specified ID was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setUserChatsSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-user-chats-settings/
     *
     *
     * @param roomId The identifier of the room whose chat settings are to be updated.
     * @param setUserChatSettingsRequestBody The chat settings to apply.
     * @return [UserChatSettingsWrapper]
     */
    @PUT("api/2.0/ai/rooms/{roomId}/chats/config")
    suspend fun setUserChatsSettings(@Path("roomId") roomId: kotlin.Int, @Body setUserChatSettingsRequestBody: SetUserChatSettingsRequestBody): Response<UserChatSettingsWrapper>

    /**
     * POST api/2.0/ai/rooms/{roomId}/chats
     * Start a new AI chat
     * Creates a new AI chat session within the specified room and sends the initial message to the configured AI provider.  The response is delivered as a Server-Sent Events (SSE) stream containing completion chunks (text deltas, tool calls, tool results, and message lifecycle events)  with periodic keep-alive pings every 5 seconds. File references can be included as context for the AI model.
     * Responses:
     *  - 200: SSE stream of ChatCompletion events (text/event-stream)
     *  - 400: The message is empty or one or more file attachments could not be processed
     *  - 403: You don't have enough permission to access the chat in this room
     *  - 404: The specified room or AI provider was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startNewChat Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-new-chat/
     *
     *
     * @param roomId The identifier of the room in which to create the new AI chat session.
     * @param startNewChatBody The initial message and optional file attachments.
     * @return [Unit]
     */
    @POST("api/2.0/ai/rooms/{roomId}/chats")
    suspend fun startNewChat(@Path("roomId") roomId: kotlin.Int, @Body startNewChatBody: StartNewChatBody): Response<Unit>

}
