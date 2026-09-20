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

import onlyoffice.docspace.api.sdk.models.Culture
import onlyoffice.docspace.api.sdk.models.EmployeeArrayWrapper
import onlyoffice.docspace.api.sdk.models.EmployeeFullArrayWrapper
import onlyoffice.docspace.api.sdk.models.EmployeeFullWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.InviteUsersRequestDto
import onlyoffice.docspace.api.sdk.models.MemberRequestDto
import onlyoffice.docspace.api.sdk.models.SortOrder
import onlyoffice.docspace.api.sdk.models.TokenDiagnosticsWrapper
import onlyoffice.docspace.api.sdk.models.UpdateMemberRequestDto
import onlyoffice.docspace.api.sdk.models.UpdateMembersRequestDto
import onlyoffice.docspace.api.sdk.models.UserExistsResponseWrapper

interface ProfilesApi {
    /**
     * POST api/2.0/people
     * Add a user
     * Creates a portal profile, either by an administrator adding somebody directly or by a person accepting an  invitation link, which is why the operation accepts both an authenticated session and an invitation  confirmation token.  Set `fromInviteLink` to true and pass the invitation `key` for the second case: the resulting type then comes  from the link and the `type` in the request is ignored, and an invalid or expired link answers 403.  Without a link the caller needs the permission to add users of the requested type, cannot create a guest  through this operation at all, has to be a DocSpace admin to create a room admin and the portal owner to  create another DocSpace admin; either way the portal has to allow inviting members, or guests when the link  says so.  The password is optional: `passwordHash` is taken as it is, a plain `password` is checked against the portal  password policy and rejected with 400 when it is too weak, and when both are omitted a random password is  generated and the account is created without anybody knowing it.  When the portal has no free paid seat the account is still created, silently as a `User` instead of the  requested type, so read the `type` in the answer rather than assuming the request was honoured.  Creating a profile raises a `UserCreated` webhook, downloads the avatar named in `files` if one is given, and  answers with the new profile including its ID.  To invite several people by email at once instead, use `POST api/2.0/people/invite`.
     * Responses:
     *  - 200: The new profile with its detailed information
     *  - 400: The password does not meet the portal password policy
     *  - 403: The invitation link is invalid or has expired, the portal does not allow inviting this kind of account, or the caller may not create an account of the requested type
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for addMember Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-member/
     *
     *
     * @param memberRequestDto  (optional)
     * @return [EmployeeFullWrapper]
     */
    @POST("api/2.0/people")
    suspend fun addMember(@Body memberRequestDto: MemberRequestDto? = null): Response<EmployeeFullWrapper>

    /**
     * GET api/2.0/people/exists
     * Check whether an email is taken
     * Reports whether an email address already belongs to a portal profile, and in what state that profile is.  It is meant for the invitation and sign-up screens, which is why it accepts a confirmation token as well as an  ordinary session, and why it is available on an unpaid portal.  Pass the address either in plain text as `email` or, when it arrived inside an invitation link, encrypted as  `encemail`; one of the two is required and a malformed or overlong address answers 400.  The call is read-only, and the answer carries `exists` plus the `status` of the profile - `Active`,  `Terminated` or `Pending` - which is left out entirely when nothing matches, so a pending invitation can be  told apart from a working account and from a free address.  It reveals only that an address is taken and not who owns it - read `GET api/2.0/people/email` for the  profile itself, which needs the right to see that account.
     * Responses:
     *  - 200: Whether the address is taken, and the status of the profile that holds it
     *  - 400: Both email and encemail are missing, or the address is malformed or longer than 255 characters
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for checkUserExistsByEmail Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-user-exists-by-email/
     *
     *
     * @param email The user email address. (optional)
     * @param encemail The user encrypted email address. (optional)
     * @param culture Culture (optional)
     * @return [UserExistsResponseWrapper]
     */
    @GET("api/2.0/people/exists")
    suspend fun checkUserExistsByEmail(@Query("email") email: kotlin.String? = null, @Query("encemail") encemail: kotlin.String? = null, @Query("culture") culture: kotlin.String? = null): Response<UserExistsResponseWrapper>

