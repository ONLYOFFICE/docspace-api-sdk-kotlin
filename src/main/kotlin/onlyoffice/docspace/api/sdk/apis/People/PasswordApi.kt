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

import onlyoffice.docspace.api.sdk.models.ChangePasswordRequest
import onlyoffice.docspace.api.sdk.models.EmailMemberRequestDto
import onlyoffice.docspace.api.sdk.models.EmployeeFullWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface PasswordApi {
    /**
     * PUT api/2.0/people/{userid}/password
     * Change a user password
     * Sets a new password on an account, which is the step that completes a password change or a password  recovery.  The request has to carry the confirmation token from the emailed link rather than an ordinary session, and an  expired or already used token is answered with 401.  The account has to exist and be `Active`, so the password of a disabled account or of an open invitation  cannot be set, and only the portal owner may set the owner's own password.  Send either `passwordHash`, which is taken as it is, or a plain `password`, which is checked against the  portal password policy; sending neither, or a password the policy rejects, answers 400.  The change ends every other session of that account and emails it a notice that the password was changed.  The answer is the profile, which does not carry the password in any form.  To have the recovery link sent in the first place, use `POST api/2.0/people/password`.
     * Responses:
     *  - 200: The profile whose password was changed
     *  - 400: The user ID is empty, no password was sent, or the password does not meet the portal policy
     *  - 403: The account is not active, or only its owner may change this password
     *  - 404: No account has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeUserPassword Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-password/
     *
     *
     * @param userid The ID of the account whose password is set, taken from the route. It has to match the account the  confirmation token was issued for, and the account has to be active.
     * @param changePasswordRequest The new password, sent either in plain text or already hashed. Exactly one of the two fields is needed.
     * @return [EmployeeFullWrapper]
     */
    @PUT("api/2.0/people/{userid}/password")
    suspend fun changeUserPassword(@Path("userid") userid: java.util.UUID, @Body changePasswordRequest: ChangePasswordRequest): Response<EmployeeFullWrapper>

    /**
     * POST api/2.0/people/password
     * Remind a user password
     * Emails a password recovery link to an address, and is the entry point of the recovery flow rather than the  operation that changes anything.  It needs no authentication, which is how a person who cannot sign in uses it; when the portal has a CAPTCHA  configured, an unauthenticated request has to pass it and answers 403 if it does not.  An unauthenticated caller always gets the same success message, whether or not the address belongs to an  account, so the answer cannot be used to find out which addresses are registered.  An authenticated caller does get told: a failure is answered with 403, and asking for somebody else requires  DocSpace administrator rights, while the owner's password can be asked for by the owner alone and another  administrator's only by the owner.  The link that is sent leads to `PUT api/2.0/people/{userid}/password`, which is where the new password is  set; no password is ever sent by email despite the wording of the message.  Repeated calls are throttled.
     * Responses:
     *  - 200: The message stating that the recovery link was sent to the address
     *  - 403: The CAPTCHA was not passed, or an authenticated caller may not ask for that account
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for sendUserPassword Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-user-password/
     *
     *
     * @param emailMemberRequestDto  (optional)
     * @return [StringWrapper]
     */
    @POST("api/2.0/people/password")
    suspend fun sendUserPassword(@Body emailMemberRequestDto: EmailMemberRequestDto? = null): Response<StringWrapper>

}
