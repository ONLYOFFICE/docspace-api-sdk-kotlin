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

import onlyoffice.docspace.api.sdk.models.AiSettingsWrapper
import onlyoffice.docspace.api.sdk.models.SetEmbeddingConfigRequestBody
import onlyoffice.docspace.api.sdk.models.SetWebSearchSettingsRequestBody
import onlyoffice.docspace.api.sdk.models.VectorizationSettingsWrapper
import onlyoffice.docspace.api.sdk.models.WebSearchSettingsWrapper

interface AISettingsApi {
    /**
     * GET api/2.0/ai/config
     * Get AI settings
     * Retrieves the combined AI configuration for the current portal, including the status of web search,  vectorization, and AI readiness, along with tool names and the portal MCP server identifier.
     * Responses:
     *  - 200: Current AI settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getAiSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-settings/
     *
     *
     * @return [AiSettingsWrapper]
     */
    @GET("api/2.0/ai/config")
    suspend fun getAiSettings(): Response<AiSettingsWrapper>

    /**
     * GET api/2.0/ai/config/vectorization
     * Get vectorization settings
     * Retrieves the current embedding provider settings used for document vectorization,  including the configured provider type and whether the API key needs to be reset.
     * Responses:
     *  - 200: Current vectorization settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getVectorizationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-vectorization-settings/
     *
     *
     * @return [VectorizationSettingsWrapper]
     */
    @GET("api/2.0/ai/config/vectorization")
    suspend fun getVectorizationSettings(): Response<VectorizationSettingsWrapper>

    /**
     * GET api/2.0/ai/config/web-search
     * Get web search settings
     * Retrieves the current web search integration settings for AI chat sessions,  including whether web search is enabled, the configured search engine type, and whether the API key needs to be reset.
     * Responses:
     *  - 200: Current web search settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getWebSearchSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-search-settings/
     *
     *
     * @return [WebSearchSettingsWrapper]
     */
    @GET("api/2.0/ai/config/web-search")
    suspend fun getWebSearchSettings(): Response<WebSearchSettingsWrapper>

    /**
     * PUT api/2.0/ai/config/vectorization
     * Update vectorization settings
     * Configures the embedding provider used for document vectorization at the portal level.  Vectorization enables semantic search and knowledge retrieval capabilities in AI chat sessions.  Allows selecting the embedding provider type and providing the API key for the chosen provider.  Only portal administrators can modify these settings.
     * Responses:
     *  - 200: Updated vectorization settings
     *  - 401: Unauthorized
     *
     * REST API Reference for setVectorizationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-vectorization-settings/
     *
     *
     * @param setEmbeddingConfigRequestBody The embedding provider configuration parameters.
     * @return [VectorizationSettingsWrapper]
     */
    @PUT("api/2.0/ai/config/vectorization")
    suspend fun setVectorizationSettings(@Body setEmbeddingConfigRequestBody: SetEmbeddingConfigRequestBody): Response<VectorizationSettingsWrapper>

    /**
     * PUT api/2.0/ai/config/web-search
     * Update web search settings
     * Configures the web search integration for AI chat sessions at the portal level.  Allows enabling or disabling web search, selecting the search engine type, and providing the API key for the chosen engine.  Only portal administrators can modify these settings.
     * Responses:
     *  - 200: Updated web search settings
     *  - 401: Unauthorized
     *
     * REST API Reference for setWebSearchSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-web-search-settings/
     *
     *
     * @param setWebSearchSettingsRequestBody The web search configuration parameters.
     * @return [WebSearchSettingsWrapper]
     */
    @PUT("api/2.0/ai/config/web-search")
    suspend fun setWebSearchSettings(@Body setWebSearchSettingsRequestBody: SetWebSearchSettingsRequestBody): Response<WebSearchSettingsWrapper>

}
