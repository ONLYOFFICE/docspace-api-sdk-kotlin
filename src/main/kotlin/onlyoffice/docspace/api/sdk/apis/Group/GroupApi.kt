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


package onlyoffice.docspace.api.sdk.apis.Group

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.GroupArrayWrapper
import onlyoffice.docspace.api.sdk.models.GroupRequestDto
import onlyoffice.docspace.api.sdk.models.GroupSummaryArrayWrapper
import onlyoffice.docspace.api.sdk.models.GroupWrapper
import onlyoffice.docspace.api.sdk.models.MembersRequest
import onlyoffice.docspace.api.sdk.models.NoContentResultWrapper
import onlyoffice.docspace.api.sdk.models.SetManagerRequest
import onlyoffice.docspace.api.sdk.models.SortOrder
import onlyoffice.docspace.api.sdk.models.UpdateGroupRequest

interface GroupApi {
    /**
     * POST api/2.0/group
     * Add a new group
     * Adds a new group with the group manager, name, and members specified in the request.
     * Responses:
     *  - 200: Newly created group with the detailed information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for addGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-group/
     *
     *
     * @param groupRequestDto  (optional)
     * @return [GroupWrapper]
     */
    @POST("api/2.0/group")
    suspend fun addGroup(@Body groupRequestDto: GroupRequestDto? = null): Response<GroupWrapper>

    /**
     * PUT api/2.0/group/{id}/members
     * Add group members
     * Adds new group members to the group with the ID specified in the request.
     * Responses:
     *  - 200: Group with the detailed information
     *  - 404: Group not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for addMembersTo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-members-to/
     *
     *
     * @param id The group ID.
     * @param membersRequest The member request.
     * @return [GroupWrapper]
     */
    @PUT("api/2.0/group/{id}/members")
    suspend fun addMembersTo(@Path("id") id: java.util.UUID, @Body membersRequest: MembersRequest): Response<GroupWrapper>

    /**
     * DELETE api/2.0/group/{id}
     * Delete a group
     * Deletes a group with the ID specified in the request from the list of groups on the portal.
     * Responses:
     *  - 200: No content
     *  - 404: Group not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-group/
     *
     *
     * @param id The group ID.
     * @return [NoContentResultWrapper]
     */
    @DELETE("api/2.0/group/{id}")
    suspend fun deleteGroup(@Path("id") id: java.util.UUID): Response<NoContentResultWrapper>

    /**
     * GET api/2.0/group/{id}
     * Get a group
     * Returns the detailed information about the selected group.
     * Responses:
     *  - 200: Group with the detailed information
     *  - 404: Group not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group/
     *
     *
     * @param id The group ID.
     * @param includeMembers Specifies whether to include the group members or not. (optional)
     * @return [GroupWrapper]
     */
    @GET("api/2.0/group/{id}")
    suspend fun getGroup(@Path("id") id: java.util.UUID, @Query("includeMembers") includeMembers: kotlin.Boolean? = null): Response<GroupWrapper>

    /**
     * GET api/2.0/group/user/{userid}
     * Get user groups
     * Returns a list of groups for the user with the ID specified in the request.
     * Responses:
     *  - 200: List of groups
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroupByUserId Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group-by-user-id/
     *
     *
     * @param userid The user ID.
     * @return [GroupSummaryArrayWrapper]
     */
    @GET("api/2.0/group/user/{userid}")
    suspend fun getGroupByUserId(@Path("userid") userid: java.util.UUID): Response<GroupSummaryArrayWrapper>

    /**
     * GET api/2.0/group
     * Get groups
     * Returns the general information about all the groups, such as group ID and group manager.
     * Responses:
     *  - 200: List of groups
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroups Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups/
     *
     *
     * @param userId The user ID. (optional)
     * @param manager Specifies if the user is a manager or not. (optional)
     * @param count The number of records to retrieve. (optional)
     * @param startIndex The starting index for paginated results. (optional)
     * @param sortBy Specifies the property used to sort the query results. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterValue The text used for filtering or searching group data. (optional)
     * @return [GroupArrayWrapper]
     */
    @GET("api/2.0/group")
    suspend fun getGroups(@Query("userId") userId: java.util.UUID? = null, @Query("manager") manager: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<GroupArrayWrapper>

    /**
     * PUT api/2.0/group/{fromId}/members/{toId}
     * Move group members
     * Moves all the members from the selected group to another one specified in the request.
     * Responses:
     *  - 200: Group with the detailed information
     *  - 404: Group not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for moveMembersTo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-members-to/
     *
     *
     * @param fromId The group ID to move from.
     * @param toId The group ID to move to.
     * @return [GroupWrapper]
     */
    @PUT("api/2.0/group/{fromId}/members/{toId}")
    suspend fun moveMembersTo(@Path("fromId") fromId: java.util.UUID, @Path("toId") toId: java.util.UUID): Response<GroupWrapper>

    /**
     * DELETE api/2.0/group/{id}/members
     * Remove group members
     * Removes the group members specified in the request from the selected group.
     * Responses:
     *  - 200: Group with the detailed information
     *  - 404: Group not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for removeMembersFrom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-members-from/
     *
     *
     * @param id The group ID.
     * @param membersRequest The member request.
     * @return [GroupWrapper]
     */
    @HTTP(method = "DELETE", path = "api/2.0/group/{id}/members", hasBody = true)
    suspend fun removeMembersFrom(@Path("id") id: java.util.UUID, @Body membersRequest: MembersRequest): Response<GroupWrapper>

    /**
     * PUT api/2.0/group/{id}/manager
     * Set a group manager
     * Sets a user with the ID specified in the request as a group manager.
     * Responses:
     *  - 200: Group with the detailed information
     *  - 404: User not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setGroupManager Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-group-manager/
     *
     *
     * @param id The group ID.
     * @param setManagerRequest The request for setting a group manager.
     * @return [GroupWrapper]
     */
    @PUT("api/2.0/group/{id}/manager")
    suspend fun setGroupManager(@Path("id") id: java.util.UUID, @Body setManagerRequest: SetManagerRequest): Response<GroupWrapper>

    /**
     * POST api/2.0/group/{id}/members
     * Replace group members
     * Replaces the group members with those specified in the request.
     * Responses:
     *  - 200: Group with the detailed information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setMembersTo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-members-to/
     *
     *
     * @param id The group ID.
     * @param membersRequest The member request.
     * @return [GroupWrapper]
     */
    @POST("api/2.0/group/{id}/members")
    suspend fun setMembersTo(@Path("id") id: java.util.UUID, @Body membersRequest: MembersRequest): Response<GroupWrapper>

    /**
     * PUT api/2.0/group/{id}
     * Update a group
     * Updates the existing group changing the group manager, name, and/or members.
     * Responses:
     *  - 200: Updated group with the detailed information
     *  - 404: Group not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-group/
     *
     *
     * @param id The group ID.
     * @param updateGroupRequest The request for updating a group.
     * @return [GroupWrapper]
     */
    @PUT("api/2.0/group/{id}")
    suspend fun updateGroup(@Path("id") id: java.util.UUID, @Body updateGroupRequest: UpdateGroupRequest): Response<GroupWrapper>

}
