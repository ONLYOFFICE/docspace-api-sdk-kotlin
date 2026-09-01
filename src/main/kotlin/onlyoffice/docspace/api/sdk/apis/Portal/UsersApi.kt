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
     * Returns an invitation link for joining the portal.
     * Responses:
     *  - 200: Invitation link
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
     * Deletes an invitation link.
     * Ensures that the current user has permission to delete the specified invitation link.  Throws security or not-found exceptions if required conditions are not met.
     * Responses:
     *  - 200: Invitation link
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
     * @param invitationLinkDeleteRequestDto The data transfer object containing the details of the invitation link to be deleted. (optional)
     * @return [StringWrapper]
     */
    @HTTP(method = "DELETE", path = "api/2.0/portal/users/invitationlink", hasBody = true)
    suspend fun deleteInvitationLink(@Body invitationLinkDeleteRequestDto: InvitationLinkDeleteRequestDto? = null): Response<StringWrapper>

    /**
     * GET api/2.0/portal/users/invite/{employeeType}
     * Get an invitation link
     * Returns an invitation link for joining the portal.
     * Responses:
     *  - 200: Invitation link
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
     * @param employeeType The type of employee role for the invitation link (DocSpaceAdmin, RoomAdmin or User).
     * @return [StringWrapper]
     */
    @Deprecated("This api was deprecated")
    @GET("api/2.0/portal/users/invite/{employeeType}")
    suspend fun getInvitationLink(@Path("employeeType") employeeType: EmployeeType): Response<StringWrapper>

    /**
     * GET api/2.0/portal/users/invitationlink/{employeeType}
     * Get an invitation link
     * Returns an invitation link for joining the portal.
     * Responses:
     *  - 200: Invitation link
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
     * @param employeeType The type of employee role for the invitation link (DocSpaceAdmin, RoomAdmin or User).
     * @return [InvitationLinkWrapper]
     */
    @GET("api/2.0/portal/users/invitationlink/{employeeType}")
    suspend fun getInvitationLinkByEmployeeType(@Path("employeeType") employeeType: EmployeeType): Response<InvitationLinkWrapper>

    /**
     * GET api/2.0/portal/userscount
     * Get a number of portal users
     * Returns a number of portal users.
     * Responses:
     *  - 200: Number of portal users
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
     * Get a user by ID
     * Returns a user with the ID specified in the request from the current portal.
     * Responses:
     *  - 200: User information
     *  - 404: The user could not be found
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
     * @param userID The user ID extracted from the route parameters.
     * @return [UserInfoWrapper]
     */
    @GET("api/2.0/portal/users/{userID}")
    suspend fun getUserById(@Path("userID") userID: java.util.UUID): Response<UserInfoWrapper>

    /**
     * POST api/2.0/portal/present/mark
     * Mark a gift message as read
     * Marks a gift message as read.
     * Responses:
     *  - 200: OK
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
     * Sends congratulations to the user after registering a portal.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
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
     * @param userid The user ID to receive the congratulatory message.
     * @param key The template identifier or email configuration key.
     * @return [Unit]
     */
    @POST("api/2.0/portal/sendcongratulations")
    suspend fun sendCongratulations(@Query("Userid") userid: java.util.UUID, @Query("Key") key: kotlin.String): Response<Unit>

    /**
     * PUT api/2.0/portal/users/invitationlink
     * Update an invitation link
     * Returns an invitation link for joining the portal.
     * Responses:
     *  - 200: Invitation link
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
