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

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.IconRequest
import onlyoffice.docspace.api.sdk.models.RoomGroupArrayWrapper
import onlyoffice.docspace.api.sdk.models.RoomGroupRequestDto
import onlyoffice.docspace.api.sdk.models.RoomGroupWrapper
import onlyoffice.docspace.api.sdk.models.SearchArea
import onlyoffice.docspace.api.sdk.models.UpdateRoomGroupRequest

interface GroupsApi {
    /**
     * POST api/2.0/files/group
     * Add a new room group
     * Creates a room group, a personal collection that gathers rooms the caller already works with under one name  and icon; it belongs to the account that created it and is never shown to other members of the portal. Pass  the group name, the identifier of one of the built-in covers offered by `GET api/2.0/files/rooms/covers`, and  a list of at least one room - a number for a room stored in the portal, a string for a room on a connected  third-party account. Any role may create its own group, a guest included: what is checked is read access to  each listed room, not the role of the caller. Repeated identifiers are collapsed, and a value that is not a  room identifier at all is rejected as an invalid request. When none of the listed rooms can be read the group  is not created; when only some of them can, the group is created with those rooms and the call is still  reported as failed, so re-read `GET api/2.0/files/group` before retrying. A room may sit in several groups,  and two groups of the same account may carry the same name. The answer is the stored group with its rooms.
     * Responses:
     *  - 200: The created room group with the rooms that were linked to it
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Change room group icon
     * Replaces the icon of one of the caller's own room groups and returns the whole group, its name and its rooms  left as they were. Send the identifier of one of the built-in covers offered by  `GET api/2.0/files/rooms/covers`; an empty string strips the icon, after which the group comes back with an  empty `icon`, and any other value - including a word that merely reads like one, such as `none` - is rejected  as an invalid request. An uploaded image cannot be used here, unlike the logo of a room. Leaving `icon` out of  the body or sending it as null is accepted and changes nothing, whereas a request that carries no body at all,  or a body that is not JSON, is refused. Setting the icon the group already has is accepted as well, so  retrying the call is safe. Any role may re-icon its own group, and a group belonging to another account is  answered as missing rather than refused, exactly as reading it would be.
     * Responses:
     *  - 200: The room group with the new icon
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeRoomGroupIcon Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-group-icon/
     *
     *
     * @param id The room group to re-icon, identified by the value `GET api/2.0/files/group` reports for it. A group of  another account cannot be addressed and reads as missing.
     * @param iconRequest The icon to give the group. A body that leaves the icon out is accepted and changes nothing. (optional)
     * @return [RoomGroupWrapper]
     */
    @POST("api/2.0/files/group/{id}/icon")
    suspend fun changeRoomGroupIcon(@Path("id") id: kotlin.Int, @Body iconRequest: IconRequest? = null): Response<RoomGroupWrapper>

    /**
     * DELETE api/2.0/files/group/{id}
     * Delete a room group
     * Deletes one of the caller's own room groups. Only the collection goes away: the rooms it gathered, their  content and the shares on them are left exactly as they were, and a room that was in no other group simply  stops being grouped. Deleting a group of another account is refused, and an identifier that names nothing -  because it never existed, or because the group has already been deleted - is answered as missing, so repeating  the call after a successful delete does not report success a second time. The operation is destructive and  cannot be undone: there is no trash for groups, and rebuilding one means calling `POST api/2.0/files/group`  again with the same name, icon and rooms, which gives it a new identifier. Nothing is returned in the body.  The `includeMembers` parameter is accepted here because the route shares its contract with  `GET api/2.0/files/group/{id}`, and has no effect on what is deleted. Read the group first when the rooms it  gathers still have to be recorded somewhere.
     * Responses:
     *  - 200: The room group no longer exists; the body is empty and the rooms it gathered are left as they were
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteRoomGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-group/
     *
     *
     * @param id The room group to act on, identified by the value `GET api/2.0/files/group` reports for it. A group of another  account cannot be addressed and reads as missing.
     * @param includeMembers Whether the rooms of the group are listed in the answer: true fills the `rooms` array, false leaves it out and  reports only how many there are in `totalRooms`. (optional)
     * @return [Unit]
     */
    @DELETE("api/2.0/files/group/{id}")
    suspend fun deleteRoomGroup(@Path("id") id: kotlin.Int, @Query("includeMembers") includeMembers: kotlin.Boolean? = null): Response<Unit>

