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


package onlyoffice.docspace.api.sdk.apis.Settings

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TfaAppCodeArrayWrapper
import onlyoffice.docspace.api.sdk.models.TfaConfirmDataWrapper
import onlyoffice.docspace.api.sdk.models.TfaRequestsDto
import onlyoffice.docspace.api.sdk.models.TfaSettingsArrayWrapper
import onlyoffice.docspace.api.sdk.models.TfaSetupCodeWrapper
import onlyoffice.docspace.api.sdk.models.TfaValidateRequestsDto

interface TFASettingsApi {
    /**
     * GET api/2.0/settings/tfaappcodes
     * Get the TFA backup codes
     * Returns the one-time backup codes of the current user's authenticator-application credential, each with the  flag that says whether it has been spent. A backup code is accepted in place of a code from the application  when signing in, and every code works exactly once, so this list is what a member falls back on after losing  access to their authenticator. Any authenticated member may call it, always for their own account: there is no  way to read someone else's codes. The authenticator method has to be enabled on the portal and an application  has to be linked to the account already, otherwise the call answers 405; link one through  `GET api/2.0/settings/tfaapp/confirm` and `POST api/2.0/settings/tfaapp/validate`. Accounts flagged as  outsiders are refused. This is a read-only, idempotent call: the codes are generated once, when the  application is first linked, and the whole set is replaced by `PUT api/2.0/settings/tfaappnewcodes`. The  default configuration issues five codes of six characters, and a portal may be configured for a different  number and length.
     * Responses:
     *  - 200: The caller's backup codes, each with the flag showing whether it has already been used
     *  - 405: The authenticator method is not enabled on this portal, or the caller has no application linked
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTfaAppCodes Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-app-codes/
     *
     *
     * @return [TfaAppCodeArrayWrapper]
     */
    @GET("api/2.0/settings/tfaappcodes")
    suspend fun getTfaAppCodes(): Response<TfaAppCodeArrayWrapper>

    /**
     * GET api/2.0/settings/tfaapp/confirm
     * Get TFA confirmation data
     * Returns the confirmation link the current user has to follow to pass the portal's two-factor authentication  step, together with the confirmation cookie that link depends on. Any authenticated member may call it, always  for their own account, and TFA has to be required for that account by the portal policy already, otherwise the  response body is empty. Which link comes back depends on the method. With the SMS method it is a phone  activation link while the account has no activated mobile number and a phone authorization link afterwards,  and only `url` is filled in. With the authenticator-application method the response also carries `cookieName`  and `cookieValue`, and the call mutates state by issuing a fresh confirmation key and setting that cookie; the  link then points at activation while no application is linked, or after the previous link was reset, and at  re-verification once one is linked. Hand the code obtained through that flow to  `POST api/2.0/settings/tfaapp/validate`. The portal-wide policy behind all of this is read with  `GET api/2.0/settings/tfaapp`.
     * Responses:
     *  - 200: The confirmation link for the caller's TFA step, with the cookie filled in for the authenticator method
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTfaConfirmData Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-confirm-data/
     *
     *
     * @return [TfaConfirmDataWrapper]
     */
    @GET("api/2.0/settings/tfaapp/confirm")
    suspend fun getTfaConfirmData(): Response<TfaConfirmDataWrapper>

    /**
     * GET api/2.0/settings/tfaapp
     * Get the TFA settings
     * Lists the two-factor authentication methods this portal offers, with the state of each one. The list carries  at most two entries: `sms`, present only when the SMS method is enabled in the portal's configuration, and  `app`, present only when the authenticator-application method is enabled there, so an empty list means neither  method is offered here. Any authenticated member may call it, and what it returns is the portal-wide policy,  not the caller's own linked credential. This is a read-only, idempotent call. For every entry `enabled` says  whether that method is the current policy, `available` says whether it can actually be switched on (for `sms`  that also requires a configured SMS provider), `trustedIps` lists the addresses and ranges exempt from the  challenge, and `mandatoryUsers` and `mandatoryGroups` list the accounts that have to pass it even from a  trusted address. Change the policy with `PUT api/2.0/settings/tfaapp`, and read the caller's own backup codes  with `GET api/2.0/settings/tfaappcodes`.
     * Responses:
     *  - 200: The TFA methods the portal offers, with the portal-wide state of each
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTfaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-settings/
     *
     *
     * @return [TfaSettingsArrayWrapper]
     */
    @GET("api/2.0/settings/tfaapp")
    suspend fun getTfaSettings(): Response<TfaSettingsArrayWrapper>

