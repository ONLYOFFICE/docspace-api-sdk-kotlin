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

import onlyoffice.docspace.api.sdk.models.AddMcpServerRequestBody
import onlyoffice.docspace.api.sdk.models.AddRoomServersRequestBody
import onlyoffice.docspace.api.sdk.models.ConnectServerRequestBody
import onlyoffice.docspace.api.sdk.models.DeleteRoomServersRequestBody
import onlyoffice.docspace.api.sdk.models.DeleteServersRequestBody
import onlyoffice.docspace.api.sdk.models.McpServerArrayWrapper
import onlyoffice.docspace.api.sdk.models.McpServerShortArrayWrapper
import onlyoffice.docspace.api.sdk.models.McpServerShortWrapper
import onlyoffice.docspace.api.sdk.models.McpServerStatusArrayWrapper
import onlyoffice.docspace.api.sdk.models.McpServerStatusWrapper
import onlyoffice.docspace.api.sdk.models.McpServerWrapper
import onlyoffice.docspace.api.sdk.models.McpToolArrayWrapper
import onlyoffice.docspace.api.sdk.models.SetMcpToolsRequestBody
import onlyoffice.docspace.api.sdk.models.SetServerStatusRequestBody
import onlyoffice.docspace.api.sdk.models.UpdateServerRequestBody

interface AIMCPApi {
    /**
     * POST api/2.0/ai/rooms/{roomId}/servers
     * Assign MCP servers to a room
     * Associates one or more MCP servers with a specific room, making them available for AI chat sessions  within that room. A maximum of 5 MCP servers can be assigned to a single room. If OAuth-based servers  are included, each room member will need to individually authorize their connection.  Requires room edit permissions.
     * Responses:
     *  - 200: List of MCP server statuses after assignment
     *  - 400: The maximum number of servers per room has been exceeded
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The room with the specified ID was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for addRoomServers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-servers/
     *
     *
     * @param roomId Identifier of the room to which MCP servers will be assigned.
     * @param addRoomServersRequestBody Server identifiers to assign.
     * @return [McpServerStatusArrayWrapper]
     */
    @POST("api/2.0/ai/rooms/{roomId}/servers")
    suspend fun addRoomServers(@Path("roomId") roomId: kotlin.Int, @Body addRoomServersRequestBody: AddRoomServersRequestBody): Response<McpServerStatusArrayWrapper>

    /**
     * POST api/2.0/ai/servers
     * Register a custom MCP server
     * Registers a new custom MCP (Model Context Protocol) server for the current tenant.  The system validates the server name (only letters, numbers, underscores, and hyphens are allowed),  checks that it is not reserved or already taken, and then attempts to connect to the provided endpoint  to verify reachability and credentials before persisting the configuration.  Requires DocSpace administrator privileges.
     * Responses:
     *  - 200: Newly registered MCP server configuration
     *  - 400: Invalid server name, reserved name, duplicate name, incorrect credentials, or invalid endpoint URL
     *  - 403: You don't have permission to manage MCP servers
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for addServer Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-server/
     *
     *
     * @param addMcpServerRequestBody MCP server registration parameters.
     * @return [McpServerWrapper]
     */
    @POST("api/2.0/ai/servers")
    suspend fun addServer(@Body addMcpServerRequestBody: AddMcpServerRequestBody): Response<McpServerWrapper>

    /**
     * POST api/2.0/ai/rooms/{roomId}/servers/{serverId}/connect
     * Connect an OAuth-based MCP server in a room
     * Completes the OAuth authorization flow for an MCP server within a specific room on behalf of the  current user. The authorization code obtained from the OAuth provider must be passed in the request body.  Upon successful token exchange, the system verifies connectivity to the server and stores  the credentials for the current user. Requires room edit permissions.
     * Responses:
     *  - 200: MCP server connection status after authorization
     *  - 400: The provided authorization code is invalid
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The room or MCP server connection was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for connectServer Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/connect-server/
     *
     *
     * @param roomId Identifier of the room containing the MCP server.
     * @param serverId Unique identifier of the MCP server to connect.
     * @param connectServerRequestBody The request body containing additional data necessary for connecting to the server,  such as authentication or operation-specific information.
     * @return [McpServerStatusWrapper]
     */
    @POST("api/2.0/ai/rooms/{roomId}/servers/{serverId}/connect")
    suspend fun connectServer(@Path("roomId") roomId: kotlin.Int, @Path("serverId") serverId: java.util.UUID, @Body connectServerRequestBody: ConnectServerRequestBody): Response<McpServerStatusWrapper>

