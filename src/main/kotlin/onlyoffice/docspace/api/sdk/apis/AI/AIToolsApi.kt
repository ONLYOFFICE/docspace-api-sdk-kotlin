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
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse
import onlyoffice.docspace.api.sdk.models.AiTMCPItem
import onlyoffice.docspace.api.sdk.models.AiToolsAddCustomServerRequest
import onlyoffice.docspace.api.sdk.models.AiToolsBulkResult
import onlyoffice.docspace.api.sdk.models.AiToolsMutationResult
import onlyoffice.docspace.api.sdk.models.AiToolsRemoveCustomServerRequest
import onlyoffice.docspace.api.sdk.models.AiToolsReplaceAllCustomServersRequest
import onlyoffice.docspace.api.sdk.models.AiToolsSetAllowAlwaysRequest
import onlyoffice.docspace.api.sdk.models.AiToolsSetDisabledRequest
import onlyoffice.docspace.api.sdk.models.AiToolsUpdateCustomServerRequest

interface AIToolsApi {
    /**
     * POST api/2.0/ai/tools/add-custom-server
     * Add custom server
     * Registers a custom MCP server in the scope under the given name.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsAddCustomServer Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-add-custom-server/
     *
     *
     * @param aiToolsAddCustomServerRequest 
     * @return [AiToolsMutationResult]
     */
    @POST("api/2.0/ai/tools/add-custom-server")
    suspend fun aiToolsAddCustomServer(@Body aiToolsAddCustomServerRequest: AiToolsAddCustomServerRequest): Response<AiToolsMutationResult>

    /**
     * GET api/2.0/ai/tools/get-allow-always
     * Get allow always
     * Lists the tools on the always-allow list of the scope.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsGetAllowAlways Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-allow-always/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.collections.List<kotlin.String>]
     */
    @GET("api/2.0/ai/tools/get-allow-always")
    suspend fun aiToolsGetAllowAlways(@Query("entityId") entityId: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * GET api/2.0/ai/tools/get-custom-server
     * Get custom server
     * Returns the configuration of one custom MCP server, or an empty result when it is not registered.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsGetCustomServer Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-custom-server/
     *
     *
     * @param name The custom MCP server name.
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.Any]
     */
    @GET("api/2.0/ai/tools/get-custom-server")
    suspend fun aiToolsGetCustomServer(@Query("name") name: kotlin.String, @Query("entityId") entityId: kotlin.String? = null): Response<kotlin.Any>

    /**
     * GET api/2.0/ai/tools/get-disabled
     * Get disabled
     * Returns the switched-off tools of the scope, grouped by server type.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsGetDisabled Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-disabled/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>]
     */
    @GET("api/2.0/ai/tools/get-disabled")
    suspend fun aiToolsGetDisabled(@Query("entityId") entityId: kotlin.String? = null): Response<kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>>

    /**
     * GET api/2.0/ai/tools/is-allow-always
     * Is allow always
     * Tells whether one tool is on the always-allow list.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsIsAllowAlways Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-is-allow-always/
     *
     *
     * @param serverType The MCP server type the tool belongs to.
     * @param toolName The tool name.
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.Boolean]
     */
    @GET("api/2.0/ai/tools/is-allow-always")
    suspend fun aiToolsIsAllowAlways(@Query("serverType") serverType: kotlin.String, @Query("toolName") toolName: kotlin.String, @Query("entityId") entityId: kotlin.String? = null): Response<kotlin.Boolean>

    /**
     * GET api/2.0/ai/tools/is-tool-disabled
     * Is tool disabled
     * Tells whether one tool of a server type is switched off.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsIsToolDisabled Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-is-tool-disabled/
     *
     *
     * @param serverType The MCP server type the tool belongs to.
     * @param toolName The tool name.
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.Boolean]
     */
    @GET("api/2.0/ai/tools/is-tool-disabled")
    suspend fun aiToolsIsToolDisabled(@Query("serverType") serverType: kotlin.String, @Query("toolName") toolName: kotlin.String, @Query("entityId") entityId: kotlin.String? = null): Response<kotlin.Boolean>