    /**
     * GET api/2.0/settings/tfaapp/setup
     * Generate the TFA setup code
     * Issues the secret the current user has to enter in an authenticator application before the  authenticator-application method can be used, both as a scannable QR-code image and as a key for manual entry.  The call is reachable only with a confirmation token carrying the `TfaActivation` role, obtained from  `GET api/2.0/settings/tfaapp/confirm` or from the login flow; an ordinary bearer token is refused. The  authenticator method has to be enabled on the portal and be its current policy, and the account must have no  application linked yet: for an already-linked account the call answers 405, so reset the credential first with  `PUT api/2.0/settings/tfaappnewapp`. Accounts flagged as outsiders are refused. Repeating the call is safe and  hands back the same secret for the account, so the QR code and the manual key always describe one and the same  credential. `qrCodeSetupImageUrl` is a base64 `data:` URL of a PNG image, and `account` is the label the  application will show. Finish the setup by sending a code from the application to  `POST api/2.0/settings/tfaapp/validate`.
     * Responses:
     *  - 200: The account label, the manual entry key and the QR-code image for linking an authenticator application
     *  - 405: The authenticator method is not enabled on this portal, or the account already has an application linked
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for tfaAppGenerateSetupCode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/tfa-app-generate-setup-code/
     *
     *
     * @return [TfaSetupCodeWrapper]
     */
    @GET("api/2.0/settings/tfaapp/setup")
    suspend fun tfaAppGenerateSetupCode(): Response<TfaSetupCodeWrapper>

    /**
     * POST api/2.0/settings/tfaapp/validate
     * Validate the TFA code
     * Verifies a two-factor authentication code for the account named in the confirmation link being used, and  completes that account's pending TFA step. The call is reachable only with a confirmation token carrying the  `TfaActivation` or `TfaAuth` role, issued by `GET api/2.0/settings/tfaapp/confirm` or by the login flow; an  ordinary bearer token is refused. Both a code from the authenticator application and one of the account's  unused backup codes are accepted, and a backup code is spent by the check. The call mutates state: it signs  the account in, clears the confirmation cookie so the link cannot be replayed, and on the very first  activation it generates the backup codes later returned by `GET api/2.0/settings/tfaappcodes`. Pass  `session=true` to keep that sign-in for the browser session only instead of a persistent one. It answers  `true` only for that first activation and `false` when an application was already linked. A wrong code is  rejected as an invalid request, and further attempts are refused once the portal's login attempt limit is  reached. The call also works while the portal's payment is overdue.
     * Responses:
     *  - 200: `true` when the code completed a first activation and backup codes were generated, `false` when an application was already linked
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for tfaValidateAuthCode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/tfa-validate-auth-code/
     *
     *
     * @param tfaValidateRequestsDto  (optional)
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/settings/tfaapp/validate")
    suspend fun tfaValidateAuthCode(@Body tfaValidateRequestsDto: TfaValidateRequestsDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/settings/tfaappnewapp
     * Unlink the TFA application
     * Detaches the authenticator application from an account, so that the account has to link a new one before it  can sign in again. `id` has to name an existing account: an empty or unknown value is refused. Passing the  caller's own ID resets their own credential and returns the activation link they should follow next; passing  another member's ID is allowed for the portal owner only, and every other caller, a DocSpace administrator  included, is refused. The account has to have an application linked and the authenticator method has to be  enabled on the portal, otherwise the call answers 405. The call is destructive: the account's backup codes are  dropped together with the credential and all of its sessions are signed out. For another member the portal  also emails them that their TFA was reset, and the answer is then an empty string. The portal-wide policy is  not touched, so TFA stays required and the account sets up an application again through  `GET api/2.0/settings/tfaapp/confirm`; lift the requirement for everyone with `PUT api/2.0/settings/tfaapp`.
     * Responses:
     *  - 200: The activation link when the caller reset their own application, or an empty string when another member's was reset
     *  - 403: The caller is not the portal owner, or the account cannot be resolved from `id`
     *  - 405: The authenticator method is not enabled on this portal, or the account has no application linked
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for unlinkTfaApp Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-tfa-app/
     *
     *
     * @param tfaRequestsDto  (optional)
     * @return [StringWrapper]
     */
    @PUT("api/2.0/settings/tfaappnewapp")
    suspend fun unlinkTfaApp(@Body tfaRequestsDto: TfaRequestsDto? = null): Response<StringWrapper>

