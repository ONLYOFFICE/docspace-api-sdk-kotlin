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

import onlyoffice.docspace.api.sdk.models.EmailMemberRequestDto
import onlyoffice.docspace.api.sdk.models.EmployeeFullWrapper
import onlyoffice.docspace.api.sdk.models.MemberBaseRequestDto
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface PasswordApi {
    /**
     * PUT api/2.0/people/{userid}/password
     * Change a user password
     * Sets a new password to the user with the ID specified in the request.
     * Responses:
     *  - 200: Detailed user information
     *  - 400: Incorrect email
     *  - 401: Unauthorized
     *  - 403: The invitation link is invalid or its validity has expired
     *  - 404: User not found
     *
     * REST API Reference for changeUserPassword Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-password/
     *
     *
     * @param userid The user ID.
     * @param memberBaseRequestDto The request parameters for the user generic information.
     * @return [Call]<[EmployeeFullWrapper]>
     */
    @PUT("api/2.0/people/{userid}/password")
    fun changeUserPassword(@Path("userid") userid: java.util.UUID, @Body memberBaseRequestDto: MemberBaseRequestDto): Call<EmployeeFullWrapper>

    /**
     * POST api/2.0/people/password
     * Remind a user password
     * Reminds a password to the user using the email address specified in the request.
     * Responses:
     *  - 200: Email with the password
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for sendUserPassword Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-user-password/
     *
     *
     * @param emailMemberRequestDto  (optional)
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/people/password")
    fun sendUserPassword(@Body emailMemberRequestDto: EmailMemberRequestDto? = null): Call<StringWrapper>

}
