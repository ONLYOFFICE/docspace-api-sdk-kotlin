 /*
 * (c) Copyright Ascensio System SIA 2025
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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
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
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.UpdateMemberRequestDto
import onlyoffice.docspace.api.sdk.models.UpdateMembersRequestDto

interface ProfilesApi {
    /**
     * POST api/2.0/people
     * Add a user
     * Adds a new portal user with the first name, last name, email address, and several optional parameters specified in the request.
     * Responses:
     *  - 200: Newly added user with the detailed information
     *  - 401: Unauthorized
     *  - 403: The invitation link is invalid or its validity has expired
     *
     * REST API Reference for addMember Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-member/
     *
     *
     * @param memberRequestDto  (optional)
     * @return [Call]<[EmployeeFullWrapper]>
     */
    @POST("api/2.0/people")
    fun addMember(@Body memberRequestDto: MemberRequestDto? = null): Call<EmployeeFullWrapper>

    /**
     * DELETE api/2.0/people/{userid}
     * Delete a user
     * Deletes a user with the ID specified in the request from the portal.
     * Responses:
     *  - 200: Deleted user detailed information
     *  - 400: The user is not suspended
     *  - 401: Unauthorized
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: User not found
     *
     * REST API Reference for deleteMember Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-member/
     *
     *
     * @param userid The user ID.
     * @return [Call]<[EmployeeFullWrapper]>
     */
    @DELETE("api/2.0/people/{userid}")
    fun deleteMember(@Path("userid") userid: kotlin.String): Call<EmployeeFullWrapper>

    /**
     * DELETE api/2.0/people/@self
     * Delete my profile
     * Deletes the current user profile.
     * Responses:
     *  - 200: Detailed information about my profile
     *  - 401: Unauthorized
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: User not found
     *
     * REST API Reference for deleteProfile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-profile/
     *
     *
     * @return [Call]<[EmployeeFullWrapper]>
     */
    @DELETE("api/2.0/people/@self")
    fun deleteProfile(): Call<EmployeeFullWrapper>

    /**
     * GET api/2.0/people
     * Get profiles
     * Returns a list of profiles for all the portal users.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 401: Unauthorized
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
     * @return [Call]<[EmployeeFullArrayWrapper]>
     */
    @GET("api/2.0/people")
    fun getAllProfiles(@Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterBy") filterBy: kotlin.String? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterSeparator") filterSeparator: kotlin.String? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<EmployeeFullArrayWrapper>

    /**
     * GET api/2.0/people/tokendiagnostics
     * Get user claims
     * Returns the user claims.
     * Responses:
     *  - 200: Claims
     *  - 401: Unauthorized
     *
     * REST API Reference for getClaims Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-claims/
     *
     *
     * @return [Call]<[ObjectWrapper]>
     */
    @GET("api/2.0/people/tokendiagnostics")
    fun getClaims(): Call<ObjectWrapper>

    /**
     * GET api/2.0/people/email
     * Get a profile by user email
     * Returns the detailed information about a profile of the user with the email specified in the request.
     * Responses:
     *  - 200: Detailed profile information
     *  - 401: Unauthorized
     *  - 404: User not found
     *
     * REST API Reference for getProfileByEmail Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-profile-by-email/
     *
     *
     * @param email The user email address. (optional)
     * @param culture Culture (optional)
     * @return [Call]<[EmployeeFullWrapper]>
     */
    @GET("api/2.0/people/email")
    fun getProfileByEmail(@Query("email") email: kotlin.String? = null, @Query("culture") culture: kotlin.String? = null): Call<EmployeeFullWrapper>

    /**
     * GET api/2.0/people/{userid}
     * Get a profile by user ID
     * Returns the detailed information about a profile of the user with the ID specified in the request.
     * Responses:
     *  - 200: Detailed profile information
     *  - 400: Incorect UserId
     *  - 401: Unauthorized
     *  - 404: User not found
     *
     * REST API Reference for getProfileByUserId Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-profile-by-user-id/
     *
     *
     * @param userid The user ID.
     * @return [Call]<[EmployeeFullWrapper]>
     */
    @GET("api/2.0/people/{userid}")
    fun getProfileByUserId(@Path("userid") userid: kotlin.String): Call<EmployeeFullWrapper>

    /**
     * GET api/2.0/people/@self
     * Get my profile
     * Returns the detailed information about the current user profile.
     * Responses:
     *  - 200: Detailed information about my profile
     *  - 401: Unauthorized
     *
     * REST API Reference for getSelfProfile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-self-profile/
     *
     *
     * @return [Call]<[EmployeeFullWrapper]>
     */
    @GET("api/2.0/people/@self")
    fun getSelfProfile(): Call<EmployeeFullWrapper>

    /**
     * POST api/2.0/people/invite
     * Invite users
     * Invites users specified in the request to the current portal.
     * Responses:
     *  - 200: List of users
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for inviteUsers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/invite-users/
     *
     *
     * @param inviteUsersRequestDto  (optional)
     * @return [Call]<[EmployeeArrayWrapper]>
     */
    @POST("api/2.0/people/invite")
    fun inviteUsers(@Body inviteUsersRequestDto: InviteUsersRequestDto? = null): Call<EmployeeArrayWrapper>

    /**
     * PUT api/2.0/people/delete
     * Delete users
     * Deletes a list of the users with the IDs specified in the request.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 401: Unauthorized
     *  - 409: Data reassign process is not complete
     *
     * REST API Reference for removeUsers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-users/
     *
     *
     * @param updateMembersRequestDto  (optional)
     * @return [Call]<[EmployeeFullArrayWrapper]>
     */
    @PUT("api/2.0/people/delete")
    fun removeUsers(@Body updateMembersRequestDto: UpdateMembersRequestDto? = null): Call<EmployeeFullArrayWrapper>

    /**
     * PUT api/2.0/people/invite
     * Resend activation emails
     * Resends emails to the users who have not activated their emails.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for resendUserInvites Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-user-invites/
     *
     *
     * @param updateMembersRequestDto  (optional)
     * @return [Call]<[EmployeeFullArrayWrapper]>
     */
    @PUT("api/2.0/people/invite")
    fun resendUserInvites(@Body updateMembersRequestDto: UpdateMembersRequestDto? = null): Call<EmployeeFullArrayWrapper>

    /**
     * POST api/2.0/people/email
     * Send instructions to change email
     * Sends a message to the user email with the instructions to change the email address connected to the portal.
     * Responses:
     *  - 200: Message text
     *  - 400: Incorrect userId or email
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *  - 404: User not found
     *
     * REST API Reference for sendEmailChangeInstructions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-email-change-instructions/
     *
     *
     * @param updateMemberRequestDto  (optional)
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/people/email")
    fun sendEmailChangeInstructions(@Body updateMemberRequestDto: UpdateMemberRequestDto? = null): Call<StringWrapper>

    /**
     * PUT api/2.0/people/{userid}
     * Update a user
     * Updates the data for the selected portal user with the first name, last name, email address, and/or optional parameters specified in the request.
     * Responses:
     *  - 200: Updated user with the detailed information
     *  - 400: Incorrect user name
     *  - 401: Unauthorized
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: User not found
     *
     * REST API Reference for updateMember Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member/
     *
     *
     * @param userid The user ID.
     * @param updateMemberRequestDto The request parameters for updating the user information.
     * @return [Call]<[EmployeeFullWrapper]>
     */
    @PUT("api/2.0/people/{userid}")
    fun updateMember(@Path("userid") userid: kotlin.String, @Body updateMemberRequestDto: UpdateMemberRequestDto): Call<EmployeeFullWrapper>

    /**
     * PUT api/2.0/people/{userid}/culture
     * Update a user culture code
     * Updates the user culture code with the parameters specified in the request.
     * Responses:
     *  - 200: Detailed user information
     *  - 401: Unauthorized
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: User not found
     *
     * REST API Reference for updateMemberCulture Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member-culture/
     *
     *
     * @param userid The user ID.
     * @param culture The culture code parameters. (optional)
     * @return [Call]<[EmployeeFullWrapper]>
     */
    @PUT("api/2.0/people/{userid}/culture")
    fun updateMemberCulture(@Path("userid") userid: kotlin.String, @Body culture: Culture? = null): Call<EmployeeFullWrapper>

}
