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
import onlyoffice.docspace.api.sdk.models.AiProfilesTestConnection200Response
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse
import onlyoffice.docspace.api.sdk.models.AiWebSearchConfig
import onlyoffice.docspace.api.sdk.models.AiWebSearchConfigureRequest
import onlyoffice.docspace.api.sdk.models.AiWebSearchMutationResult

interface AIWebSearchApi {
    /**
     * DELETE api/2.0/ai/web-search/clear
     * Clear the web-search configuration
     * Removes the portal's web-search configuration, after which web search is unavailable everywhere it was not configured separately. This is not scoped: it takes no `entityId` and any body sent with it is ignored, so it cannot be used to clear one room's configuration. Clearing an already-unconfigured portal is not an error and the call answers success either way. The stored provider key is destroyed with the configuration and has to be entered again.
     * Responses:
     *  - 200: Confirms the portal has no web-search configuration any more.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiWebSearchClear Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-clear/
     *
     *
     * @param body Ignored. The operation always clears the portal-wide configuration, so send an empty body; a value here does not scope it to a room.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/web-search/clear", hasBody = true)
    suspend fun aiWebSearchClear(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * PUT api/2.0/ai/web-search/configure
     * Configure and verify web search
     * Validates a web-search configuration against the live provider and stores it only if the provider answers, which makes it the safe way to save a form in one step. `entityId` scopes the configuration to a room and has to name one the caller can open; omitting it configures the portal. A `baseUrl` pointing at a private network address is refused. Use `PUT api/2.0/ai/web-search/set-active-config` when the configuration should be stored without a provider round trip.
     * Responses:
     *  - 200: Whether the configuration was stored, after the provider answered.
     *  - 400: The configuration is missing or malformed, or the provider URL points at a private network address.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiWebSearchConfigure Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-configure/
     *
     *
     * @param aiWebSearchConfigureRequest 
     * @return [AiWebSearchMutationResult]
     */
    @PUT("api/2.0/ai/web-search/configure")
    suspend fun aiWebSearchConfigure(@Body aiWebSearchConfigureRequest: AiWebSearchConfigureRequest): Response<AiWebSearchMutationResult>

    /**
     * GET api/2.0/ai/web-search/get-active-config
     * Get active config
     * Returns the web-search configuration in force for a scope - the provider, its endpoint and its settings. `entityId` picks a room and has to name one the caller can open; omitting it reads the portal-wide configuration, and a room with none of its own falls back to that. An unconfigured scope answers an empty result rather than 404. The provider key is not part of the answer, so a client cannot read it back after storing it.
     * Responses:
     *  - 200: The configuration in force for the scope, without the provider key, or an empty result when web search is not configured.
     *  - 400: `entityId` is not a string.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiWebSearchGetActiveConfig Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-get-active-config/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [AiWebSearchConfig]
     */
    @GET("api/2.0/ai/web-search/get-active-config")
    suspend fun aiWebSearchGetActiveConfig(@Query("entityId") entityId: kotlin.String? = null): Response<AiWebSearchConfig>

    /**
     * GET api/2.0/ai/web-search/is-configured
     * Is configured
     * Tells whether web search is available in a scope, as a bare boolean, which is the cheap check for hiding or showing the feature. `entityId` picks a room and has to name one the caller can open. It reports the same state as `GET api/2.0/ai/web-search/get-active-config` without transferring the configuration itself. A true answer means a provider is stored, not that the provider is currently reachable - probe that with `POST api/2.0/ai/web-search/test-connection`.
     * Responses:
     *  - 200: Whether a web-search provider is stored for the scope.
     *  - 400: `entityId` is not a string.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiWebSearchIsConfigured Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-is-configured/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.Boolean]
     */
    @GET("api/2.0/ai/web-search/is-configured")
    suspend fun aiWebSearchIsConfigured(@Query("entityId") entityId: kotlin.String? = null): Response<kotlin.Boolean>

