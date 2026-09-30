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


package onlyoffice.docspace.api.sdk.apis.Portal

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.EmployeeType
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.Int64Wrapper
import onlyoffice.docspace.api.sdk.models.InvitationLinkCreateRequestDto
import onlyoffice.docspace.api.sdk.models.InvitationLinkDeleteRequestDto
import onlyoffice.docspace.api.sdk.models.InvitationLinkUpdateRequestDto
import onlyoffice.docspace.api.sdk.models.InvitationLinkWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.UserInfoWrapper

interface UsersApi {
    /**
     * POST api/2.0/portal/users/invitationlink
     * Create an invitation link
     * Creates the portal's invitation link for one role and returns it together with the URL to share. A portal  keeps at most one link per role, so a call for a role that already has one is refused - read the existing link  with `GET api/2.0/portal/users/invitationlink/{employeeType}` and change it with  `PUT api/2.0/portal/users/invitationlink` instead. Inviting members has to be enabled for the portal  (`GET api/2.0/settings/invitationsettings`), `employeeType` has to be `DocSpaceAdmin`, `RoomAdmin` or `User`,  and `expiration`, when given, has to lie in the future and is read in the portal time zone. The caller needs  the right to add users of that role, only the portal owner may create the DocSpace administrator link, and a  link for a paying role additionally needs a free paid seat in the portal quota. The call is mutating and not  idempotent. The answer carries the `id` needed to update or delete the link, the shortened `url`,  `maxUseCount` and `currentUseCount`, `expiration` in the portal time zone - empty for a link that never  expires - and `isExpired`.
     * Responses:
     *  - 200: The invitation link as it was created, with the `id` to address it later and the `url` to share
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createInvitationLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-invitation-link/
     *
     *
     * @param invitationLinkCreateRequestDto  (optional)
     * @return [InvitationLinkWrapper]
     */
    @POST("api/2.0/portal/users/invitationlink")
    suspend fun createInvitationLink(@Body invitationLinkCreateRequestDto: InvitationLinkCreateRequestDto? = null): Response<InvitationLinkWrapper>

    /**
     * DELETE api/2.0/portal/users/invitationlink
     * Delete an invitation link
     * Deletes the portal's invitation link with the given `id`, so the URL shared from it stops letting anyone in;  accounts that already joined through it are not touched. Inviting members has to be enabled for the portal  (`GET api/2.0/settings/invitationsettings`) and the link has to exist - a second call with the same `id` is  answered as not found. The caller needs the right to add users of the link's role, and only the portal owner  may delete the DocSpace administrator link. The call is destructive and cannot be undone: a link for the same  role has to be created again with `POST api/2.0/portal/users/invitationlink`, and it gets a new `id`, a new  URL and a `currentUseCount` that starts from zero. Nothing is returned in the body. To stop invitations  without losing the links, switch inviting members off for the whole portal with  `PUT api/2.0/settings/invitationsettings` - the links then stay stored but are refused until it is switched on  again.
     * Responses:
     *  - 200: The invitation link is deleted and its URL no longer lets anyone join the portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteInvitationLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-invitation-link/
     *
     *
     * @param invitationLinkDeleteRequestDto  (optional)
     * @return [StringWrapper]
     */
    @HTTP(method = "DELETE", path = "api/2.0/portal/users/invitationlink", hasBody = true)
    suspend fun deleteInvitationLink(@Body invitationLinkDeleteRequestDto: InvitationLinkDeleteRequestDto? = null): Response<StringWrapper>

    /**
     * GET api/2.0/portal/users/invite/{employeeType}
     * Get a legacy invitation link
     * Deprecated - use `POST api/2.0/portal/users/invitationlink` and the neighbouring operations under that path,  which store the link and let it be read, changed and revoked. Builds a shortened URL that lets whoever opens  it join this portal with the role given in the path, and returns it as a bare string; nothing is stored, so  the link can afterwards be neither listed nor withdrawn. Inviting members has to be enabled for the portal -  `GET api/2.0/settings/invitationsettings` reports that - otherwise the call is refused. The caller needs the  right to add users of the requested role and only the portal owner may ask for a DocSpace administrator link;  a caller without that right gets an empty string instead of an error, so treat an empty answer as a refusal.  The call changes nothing on the portal and may be repeated, each time returning an equivalent link. The URL  carries a confirmation key bound to the calling account and the portal alias; it has no use limit and stops  being accepted once the portal's e-mail key lifetime has passed, seven days by default - neither of the two  can be set per link, which is what the replacement operations add.
     * Responses:
     *  - 200: The invitation URL to hand to the invited person, or an empty string when the caller may not invite that role
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getInvitationLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-invitation-link/
     *
     *
     * @param employeeType The role whoever follows the link joins with. Only `DocSpaceAdmin`, `RoomAdmin` and `User` have a link; any  other role is refused. The portal keeps at most one link per role, so this value alone identifies it.
     * @return [StringWrapper]
     */
    @Deprecated("This api was deprecated")
    @GET("api/2.0/portal/users/invite/{employeeType}")
    suspend fun getInvitationLink(@Path("employeeType") employeeType: EmployeeType): Response<StringWrapper>

