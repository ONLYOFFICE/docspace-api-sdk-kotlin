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
import onlyoffice.docspace.api.sdk.models.AiToolsAddCustomServerRequest
import onlyoffice.docspace.api.sdk.models.AiToolsBulkResult
import onlyoffice.docspace.api.sdk.models.AiToolsListSystemTools200Response
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
     * Registers a custom MCP server under the given name so the model may call its tools. The name becomes a URL path segment, so it may not be `.`, `..`, or contain a path separator or a control character. `config` may be omitted in two cases: a name matching a host-configured system server pins the entry to that server's canonical settings as a whitelist marker, and a name already registered portal-wide copies the portal-level configuration into this scope; anything else without a config is rejected. `entityId` scopes the registration and has to name a room the caller can open - a room that is not an agent room folds to the portal-wide scope, while an unreachable one is refused so it cannot silently rewrite the portal's own registry.
     * Responses:
     *  - 200: Whether the server was registered, with the stored entry.
     *  - 400: The server name is missing or is not routable.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Returns the always-allow list of the scope - the tools whose calls run without pausing the round for approval. `entityId` picks the scope and omitting it reads the portal-wide setting. An empty answer means every tool call has to be approved through `POST api/2.0/ai/ai/approve-tool-call`. Use `GET api/2.0/ai/tools/is-allow-always` to ask about a single tool.
     * Responses:
     *  - 200: The tools that run without an approval pause. An empty list means every call needs approval.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Returns the stored configuration of one registered custom MCP server. The name is required and is read from the query; `entityId` picks the scope, and omitting it reads the portal-wide registry. A name that is not registered answers a null body with status 200 rather than 404. The configuration of a system server is returned empty on purpose: those run server-side only, so neither their endpoint nor their credentials are handed to a browser.
     * Responses:
     *  - 200: The stored configuration, empty for a system server and null when the name is not registered.
     *  - 400: The server name is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Returns the tools switched off in the scope, as a map of server type to tool names. `entityId` picks the scope and omitting it reads the portal-wide setting. An absent server type means nothing is switched off for it, so an empty answer means every tool is on offer. Use `GET api/2.0/ai/tools/is-tool-disabled` to ask about one tool instead of reading the whole map.
     * Responses:
     *  - 200: The switched-off tools as a map of server type to tool names. An absent type means nothing is switched off for it.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Tells whether one named tool runs without an approval pause in the scope. Both `serverType` and `toolName` are required and are read from the query; `entityId` picks the scope. The answer is a bare boolean. A false answer means a call to that tool pauses the round, and the caller resumes it with the approve or deny operation.
     * Responses:
     *  - 200: Whether that one tool runs without an approval pause.
     *  - 400: `serverType` or `toolName` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Tells whether one named tool of one server type is switched off in the scope. Both `serverType` and `toolName` are required and are read from the query; `entityId` picks the scope. The answer is a bare boolean. It reflects only the disable list - a tool that is on offer may still require approval, which `GET api/2.0/ai/tools/is-allow-always` reports.
     * Responses:
     *  - 200: Whether that one tool is switched off in the scope.
     *  - 400: `serverType` or `toolName` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Lists the custom MCP servers registered in the scope as a map of name to configuration. `entityId` picks the scope and omitting it lists the portal-wide registry. The configuration of any entry that names a host-configured system server comes back empty, for the same reason as in the single-server read, and the portal's own built-in MCP server is left out of the list entirely because it is always enabled and cannot be configured. The names in the answer are what the disable and always-allow operations accept as `serverType`.
     * Responses:
     *  - 200: The scope's registrations as a map of name to configuration, system entries emptied and the portal's built-in server left out.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Lists every tool the scope can offer the model, as a map of server type to tool group. The answer merges two sources - the host-configured system servers and the live tools of the scope's registered custom MCP servers - and names the system ones separately in `system`, so a client can tell the two apart. `errors` carries the reason a registered server delivered no tools, which is the text to show on a permission card, because the browser cannot reach a server-executed MCP server to find out for itself. The connections are opened server-side, so one request is enough and the client never speaks MCP itself; the portal's own built-in server is left out because it is always enabled.
     * Responses:
     *  - 200: The scope's tools grouped by server type, the system group keys named in `system`, and the reason a registered server delivered none in `errors`.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiToolsListSystemTools Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-system-tools/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [AiToolsListSystemTools200Response]
     */
    @GET("api/2.0/ai/tools/list-system-tools")
    suspend fun aiToolsListSystemTools(@Query("entityId") entityId: kotlin.String? = null): Response<AiToolsListSystemTools200Response>

    /**
     * DELETE api/2.0/ai/tools/remove-custom-server
     * Remove custom server
     * Unregisters a custom MCP server from the scope, so the model is no longer offered its tools. The name is required and may be sent in the body or as a query parameter, and `entityId` has to name a room the caller can open. A name that is not registered is not reported: the call answers success without removing anything. The server itself is untouched - only this portal's registration is dropped.
     * Responses:
     *  - 200: Confirms the request was accepted, whether or not a registration was removed.
     *  - 400: The server name is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Replaces the whole custom MCP server registry of the scope with the supplied map in one write, which makes it the operation a settings screen saves with. `map` is required: without it the registry would be emptied, so a missing or non-object value is rejected rather than treated as none. Every name in the map is validated as a routable path segment and every configuration is resolved before anything is written, so a map with one bad entry changes nothing. `entityId` has to name a room the caller can open - this is the operation where an unreachable one would otherwise have wiped the portal-wide registry.
     * Responses:
     *  - 200: Whether the registry was replaced, with `errors` listing what was refused.
     *  - 400: The body is not a map of server name to configuration, or a name is not routable.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Adds one tool to the scope's always-allow list, or takes it off, which decides whether a call to it pauses the round for approval. `value` is coerced to a boolean, so any truthy value adds and any falsy one removes. Unlike the disable operation, `serverType` is not validated here: an unknown one is stored and then simply never matches, so a wrong value fails silently. `entityId` has to name a room the caller can open.
     * Responses:
     *  - 200: Confirms the always-allow list was updated.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Switches off the listed tools of one server type in the scope, so the model is no longer offered them. `serverType` has to be a key the round's tool filter actually matches - a host-configured system server, one of the two DocSpace integration groups, web search, image generation, or one of the scope's registered custom servers - and an unknown value is rejected with the list of valid ones in the message, rather than stored and silently ignored. `toolNames` replaces the previous selection for that server type, so send the full list and pass an empty one to switch everything back on. `entityId` has to name a room the caller can open.
     * Responses:
     *  - 200: Confirms the new disable list was stored for that server type.
     *  - 400: The list of tools to disable is malformed.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Replaces the stored configuration of a registered custom MCP server, under the same name and scope rules as the add operation. The name is re-validated as a routable path segment, and an omitted `config` resolves the same way - to a system server's canonical settings, or to the portal-level entry of that name. `entityId` has to name a room the caller can open. The answer carries the stored registry entry.
     * Responses:
     *  - 200: Whether the server was updated, with the stored entry.
     *  - 400: The server name is missing or is not routable.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
