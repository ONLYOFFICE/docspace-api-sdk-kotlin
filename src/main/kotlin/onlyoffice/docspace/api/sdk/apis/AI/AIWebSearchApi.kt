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
     * Clear
     * Removes the web-search configuration of the scope. Does nothing when web search was not configured there.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiWebSearchClear Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-clear/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/web-search/clear", hasBody = true)
    suspend fun aiWebSearchClear(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * PUT api/2.0/ai/web-search/configure
     * Configure
     * Validates a web-search configuration against the live provider and stores it only when the provider answers, replacing the previous one in a single write.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * Returns the web-search configuration active in the scope, or an empty result when web search is not configured.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * Tells whether web search is configured in the scope.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * Web page contents proxied to the portal's active web-search provider
     * Fetches web page contents on behalf of the document editor's AI plugin, against the portal's active web-search provider, the same way as the search passthrough.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiWebSearchPassthroughContents Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-contents/
     *
     *
     * @param requestBody 
     * @return [AiSuccessResponse]
     */
    @POST("api/2.0/ai/websearch/v1/contents")
    suspend fun aiWebSearchPassthroughContents(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any>): Response<AiSuccessResponse>

    /**
     * POST api/2.0/ai/websearch/v1/search
     * Web search proxied to the portal's active web-search provider
     * Runs a web search on behalf of the document editor's AI plugin. The plugin only holds a placeholder configuration; the portal's active provider and its key are resolved here and never reach the browser.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiWebSearchPassthroughSearch Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-search/
     *
     *
     * @param requestBody 
     * @return [AiSuccessResponse]
     */
    @POST("api/2.0/ai/websearch/v1/search")
    suspend fun aiWebSearchPassthroughSearch(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any>): Response<AiSuccessResponse>

    /**
     * PUT api/2.0/ai/web-search/set-active-config
     * Set active config
     * Stores a web-search configuration without contacting the provider first, for forms that validate locally.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * Test connection
     * Checks a web-search configuration against the live provider without storing it - for a Test button that must not commit on success.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
