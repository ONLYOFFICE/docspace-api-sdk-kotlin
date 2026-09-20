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
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.MobileRequestsDto
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface AuthenticationApi {
    /**
     * POST api/2.0/authentication
     * Authenticate a user
     * Signs a user in to the current portal and either issues the authentication token or reports which second  factor is still missing. Credentials go in the body as `userName` with `password` or `passwordHash`, as the  key of a confirmation link in `confirmData`, or as a third-party account (`provider` with `accessToken`, or  `serializedProfile`), which only a standalone installation or a tariff with third-party sign-in allows. Open  to unauthenticated callers, mutating and not  idempotent: it writes a login event, sets the portal cookies and counts every failure against the brute-force  limit. When a second factor is required for this user the answer carries no `token` but `sms` with the masked  phone number - or a `confirmUrl` pointing at `POST api/2.0/authentication/setphone` while no number is  activated yet - or `tfa` with the setup key while the authenticator app is not connected; submit the code to  `POST api/2.0/authentication/{code}` to finish such a sign-in. Otherwise the answer carries `token` for the  `Authorization` header and `expires`, which is omitted when `session=true` ties the token to the browser  session. An unknown user fails with 404, rejected credentials with 401, a disabled or blocked user with 403.
     * Responses:
     *  - 200: The authentication token, or the second factor that has to be passed before a token is issued
     *  - 400: The request body could not be validated, for example `confirmData.email` is not an email address
     *  - 401: The password, the confirmation key or the third-party profile was rejected, or third-party sign-in is not allowed for this portal
     *  - 403: The user is disabled, or too many failed attempts and CAPTCHA failures have blocked further sign-ins for these credentials
     *  - 404: No user of this portal matches the credentials in the request body
     *  - 429: The portal rate limiter rejected the call - retry after the interval in the `Retry-After` header
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Finishes a two-factor sign-in: checks the one-time code and, when it matches, issues the authentication token.  Call it only after `POST api/2.0/authentication` answered with `sms` or `tfa` set, and repeat the same  credentials in the body next to `code` - the code alone does not identify the user. The code comes from the  SMS the portal sent, which `POST api/2.0/authentication/sendsms` resends, or from the authenticator app;  whichever second factor the portal has enabled for this user is the one checked here. Open to unauthenticated  callers, mutating and not idempotent: a code is single-use, the sign-in is written to the login history, and  the first code accepted from an authenticator app also connects that app to the user. The answer carries  `token` for the `Authorization` header, `expires` unless `session=true` tied the token to the browser session,  and either `sms` with the masked phone number or `tfa`. A wrong, empty or expired code fails with 401 and  counts against the brute-force limit, which then refuses further attempts with 403.
     * Responses:
     *  - 200: The authentication token to send in the `Authorization` header, together with the second factor that was accepted
     *  - 400: The request body could not be validated, for example `confirmData.email` is not an email address
     *  - 401: The credentials were rejected, or the two-factor code is wrong, empty or expired
     *  - 403: The user is disabled, or too many failed attempts have blocked further sign-ins for these credentials
     *  - 404: No user of this portal matches the credentials in the request body
     *  - 429: The portal rate limiter rejected the call - retry after the interval in the `Retry-After` header
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for authenticateMeFromBodyWithCode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me-from-body-with-code/
     *
     *
     * @param code The two-factor authentication code. Send the same value as the `code` of the request body, which is the one the handler reads.
     * @param authWithCodeRequestsDto  (optional)
     * @return [AuthenticationTokenWrapper]
     */
    @POST("api/2.0/authentication/{code}")
    suspend fun authenticateMeFromBodyWithCode(@Path("code") code: kotlin.String, @Body authWithCodeRequestsDto: AuthWithCodeRequestsDto? = null): Response<AuthenticationTokenWrapper>

    /**
     * POST api/2.0/authentication/confirm
     * Check a confirmation link
     * Checks the key of a confirmation link that the portal sent by email and reports whether the action behind that  link can still be carried out - an employee invitation, phone activation, a password change, portal removal  and so on. Take `key` and `type` from the query string of the link; when `key` is left empty, the key saved in  the confirmation cookie of the same `type` is used instead. Open to unauthenticated callers and read-only: it  neither accepts the invitation nor signs anyone in. `result` is `Ok` when the link may be used, `Invalid` when  the key does not match the type or the email, `Expired` when it is too old, and `TariffLimit`, `UserExisted`,  `UserExcluded` or `QuotaFailed` when the key is sound but the invitation behind it cannot be accepted. Only  `Ok` should be followed by the operation that performs the action - `POST api/2.0/people` with  `fromInviteLink` for an invitation, `POST api/2.0/authentication` with `confirmData` for a sign-in link - and  for an invitation to a room the answer also carries the identifier and the title of that room.
     * Responses:
     *  - 200: Whether the confirmation link may be used, with the room and the email it was issued for when it is an invitation
     *  - 403: The portal's IP restrictions do not allow this address to check an invitation link
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Reports whether the credentials that came with this very request identify a signed-in user of the current  portal - the authentication cookie, or the token in the `Authorization` header. Nothing has to be called  first: the operation is open to unauthenticated callers, who simply get `false`, it is read-only and  idempotent, and it answers even while the portal's payment has lapsed. The result is a bare boolean that  carries no reason, so `false` covers a missing, malformed, expired and revoked token alike; the way to recover  from it is to sign in again with `POST api/2.0/authentication`. It says nothing about who the caller is or how  long the session still lasts - read `GET api/2.0/people/@self` for the profile behind the token.
     * Responses:
     *  - 200: `true` when the request carries a valid token or cookie of an active portal user, `false` in every other case
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Ends the session the request itself was made with: the login event behind the authentication cookie is closed,  the sockets opened for it are disconnected, the portal cookies are cleared and a logout event is written to  the login history. Send it with the cookie or token of the session that is to be closed; an anonymous call is  accepted and closes nothing. The operation is mutating and idempotent - the same session cannot be closed  twice - and it touches only that one session: the other sessions of the same user stay alive and are ended by  `PUT api/2.0/security/activeconnections/logoutallexceptthis` or  `PUT api/2.0/security/activeconnections/logout/{loginEventId}`. The answer is a single logout URL when the  user signed in through SSO and the portal has an SLO endpoint configured, and the client has to open that URL  to end the session on the identity provider as well; for everyone else it is empty and nothing more is needed.
     * Responses:
     *  - 200: The single logout URL to open when the user signed in through SSO, or an empty result when no further action is needed
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Stores the mobile phone number of a user who is going through phone activation and sends the first SMS  authentication code to it. It is reachable only with the phone-activation confirmation link that  `POST api/2.0/authentication` returns in `confirmUrl` when SMS two-factor is required and the user has no  activated number yet: that link authorizes the call in place of an authentication token, and no token is  issued here. The operation is mutating and not idempotent - it saves the number as not activated, writes an  audit event and sends a message - and an already activated number is not replaced this way, the stored number  has to be erased first. The answer carries `sms`, the masked number and `expires`, the moment the code stops  being accepted. Submit that code to `POST api/2.0/authentication/{code}`, which signs the user in and marks  the number activated, or ask for another one with `POST api/2.0/authentication/sendsms`.
     * Responses:
     *  - 200: The masked phone number the code was sent to and the moment that code expires - no authentication token yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Sends a new SMS authentication code to the phone number stored for the user and reports when that code  expires. The credentials in the body are checked exactly as by `POST api/2.0/authentication`, so use this  operation to resend the code after that call answered with `sms`; the user needs SMS two-factor enabled and a  phone number already stored, which `POST api/2.0/authentication/setphone` registers. Open to unauthenticated  callers, mutating and not idempotent: every call sends a message, is counted in the portal's SMS usage and  spends one of the few codes a number is allowed within the code lifetime (ten minutes by default), after which  the call fails until those codes expire. Codes sent earlier stay valid, so a resent code does not invalidate  them, and the first one to be accepted invalidates all of them. The answer carries `sms`, the masked number  and `expires`, and no token - submit the code to `POST api/2.0/authentication/{code}`.
     * Responses:
     *  - 200: The masked phone number the code was sent to and the moment that code expires - no authentication token yet
     *  - 400: The request body could not be validated, for example `confirmData.email` is not an email address
     *  - 401: The password, the confirmation key or the third-party profile was rejected
     *  - 403: The user is disabled, or too many failed attempts have blocked further sign-ins for these credentials
     *  - 404: No user of this portal matches the credentials in the request body
     *  - 429: The portal rate limiter rejected the call - retry after the interval in the `Retry-After` header
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
