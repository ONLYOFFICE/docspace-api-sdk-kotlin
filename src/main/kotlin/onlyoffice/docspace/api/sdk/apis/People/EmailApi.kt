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
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.UpdateMemberRequestDto

interface EmailApi {
    /**
     * PUT api/2.0/people/{userid}/email
     * Change a user email
     * Sets a new email address on an account, which is the step that completes an email change.  The request has to carry the confirmation token from the emailed link rather than an ordinary session, and an  expired or already used token is answered with 401.  The account has to exist and be `Active`, and only the portal owner may change the owner's own address.  Pass the address either in plain text as `email` or, as it arrives inside the confirmation link, encrypted as  `encEmail`; an empty or malformed address answers 400.  An address equal to the current one is accepted and changes nothing, while a new one is stored in lowercase  and marks the account `Activated`, because following the link proves the address works.  The answer is the profile with its new address.  The change is requested through `POST api/2.0/people/email`, which is what sends the link.
     * Responses:
     *  - 200: The profile with its new address
     *  - 400: The user ID is empty, or the address is missing or malformed
     *  - 403: The account is not active, or only its owner may change this address
     *  - 404: No account has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeUserEmail Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-email/
     *
     *
     * @param userid The ID of the account whose address is set, taken from the route. It has to match the account the  confirmation token was issued for, and the account has to be active.
     * @param changeEmailRequest The new address, in plain text or in the encrypted form the confirmation link carries.
     * @return [EmployeeFullWrapper]
     */
    @PUT("api/2.0/people/{userid}/email")
    suspend fun changeUserEmail(@Path("userid") userid: java.util.UUID, @Body changeEmailRequest: ChangeEmailRequest): Response<EmployeeFullWrapper>

    /**
     * POST api/2.0/people/email
     * Send instructions to change email
     * Starts changing the email address of an account, and what it actually does depends on who calls it.  A caller acting on their own account only gets a confirmation letter sent to the new address, and the address  stays unchanged until that link is followed, which lands on `PUT api/2.0/people/{userid}/email`.  A DocSpace administrator acting on somebody else changes the address immediately instead: the account is  marked as not activated, every session of it is ended, and activation instructions are sent to the new  address - and passing the address the account already has is then rejected with 400.  A caller who is not an administrator may only address their own account, nobody but the owner may change the  owner's address, and only the owner may change the address of another DocSpace administrator.  The target has to be an account that is neither disabled nor a pending invitation, otherwise the operation  answers 404, and an address that already belongs to somebody answers 400.  The answer is a ready-to-display message naming the address the letter was sent to.
     * Responses:
     *  - 200: The message stating which address the letter was sent to
     *  - 400: The user ID is empty, the address is missing, malformed, already taken, or equal to the current one
     *  - 403: The caller may not change the address of that account
     *  - 404: The account does not exist, is disabled, or is a pending invitation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
