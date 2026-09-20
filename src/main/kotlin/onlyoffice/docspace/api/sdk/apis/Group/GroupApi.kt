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

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.GroupArrayWrapper
import onlyoffice.docspace.api.sdk.models.GroupRequestDto
import onlyoffice.docspace.api.sdk.models.GroupSummaryArrayWrapper
import onlyoffice.docspace.api.sdk.models.GroupWrapper
import onlyoffice.docspace.api.sdk.models.MembersRequest
import onlyoffice.docspace.api.sdk.models.SetManagerRequest
import onlyoffice.docspace.api.sdk.models.SortOrder
import onlyoffice.docspace.api.sdk.models.UpdateGroupRequest

interface GroupApi {
    /**
     * POST api/2.0/group
     * Add a new group
     * Creates a group with the given name and, optionally, a manager and a first set of members.  The caller needs the permissions to edit groups and to add and remove users.  The name is required and cannot be blank, and unlike the operations that add members later, this one checks  every listed account upfront and rejects the whole call with 400 if any of them is unusable - a guest, a  disabled account or an ID that matches nobody.  The call is not idempotent: names are not unique, so repeating it creates a second group with the same name.  Creating a group raises a `GroupCreated` webhook, and the answer holds the new group with its members  included.  Members can be changed afterwards through `PUT api/2.0/group/{id}` or the dedicated member operations.
     * Responses:
     *  - 200: The new group, with its members
     *  - 400: The group name is empty, or one of the listed accounts is a guest, is disabled or does not exist
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
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
     * Adds the listed accounts to a group, keeping the members it already has.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  Accounts that cannot be group members - a guest, a disabled account or an ID that matches nobody - are  silently skipped instead of failing the call, so compare the members in the answer with what was sent to see  what was actually applied.  The call is idempotent for an account that is already a member, and it does not change who manages the group;  use `PUT api/2.0/group/{id}/manager` for that.  The answer is the group with its members after the addition.  To replace the whole list instead of extending it, use `POST api/2.0/group/{id}/members`.
     * Responses:
     *  - 200: The group with its members after the addition
     *  - 403: No permissions to perform this action
     *  - 404: No group has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for addMembersTo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-members-to/
     *
     *
     * @param id The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404.
     * @param membersRequest The accounts to add, replace with, or remove.
     * @return [GroupWrapper]
     */
    @PUT("api/2.0/group/{id}/members")
    suspend fun addMembersTo(@Path("id") id: java.util.UUID, @Body membersRequest: MembersRequest): Response<GroupWrapper>

    /**
     * DELETE api/2.0/group/{id}
     * Delete a group
     * Deletes a group and withdraws the access it had been granted to rooms, folders and files.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  The removal is permanent and cannot be undone, and it affects sharing: everything that was shared with the  group loses that share, so members who had access only through this group lose it too.  The accounts themselves are kept - only their membership disappears.  The call answers 204 with no body and raises a `GroupDeleted` webhook; a second call with the same ID answers  404 rather than succeeding again.  To empty a group without deleting it, move its members away with  `PUT api/2.0/group/{fromId}/members/{toId}` or remove them through `DELETE api/2.0/group/{id}/members`.
     * Responses:
     *  - 204: The group is deleted. No content is returned
     *  - 403: No permissions to perform this action
     *  - 404: No group has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-group/
     *
     *
     * @param id The ID of the group to delete, taken from the route. It has to be a group that has not been deleted already,  otherwise the operation answers 404.
     * @return [Unit]
     */
    @DELETE("api/2.0/group/{id}")
    suspend fun deleteGroup(@Path("id") id: java.util.UUID): Response<Unit>

    /**
     * GET api/2.0/group/{id}
     * Get a group
     * Returns one group by its ID, with its name, its manager and - when asked for - the accounts that belong to  it.  The caller needs the permission to read groups, and the ID has to belong to a group that has not been  deleted, otherwise the operation answers 404.  The call is read-only, and the member list is left out unless `includeMembers` is set to true, so ask for it  only when the members are actually needed.  Use `GET api/2.0/group` to look a group up by name or to page through them all.
     * Responses:
     *  - 200: The group, with its members when includeMembers was set
     *  - 403: No permissions to perform this action
     *  - 404: No group has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group/
     *
     *
     * @param id The ID of the group to read, taken from the route. It has to be a group that has not been deleted, otherwise  the operation answers 404.
     * @param includeMembers Whether to fill in the member list of the group. It defaults to true, so set it to false when only the name  and the manager are needed and the group may be large. (optional)
     * @return [GroupWrapper]
     */
    @GET("api/2.0/group/{id}")
    suspend fun getGroup(@Path("id") id: java.util.UUID, @Query("includeMembers") includeMembers: kotlin.Boolean? = null): Response<GroupWrapper>