    /**
     * DELETE api/2.0/ai/rooms/{roomId}/servers
     * Remove MCP servers from a room
     * Detaches one or more MCP servers from the specified room. After removal, the servers will no longer  be available in AI chat sessions within this room. Existing connections and tool configurations for  the removed servers are also cleaned up. Requires room edit permissions.
     * Responses:
     *  - 204: MCP servers were successfully removed from the room
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The room with the specified ID was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteRoomServers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-servers/
     *
     *
     * @param roomId Identifier of the room from which MCP servers will be removed.
     * @param deleteRoomServersRequestBody Server identifiers to remove.
     * @return [Unit]
     */
    @DELETE("api/2.0/ai/rooms/{roomId}/servers")
    suspend fun deleteRoomServers(@Path("roomId") roomId: kotlin.Int, @Body deleteRoomServersRequestBody: DeleteRoomServersRequestBody): Response<Unit>

    /**
     * DELETE api/2.0/ai/servers
     * Delete MCP servers
     * Permanently removes one or more MCP servers from the current tenant by their IDs.  All room associations and connection data for the deleted servers are also cleaned up.  This action is irreversible. Requires DocSpace administrator privileges.
     * Responses:
     *  - 204: MCP servers were successfully deleted
     *  - 403: You don't have permission to manage MCP servers
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteServer Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-server/
     *
     *
     * @param deleteServersRequestBody Server identifiers to delete.
     * @return [Unit]
     */
    @DELETE("api/2.0/ai/servers")
    suspend fun deleteServer(@Body deleteServersRequestBody: DeleteServersRequestBody): Response<Unit>

    /**
     * POST api/2.0/ai/rooms/{roomId}/servers/{serverId}/disconnect
     * Disconnect an MCP server in a room
     * Revokes the current user's OAuth connection to an MCP server within the specified room. After  disconnection, the server's tools will no longer be available to this user in AI chat sessions  until they re-authorize. Other room members' connections are not affected.  Requires room edit permissions.
     * Responses:
     *  - 200: MCP server connection status after disconnection
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The room or MCP server connection was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for disconnectServer Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/disconnect-server/
     *
     *
     * @param roomId Identifier of the room containing the MCP server.
     * @param serverId Unique identifier of the MCP server to disconnect from.
     * @return [McpServerStatusWrapper]
     */
    @POST("api/2.0/ai/rooms/{roomId}/servers/{serverId}/disconnect")
    suspend fun disconnectServer(@Path("roomId") roomId: kotlin.Int, @Path("serverId") serverId: java.util.UUID): Response<McpServerStatusWrapper>

