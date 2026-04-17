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

import onlyoffice.docspace.api.sdk.models.CreateAgentRequestDto
import onlyoffice.docspace.api.sdk.models.DeleteRoomRequest
import onlyoffice.docspace.api.sdk.models.FileOperationWrapper
import onlyoffice.docspace.api.sdk.models.FolderContentIntegerWrapper
import onlyoffice.docspace.api.sdk.models.FolderIntegerArrayWrapper
import onlyoffice.docspace.api.sdk.models.FolderIntegerWrapper
import onlyoffice.docspace.api.sdk.models.NewItemsAgentNewItemsArrayWrapper
import onlyoffice.docspace.api.sdk.models.QuotaFilter
import onlyoffice.docspace.api.sdk.models.SortOrder
import onlyoffice.docspace.api.sdk.models.SubjectFilter
import onlyoffice.docspace.api.sdk.models.UpdateRoomRequest
import onlyoffice.docspace.api.sdk.models.UpdateRoomsQuotaRequestDtoInteger
import onlyoffice.docspace.api.sdk.models.UpdateRoomsRoomIdsRequestDtoInteger

interface AIAgentsApi {
    /**
     * POST api/2.0/ai/agents
     * Create an ai agent
     * Creates an ai agent.
     * Responses:
     *  - 200: Agent information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createAgent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-agent/
     *
     *
     * @param createAgentRequestDto  (optional)
     * @return [FolderIntegerWrapper]
     */
    @POST("api/2.0/ai/agents")
    suspend fun createAgent(@Body createAgentRequestDto: CreateAgentRequestDto? = null): Response<FolderIntegerWrapper>

    /**
     * DELETE api/2.0/ai/agents/{id}
     * Remove an ai agent
     * Removes an ai agent.
     * Responses:
     *  - 200: File operation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteAgent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-agent/
     *
     *
     * @param id The room ID.
     * @param deleteRoomRequest The parameters for deleting a room.
     * @return [FileOperationWrapper]
     */
    @DELETE("api/2.0/ai/agents/{id}")
    suspend fun deleteAgent(@Path("id") id: kotlin.Int, @Body deleteRoomRequest: DeleteRoomRequest): Response<FileOperationWrapper>

    /**
     * GET api/2.0/ai/agents/{id}
     * Return an ai agent
     * Returns an ai agent.
     * Responses:
     *  - 200: Agent information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAgentInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agent-info/
     *
     *
     * @param id The room ID.
     * @return [FolderIntegerWrapper]
     */
    @GET("api/2.0/ai/agents/{id}")
    suspend fun getAgentInfo(@Path("id") id: kotlin.Int): Response<FolderIntegerWrapper>

    /**
     * GET api/2.0/ai/agents
     * Get ai agents
     * Get ai agents
     * Responses:
     *  - 200: Agent information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAgents Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agents/
     *
     *
     * @param subjectId The filter by user ID. (optional)
     * @param subjectOwnerId The filter by room owner ID. (optional)
     * @param withoutTags Specifies whether to search by tags or not. (optional)
     * @param tags The tags in the serialized format. (optional)
     * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
     * @param subjectFilter The filter by user (Owner - 0, Member - 1). (optional)
     * @param quotaFilter The filter by quota (All - 0, Default - 1, Custom - 2). (optional)
     * @param count Specifies the maximum number of items to retrieve. (optional)
     * @param startIndex The index from which to start retrieving the room content. (optional)
     * @param sortBy Specifies the field by which the room content should be sorted. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterValue The text filter value used to refine search or query operations. (optional)
     * @return [FolderContentIntegerWrapper]
     */
    @GET("api/2.0/ai/agents")
    suspend fun getAgents(@Query("subjectId") subjectId: kotlin.String? = null, @Query("subjectOwnerId") subjectOwnerId: kotlin.String? = null, @Query("withoutTags") withoutTags: kotlin.Boolean? = null, @Query("tags") tags: kotlin.String? = null, @Query("excludeSubject") excludeSubject: kotlin.Boolean? = null, @Query("subjectFilter") subjectFilter: SubjectFilter? = null, @Query("quotaFilter") quotaFilter: QuotaFilter? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/ai/agents/news
     * Get the room new items
     * Returns the room new items.
     * Responses:
     *  - 200: List of new items
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAgentsNewItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agents-new-items/
     *
     *
     * @return [NewItemsAgentNewItemsArrayWrapper]
     */
    @GET("api/2.0/ai/agents/news")
    suspend fun getAgentsNewItems(): Response<NewItemsAgentNewItemsArrayWrapper>

    /**
     * PUT api/2.0/ai/agents/resetquota
     * Reset the AI agents quota limit
     * Resets the quota limit for the AI agents with the IDs specified in the request.
     * Responses:
     *  - 200: List of AI agents with the detailed information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for resetAgentsQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-agents-quota/
     *
     *
     * @param updateRoomsRoomIdsRequestDtoInteger  (optional)
     * @return [FolderIntegerArrayWrapper]
     */
    @PUT("api/2.0/ai/agents/resetquota")
    suspend fun resetAgentsQuota(@Body updateRoomsRoomIdsRequestDtoInteger: UpdateRoomsRoomIdsRequestDtoInteger? = null): Response<FolderIntegerArrayWrapper>

    /**
     * PUT api/2.0/ai/agents/{id}
     * Update an ai agent
     * Updates an ai agent.
     * Responses:
     *  - 200: Updated agent information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateAgent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-agent/
     *
     *
     * @param id The room ID.
     * @param updateRoomRequest The request parameters for updating a room.
     * @return [FolderIntegerWrapper]
     */
    @PUT("api/2.0/ai/agents/{id}")
    suspend fun updateAgent(@Path("id") id: kotlin.Int, @Body updateRoomRequest: UpdateRoomRequest): Response<FolderIntegerWrapper>

    /**
     * PUT api/2.0/ai/agents/agentquota
     * Change the AI agent quota limit
     * Changes the quota limit for the AI agents with the IDs specified in the request.
     * Responses:
     *  - 200: List of AI agents with the detailed information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateAgentsQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-agents-quota/
     *
     *
     * @param updateRoomsQuotaRequestDtoInteger  (optional)
     * @return [FolderIntegerArrayWrapper]
     */
    @PUT("api/2.0/ai/agents/agentquota")
    suspend fun updateAgentsQuota(@Body updateRoomsQuotaRequestDtoInteger: UpdateRoomsQuotaRequestDtoInteger? = null): Response<FolderIntegerArrayWrapper>

}