    /**
     * DELETE api/2.0/people/{userid}
     * Delete a user
     * Deletes a portal profile and queues the erasure of the data behind it.  The account has to be disabled first - set the `Terminated` status through  `PUT api/2.0/people/status/{status}`, otherwise the operation answers 403 - and it must not be a system  account or one imported from LDAP.  The caller needs the permission to add and remove users, and has to be the portal owner to delete a DocSpace  administrator.  The profile disappears at once, together with its avatar, its group memberships, its file shares and its  OAuth clients, while the data it owned is erased by a queued job afterwards, which can be watched through  `GET api/2.0/people/remove/progress/{userid}`.  The removal is permanent and cannot be undone, so hand the rooms and the shared files over first through  `POST api/2.0/people/reassign/start` - an account whose reassignment has not finished cannot be deleted.  The call raises a `UserDeleted` webhook and answers with the profile as it was just before it was removed.  To delete several accounts at once use `PUT api/2.0/people/delete`.
     * Responses:
     *  - 200: The profile as it was just before it was deleted
     *  - 403: The account is not disabled, is a system or an LDAP account, or the caller may not delete a DocSpace administrator
     *  - 404: No user has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteMember Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-member/
     *
     *
     * @param userid The user ID.
     * @return [EmployeeFullWrapper]
     */
    @DELETE("api/2.0/people/{userid}")
    suspend fun deleteMember(@Path("userid") userid: kotlin.String): Response<EmployeeFullWrapper>

    /**
     * DELETE api/2.0/people/@self
     * Close my own profile
     * Closes the calling account at its owner's request: it does not erase the profile, it disables it, ends every  session it has and tells the portal administrators that the account asked to be removed.  It is the second step of the self-service removal - the first is `PUT api/2.0/people/self/delete`, which mails  the confirmation link - so the request has to carry the confirmation token from that link rather than an  ordinary session.  It always acts on the calling account and takes no parameters; the portal owner and an account imported from  LDAP cannot close themselves and get 403.  After the call the account has the `Terminated` status and can no longer sign in, but its rooms, files and  group memberships are untouched, which is why an administrator still has to erase it through  `DELETE api/2.0/people/{userid}` - that operation requires exactly this disabled state.  The step is reversible until then: re-enabling the account through `PUT api/2.0/people/status/{status}`  restores it.  The call raises a `UserUpdated` webhook, not a delete one, and answers with the profile in its new state.
     * Responses:
     *  - 200: The profile of the caller with the Terminated status
     *  - 403: The caller is the portal owner, an LDAP account or a system account
     *  - 404: The calling account no longer exists
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteProfile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-profile/
     *
     *
     * @return [EmployeeFullWrapper]
     */
    @DELETE("api/2.0/people/@self")
    suspend fun deleteProfile(): Response<EmployeeFullWrapper>

    /**
     * GET api/2.0/people
     * Get the active profiles
     * Returns a page of the working accounts of the portal, with the full profile of each of them.  It reports only the accounts whose status is `Active`, so disabled accounts and open invitations are never  listed - use `GET api/2.0/people/status/{status}` for those, or `GET api/2.0/people/filter` to search across  every state.  The caller has to be a room admin, a DocSpace admin or a People module admin; a member or a guest gets 403.  The call is read-only, paged by `count` and `startIndex`, ordered by `sortBy` and `sortOrder`, and reports  the number of matches in the total count of the response.  Narrow it with `filterValue` on the name and the email, and with `filterBy` set to `group` to keep only the  members of the group whose ID is passed in `filterValue`.
     * Responses:
     *  - 200: A page of active accounts, with their full profiles
     *  - 403: The caller is a member or a guest
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAllProfiles Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-profiles/
     *
     *
     * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
     * @param startIndex The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. (optional)
     * @param filterBy The only recognised value is `group`, which makes `filterValue` the ID of the group to keep the members of.  Any other value, and omitting the field, applies no group filter. (optional)
     * @param sortBy What to order the accounts by, compared without regard to case: `FirstName`, `LastName`, `DisplayName`,  `Type`, `Email`, `Department`, `UsedSpace`, `CreatedBy` or `RegistrationDate`. (optional)
     * @param sortOrder The direction of the ordering: `Ascending`, which is the default, or `Descending`. (optional)
     * @param filterSeparator The character that splits `filterValue` into several terms, of which any one may match. Omit it to split  the value on spaces instead, in which case every term has to match. (optional)
     * @param filterValue The text to match against the name and the email of the account, case-insensitively. Omit it to apply no  text filter. (optional)
     * @return [EmployeeFullArrayWrapper]
     */
    @GET("api/2.0/people")
    suspend fun getAllProfiles(@Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterBy") filterBy: kotlin.String? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterSeparator") filterSeparator: kotlin.String? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<EmployeeFullArrayWrapper>

