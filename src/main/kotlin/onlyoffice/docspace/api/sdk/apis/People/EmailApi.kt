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

import onlyoffice.docspace.api.sdk.models.ChangeEmailRequest
import onlyoffice.docspace.api.sdk.models.EmployeeFullWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.UpdateMemberRequestDto

interface EmailApi {
    /**
     * PUT api/2.0/people/{userid}/email
     * Change a user email
     * Sets a new email to the user with the ID specified in the request.
     * Responses:
     *  - 200: Detailed user information
     *  - 400: Incorrect userId or email
     *  - 403: The link is invalid or no permissions to perform this action
     *  - 404: The user could not be found
     *  - 401: Unauthorized
     *
     * REST API Reference for changeUserEmail Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-email/
     *
     *
     * @param userid The user ID.
     * @param changeEmailRequest The request parameters for updating a user email.
     * @return [EmployeeFullWrapper]
     */
    @PUT("api/2.0/people/{userid}/email")
    suspend fun changeUserEmail(@Path("userid") userid: java.util.UUID, @Body changeEmailRequest: ChangeEmailRequest): Response<EmployeeFullWrapper>

    /**
     * POST api/2.0/people/email
     * Send instructions to change email
     * Sends a message to the user email with the instructions to change the email address connected to the portal.
     * Responses:
     *  - 200: Message text
     *  - 400: Incorrect userId or email
     *  - 403: No permissions to perform this action
     *  - 404: User not found
     *  - 401: Unauthorized
     *
     * REST API Reference for sendEmailChangeInstructions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-email-change-instructions/
     *
     *
     * @param updateMemberRequestDto  (optional)
     * @return [StringWrapper]
     */
    @POST("api/2.0/people/email")
    suspend fun sendEmailChangeInstructions(@Body updateMemberRequestDto: UpdateMemberRequestDto? = null): Response<StringWrapper>

}