    /**
     * GET api/2.0/files/group/{id}
     * Get room group info
     * Returns one room group of the calling account together with the rooms it gathers. Groups are personal: an  identifier that belongs to another member is answered the same way as one that was never created or has  already been deleted, and a portal administrator is no exception to that rule. Take the identifier from  `GET api/2.0/files/group`, which lists the groups the caller owns. Set `includeMembers` to false to get the  group without the `rooms` array, which is the cheaper form when only the name, the icon and the number of  rooms are needed; `totalRooms` is filled either way. A room moved to the archive is left out of both `rooms`  and `totalRooms` while its membership survives, so taking the room out of the archive brings it back into the  group. Rooms stored in the portal are listed before rooms on connected third-party accounts. The call is  read-only and changes nothing about the group or the rooms it refers to.
     * Responses:
     *  - 200: The room group with the rooms it gathers
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRoomGroupInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-group-info/
     *
     *
     * @param id The room group to act on, identified by the value `GET api/2.0/files/group` reports for it. A group of another  account cannot be addressed and reads as missing.
     * @param includeMembers Whether the rooms of the group are listed in the answer: true fills the `rooms` array, false leaves it out and  reports only how many there are in `totalRooms`. (optional)
     * @return [RoomGroupWrapper]
     */
    @GET("api/2.0/files/group/{id}")
    suspend fun getRoomGroupInfo(@Path("id") id: kotlin.Int, @Query("includeMembers") includeMembers: kotlin.Boolean? = null): Response<RoomGroupWrapper>

    /**
     * GET api/2.0/files/group
     * List room groups
     * Returns every room group of the calling account, each with the rooms it gathers. Only groups the caller  created are listed: groups of other members never appear here, and an account that has never made one gets an  empty array back. Set `includeMembers` to false to leave the `rooms` array out of every entry and keep the  name, the icon and `totalRooms` alone, which is the cheaper form when the list is only being shown as a menu.  Archived rooms are skipped in both the `rooms` array and the `totalRooms` count, and reappear once the room is  taken out of the archive. The listing is neither paged nor filtered - it always carries the whole set - and  the order of the entries is not contractual, so sort them on the client when the order matters. The call is  read-only. Use `GET api/2.0/files/group/{id}` when the identifier of a single group is already known, and  `POST api/2.0/files/group` to add one.
     * Responses:
     *  - 200: The room groups of the calling account
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRoomGroups Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-groups/
     *
     *
     * @param includeMembers Whether the rooms of each group are listed in the answer: true fills the `rooms` array of every entry, false  leaves it out and reports only how many there are in `totalRooms`. (optional)
     * @param searchArea The section to list the groups of: Active for Rooms and Forms for Forms. Active when omitted. (optional)
     * @return [RoomGroupArrayWrapper]
     */
    @GET("api/2.0/files/group")
    suspend fun getRoomGroups(@Query("includeMembers") includeMembers: kotlin.Boolean? = null, @Query("searchArea") searchArea: SearchArea? = null): Response<RoomGroupArrayWrapper>

    /**
     * PUT api/2.0/files/group/{id}
     * Update room group
     * Applies changes to one of the caller's own room groups: a new name, rooms to attach, rooms to detach, or any  combination of the three in a single call. A body that carries none of the three (`{}`) is accepted and  changes nothing, while a body that names them and leaves every one of them empty asks for an update that  cannot be performed and is rejected as an invalid request. `roomsToAdd` is resolved the way creation resolves  its list: every identifier has to name a room the caller can read, repeats and rooms already in the group are  collapsed, and when only part of the list resolves the rest is still attached and the call is reported as  failed. `roomsToRemove` works the other way round - a room already in the group is always detached, even when  the caller has since lost access to it, whereas an identifier that is not in the group is resolved first and  refused when it names nothing. The steps are applied in order and are not rolled back when a later one fails.  A group of another account is answered as missing. The answer is the group as stored after the call.
     * Responses:
     *  - 200: The room group as stored after the change
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateRoomGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room-group/
     *
     *
     * @param id The room group to change, identified by the value `GET api/2.0/files/group` reports for it. A group of another  account cannot be addressed and reads as missing.
     * @param updateRoomGroupRequest The changes to apply. Carrying none of them leaves the group as it is, and each of them may be sent on its own  or together with the others.
     * @return [RoomGroupWrapper]
     */
    @PUT("api/2.0/files/group/{id}")
    suspend fun updateRoomGroup(@Path("id") id: kotlin.Int, @Body updateRoomGroupRequest: UpdateRoomGroupRequest): Response<RoomGroupWrapper>

}