    /**
     * GET api/2.0/people/tokendiagnostics
     * Get user claims
     * Returns the identity the current request was authenticated with, as the portal sees it: the account name and  the full list of claims attached to the token or the cookie.  It is a diagnostics operation meant for working out why a call is rejected - which account a token really  belongs to, and which scopes and roles it carries - rather than a source of profile data.  It needs no permission of its own and reports on the caller only, so it cannot be used to inspect another  account.  The call is read-only, and every claim comes back as a single `type:value` string, in the order the  authentication produced them.  An account name of `Unknown Name` means the identity carries no name claim, not that the request is  unauthenticated.  For the profile behind the identity, read `GET api/2.0/people/@self`.
     * Responses:
     *  - 200: The account name and the claims of the current identity
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getClaims Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-claims/
     *
     *
     * @return [TokenDiagnosticsWrapper]
     */
    @GET("api/2.0/people/tokendiagnostics")
    suspend fun getClaims(): Response<TokenDiagnosticsWrapper>

    /**
     * GET api/2.0/people/email
     * Get a profile by user email
     * Returns the full profile of the account that owns an email address.  Pass the address either in plain text as `email` or, when it arrived inside an invitation link, encrypted as  `encemail`; one of the two is required and a malformed or overlong address answers 400.  The caller has to be allowed to see that account - a guest, for instance, only sees the accounts it is  related to - and an address that belongs to nobody answers 404.  The call is read-only, and `culture` changes nothing about the profile: it only picks the language of the  error message when the lookup fails.  To find out whether an address is taken without the right to see its owner, use  `GET api/2.0/people/exists`, and to look an account up by its ID or user name use  `GET api/2.0/people/{userid}`.
     * Responses:
     *  - 200: The full profile of the account that owns the address
     *  - 400: Both email and encemail are missing, or the address is malformed or longer than 255 characters
     *  - 403: The caller is not allowed to see that account
     *  - 404: No account owns the specified address
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getProfileByEmail Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-profile-by-email/
     *
     *
     * @param email The user email address. (optional)
     * @param encemail The user encrypted email address. (optional)
     * @param culture Culture (optional)
     * @return [EmployeeFullWrapper]
     */
    @GET("api/2.0/people/email")
    suspend fun getProfileByEmail(@Query("email") email: kotlin.String? = null, @Query("encemail") encemail: kotlin.String? = null, @Query("culture") culture: kotlin.String? = null): Response<EmployeeFullWrapper>

    /**
     * GET api/2.0/people/{userid}
     * Get a profile by user ID
     * Returns the profile of one account, looked up by its user name first and by its ID if the name matches  nothing, so both forms work in the route.  The caller has to be allowed to see that account - a guest, for instance, only sees the accounts it is  related to - and a value that matches neither a name nor an ID answers 404.  A request authenticated with an invitation link is treated differently: it skips that visibility check and  gets a reduced profile with the identifying fields only, which is what an invitation page needs.  The call is read-only and is available on an unpaid portal.  To read the calling account use `GET api/2.0/people/@self`, and to look an account up by address use  `GET api/2.0/people/email`.
     * Responses:
     *  - 200: The full profile, or a reduced one for a request authenticated with an invitation link
     *  - 403: The caller is not allowed to see that account
     *  - 404: No account has the specified ID or user name
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getProfileByUserId Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-profile-by-user-id/
     *
     *
     * @param userid The user ID.
     * @return [EmployeeFullWrapper]
     */
    @GET("api/2.0/people/{userid}")
    suspend fun getProfileByUserId(@Path("userid") userid: kotlin.String): Response<EmployeeFullWrapper>

    /**
     * GET api/2.0/people/@self
     * Get my profile
     * Returns the profile of the account the request is authenticated as, together with the session details only  this operation reports.  It takes no parameters, needs no permission and always describes the caller, so it is the operation to call  right after signing in to find out who the token belongs to and what that account may do.  The call is read-only and available on an unpaid portal.  Beyond the ordinary profile fields it fills in four that stay empty everywhere else: `theme` with the  interface theme the account chose, `loginEventId` with the identifier of the current session,  `hasPersonalFolder` with whether the account has a personal folder, and `authCookieLifetime` with the seconds  the session has left - the last one only when less than a day remains or the portal is configured to expose  it, so an absent value means neither, not an endless session.  To read somebody else use `GET api/2.0/people/{userid}`, which reports none of these four.
     * Responses:
     *  - 200: The profile of the caller, with the theme, the session and the personal folder details
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSelfProfile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-self-profile/
     *
     *
     * @return [EmployeeFullWrapper]
     */
    @GET("api/2.0/people/@self")
    suspend fun getSelfProfile(): Response<EmployeeFullWrapper>