    /**
     * GET api/2.0/ai/tools/list-custom-servers
     * List custom servers
     * Lists the custom MCP servers registered in the scope, keyed by name.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsListCustomServers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-custom-servers/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.collections.Map<kotlin.String, kotlin.Any>]
     */
    @GET("api/2.0/ai/tools/list-custom-servers")
    suspend fun aiToolsListCustomServers(@Query("entityId") entityId: kotlin.String? = null): Response<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * GET api/2.0/ai/tools/list-system-tools
     * List system tools
     * Lists the tools of the host-configured system MCP servers, grouped by server type. The servers are connected and listed server-side, so the client renders its permission cards from one request and never opens an MCP connection of its own.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsListSystemTools Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-system-tools/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.collections.Map<kotlin.String, kotlin.collections.List<AiTMCPItem>>]
     */
    @GET("api/2.0/ai/tools/list-system-tools")
    suspend fun aiToolsListSystemTools(@Query("entityId") entityId: kotlin.String? = null): Response<kotlin.collections.Map<kotlin.String, kotlin.collections.List<AiTMCPItem>>>

    /**
     * DELETE api/2.0/ai/tools/remove-custom-server
     * Remove custom server
     * Removes a custom MCP server from the registry.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsRemoveCustomServer Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-remove-custom-server/
     *
     *
     * @param aiToolsRemoveCustomServerRequest 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/tools/remove-custom-server", hasBody = true)
    suspend fun aiToolsRemoveCustomServer(@Body aiToolsRemoveCustomServerRequest: AiToolsRemoveCustomServerRequest): Response<AiSuccessResponse>

    /**
     * PUT api/2.0/ai/tools/replace-all-custom-servers
     * Replace all custom servers
     * Replaces the whole custom MCP server registry of the scope with the supplied map.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsReplaceAllCustomServers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-replace-all-custom-servers/
     *
     *
     * @param aiToolsReplaceAllCustomServersRequest 
     * @return [AiToolsBulkResult]
     */
    @PUT("api/2.0/ai/tools/replace-all-custom-servers")
    suspend fun aiToolsReplaceAllCustomServers(@Body aiToolsReplaceAllCustomServersRequest: AiToolsReplaceAllCustomServersRequest): Response<AiToolsBulkResult>

    /**
     * PUT api/2.0/ai/tools/set-allow-always
     * Set allow always
     * Adds a tool to the always-allow list, or removes it - the tools on that list run without an approval dialog.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsSetAllowAlways Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-allow-always/
     *
     *
     * @param aiToolsSetAllowAlwaysRequest 
     * @return [AiSuccessResponse]
     */
    @PUT("api/2.0/ai/tools/set-allow-always")
    suspend fun aiToolsSetAllowAlways(@Body aiToolsSetAllowAlwaysRequest: AiToolsSetAllowAlwaysRequest): Response<AiSuccessResponse>

    /**
     * PUT api/2.0/ai/tools/set-disabled
     * Set disabled
     * Marks the listed tools of one server type as switched off, so the model is no longer offered them.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsSetDisabled Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-disabled/
     *
     *
     * @param aiToolsSetDisabledRequest 
     * @return [AiSuccessResponse]
     */
    @PUT("api/2.0/ai/tools/set-disabled")
    suspend fun aiToolsSetDisabled(@Body aiToolsSetDisabledRequest: AiToolsSetDisabledRequest): Response<AiSuccessResponse>

    /**
     * PUT api/2.0/ai/tools/update-custom-server
     * Update custom server
     * Updates the configuration of a registered custom MCP server.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiToolsUpdateCustomServer Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-update-custom-server/
     *
     *
     * @param aiToolsUpdateCustomServerRequest 
     * @return [AiToolsMutationResult]
     */
    @PUT("api/2.0/ai/tools/update-custom-server")
    suspend fun aiToolsUpdateCustomServer(@Body aiToolsUpdateCustomServerRequest: AiToolsUpdateCustomServerRequest): Response<AiToolsMutationResult>

}
