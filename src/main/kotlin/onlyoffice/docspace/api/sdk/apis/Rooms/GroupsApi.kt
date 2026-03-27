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


package onlyoffice.docspace.api.sdk.apis.Rooms

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.IconRequest
import onlyoffice.docspace.api.sdk.models.RoomGroupArrayWrapper
import onlyoffice.docspace.api.sdk.models.RoomGroupRequestDto
import onlyoffice.docspace.api.sdk.models.RoomGroupWrapper
import onlyoffice.docspace.api.sdk.models.UpdateRoomGroupRequest

interface GroupsApi {
    /**
     * POST api/2.0/files/group
     * Add a new room group
     * Creates a new room group with the specified name, icon, and list of rooms.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for addRoomGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-group/
     *
     *
     * @param roomGroupRequestDto  (optional)
     * @return [RoomGroupWrapper]
     */
    @POST("api/2.0/files/group")
    suspend fun addRoomGroup(@Body roomGroupRequestDto: RoomGroupRequestDto? = null): Response<RoomGroupWrapper>

    /**
     * POST api/2.0/files/group/{id}/icon
     * Change group icon
     * Changes the icon of an existing room group.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for changeRoomGroupIcon Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-group-icon/
     *
     *
     * @param id Group id
     * @param iconRequest Icon update data. (optional)
     * @return [RoomGroupWrapper]
     */
    @POST("api/2.0/files/group/{id}/icon")
    suspend fun changeRoomGroupIcon(@Path("id") id: kotlin.Int, @Body iconRequest: IconRequest? = null): Response<RoomGroupWrapper>

    /**
     * DELETE api/2.0/files/group/{id}
     * Delete group
     * Deletes the specified room group.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteRoomGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-group/
     *
     *
     * @param id The group unique identifier.
     * @param includeMembers Whether to include group members. (optional)
     * @return [Unit]
     */
    @DELETE("api/2.0/files/group/{id}")
    suspend fun deleteRoomGroup(@Path("id") id: kotlin.Int, @Query("includeMembers") includeMembers: kotlin.Boolean? = null): Response<Unit>

    /**
     * GET api/2.0/files/group/{id}
     * Get room group info
     * Returns detailed information about a room group.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomGroupInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-group-info/
     *
     *
     * @param id The group unique identifier.
     * @param includeMembers Whether to include group members. (optional)
     * @return [RoomGroupWrapper]
     */
    @GET("api/2.0/files/group/{id}")
    suspend fun getRoomGroupInfo(@Path("id") id: kotlin.Int, @Query("includeMembers") includeMembers: kotlin.Boolean? = null): Response<RoomGroupWrapper>

    /**
     * GET api/2.0/files/group
     * List room groups
     * Returns a list of all room groups for the current user.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomGroups Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-groups/
     *
     *
     * @param id The group unique identifier.
     * @param includeMembers Whether to include group members. (optional)
     * @return [RoomGroupArrayWrapper]
     */
    @GET("api/2.0/files/group")
    suspend fun getRoomGroups(@Path("id") id: kotlin.Int, @Query("includeMembers") includeMembers: kotlin.Boolean? = null): Response<RoomGroupArrayWrapper>

    /**
     * PUT api/2.0/files/group/{id}
     * Update room group
     * Updates room group properties and adds or removes rooms.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for updateRoomGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room-group/
     *
     *
     * @param id The group ID.
     * @param updateRoomGroupRequest The request for updating a group.
     * @return [RoomGroupWrapper]
     */
    @PUT("api/2.0/files/group/{id}")
    suspend fun updateRoomGroup(@Path("id") id: kotlin.Int, @Body updateRoomGroupRequest: UpdateRoomGroupRequest): Response<RoomGroupWrapper>

}
