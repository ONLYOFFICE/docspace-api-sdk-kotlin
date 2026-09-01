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

import onlyoffice.docspace.api.sdk.models.AiAgentsCreateRequest
import onlyoffice.docspace.api.sdk.models.AiAgentsDeleteRequest
import onlyoffice.docspace.api.sdk.models.AiAgentsResetQuotaRequest
import onlyoffice.docspace.api.sdk.models.AiAgentsUpdateQuotaRequest
import onlyoffice.docspace.api.sdk.models.AiAgentsUpdateRequest
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiFileOperationWrapper
import onlyoffice.docspace.api.sdk.models.AiFolderContentIntegerWrapper
import onlyoffice.docspace.api.sdk.models.AiFolderIntegerArrayWrapper
import onlyoffice.docspace.api.sdk.models.AiFolderIntegerWrapper
import onlyoffice.docspace.api.sdk.models.AiNewItemsAgentNewItemsArrayWrapper

interface AIAgentsApi {
    /**
     * POST api/2.0/ai/agents
     * Create an agent
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAgentsCreate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-create/
     *
     *
     * @param aiAgentsCreateRequest 
     * @return [AiFolderIntegerWrapper]
     */
    @POST("api/2.0/ai/agents")
    suspend fun aiAgentsCreate(@Body aiAgentsCreateRequest: AiAgentsCreateRequest): Response<AiFolderIntegerWrapper>

    /**
     * DELETE api/2.0/ai/agents/{id}
     * Delete an agent
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAgentsDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-delete/
     *
     *
     * @param id 
     * @param aiAgentsDeleteRequest 
     * @return [AiFileOperationWrapper]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/agents/{id}", hasBody = true)
    suspend fun aiAgentsDelete(@Path("id") id: kotlin.String, @Body aiAgentsDeleteRequest: AiAgentsDeleteRequest): Response<AiFileOperationWrapper>

    /**
     * GET api/2.0/ai/agents/{id}
     * Get an agent
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAgentsGet Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-get/
     *
     *
     * @param id 
     * @return [AiFolderIntegerWrapper]
     */
    @GET("api/2.0/ai/agents/{id}")
    suspend fun aiAgentsGet(@Path("id") id: kotlin.String): Response<AiFolderIntegerWrapper>

    /**
     * GET api/2.0/ai/agents
     * List agents
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAgentsList Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-list/
     *
     *
     * @return [AiFolderContentIntegerWrapper]
     */
    @GET("api/2.0/ai/agents")
    suspend fun aiAgentsList(): Response<AiFolderContentIntegerWrapper>

    /**
     * GET api/2.0/ai/agents/news
     * List agent news items
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAgentsNews Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-news/
     *
     *
     * @return [AiNewItemsAgentNewItemsArrayWrapper]
     */
    @GET("api/2.0/ai/agents/news")
    suspend fun aiAgentsNews(): Response<AiNewItemsAgentNewItemsArrayWrapper>

    /**
     * PUT api/2.0/ai/agents/resetquota
     * Reset agents' quota
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAgentsResetQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-reset-quota/
     *
     *
     * @param aiAgentsResetQuotaRequest 
     * @return [AiFolderIntegerArrayWrapper]
     */
    @PUT("api/2.0/ai/agents/resetquota")
    suspend fun aiAgentsResetQuota(@Body aiAgentsResetQuotaRequest: AiAgentsResetQuotaRequest): Response<AiFolderIntegerArrayWrapper>

    /**
     * PUT api/2.0/ai/agents/{id}
     * Update an agent
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAgentsUpdate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update/
     *
     *
     * @param id 
     * @param aiAgentsUpdateRequest 
     * @return [AiFolderIntegerWrapper]
     */
    @PUT("api/2.0/ai/agents/{id}")
    suspend fun aiAgentsUpdate(@Path("id") id: kotlin.String, @Body aiAgentsUpdateRequest: AiAgentsUpdateRequest): Response<AiFolderIntegerWrapper>

    /**
     * PUT api/2.0/ai/agents/agentquota
     * Update agents' quota
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAgentsUpdateQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update-quota/
     *
     *
     * @param aiAgentsUpdateQuotaRequest 
     * @return [AiFolderIntegerArrayWrapper]
     */
    @PUT("api/2.0/ai/agents/agentquota")
    suspend fun aiAgentsUpdateQuota(@Body aiAgentsUpdateQuotaRequest: AiAgentsUpdateQuotaRequest): Response<AiFolderIntegerArrayWrapper>

}
