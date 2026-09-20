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


package onlyoffice.docspace.api.sdk.apis.People

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.EmployeeActivationStatus
import onlyoffice.docspace.api.sdk.models.EmployeeFullArrayWrapper
import onlyoffice.docspace.api.sdk.models.EmployeeStatus
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.SortOrder
import onlyoffice.docspace.api.sdk.models.UpdateMembersRequestDto

interface UserStatusApi {
    /**
     * GET api/2.0/people/status/{status}
     * Get profiles by status
     * Returns a page of the accounts that are in one particular state - the status is taken from the route - with  the full profile of each of them.  The caller has to be a room admin, a DocSpace admin or a People module admin; a member or a guest gets 403.  The call is read-only, paged by `count` and `startIndex`, ordered by `sortBy` and `sortOrder`, and reports  the number of matches in the total count of the response.  Narrow it with `filterValue` on the name and the email; setting `filterBy` to `group` makes the same  `filterValue` the ID of the group to keep the members of, and because the value is then applied as the text  filter as well, that combination normally matches nothing - use `GET api/2.0/people/filter` with `groupId`  to filter by group.  `GET api/2.0/people` is the same operation fixed to the `Active` status.
     * Responses:
     *  - 200: A page of accounts in the requested state, with their full profiles
     *  - 403: The caller is a member or a guest
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getByStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-by-status/
     *
     *
     * @param status The account state to list, taken from the route: `Active` for working accounts, `Terminated` for disabled  ones, `Pending` for open invitations, or `All` for every state.
     * @param filterBy The only recognised value is `group`, which makes `filterValue` the ID of the group to keep the members of.  Any other value, and omitting the field, applies no group filter. (optional)
     * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
     * @param startIndex The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. (optional)
     * @param sortBy What to order the accounts by, compared without regard to case: `FirstName`, `LastName`, `DisplayName`,  `Type`, `Email`, `Department`, `UsedSpace`, `CreatedBy` or `RegistrationDate`. (optional)
     * @param sortOrder The direction of the ordering: `Ascending`, which is the default, or `Descending`. (optional)
     * @param filterSeparator The character that splits `filterValue` into several terms, of which any one may match. Omit it to split  the value on spaces instead, in which case every term has to match. (optional)
     * @param filterValue The text to match against the name and the email of the account, case-insensitively. Omit it to apply no  text filter. (optional)
     * @return [EmployeeFullArrayWrapper]
     */
    @GET("api/2.0/people/status/{status}")
    suspend fun getByStatus(@Path("status") status: EmployeeStatus, @Query("filterBy") filterBy: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterSeparator") filterSeparator: kotlin.String? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<EmployeeFullArrayWrapper>

    /**
     * PUT api/2.0/people/activationstatus/{activationstatus}
     * Set my activation status
     * Sets the activation state of the calling account, which is how a person finishes confirming their email  address after following the link they were sent.  The request has to carry the confirmation token from that link rather than an ordinary session, and the  account must be allowed to edit its own profile.  Despite taking a list, it accepts exactly one ID and that ID has to be the calling account: an empty list,  more than one entry, or somebody else's ID is answered with 400, so it cannot be used to activate other  people.  Setting `Activated` on the portal owner sends the administrator welcome email, once per portal.  The change raises a `UserUpdated` webhook, and the answer holds the profile in its new state - or nothing at  all when the account has meanwhile disappeared, which is skipped without an error.  The account status is a different thing and is changed through `PUT api/2.0/people/status/{status}`.
     * Responses:
     *  - 200: The profile of the caller in its new activation state
     *  - 400: The list is empty, holds more than one ID, or names an account other than the caller
     *  - 403: The account may not edit its own profile
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateUserActivationStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-activation-status/
     *
     *
     * @param activationstatus The activation state to set on the calling account, taken from the route: `NotActivated`, `Activated`,  `Pending` or `AutoGenerated`.
     * @param updateMembersRequestDto The account to change. Only `userIds` is read, it has to hold exactly one entry, and that entry has to be the  calling account; `resendAll` is ignored here.
     * @return [EmployeeFullArrayWrapper]
     */
    @PUT("api/2.0/people/activationstatus/{activationstatus}")
    suspend fun updateUserActivationStatus(@Path("activationstatus") activationstatus: EmployeeActivationStatus, @Body updateMembersRequestDto: UpdateMembersRequestDto): Response<EmployeeFullArrayWrapper>

    /**
     * PUT api/2.0/people/status/{status}
     * Change a user status
     * Enables or disables several portal accounts at once, which is the way to suspend somebody without deleting  them and to bring them back later.  Only `Active` and `Terminated` are accepted in the route; any other status answers 400.  The caller needs the permission to edit users, and the whole list is checked before anything is applied: a  system account, an LDAP account, the portal owner, the caller themselves, or - unless the caller is the  portal owner - a DocSpace administrator rejects the entire call with 403 and changes nothing.  Disabling ends every session of the account and takes its seat back, while enabling takes a seat again and  can therefore answer 402 when the tariff or the user quota has none left; the accounts are then processed one  by one, so a quota failure partway through leaves the earlier ones enabled.  Enabling only affects accounts that were disabled, and an account that had never filled in its name comes  back as `Pending` rather than `Active` when it still has an unused invitation, so read the `status` in the  answer instead of assuming it matches the request.  Each changed account raises a `UserUpdated` webhook, and disabling is what  `DELETE api/2.0/people/{userid}` requires before it will delete an account.
     * Responses:
     *  - 200: The listed accounts with their statuses after the change
     *  - 400: The requested status is neither Active nor Terminated
     *  - 402: The tariff or the user quota does not allow enabling one more account
     *  - 403: No permissions to perform this action, or the list names a system, LDAP, owner, self or DocSpace admin account
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateUserStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-status/
     *
     *
     * @param status The state to put the listed accounts into, taken from the route. Only `Active`, which enables an account,  and `Terminated`, which disables it, are accepted; any other value is rejected with 400.
     * @param updateMembersRequestDto The accounts to enable or disable. Only `userIds` is read by this operation; `resendAll` belongs to the  invitation operations and is ignored here.
     * @return [EmployeeFullArrayWrapper]
     */
    @PUT("api/2.0/people/status/{status}")
    suspend fun updateUserStatus(@Path("status") status: EmployeeStatus, @Body updateMembersRequestDto: UpdateMembersRequestDto): Response<EmployeeFullArrayWrapper>

}
