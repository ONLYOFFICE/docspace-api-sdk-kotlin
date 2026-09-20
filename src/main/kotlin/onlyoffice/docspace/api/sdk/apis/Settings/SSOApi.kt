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

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.SsoSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.SsoSettingsV2ConstantsWrapper
import onlyoffice.docspace.api.sdk.models.SsoSettingsV2Wrapper

interface SSOApi {
    /**
     * GET api/2.0/settings/ssov2/default
     * Get the default SSO settings
     * Returns the built-in SSO configuration a portal starts from: empty identity provider and service provider  sections with the stock SAML settings already filled in (HTTP-POST binding, transient name ID format, RSA-SHA1  signing, AES-128 encryption), the default attribute mapping of `givenName`, `sn` and `mail`, the  `Single Sign-on` login label, new accounts typed as user, and SSO switched off. Use it as the template for a  new configuration: fill in the identity provider entity ID, sign-in URL and certificates, then send the result  to `POST api/2.0/settings/ssov2`. The values are the same for every portal and do not depend on what is  currently saved, nothing is written, and the call is safe to repeat. The caller needs the permission to edit  portal settings, which in practice means the portal owner or a DocSpace admin, and the portal plan has to  include Single Sign-On. This operation changes nothing by itself: to actually discard the configuration in  use, call `DELETE api/2.0/settings/ssov2`, and to read what is configured now, call  `GET api/2.0/settings/ssov2`.
     * Responses:
     *  - 200: The built-in SSO configuration a portal starts from
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getDefaultSsoSettingsV2 Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-sso-settings-v2/
     *
     *
     * @return [SsoSettingsV2Wrapper]
     */
    @GET("api/2.0/settings/ssov2/default")
    suspend fun getDefaultSsoSettingsV2(): Response<SsoSettingsV2Wrapper>

    /**
     * GET api/2.0/settings/ssov2
     * Get the SSO settings
     * Returns the SAML Single Sign-On configuration of the current portal: the identity provider endpoints and  certificates, the service provider certificates, the attribute mapping, the login button label and the user  type new SSO accounts get. Anonymous callers are accepted, but an unauthenticated one receives only  `hideAuthPage`, which tells the sign-in page whether the built-in login form has to be hidden; every other  field stays empty, so read the full configuration with an authenticated request. An authenticated caller needs  the permission to edit portal settings, which in practice means the portal owner or a DocSpace admin, and the  portal plan has to include Single Sign-On, otherwise the call is refused. The operation only reads and is safe  to repeat. When the login label was never set, the response carries the built-in `Single Sign-on` instead of  an empty string, and `enableSso` is null until the settings are saved for the first time. Use  `GET api/2.0/settings/ssov2/default` for a blank configuration to start from, and  `GET api/2.0/settings/ssov2/constants` for the values the SAML fields accept.
     * Responses:
     *  - 200: The current portal SSO settings; an anonymous caller gets only the hidden-login-form flag
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSsoSettingsV2 Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2/
     *
     *
     * @return [SsoSettingsV2Wrapper]
     */
    @GET("api/2.0/settings/ssov2")
    suspend fun getSsoSettingsV2(): Response<SsoSettingsV2Wrapper>

    /**
     * GET api/2.0/settings/ssov2/constants
     * Get the SSO settings constants
     * Returns every literal value the SAML fields of the SSO configuration accept, grouped by the field it belongs  to: name ID formats, request bindings, signing and encryption algorithms, and what a service provider or  identity provider certificate can be used for. The values are the SAML URNs and algorithm URIs themselves, so  they can be written into the configuration exactly as they come back; picking one from the matching group is  the point, because `POST api/2.0/settings/ssov2` stores these fields as they are given and a misspelled value  therefore surfaces only later, as a failing sign-in. The list is a fixed part of the product: it is the same  for every portal, does not depend on the saved settings and does not change between calls within a release, so  it can be cached. The operation only reads, is safe to repeat and needs nothing beyond an authenticated  caller. Use it together with `GET api/2.0/settings/ssov2/default`, which already has the usual values set.
     * Responses:
     *  - 200: Every value the SAML fields accept: name ID formats, bindings, signing and encryption algorithms, and the service provider and identity provider certificate uses
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSsoSettingsV2Constants Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2-constants/
     *
     *
     * @return [SsoSettingsV2ConstantsWrapper]
     */
    @GET("api/2.0/settings/ssov2/constants")
    suspend fun getSsoSettingsV2Constants(): Response<SsoSettingsV2ConstantsWrapper>

    /**
     * DELETE api/2.0/settings/ssov2
     * Reset the SSO settings
     * Discards the SAML Single Sign-On configuration of the current portal, stores the built-in default one in its  place and returns what was stored, which is the same content as `GET api/2.0/settings/ssov2/default`. This is  destructive and cannot be undone through the API: the identity provider addresses, both certificate sets, the  attribute mapping and the login label are gone and SSO is left switched off, so keep a copy of  `GET api/2.0/settings/ssov2` first if the configuration may be needed again. Every account that signed in  through SSO is unlinked and becomes an ordinary account that keeps its data but authenticates with portal  credentials from then on, and its external contacts are converted the same way. Repeating the call is  harmless, as the second one stores the same defaults again. The caller needs the permission to edit portal  settings, which in practice means the portal owner or a DocSpace admin, and the portal plan has to include  Single Sign-On, otherwise the call is refused. To switch SSO off while keeping the configuration, send it back  to `POST api/2.0/settings/ssov2` with SSO disabled instead. The reset is recorded in the audit trail.
     * Responses:
     *  - 200: The default SSO configuration that is now in effect
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for resetSsoSettingsV2 Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-sso-settings-v2/
     *
     *
     * @return [SsoSettingsV2Wrapper]
     */
    @DELETE("api/2.0/settings/ssov2")
    suspend fun resetSsoSettingsV2(): Response<SsoSettingsV2Wrapper>

    /**
     * POST api/2.0/settings/ssov2
     * Save the SSO settings
     * Replaces the whole SAML Single Sign-On configuration of the current portal with the one passed as a JSON  object in `serializeSettings`, and returns the configuration as it was stored. The payload is a complete  configuration rather than a patch: fields left out are stored empty, so send back a changed copy of  `GET api/2.0/settings/ssov2`, or start from `GET api/2.0/settings/ssov2/default`. The identity provider entity  ID and sign-in URL are required, the sign-in and sign-out URLs have to be absolute http or https addresses,  and the attribute mapping has to name the fields for first name, last name and email; otherwise nothing is  saved. The caller has to be allowed to edit portal settings (portal owner or DocSpace admin), and the portal  plan has to include Single Sign-On. Some values are normalised on the way in: a `usersType` other than 1 (room  admin), 3 (DocSpace admin) or 4 (user) becomes 4, an empty login label becomes `Single Sign-on`, and a longer  one is cut to 100 characters. Saving with SSO switched off unlinks every existing SSO account and turns it  into an ordinary one; switching SSO back on later does not restore those links. The change is recorded in the  audit trail.
     * Responses:
     *  - 200: The SSO settings as they were stored, with the login label and the user type normalised
     *  - 400: The serialized settings are empty or do not contain an SSO configuration object
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveSsoSettingsV2 Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-sso-settings-v2/
     *
     *
     * @param ssoSettingsRequestsDto  (optional)
     * @return [SsoSettingsV2Wrapper]
     */
    @POST("api/2.0/settings/ssov2")
    suspend fun saveSsoSettingsV2(@Body ssoSettingsRequestsDto: SsoSettingsRequestsDto? = null): Response<SsoSettingsV2Wrapper>

}
