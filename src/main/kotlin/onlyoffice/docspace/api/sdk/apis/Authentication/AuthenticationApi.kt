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


package onlyoffice.docspace.api.sdk.apis.Authentication

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AuthRequestsDto
import onlyoffice.docspace.api.sdk.models.AuthWithCodeRequestsDto
import onlyoffice.docspace.api.sdk.models.AuthenticationTokenWrapper
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ConfirmWrapper
import onlyoffice.docspace.api.sdk.models.EmailValidationKeyModel
import onlyoffice.docspace.api.sdk.models.MobileRequestsDto
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface AuthenticationApi {
    /**
     * POST api/2.0/authentication
     * Authenticate a user
     * Authenticates the current user by SMS, authenticator app, or without two-factor authentication.
     * Responses:
     *  - 200: Authentication data
     *  - 400: userName, password or passworHash is empty
     *  - 401: User authentication failed
     *  - 404: The user could not be found
     *  - 429: Too many login attempts. Please try again later
     *
     * REST API Reference for authenticateMe Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me/
     *
     *
     * @param authRequestsDto  (optional)
     * @return [AuthenticationTokenWrapper]
     */
    @POST("api/2.0/authentication")
    suspend fun authenticateMe(@Body authRequestsDto: AuthRequestsDto? = null): Response<AuthenticationTokenWrapper>

    /**
     * POST api/2.0/authentication/{code}
     * Authenticate a user by code
     * Authenticates the current user by SMS or two-factor authentication code.
     * Responses:
     *  - 200: Authentication data
     *  - 400: userName, password or passworHash is empty
     *  - 401: User authentication failed
     *  - 403: Auth code is not available
     *  - 429: Too many login attempts. Please try again later
     *
     * REST API Reference for authenticateMeFromBodyWithCode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me-from-body-with-code/
     *
     *
     * @param code 
     * @param authWithCodeRequestsDto  (optional)
     * @return [AuthenticationTokenWrapper]
     */
    @POST("api/2.0/authentication/{code}")
    suspend fun authenticateMeFromBodyWithCode(@Path("code") code: kotlin.String, @Body authWithCodeRequestsDto: AuthWithCodeRequestsDto? = null): Response<AuthenticationTokenWrapper>

    /**
     * POST api/2.0/authentication/confirm
     * Open confirmation email URL
     * Opens a confirmation email URL to validate a certain action (employee invitation, portal removal, phone activation, etc.).
     * Responses:
     *  - 200: Validation result: Ok, Invalid, or Expired
     *
     * REST API Reference for checkConfirm Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-confirm/
     *
     *
     * @param emailValidationKeyModel  (optional)
     * @return [ConfirmWrapper]
     */
    @POST("api/2.0/authentication/confirm")
    suspend fun checkConfirm(@Body emailValidationKeyModel: EmailValidationKeyModel? = null): Response<ConfirmWrapper>

    /**
     * GET api/2.0/authentication
     * Check authentication
     * Checks if the current user is authenticated or not.
     * Responses:
     *  - 200: Boolean value: true if the current user is authenticated
     *
     * REST API Reference for getIsAuthentificated Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-authentificated/
     *
     *
     * @return [BooleanWrapper]
     */
    @GET("api/2.0/authentication")
    suspend fun getIsAuthentificated(): Response<BooleanWrapper>

    /**
     * POST api/2.0/authentication/logout
     * Log out
     * Logs out of the current user account.
     * Responses:
     *  - 200: Ok
     *
     * REST API Reference for logout Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/logout/
     *
     *
     * @return [StringWrapper]
     */
    @POST("api/2.0/authentication/logout")
    suspend fun logout(): Response<StringWrapper>

    /**
     * POST api/2.0/authentication/setphone
     * Set a mobile phone
     * Sets a mobile phone for the current user.
     * Responses:
     *  - 200: Authentication data
     *  - 401: Unauthorized
     *
     * REST API Reference for saveMobilePhone Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-mobile-phone/
     *
     *
     * @param mobileRequestsDto  (optional)
     * @return [AuthenticationTokenWrapper]
     */
    @POST("api/2.0/authentication/setphone")
    suspend fun saveMobilePhone(@Body mobileRequestsDto: MobileRequestsDto? = null): Response<AuthenticationTokenWrapper>

    /**
     * POST api/2.0/authentication/sendsms
     * Send SMS code
     * Sends SMS with an authentication code.
     * Responses:
     *  - 200: Authentication data
     *  - 400: userName, password or passworHash is empty
     *  - 429: Too many login attempts. Please try again later
     *
     * REST API Reference for sendSmsCode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-sms-code/
     *
     *
     * @param authRequestsDto  (optional)
     * @return [AuthenticationTokenWrapper]
     */
    @POST("api/2.0/authentication/sendsms")
    suspend fun sendSmsCode(@Body authRequestsDto: AuthRequestsDto? = null): Response<AuthenticationTokenWrapper>

}