    /**
     * POST api/2.0/people/invite
     * Invite users
     * Invites people to the portal by email, creating a pending profile for each address and mailing it an  invitation link.  The caller has to be a room admin or a DocSpace admin - a member or a guest is rejected - the portal has to  allow inviting members, and inviting a room admin additionally requires DocSpace admin rights while inviting  another DocSpace admin requires the portal owner; a `Guest` type is not accepted here at all.  An address that already belongs to a profile is not mailed again: the existing account is only related to the  caller, and its type is raised when the invitation asks for a higher one, while a disabled account rejects  the whole call with 400.  The whole call is rejected before anything is sent when the invitations would need more paid seats than the  tariff has left, and a malformed or punycode address is rejected with 400, so the list is validated as a  batch but applied one address at a time - a failure partway through leaves the earlier invitations sent.  The answer is not the result of this call: it lists every profile of the portal that is still pending and  that the caller may see, so previously invited people appear in it as well.  Each newly invited profile raises a `UserInvited` webhook, and repeated calls are throttled.  Use `PUT api/2.0/people/invite` to send the invitation email again, and `POST api/2.0/people` to create a  profile without mailing anybody.
     * Responses:
     *  - 200: Every pending profile the caller may see, not only the ones just invited
     *  - 400: An address is malformed or written in punycode, or it belongs to a disabled account
     *  - 402: The invitations would need more paid seats than the tariff has left
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for inviteUsers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/invite-users/
     *
     *
     * @param inviteUsersRequestDto  (optional)
     * @return [EmployeeArrayWrapper]
     */
    @POST("api/2.0/people/invite")
    suspend fun inviteUsers(@Body inviteUsersRequestDto: InviteUsersRequestDto? = null): Response<EmployeeArrayWrapper>

    /**
     * PUT api/2.0/people/delete
     * Delete users
     * Deletes several portal profiles in one call and queues the erasure of the data behind each of them.  Every listed account has to be disabled already - set the `Terminated` status through  `PUT api/2.0/people/status/{status}` first, because a single account that is still active rejects the whole  call with 403 - and the caller needs the permission to add and remove users.  System and LDAP accounts are dropped from the list without an error, and so are the accounts the caller may  not delete: a room admin when the caller is not a DocSpace admin, and a DocSpace admin when the caller is not  the portal owner.  The answer lists every account that was asked for, including the ones that were skipped, so it is not proof  that an account was deleted - read `GET api/2.0/people/{userid}` for that, which then answers 404.  The removal is permanent and cannot be undone, and each deleted account raises a `UserDeleted` webhook while  its data is erased by a queued job that can be watched through  `GET api/2.0/people/remove/progress/{userid}`.  Hand the rooms and the shared files over first through `POST api/2.0/people/reassign/start` - an account with  an unfinished reassignment cannot be deleted.
     * Responses:
     *  - 200: Every account that was asked for, including the ones that were skipped
     *  - 400: The userIds field is missing
     *  - 403: No permissions to perform this action, or one of the listed accounts is not disabled
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for removeUsers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-users/
     *
     *
     * @param updateMembersRequestDto  (optional)
     * @return [EmployeeFullArrayWrapper]
     */
    @PUT("api/2.0/people/delete")
    suspend fun removeUsers(@Body updateMembersRequestDto: UpdateMembersRequestDto? = null): Response<EmployeeFullArrayWrapper>