    /**
     * POST api/2.0/ai/websearch/v1/contents
     * Web page contents passthrough
     * Fetches the contents of web pages on behalf of the document editor's AI plugin, against the portal's active web-search provider, exactly as the search passthrough does — including the `entityId` / `entityKind` billing attribution. The portal-wide configuration is used and a portal without one answers 404. The provider's status, body and content type are relayed verbatim, so its 429 and its failures surface unchanged. This is the follow-up to `POST api/2.0/ai/websearch/v1/search`, which returns the results whose contents this operation retrieves.
     * Responses:
     *  - 200: The provider's own response, relayed verbatim with its status and content type.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: Web search is not configured for this portal.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 429: Relayed verbatim from the AI provider, which is rate-limiting this portal's key.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *  - 502: The AI provider could not be reached, or answered with a failure of its own.
     *
     * REST API Reference for aiWebSearchPassthroughContents Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-contents/
     *
     *
     * @param requestBody A page-contents request in the shape the portal's active web-search provider expects, forwarded to it unchanged. The endpoint and the key come from the stored configuration.
     * @return [kotlin.collections.Map<kotlin.String, kotlin.Any>]
     */
    @POST("api/2.0/ai/websearch/v1/contents")
    suspend fun aiWebSearchPassthroughContents(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * POST api/2.0/ai/websearch/v1/search
     * Web search passthrough
     * Runs a web search on behalf of the document editor's AI plugin, which holds only a placeholder configuration - the portal's active provider and its key are resolved here, so neither ever reaches the browser. The portal-wide configuration is used, and a portal without one answers 404. The `entityId` and `entityKind` query parameters name the document the search is billed to; with the ONLYOFFICE provider the entry is resolved under the caller's credentials and sent to the gateway as the request `metadata` (`source_id` / `source_type` / `source_title`), and an entry the caller cannot open sends none. The provider's own status, body and content type are relayed as they stand, so a provider that rate-limits answers 429 and one that is unreachable answers 502. Closing the connection aborts the upstream request.
     * Responses:
     *  - 200: The provider's own response, relayed verbatim with its status and content type.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: Web search is not configured for this portal.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 429: Relayed verbatim from the AI provider, which is rate-limiting this portal's key.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *  - 502: The AI provider could not be reached, or answered with a failure of its own.
     *
     * REST API Reference for aiWebSearchPassthroughSearch Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-search/
     *
     *
     * @param requestBody A search request in the shape the portal's active web-search provider expects, forwarded to it unchanged. The endpoint and the key come from the stored configuration and must not be sent here.
     * @return [kotlin.collections.Map<kotlin.String, kotlin.Any>]
     */
    @POST("api/2.0/ai/websearch/v1/search")
    suspend fun aiWebSearchPassthroughSearch(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * PUT api/2.0/ai/web-search/set-active-config
     * Set active config
     * Stores a web-search configuration without contacting the provider first, for a form that has already validated its input or for restoring a known-good configuration. `entityId` scopes it to a room and has to name one the caller can open. A `baseUrl` pointing at a private network address is still refused, because that check is local. Nothing guarantees the stored provider works: follow up with `POST api/2.0/ai/web-search/test-connection`, or use `PUT api/2.0/ai/web-search/configure` to have the store gated on a live probe.
     * Responses:
     *  - 200: Confirms the configuration was stored, unverified.
     *  - 400: The configuration is missing or malformed, or the provider URL points at a private network address.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiWebSearchSetActiveConfig Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-set-active-config/
     *
     *
     * @param aiWebSearchConfigureRequest 
     * @return [AiSuccessResponse]
     */
    @PUT("api/2.0/ai/web-search/set-active-config")
    suspend fun aiWebSearchSetActiveConfig(@Body aiWebSearchConfigureRequest: AiWebSearchConfigureRequest): Response<AiSuccessResponse>

    /**
     * POST api/2.0/ai/web-search/test-connection
     * Test a web-search provider
     * Probes a web-search configuration against the live provider and reports the outcome, storing nothing - this is what a Test button calls so that a failure commits no state. The configuration is taken from the request rather than from storage, so credentials that were never saved can be checked. A `baseUrl` pointing at a private network address is refused before any request leaves the portal. The verdict is carried in the body rather than in the status, so a failed probe still answers 200 and the caller has to read the payload.
     * Responses:
     *  - 200: The outcome of the probe. A failed probe is reported here, not as a status.
     *  - 400: The configuration is missing or malformed, or the provider URL points at a private network address.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiWebSearchTestConnection Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-test-connection/
     *
     *
     * @param aiWebSearchConfig 
     * @return [AiProfilesTestConnection200Response]
     */
    @POST("api/2.0/ai/web-search/test-connection")
    suspend fun aiWebSearchTestConnection(@Body aiWebSearchConfig: AiWebSearchConfig): Response<AiProfilesTestConnection200Response>

}