    /**
     * GET api/2.0/ai/servers/available
     * Get available MCP servers
     * Returns a paginated list of MCP servers that are currently active (enabled) and available for  assignment to rooms. Only servers in the enabled state are included. Each entry contains a compact  summary with the server name, type, icon, and status. Supports pagination via startIndex and count.  The total count of available servers is included in the response metadata.
     * Responses:
     *  - 200: Paginated list of active MCP servers available for room assignment
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAvailableServers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-available-servers/
     *
     *
     * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
     * @param count The maximum number of items to return per page. Defaults to 100. (optional)
     * @return [McpServerShortArrayWrapper]
     */
    @GET("api/2.0/ai/servers/available")
    suspend fun getAvailableServers(@Query("startIndex") startIndex: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Response<McpServerShortArrayWrapper>

    /**
     * GET api/2.0/ai/rooms/{roomId}/servers
     * Get MCP servers assigned to a room
     * Returns the list of MCP servers currently assigned to the specified room along with their connection  statuses for the current user. For OAuth-based servers, the connection status reflects whether the  current user has completed authorization. Requires access to the room's AI chat.
     * Responses:
     *  - 200: List of MCP server statuses in the room
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The room with the specified ID was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRoomServers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-servers/
     *
     *
     * @param roomId Identifier of the room whose assigned MCP servers are being retrieved.
     * @return [McpServerStatusArrayWrapper]
     */
    @GET("api/2.0/ai/rooms/{roomId}/servers")
    suspend fun getRoomServers(@Path("roomId") roomId: kotlin.Int): Response<McpServerStatusArrayWrapper>

    /**
     * GET api/2.0/ai/servers/{id}
     * Get an MCP server by ID
     * Retrieves a summary view of a single MCP server by its unique identifier, including its name,  type, enabled state, and icon. This endpoint returns a compact representation without  sensitive details such as endpoint URL or authentication headers.  Requires DocSpace administrator privileges.
     * Responses:
     *  - 200: MCP server summary information
     *  - 403: You don't have permission to manage MCP servers
     *  - 404: The MCP server with the specified ID was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getServer Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-server/
     *
     *
     * @param id Unique identifier of the MCP server to retrieve.
     * @return [McpServerShortWrapper]
     */
    @GET("api/2.0/ai/servers/{id}")
    suspend fun getServer(@Path("id") id: java.util.UUID): Response<McpServerShortWrapper>

    /**
     * GET api/2.0/ai/servers
     * Get all MCP servers
     * Returns a paginated list of all MCP servers registered for the current tenant, including both  enabled and disabled servers. Each entry contains the full configuration (endpoint, headers,  icon, type, and status). Supports pagination via the startIndex and count query parameters.  The total number of servers is included in the response metadata.  Requires DocSpace administrator privileges.
     * Responses:
     *  - 200: Paginated list of all registered MCP servers
     *  - 403: You don't have permission to manage MCP servers
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getServers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-servers/
     *
     *
     * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
     * @param count The maximum number of items to return per page. Defaults to 100. (optional)
     * @return [McpServerArrayWrapper]
     */
    @GET("api/2.0/ai/servers")
    suspend fun getServers(@Query("startIndex") startIndex: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Response<McpServerArrayWrapper>

    /**
     * GET api/2.0/ai/rooms/{roomId}/servers/{serverId}/tools
     * Get MCP server tools in a room
     * Retrieves the full list of tools exposed by an MCP server within the context of a specific room,  along with each tool's enabled or disabled state. Disabled tools will not be invoked during  AI chat sessions in this room. Requires access to the room's AI chat.
     * Responses:
     *  - 200: List of tools with their enabled/disabled states
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The room or MCP server was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTools Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tools/
     *
     *
     * @param roomId Identifier of the room containing the MCP server.
     * @param serverId Unique identifier of the MCP server whose tools are being retrieved.
     * @return [McpToolArrayWrapper]
     */
    @GET("api/2.0/ai/rooms/{roomId}/servers/{serverId}/tools")
    suspend fun getTools(@Path("roomId") roomId: kotlin.Int, @Path("serverId") serverId: java.util.UUID): Response<McpToolArrayWrapper>

    /**
     * PUT api/2.0/ai/servers/{id}/status
     * Enable or disable an MCP server
     * Toggles the enabled/disabled state of an MCP server. When a server is disabled, it becomes  unavailable for assignment to rooms and will not be used during AI chat sessions.  Enabling a previously disabled server restores its availability across the tenant.  Requires DocSpace administrator privileges.
     * Responses:
     *  - 200: MCP server with the updated status
     *  - 403: You don't have permission to manage MCP servers
     *  - 404: The MCP server with the specified ID was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setServerStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-server-status/
     *
     *
     * @param id Unique identifier of the MCP server whose status is being changed.
     * @param setServerStatusRequestBody New status value.
     * @return [McpServerWrapper]
     */
    @PUT("api/2.0/ai/servers/{id}/status")
    suspend fun setServerStatus(@Path("id") id: java.util.UUID, @Body setServerStatusRequestBody: SetServerStatusRequestBody): Response<McpServerWrapper>

    /**
     * PUT api/2.0/ai/rooms/{roomId}/servers/{serverId}/tools
     * Configure MCP server tools in a room
     * Updates the set of disabled tools for an MCP server within a specific room. Pass a list of tool names  that should be disabled — all other tools exposed by the server will remain enabled. This allows  room administrators to restrict which MCP capabilities are available during AI chat sessions.  Requires room edit permissions.
     * Responses:
     *  - 200: Complete list of tools with their enabled/disabled states
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The room or MCP server was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setTools Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tools/
     *
     *
     * @param roomId Identifier of the room containing the MCP server.
     * @param serverId Unique identifier of the MCP server whose tools are being configured.
     * @param setMcpToolsRequestBody Tool configuration parameters.
     * @return [McpToolArrayWrapper]
     */
    @PUT("api/2.0/ai/rooms/{roomId}/servers/{serverId}/tools")
    suspend fun setTools(@Path("roomId") roomId: kotlin.Int, @Path("serverId") serverId: java.util.UUID, @Body setMcpToolsRequestBody: SetMcpToolsRequestBody): Response<McpToolArrayWrapper>

    /**
     * PUT api/2.0/ai/servers/{id}
     * Update a custom MCP server
     * Updates the configuration of an existing custom MCP server identified by its unique ID.  Any combination of fields (name, description, endpoint, headers, icon) can be updated in a single request.  If the endpoint or headers are changed, the system re-validates connectivity by attempting to reach  the new endpoint before saving. Name uniqueness and format rules are enforced on every update.  Requires DocSpace administrator privileges.
     * Responses:
     *  - 200: Updated MCP server configuration
     *  - 400: Invalid server name, reserved name, duplicate name, incorrect credentials, or invalid endpoint URL
     *  - 403: You don't have permission to manage MCP servers
     *  - 404: The MCP server with the specified ID was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateServer Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-server/
     *
     *
     * @param id Unique identifier of the MCP server to update.
     * @param updateServerRequestBody Updated server configuration fields.
     * @return [McpServerWrapper]
     */
    @PUT("api/2.0/ai/servers/{id}")
    suspend fun updateServer(@Path("id") id: java.util.UUID, @Body updateServerRequestBody: UpdateServerRequestBody): Response<McpServerWrapper>

}