    /**
     * GET api/2.0/portal/users/invitationlink/{employeeType}
     * Get an invitation link by role
     * Returns the portal's invitation link for one role - the URL to share, how long it lasts and how often it has  already been used. Inviting members has to be enabled for the portal  (`GET api/2.0/settings/invitationsettings`) and `employeeType` has to be `DocSpaceAdmin`, `RoomAdmin` or  `User`; the caller needs the right to add users of that role, only the portal owner may read the DocSpace  administrator link, and a link for a paying role is shown only while the portal quota still has a free paid  seat. The call is read-only and idempotent, but the `url` it returns is signed for the calling account, so two  administrators are handed two different URLs for one and the same link. A role that has no link yet is  answered with an empty body and 200 rather than a 404 - create the link with  `POST api/2.0/portal/users/invitationlink`. `expiration` is in the portal time zone and empty for a link  without a deadline, `isExpired` says whether that deadline has passed, and `currentUseCount` counts how many  accounts have already joined through the link.
     * Responses:
     *  - 200: The invitation link of that role, or an empty body when the portal has no link for it
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getInvitationLinkByEmployeeType Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-invitation-link-by-employee-type/
     *
     *
     * @param employeeType The role whoever follows the link joins with. Only `DocSpaceAdmin`, `RoomAdmin` and `User` have a link; any  other role is refused. The portal keeps at most one link per role, so this value alone identifies it.
     * @return [InvitationLinkWrapper]
     */
    @GET("api/2.0/portal/users/invitationlink/{employeeType}")
    suspend fun getInvitationLinkByEmployeeType(@Path("employeeType") employeeType: EmployeeType): Response<InvitationLinkWrapper>

    /**
     * GET api/2.0/portal/userscount
     * Get a number of portal users
     * Returns how many accounts this portal currently has in the active state, whatever their role, so a client can  show the seat usage next to the allowance. Accounts that were invited but have not joined yet and accounts  that were disabled or removed are not counted. The caller needs the portal-settings right and is refused  without it; the call is read-only and idempotent, and the number moves as soon as an account joins, is  disabled or is deleted. The answer is a plain number, not an object. Compare it with `countUser` and  `countPaidUser` from `GET api/2.0/portal/quota` to see how much of the allowance is left, and with  `GET api/2.0/portal/quota/right` for the smallest quota that would still hold everyone. When the accounts  themselves are needed, and not only how many there are, list them with the People API instead - this operation  cannot filter by role, group or status.
     * Responses:
     *  - 200: The number of accounts of this portal that are in the active state
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPortalUsersCount Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-users-count/
     *
     *
     * @return [Int64Wrapper]
     */
    @GET("api/2.0/portal/userscount")
    suspend fun getPortalUsersCount(): Response<Int64Wrapper>

    /**
     * GET api/2.0/portal/users/{userID}
     * Get a portal user
     * Returns one user of this portal, addressed by ID, in the shape the portal stores the account: display name,  e-mail, contacts, role and status flags, and the dates of the profile. Nothing has to be called first, and the  call is read-only and idempotent. Who may be read is decided per pair of accounts: a caller always reads their  own profile, a DocSpace administrator reads anyone, a room administrator reads anyone except a guest they have  no relation with, and a user or a guest reads nobody but themselves - a pair that is not allowed is refused.  An ID that belongs to no account of this portal and an ID of a system account are both answered as not found,  so a 404 does not tell the two apart. `userID` in the path has to be a GUID; the calling user's own profile is  easier to fetch with `GET api/2.0/people/@self`. This operation hands back the internal user record - use  `GET api/2.0/people/{userid}` for the same user in the People format, with the group, quota and access  information a client usually needs.
     * Responses:
     *  - 200: The account of this portal, in the internal user format
     *  - 404: No account with this ID exists on the portal, or the ID belongs to a system account
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getUserById Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-by-id/
     *
     *
     * @param userID The portal account the operation acts on, by user ID as `GET api/2.0/people` reports it. An ID belonging to  no account of this portal and an ID of an internal system account are both answered as not found.
     * @return [UserInfoWrapper]
     */
    @GET("api/2.0/portal/users/{userID}")
    suspend fun getUserById(@Path("userID") userID: java.util.UUID): Response<UserInfoWrapper>