    /**
     * PUT api/2.0/settings/tfaappnewcodes
     * Regenerate the TFA backup codes
     * Replaces the current user's one-time backup codes with a freshly generated set and returns it. Use it once the  previous codes have been spent or may have leaked: the whole old set stops being accepted the moment this call  succeeds, so store the new codes before leaving the response. Any authenticated member may call it, always for  their own account. The authenticator method has to be enabled on the portal and an application has to be  linked to the account already, otherwise the call answers 405, and accounts flagged as outsiders are refused.  The call mutates state and is not idempotent: every invocation issues another set and discards the one before  it, so a retry after a timeout returns codes different from those the first attempt generated. The codes come  back unused, five of them of six characters with the default configuration, and a portal may be configured for  a different number and length. Read the current set without changing it through  `GET api/2.0/settings/tfaappcodes`. The authenticator secret itself is untouched, so the linked application  keeps working.
     * Responses:
     *  - 200: The newly generated backup codes, all unused, replacing the caller's previous set
     *  - 405: The authenticator method is not enabled on this portal, or the caller has no application linked
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateTfaAppCodes Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-app-codes/
     *
     *
     * @return [TfaAppCodeArrayWrapper]
     */
    @PUT("api/2.0/settings/tfaappnewcodes")
    suspend fun updateTfaAppCodes(): Response<TfaAppCodeArrayWrapper>

    /**
     * PUT api/2.0/settings/tfaapp
     * Update the TFA settings
     * Sets the portal-wide two-factor authentication policy: `type` `1` switches on the SMS method, `2` switches on  the authenticator application, and `0` turns TFA off, as does any unknown value. The two methods are mutually  exclusive, so switching one on switches the other off. The caller has to be the portal owner or a DocSpace  administrator; other members are refused, and a request that names the owner's account in `id` or in  `mandatoryUsers` is refused unless `id` carries the caller's own account. `trustedIps` takes single addresses,  inclusive ranges and CIDR blocks, and an unparseable entry is rejected as an invalid request; accounts listed  in `mandatoryUsers` or `mandatoryGroups` still have to pass the challenge even from a trusted address.  Switching a method on is disruptive: it resets the portal's authentication cookies, so every session on the  portal, the caller's own included, has to sign in again. The answer is `true` when a method was switched on  and `false` when TFA was turned off. Use `PUT api/2.0/settings/tfaappwithlink` instead to receive the caller's  own confirmation link in the same step.
     * Responses:
     *  - 200: `true` when the SMS or the authenticator method was switched on, `false` when TFA was turned off
     *  - 405: The requested method is not enabled on this portal, or the SMS method has no configured provider
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateTfaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-settings/
     *
     *
     * @param tfaRequestsDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/settings/tfaapp")
    suspend fun updateTfaSettings(@Body tfaRequestsDto: TfaRequestsDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/settings/tfaappwithlink
     * Update TFA settings with a link
     * Applies the same portal-wide two-factor authentication change as `PUT api/2.0/settings/tfaapp` and  additionally returns the confirmation link the caller needs to pass the new challenge, so an administrator who  has just switched TFA on can go straight to setting it up for themselves. The caller has to be the portal  owner or a DocSpace administrator, and a request that names the owner's account in `id` or in `mandatoryUsers`  is refused unless `id` carries the caller's own account. Every effect of the plain call applies here too: the  methods are mutually exclusive, `type` `0` turns TFA off, `trustedIps` and the two mandatory lists behave the  same way, and switching a method on resets the portal's authentication cookies, so all sessions have to sign  in again. The answer is an empty string whenever there is no link to hand out: when the request turned TFA  off, and when the caller is exempt from the challenge, most often because their own address is in the  `trustedIps` list of that very request. The cookie the link depends on is not returned here, read it with  `GET api/2.0/settings/tfaapp/confirm`.
     * Responses:
     *  - 200: The caller's own confirmation link, or an empty string when TFA was turned off or the caller is exempt
     *  - 403: The caller is neither the portal owner nor a DocSpace administrator, or is placing the owner under the policy
     *  - 405: The requested method is not enabled on this portal, or the SMS method has no configured provider
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateTfaSettingsLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-settings-link/
     *
     *
     * @param tfaRequestsDto  (optional)
     * @return [StringWrapper]
     */
    @PUT("api/2.0/settings/tfaappwithlink")
    suspend fun updateTfaSettingsLink(@Body tfaRequestsDto: TfaRequestsDto? = null): Response<StringWrapper>

}
