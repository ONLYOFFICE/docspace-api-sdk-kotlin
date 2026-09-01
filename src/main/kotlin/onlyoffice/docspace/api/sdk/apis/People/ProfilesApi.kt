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
import onlyoffice.docspace.api.sdk.models.InviteUsersRequestDto
import onlyoffice.docspace.api.sdk.models.MemberRequestDto
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.SortOrder
import onlyoffice.docspace.api.sdk.models.UpdateMemberRequestDto
import onlyoffice.docspace.api.sdk.models.UpdateMembersRequestDto
import onlyoffice.docspace.api.sdk.models.UserExistsResponseWrapper

interface ProfilesApi {
    /**
     * POST api/2.0/people
     * Add a user
     * Adds a new portal user with the first name, last name, email address, and several optional parameters specified in the request.
     * Responses:
     *  - 200: Newly added user with the detailed information
     *  - 403: The invitation link is invalid or its validity has expired
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Check if a user exists by email
     * Returns data indicating whether a user with the specified email exists on the portal.
     * Responses:
     *  - 200: User existence result
     *  - 400: Incorrect email
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Deletes a user with the ID specified in the request from the portal.
     * Responses:
     *  - 200: Deleted user detailed information
     *  - 403: You don't have enough permission to perform the operation or user is not suspended
     *  - 404: User not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Delete my profile
     * Deletes the current user profile.
     * Responses:
     *  - 200: Detailed information about my profile
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: User not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Get profiles
     * Returns a list of profiles for all the portal users.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAllProfiles Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-profiles/
     *
     *
     * @param count The maximum number of items to be retrieved in the response. (optional)
     * @param startIndex The zero-based index of the first item to be retrieved in a filtered result set. (optional)
     * @param filterBy Specifies the filter criteria for user-related queries. (optional)
     * @param sortBy Specifies the property or field name by which the results should be sorted. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterSeparator The character or string used to separate multiple filter values in a filtering query. (optional)
     * @param filterValue The text value used as an additional filter criterion for profiles retrieval. (optional)
     * @return [EmployeeFullArrayWrapper]
     */
    @GET("api/2.0/people")
    suspend fun getAllProfiles(@Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterBy") filterBy: kotlin.String? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterSeparator") filterSeparator: kotlin.String? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<EmployeeFullArrayWrapper>

    /**
     * GET api/2.0/people/tokendiagnostics
     * Get user claims
     * Returns the user claims.
     * Responses:
     *  - 200: Claims
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getClaims Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-claims/
     *
     *
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/people/tokendiagnostics")
    suspend fun getClaims(): Response<ObjectWrapper>

    /**
     * GET api/2.0/people/email
     * Get a profile by user email
     * Returns the detailed information about a profile of the user with the email specified in the request.
     * Responses:
     *  - 200: Detailed profile information
     *  - 400: Incorrect email
     *  - 403: No permissions to perform this action
     *  - 404: User not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Returns the detailed information about a profile of the user with the ID specified in the request.
     * Responses:
     *  - 200: Detailed profile information
     *  - 400: Incorrect UserId
     *  - 404: User not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Returns the detailed information about the current user profile.
     * Responses:
     *  - 200: Detailed information about my profile
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Invites users specified in the request to the current portal.
     * Responses:
     *  - 200: List of users
     *  - 400: Incorrect email or User disabled
     *  - 402: The number of admins exceeds the limit
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
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
     * Deletes a list of the users with the IDs specified in the request.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 400: Incorrect UserIds
     *  - 403: No permissions to perform this action or users are not suspended
     *  - 409: Data reassign process is not complete
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Resends emails to the users who have not activated their emails.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Updates the data for the selected portal user with the first name, last name, email address, and/or optional parameters specified in the request.
     * Responses:
     *  - 200: Updated user with the detailed information
     *  - 400: Incorrect user name
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: User not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Updates the user culture with the parameters specified in the request.
     * Responses:
     *  - 200: Detailed user information
     *  - 400: The specified culture is not in the list of available ones
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: User not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