    /**
     * PUT api/2.0/people/invite
     * Resend activation emails
     * Sends the invitation or activation email again to the accounts that have not finished joining the portal.  Set `resendAll` to true to reach every pending account of the portal, in which case `userIds` is ignored and  the caller has to be a room admin or a DocSpace admin; with the default false only the listed accounts are  reached, and a member or a guest may then list nothing but their own ID.  Which email goes out depends on the state of each account: a pending invitation gets a fresh invitation link,  while an account that exists but has not confirmed its address gets activation instructions instead.  Accounts that are already active or that are disabled are skipped, and so are the pending accounts the caller  has no right to invite, without an error.  The answer lists only the targeted accounts the caller is allowed to see, so it can be shorter than the  request and is not a delivery report.  Repeated calls are throttled, and each call issues new links that make the previously sent ones useless.  To invite an address that has no profile yet, use `POST api/2.0/people/invite`.
     * Responses:
     *  - 200: The targeted accounts the caller is allowed to see
     *  - 403: A member or a guest asked for resendAll, or listed an account other than their own
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for resendUserInvites Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-user-invites/
     *
     *
     * @param updateMembersRequestDto  (optional)
     * @return [EmployeeFullArrayWrapper]
     */
    @PUT("api/2.0/people/invite")
    suspend fun resendUserInvites(@Body updateMembersRequestDto: UpdateMembersRequestDto? = null): Response<EmployeeFullArrayWrapper>

    /**
     * PUT api/2.0/people/{userid}
     * Update a user
     * Updates a portal profile, and which fields it accepts depends on whose profile it is - the two halves of this  operation do not overlap.  On the caller's own profile it applies `firstName`, `lastName`, `location`, `comment`, `spam`, `contacts`,  `department` and the avatar named in `files`, while `disable` and `isUser` are ignored; on somebody else's  profile only `disable` and `isUser` are applied and every descriptive field is ignored, so an administrator  cannot rename another account through this operation.  The caller needs the permission to edit that profile, cannot touch the portal owner, and has to be the portal  owner to touch another DocSpace administrator; on an account imported from LDAP or SSO the name and the  location are silently left alone even on one's own profile.  Omitted fields keep their current values, an unusable pair of names answers 400, and `disable` set to true  gives the account the `Terminated` status and ends every session it has, which is the state  `DELETE api/2.0/people/{userid}` then requires.  The `isUser` flag turns the account into a guest when true and back into a member when false, both of which  can answer 402 because either direction takes a seat; a request to make the portal owner, a DocSpace  administrator or a module administrator a guest is ignored without an error.  A change raises a `UserUpdated` webhook and the answer holds the profile as it is afterwards, so read it  instead of assuming the request was applied.  For the language use `PUT api/2.0/people/{userid}/culture`, for the type  `PUT api/2.0/people/type/{type}`, and for the status of several accounts at once  `PUT api/2.0/people/status/{status}`.
     * Responses:
     *  - 200: The profile as it is after the update
     *  - 400: The first and last name pair is not a valid user name
     *  - 402: The tariff or the user quota does not allow the requested guest or member seat
     *  - 403: The account is the portal owner or a system account, the caller may not edit it, or only the portal owner may edit a DocSpace administrator
     *  - 404: No user has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateMember Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member/
     *
     *
     * @param userid The user ID.
     * @param updateMemberRequestDto The request parameters for updating the user information.
     * @return [EmployeeFullWrapper]
     */
    @PUT("api/2.0/people/{userid}")
    suspend fun updateMember(@Path("userid") userid: kotlin.String, @Body updateMemberRequestDto: UpdateMemberRequestDto): Response<EmployeeFullWrapper>

    /**
     * PUT api/2.0/people/{userid}/culture
     * Update a user culture
     * Changes the interface language of a profile, which decides the language of the portal for that account and of  the emails it receives.  The culture has to be one the portal has enabled, otherwise the operation answers 400; read the enabled list  from the portal settings rather than guessing a code.  A caller may only change their own language - the ID in the route has to be the calling account, and an  administrator gets 403 for anybody else - and the account must be allowed to edit its own profile.  The change takes effect immediately, raises a `UserUpdated` webhook, and answers with the profile carrying  the new `cultureName`.  Other profile fields are not touched here; use `PUT api/2.0/people/{userid}` for those.
     * Responses:
     *  - 200: The profile with its new culture
     *  - 400: The specified culture is not enabled on the portal
     *  - 403: The ID in the route is not the calling account, or the account may not edit its own profile
     *  - 404: No user has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateMemberCulture Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member-culture/
     *
     *
     * @param userid The user ID.
     * @param culture The culture name parameters. (optional)
     * @return [EmployeeFullWrapper]
     */
    @PUT("api/2.0/people/{userid}/culture")
    suspend fun updateMemberCulture(@Path("userid") userid: kotlin.String, @Body culture: Culture? = null): Response<EmployeeFullWrapper>

}