    /**
     * POST api/2.0/portal/present/mark
     * Mark a gift message as read
     * Marks the open-source gift message - the notice a server installation shows about its free edition - as read  for the calling user, so the client stops displaying it. Any signed-in user may call it and nothing has to be  called first. The flag is stored per user, so marking it read for one account leaves it unread for everybody  else on the portal. The call is mutating but idempotent: repeating it changes nothing. It never fails on the  caller's behalf - a storage error is written to the portal log and the operation still answers with a success,  so the answer is no proof that the flag was saved. Nothing is returned in the body, and no operation reads the  flag back or clears it again, which makes the change effectively permanent for that user. It touches only this  one notice: portal-wide announcements and the letters the portal sends are unaffected, and other per-user  settings are stored through the operations under `api/2.0/settings`.
     * Responses:
     *  - 200: The gift message is marked as read for the calling user; the same answer is returned when saving the flag failed, because the error is only written to the portal log. The response carries no content
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for markGiftMessageAsRead Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-gift-message-as-read/
     *
     *
     * @return [Unit]
     */
    @POST("api/2.0/portal/present/mark")
    suspend fun markGiftMessageAsRead(): Response<Unit>

    /**
     * POST api/2.0/portal/sendcongratulations
     * Send congratulations
     * Sends the welcome letter that follows the registration of a new portal to the account named by `userid` and  switches on the second authentication factor the installation is configured to require after registration; on  a hosted portal in custom mode the registration data is mailed to the sales address as well. Open to  unauthenticated callers: in place of a token it needs `key`, the confirmation key of the sign-in link the  portal issued for that account, and that key is accepted for one hour after it was created - a wrong, foreign  or expired key answers 403 and sends nothing. Both parameters go in the query string. The call is meant to be  made once, right after registration; it is not idempotent, and every call within that hour sends the letters  again. When the installation asks for SMS or an authenticator app after registration, this call is what  enables that method for the whole portal, unless the new account is an internal test address. Nothing is  returned in the body and there is no operation that reports afterwards whether the letters were delivered.
     * Responses:
     *  - 200: The welcome letters were sent and the configured second factor was switched on for the portal
     *  - 403: The confirmation key does not match the user or is older than one hour
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for sendCongratulations Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-congratulations/
     *
     *
     * @param userid The account the welcome letter is addressed to, by portal user ID. The key in `key` has to have been issued  for this same account, so the pair is what authorises the call.
     * @param key The confirmation key from the sign-in link the portal issued for that account, which stands in for a token  here. It is accepted for one hour after it was created; a wrong, foreign or expired key answers 403 and sends  nothing.
     * @return [Unit]
     */
    @POST("api/2.0/portal/sendcongratulations")
    suspend fun sendCongratulations(@Query("Userid") userid: java.util.UUID, @Query("Key") key: kotlin.String): Response<Unit>

    /**
     * PUT api/2.0/portal/users/invitationlink
     * Update an invitation link
     * Changes the deadline and the use limit of an existing invitation link, addressed by its `id`. The role of a  link cannot be changed - delete it and create a link for the other role instead. Inviting members has to be  enabled for the portal (`GET api/2.0/settings/invitationsettings`), the link has to exist, and `maxUseCount`  may not be lower than the number of uses the link already has, which  `GET api/2.0/portal/users/invitationlink/{employeeType}` reports as `currentUseCount`. An `expiration` in the  past is refused; the body is applied as a whole, so omitting `expiration` clears the deadline and omitting  `maxUseCount` removes the use limit. The caller needs the right to add users of the link's role and only the  portal owner may change the DocSpace administrator link. The call is mutating, and repeating it with the same  body leaves the link as it is. The whole link comes back as it now stands, with `url` signed for the calling  account - the URL therefore differs between administrators while the link behind it is the same.
     * Responses:
     *  - 200: The invitation link as it now stands, with the deadline and the use limit that were applied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateInvitationLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-invitation-link/
     *
     *
     * @param invitationLinkUpdateRequestDto  (optional)
     * @return [InvitationLinkWrapper]
     */
    @PUT("api/2.0/portal/users/invitationlink")
    suspend fun updateInvitationLink(@Body invitationLinkUpdateRequestDto: InvitationLinkUpdateRequestDto? = null): Response<InvitationLinkWrapper>

}