    /**
     * GET api/2.0/group/user/{userid}
     * Get user groups
     * Returns every group the account with the ID in the route belongs to, as a flat list of ID and name pairs.  The caller needs the permission to read groups.  The call is read-only, is not paged, and answers an empty list both for an account that belongs to no group  and for an ID that matches no account, so an empty answer does not prove the account exists.  The entries are summaries and carry neither the manager nor the members - read `GET api/2.0/group/{id}` for  the full picture of one of them.
     * Responses:
     *  - 200: The groups the account belongs to, as ID and name pairs
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroupByUserId Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group-by-user-id/
     *
     *
     * @param userid The ID of the account whose groups are listed, taken from the route. An ID that matches no account yields an  empty list rather than 404.
     * @return [GroupSummaryArrayWrapper]
     */
    @GET("api/2.0/group/user/{userid}")
    suspend fun getGroupByUserId(@Path("userid") userid: java.util.UUID): Response<GroupSummaryArrayWrapper>

    /**
     * GET api/2.0/group
     * Get groups
     * Returns the groups of the portal, one page at a time, with the summary information about each of them - the  ID, the name and the manager - but without the member list.  The caller needs the permission to read groups.  The call is read-only, and the number of groups that match the filters is reported in the total count of the  response, so a client can page through them with `count` and `startIndex`.  Narrow the result with `filterValue` on the group name, with `userId` to keep only the groups that account  belongs to, and with `manager` set to true to keep only the groups it manages; order it with `sortBy` and  `sortOrder`, and an unknown `sortBy` falls back to sorting by title.  The entries carry no members - read `GET api/2.0/group/{id}` with `includeMembers` for one group, or  `GET api/2.0/group/user/{userid}` to find the groups of a single account.
     * Responses:
     *  - 200: The matching groups, with their summary information
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroups Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups/
     *
     *
     * @param userId Keeps only the groups the account with this ID takes part in. Omit it to search every group of the portal. (optional)
     * @param manager Narrows `userId` down to the groups that account manages, instead of every group it belongs to. It has no  effect on its own and defaults to false. (optional)
     * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
     * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
     * @param sortBy What to order the groups by: `Title`, `Manager` or `MembersCount`, compared without regard to case. Any other  value, and omitting the field, orders by title. (optional)
     * @param sortOrder The direction of the ordering: `Ascending`, which is the default, or `Descending`. (optional)
     * @param filterValue The text to match against the group name. Omit it to get every group. (optional)
     * @return [GroupArrayWrapper]
     */
    @GET("api/2.0/group")
    suspend fun getGroups(@Query("userId") userId: java.util.UUID? = null, @Query("manager") manager: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<GroupArrayWrapper>

    /**
     * PUT api/2.0/group/{fromId}/members/{toId}
     * Move group members
     * Moves every member of one group into another group, emptying the first one.  The caller needs the permissions to edit groups and to add and remove users, and both IDs have to belong to  groups that have not been deleted, otherwise the operation answers 404.  The source group is kept, only without members, so delete it separately through  `DELETE api/2.0/group/{id}` if it is no longer needed.  Members that cannot be group members any more are silently skipped rather than failing the call, and an  account that already belongs to the destination is simply left there.  The answer is the destination group with its members, not the source one.  To move a chosen few instead of everybody, use `PUT api/2.0/group/{id}/members` and  `DELETE api/2.0/group/{id}/members`.
     * Responses:
     *  - 200: The destination group with its members
     *  - 403: No permissions to perform this action
     *  - 404: No group has one of the specified IDs
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for moveMembersTo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-members-to/
     *
     *
     * @param fromId The ID of the group the members are taken from. It is emptied but not deleted, and it has to be a group that  has not been deleted already.
     * @param toId The ID of the group the members are moved into. It is the group the answer describes, and it has to be a  group that has not been deleted already.
     * @return [GroupWrapper]
     */
    @PUT("api/2.0/group/{fromId}/members/{toId}")
    suspend fun moveMembersTo(@Path("fromId") fromId: java.util.UUID, @Path("toId") toId: java.util.UUID): Response<GroupWrapper>

    /**
     * DELETE api/2.0/group/{id}/members
     * Remove group members
     * Removes the listed accounts from a group, leaving the rest of its members in place.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  The accounts themselves are kept; only their membership in this group ends, together with the access they had  through it.  The call is idempotent and forgiving: an ID that is not a member, and one that matches no account at all, are  both skipped without an error, and an empty list simply changes nothing.  The answer is the group with the members that remain.  Emptying a group cannot be done through `POST api/2.0/group/{id}/members`, which needs at least one valid  account, so list every member here, or move them away with `PUT api/2.0/group/{fromId}/members/{toId}`.
     * Responses:
     *  - 200: The group with the members that remain
     *  - 403: No permissions to perform this action
     *  - 404: No group has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for removeMembersFrom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-members-from/
     *
     *
     * @param id The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404.
     * @param membersRequest The accounts to add, replace with, or remove.
     * @return [GroupWrapper]
     */
    @HTTP(method = "DELETE", path = "api/2.0/group/{id}/members", hasBody = true)
    suspend fun removeMembersFrom(@Path("id") id: java.util.UUID, @Body membersRequest: MembersRequest): Response<GroupWrapper>

    /**
     * PUT api/2.0/group/{id}/manager
     * Set a group manager
     * Makes an account the manager of a group, replacing whoever managed it before.  The caller needs the permissions to edit groups and to add and remove users.  Both the group and the account have to exist: the operation answers 404 when the ID in the route matches no  live group and also when `userId` matches no account, so the message of the error says which of the two was  not found.  The account is added to the group at the same time, so a manager does not have to be a member beforehand, and  the previous manager stays in the group as an ordinary member.  A group has one manager, which makes the call idempotent when it names the account that manages it already.  The answer is the group with its new manager.  To change the members rather than the manager, use `PUT api/2.0/group/{id}/members`.
     * Responses:
     *  - 200: The group with its new manager
     *  - 403: No permissions to perform this action
     *  - 404: No group has the specified ID, or no account has the specified userId
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setGroupManager Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-group-manager/
     *
     *
     * @param id The ID of the group whose manager is set, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404.
     * @param setManagerRequest The account to make the manager of the group.
     * @return [GroupWrapper]
     */
    @PUT("api/2.0/group/{id}/manager")
    suspend fun setGroupManager(@Path("id") id: java.util.UUID, @Body setManagerRequest: SetManagerRequest): Response<GroupWrapper>

    /**
     * POST api/2.0/group/{id}/members
     * Replace group members
     * Replaces the whole member list of a group with the accounts given in the request, removing everybody who is  not in that list.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  At least one of the listed accounts has to be usable as a group member, otherwise the call is rejected with  400 and the group is left untouched; the accounts that cannot be members - a guest, a disabled account or an  ID that matches nobody - are then silently skipped while the rest are applied.  The replacement is not atomic: the current members are removed first and the new ones added afterwards, so a  failure in between can leave the group empty.  The answer is the group with the members it ends up with, which is why it should be read instead of assuming  the request was applied verbatim.  To add or remove a few accounts without touching the others, use `PUT api/2.0/group/{id}/members` and  `DELETE api/2.0/group/{id}/members`.
     * Responses:
     *  - 200: The group with the members it ends up with
     *  - 400: None of the listed accounts can be a group member
     *  - 403: No permissions to perform this action
     *  - 404: No group has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setMembersTo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-members-to/
     *
     *
     * @param id The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404.
     * @param membersRequest The accounts to add, replace with, or remove.
     * @return [GroupWrapper]
     */
    @POST("api/2.0/group/{id}/members")
    suspend fun setMembersTo(@Path("id") id: java.util.UUID, @Body membersRequest: MembersRequest): Response<GroupWrapper>

    /**
     * PUT api/2.0/group/{id}
     * Update a group
     * Changes the name and the manager of a group and adds or removes members, in one call.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  Every field is optional and the ones that are left out are kept: omitting `groupName` keeps the current name,  and omitting `groupManager` keeps the current manager rather than clearing it.  Accounts in `membersToAdd` that cannot be group members - a guest, a disabled account or an ID that matches  nobody - are silently skipped instead of failing the call, so compare the members in the answer with what was  sent to see what was actually applied.  Members are added first and removed afterwards, an account listed in both lists therefore ends up removed,  and removing an account that is not a member changes nothing.  The change raises a `GroupUpdated` webhook, and the answer holds the group as it is after the update.
     * Responses:
     *  - 200: The group as it is after the update
     *  - 403: No permissions to perform this action
     *  - 404: No group has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateGroup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-group/
     *
     *
     * @param id The ID of the group to update, taken from the route. It has to be a group that has not been deleted,  otherwise the operation answers 404.
     * @param updateGroupRequest The fields to change. Every field is optional and the ones that are left out keep their current values, so an  empty object changes nothing.
     * @return [GroupWrapper]
     */
    @PUT("api/2.0/group/{id}")
    suspend fun updateGroup(@Path("id") id: java.util.UUID, @Body updateGroupRequest: UpdateGroupRequest): Response<GroupWrapper>

}
