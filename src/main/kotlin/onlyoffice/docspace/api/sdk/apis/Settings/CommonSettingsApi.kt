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

import onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsWrapper
import onlyoffice.docspace.api.sdk.models.DeepLinkConfigurationRequestsDto
import onlyoffice.docspace.api.sdk.models.DefaultProductRequestDto
import onlyoffice.docspace.api.sdk.models.DnsSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.EmailActivationSettings
import onlyoffice.docspace.api.sdk.models.EmailActivationSettingsWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.MailDomainSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.PaymentSettingsWrapper
import onlyoffice.docspace.api.sdk.models.STRINGArrayWrapper
import onlyoffice.docspace.api.sdk.models.SettingsWrapper
import onlyoffice.docspace.api.sdk.models.SocketSettingsWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.StudioDefaultPageSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TenantAiAccessSettingsDto
import onlyoffice.docspace.api.sdk.models.TenantAiAccessSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TenantDeepLinkSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TenantUserInvitationSettingsRequestDto
import onlyoffice.docspace.api.sdk.models.TenantUserInvitationSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TimezonesRequestsArrayWrapper
import onlyoffice.docspace.api.sdk.models.WizardRequestsDto
import onlyoffice.docspace.api.sdk.models.WizardSettingsWrapper

interface CommonSettingsApi {
    /**
     * PUT api/2.0/settings/closeadminhelper
     * Close the admin helper
     * Dismisses the administrator helper tip for the caller, so it is not shown again on this account. Available  only to a DocSpace administrator, which includes the portal Owner, on a Standalone (self-hosted) installation  running outside white-label custom mode; every other caller is refused. This is a mutating, idempotent call  scoped to the calling account only; it never affects other administrators. It returns no data on success.
     * Responses:
     *  - 200: The admin helper tip was dismissed for the caller
     *  - 405: The caller is not a DocSpace administrator, or the portal is on SaaS, custom mode, or not Standalone
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for closeAdminHelper Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/close-admin-helper/
     *
     *
     * @return [Unit]
     */
    @PUT("api/2.0/settings/closeadminhelper")
    suspend fun closeAdminHelper(): Response<Unit>

    /**
     * PUT api/2.0/settings/wizard/complete
     * Complete the Wizard settings
     * Finishes the initial portal setup wizard: sets the owner's password and locale, applies the supplied license  if one is required, and marks the wizard as completed so it is not shown again. This call is not for a normal  logged-in session: it requires a confirmation link bearing the Wizard claim, of the kind issued when a new  portal is created, and the link is consumed as part of authenticating the request; the caller must also hold  the EditPortalSettings permission. An empty password or a malformed email address is rejected without  completing the wizard, and so is a missing, invalid, or expired license, or a license whose user quota does  not cover the portal. This call is meant to run once per portal; running it again is accepted but has no  further effect once the wizard is already completed. It returns the resulting wizard settings, including the  completed flag.
     * Responses:
     *  - 200: Resulting wizard settings, including the completed flag
     *  - 400: The email address is malformed, or the password is empty
     *  - 402: The supplied license is missing, invalid, expired, or its user quota does not cover the portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for completeWizard Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/complete-wizard/
     *
     *
     * @param wizardRequestsDto  (optional)
     * @return [WizardSettingsWrapper]
     */
    @PUT("api/2.0/settings/wizard/complete")
    suspend fun completeWizard(@Body wizardRequestsDto: WizardRequestsDto? = null): Response<WizardSettingsWrapper>

    /**
     * POST api/2.0/settings/deeplink
     * Configure the deep link settings
     * Sets how the portal responds when a client opens a DocSpace link on a mobile device: always in the browser,  always in the native app, or asking the user to choose each time. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). The handling mode must be one of the documented enum values; anything else is  rejected without being saved. This is a mutating, idempotent call: sending the same mode again leaves the  setting unchanged. It returns the saved deep link settings, including the timestamp of the last change; read  the current value at any time, including anonymously, from `GET api/2.0/settings/deeplink`.
     * Responses:
     *  - 200: Saved deep link handling settings
     *  - 400: The handling mode is not one of the supported deep link handling values
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for configureDeepLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/configure-deep-link/
     *
     *
     * @param deepLinkConfigurationRequestsDto  (optional)
     * @return [TenantDeepLinkSettingsWrapper]
     */
    @POST("api/2.0/settings/deeplink")
    suspend fun configureDeepLink(@Body deepLinkConfigurationRequestsDto: DeepLinkConfigurationRequestsDto? = null): Response<TenantDeepLinkSettingsWrapper>

    /**
     * DELETE api/2.0/settings/colortheme
     * Delete a color theme
     * Removes a custom color theme from the portal by its ID. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). An ID belonging to one of the built-in default themes is not removable; the  call succeeds but leaves the theme list unchanged. If the deleted theme was the currently selected one, the  theme with the lowest remaining ID is selected automatically. This is a mutating, idempotent call: deleting an  ID that is already gone succeeds without error and again leaves nothing changed. It returns the full updated  theme configuration, including the (possibly new) selected theme.
     * Responses:
     *  - 200: Updated color theme configuration: saved themes, selected theme, and plan limit
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deletePortalColorTheme Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-portal-color-theme/
     *
     *
     * @param id The theme to remove, by theme ID. An ID belonging to a built-in theme leaves the list untouched, and so does  one that is already gone - neither is reported as an error. Removing the theme currently in use moves the  portal to the remaining theme with the lowest ID.
     * @return [CustomColorThemesSettingsWrapper]
     */
    @DELETE("api/2.0/settings/colortheme")
    suspend fun deletePortalColorTheme(@Query("id") id: kotlin.Int): Response<CustomColorThemesSettingsWrapper>

    /**
     * GET api/2.0/settings/deeplink
     * Get the deep link settings
     * Returns how the portal currently responds when a client opens a DocSpace link on a mobile device: always in  the browser, always in the native app, or asking the user to choose. No permission is required; anonymous  callers can read it too. This is a read-only, idempotent call. The response supports conditional requests:  send the standard If-Modified-Since header with the previous `lastModified` value, and an unchanged response  comes back empty instead of resending the settings. Change the mode with `POST api/2.0/settings/deeplink`,  which requires the EditPortalSettings permission.
     * Responses:
     *  - 200: Current deep link handling settings
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getDeepLinkSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-deep-link-settings/
     *
     *
     * @return [TenantDeepLinkSettingsWrapper]
     */
    @GET("api/2.0/settings/deeplink")
    suspend fun getDeepLinkSettings(): Response<TenantDeepLinkSettingsWrapper>

    /**
     * GET api/2.0/settings/payment
     * Get the payment settings
     * Returns the portal's payment-related configuration: the sales contact email, the URL to buy or extend a  subscription, whether the portal is Standalone, the current license's trial status and expiration date, and  the maximum quota quantity that can be purchased at once. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). This is a read-only, idempotent call. It remains reachable even while the  portal's own subscription payment is overdue, since this is how the caller finds the link to resolve it.
     * Responses:
     *  - 200: Payment-related settings: sales contact, buy URL, Standalone flag, license, and quota cap
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPaymentSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-settings/
     *
     *
     * @return [PaymentSettingsWrapper]
     */
    @GET("api/2.0/settings/payment")
    suspend fun getPaymentSettings(): Response<PaymentSettingsWrapper>

    /**
     * GET api/2.0/settings/colortheme
     * Get a color theme
     * Returns the portal's color theme configuration: every saved custom theme, which one is currently selected, and  how many custom themes the plan still allows. No permission is required; anonymous callers can read it too.  This is a read-only, idempotent call. The response supports conditional requests: send the standard  If-Modified-Since header with the previous `lastModified` value, and an unchanged response comes back empty  instead of resending the same settings. A `limit` of `0` means the plan does not cap the number of custom  themes.
     * Responses:
     *  - 200: Current color theme configuration: saved themes, selected theme, and plan limit
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPortalColorTheme Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-color-theme/
     *
     *
     * @return [CustomColorThemesSettingsWrapper]
     */
    @GET("api/2.0/settings/colortheme")
    suspend fun getPortalColorTheme(): Response<CustomColorThemesSettingsWrapper>

    /**
     * GET api/2.0/settings/machine
     * Get the portal hostname
     * Returns the hostname the current request arrived on, exactly as sent in the HTTP Host header, so a client  mid-setup can learn the address the portal is actually reachable at. This call is not for a normal logged-in  session: it requires a confirmation link bearing the Wizard claim, of the kind generated during initial portal  setup, and the link is consumed as part of authenticating the request. This is a read-only, idempotent call.  The value reflects whatever the caller connected through, including a reverse proxy's public name, and is not  necessarily the tenant's configured alias or mapped domain.
     * Responses:
     *  - 200: Hostname the current request arrived on
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPortalHostname Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-hostname/
     *
     *
     * @return [StringWrapper]
     */
    @GET("api/2.0/settings/machine")
    suspend fun getPortalHostname(): Response<StringWrapper>

    /**
     * GET api/2.0/settings/logo
     * Get a portal logo
     * Returns the absolute URL of the portal's current logo image, already resolved against the active white-label  branding. Requires an authenticated session; every role, including Guest, can read it. This is a read-only,  idempotent call. The response supports conditional requests: send the standard If-Modified-Since header with  the previous `lastModified` value, and an unchanged response comes back empty instead of resending the same  URL. The URL points at whatever image is currently configured, including the default DocSpace logo when no  custom branding has been set.
     * Responses:
     *  - 200: Absolute URL of the portal's current logo image
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPortalLogo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-logo/
     *
     *
     * @return [StringWrapper]
     */
    @GET("api/2.0/settings/logo")
    suspend fun getPortalLogo(): Response<StringWrapper>

    /**
     * GET api/2.0/settings
     * Get the portal settings
     * Returns the current portal's general configuration: branding, culture, feature flags, and DocSpace/Standalone  mode, everything the client needs to render its shell before or after login. No permission is required, but  the response shape depends on the caller's identity. An anonymous caller receives only the public subset  (culture, branding, DocSpace/Standalone flags, deep link data, setup-wizard and join-by-domain hints); once  authenticated, the response also includes tenant-specific fields such as the owner ID, time zone, invitation  limit, AI/banner/dev-tools flags, and, for a DocSpace administrator, the tenant wallet's low-balance flag.  This is a read-only, idempotent call. Pass `withPassword=true` to also receive the parameters (`salt`,  iteration count, hash size) used to hash the password client-side before it is sent to the authentication  endpoints; these are only added for an anonymous caller or when explicitly requested, never as part of the  default authenticated response.
     * Responses:
     *  - 200: Current portal settings, tailored to the caller's authentication state
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPortalSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-settings/
     *
     *
     * @param withpassword Whether the answer also carries the salt, iteration count and hash size a client needs to hash a password  before sending it to the authentication operations. They are included for an anonymous caller anyway; for a  signed-in one they are left out unless this is set. (optional)
     * @return [SettingsWrapper]
     */
    @GET("api/2.0/settings")
    suspend fun getPortalSettings(@Query("withpassword") withpassword: kotlin.Boolean? = null): Response<SettingsWrapper>

    /**
     * GET api/2.0/settings/socket
     * Get the socket settings
     * Returns the base URL of the portal's real-time notification hub (Socket.IO), which the client connects to for  live updates such as file changes, presence, or quota alerts. Requires an authenticated session; every role  can read it. This is a read-only, idempotent call. The value comes from server-side configuration and cannot  be changed through this API; an empty `url` means the portal has no notification hub configured and the client  should not attempt to connect.
     * Responses:
     *  - 200: Base URL of the portal's real-time notification hub
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSocketSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-socket-settings/
     *
     *
     * @return [SocketSettingsWrapper]
     */
    @GET("api/2.0/settings/socket")
    suspend fun getSocketSettings(): Response<SocketSettingsWrapper>

    /**
     * GET api/2.0/settings/cultures
     * Get supported languages
     * Returns the two- or four-letter language codes of every culture currently enabled on the portal (for example  `en-US`), used to populate a language picker before or after login. No permission is required; anonymous  callers can read it too. This is a read-only, idempotent call, and the list is not paginated. The response  supports conditional requests: an unchanged result is signaled instead of resending the same list. The set of  enabled cultures is a portal-wide configuration value, not a per-user preference.
     * Responses:
     *  - 200: Language codes of every culture currently enabled on the portal
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSupportedCultures Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-supported-cultures/
     *
     *
     * @return [STRINGArrayWrapper]
     */
    @GET("api/2.0/settings/cultures")
    suspend fun getSupportedCultures(): Response<STRINGArrayWrapper>

    /**
     * GET api/2.0/settings/ai-access
     * Get the AI access settings
     * Returns whether AI functionality (chat, agents, vectorization) is currently available on the portal at all; AI  is enabled by default. Requires an authenticated session; every role can read it. This is a read-only,  idempotent call. When the setting is disabled, every AI-specific endpoint and folder is unavailable regardless  of the caller's own permissions; this call only reports the portal-wide switch, not any per-user entitlement.
     * Responses:
     *  - 200: Whether AI functionality is currently enabled for the portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantAiAccessSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-ai-access-settings/
     *
     *
     * @return [TenantAiAccessSettingsWrapper]
     */
    @GET("api/2.0/settings/ai-access")
    suspend fun getTenantAiAccessSettings(): Response<TenantAiAccessSettingsWrapper>

    /**
     * GET api/2.0/settings/invitationsettings
     * Get the user invitation settings
     * Returns whether the portal currently allows inviting new members and new guests at all. No permission is  required; anonymous callers can read it too, since the invitation flow itself may run before the caller has  signed in. This is a read-only, idempotent call. The response supports conditional requests: send the standard  If-Modified-Since header with the previous `lastModified` value, and an unchanged response comes back empty  instead of resending the same settings.
     * Responses:
     *  - 200: Whether inviting new members and new guests is currently allowed
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantUserInvitationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-user-invitation-settings/
     *
     *
     * @return [TenantUserInvitationSettingsWrapper]
     */
    @GET("api/2.0/settings/invitationsettings")
    suspend fun getTenantUserInvitationSettings(): Response<TenantUserInvitationSettingsWrapper>

    /**
     * GET api/2.0/settings/timezones
     * Get time zones
     * Returns every time zone known to the host machine, each with its IANA identifier and a human-readable display  name, ordered from the most negative to the most positive UTC offset. This call is not for a normal logged-in  session: it requires a confirmation link bearing the Wizard or Administrators claim, of the kind generated  during initial portal setup or issued by an administrator, and the link is consumed as part of authenticating  the request. This is a read-only, idempotent call, and the list is not paginated. Use the returned `id` values  wherever the portal expects a time zone identifier; an unrecognized value is rejected there, not here.
     * Responses:
     *  - 200: Every time zone known to the host, with its IANA ID and display name
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTimeZones Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-time-zones/
     *
     *
     * @return [TimezonesRequestsArrayWrapper]
     */
    @GET("api/2.0/settings/timezones")
    suspend fun getTimeZones(): Response<TimezonesRequestsArrayWrapper>

    /**
     * PUT api/2.0/settings/defaultfolder
     * Set the default folder
     * Sets which folder the current user's account opens into by default, such as My Documents, the rooms list, or  favorites. Requires an authenticated session; every role may set its own default, and the change never affects  any other user. Only folder types the client actually offers as a landing page are accepted; picking My  Documents (`USER`) as a Guest is rejected too, since guests have no personal storage. This is a mutating,  idempotent call. It returns the saved setting.
     * Responses:
     *  - 200: Saved default folder setting for the current user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveDefaultFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-default-folder/
     *
     *
     * @param defaultProductRequestDto  (optional)
     * @return [StudioDefaultPageSettingsWrapper]
     */
    @PUT("api/2.0/settings/defaultfolder")
    suspend fun saveDefaultFolder(@Body defaultProductRequestDto: DefaultProductRequestDto? = null): Response<StudioDefaultPageSettingsWrapper>

    /**
     * PUT api/2.0/settings/dns
     * Save the DNS settings
     * Maps a custom domain name onto the current tenant, or clears the mapping, so the portal becomes reachable  under the caller's own DNS name instead of only its default alias. Available only on a Standalone  (self-hosted) installation; on SaaS the call is always refused. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). Disable the mapping by passing `enable=false`, in which case the domain name  in the request is ignored. A domain that collides with the portal's reserved base domain, or otherwise fails  validation, is rejected without changing the current mapping. This is a mutating, idempotent call. On success  the previous domain also stops answering, and any CSP configuration referencing it is updated to the new one.
     * Responses:
     *  - 200: Confirmation that the DNS mapping was updated
     *  - 400: The domain name is invalid, or collides with the portal's reserved base domain
     *  - 402: This option is not available under the portal's current pricing plan
     *  - 405: The portal is not a Standalone installation, so a custom domain cannot be mapped
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveDnsSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-dns-settings/
     *
     *
     * @param dnsSettingsRequestsDto  (optional)
     * @return [StringWrapper]
     */
    @PUT("api/2.0/settings/dns")
    suspend fun saveDnsSettings(@Body dnsSettingsRequestsDto: DnsSettingsRequestsDto? = null): Response<StringWrapper>

    /**
     * POST api/2.0/settings/maildomainsettings
     * Save the mail domain settings
     * Overwrites the portal's trusted mail domain configuration, which controls which email domains are treated as  already verified when a user is invited or self-registers. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). When the requested mode is a custom domain list, every domain is normalized to  lowercase and checked against the expected hostname format; a domain that fails the check, or an empty custom  list, causes the whole call to be rejected without saving anything. For the other modes the domain list in the  request is ignored. The `inviteUsersAsVisitors` flag controls whether users who join through a trusted domain  are added as full members or as visitors, and takes effect on the next join rather than retroactively. This is  a mutating, idempotent call: repeating it with the same body leaves the portal in the same state. On success  it returns a confirmation message, not the saved settings themselves; read them back from  `GET api/2.0/settings`.
     * Responses:
     *  - 200: Confirmation message that the trusted mail domain settings were saved
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveMailDomainSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-mail-domain-settings/
     *
     *
     * @param mailDomainSettingsRequestsDto  (optional)
     * @return [StringWrapper]
     */
    @POST("api/2.0/settings/maildomainsettings")
    suspend fun saveMailDomainSettings(@Body mailDomainSettingsRequestsDto: MailDomainSettingsRequestsDto? = null): Response<StringWrapper>

    /**
     * PUT api/2.0/settings/colortheme
     * Save a color theme
     * Adds or updates a custom color theme, or changes which theme is selected, for the whole portal. Requires Owner  or DocSpaceAdmin (the EditPortalSettings permission). Pass `theme` to create or edit one: an existing theme is  matched and updated by its ID, a new one is appended, and an ID that collides with a built-in default theme is  treated as a request to create a new custom theme instead of overwriting the default. Once the plan's  custom-theme limit is reached, a new theme is silently not added rather than rejected with an error, so check  the returned `themes` count against `limit` before assuming it was saved. Pass `selected` to switch the active  theme; an ID that does not match any existing theme is ignored. This is a mutating call, not strictly  idempotent once the limit has been reached. It returns the full updated theme configuration.
     * Responses:
     *  - 200: Updated color theme configuration: saved themes, selected theme, and plan limit
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for savePortalColorTheme Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-portal-color-theme/
     *
     *
     * @param customColorThemesSettingsRequestsDto  (optional)
     * @return [CustomColorThemesSettingsWrapper]
     */
    @PUT("api/2.0/settings/colortheme")
    suspend fun savePortalColorTheme(@Body customColorThemesSettingsRequestsDto: CustomColorThemesSettingsRequestsDto? = null): Response<CustomColorThemesSettingsWrapper>

    /**
     * POST api/2.0/settings/ai-access
     * Set the AI access settings
     * Turns AI functionality (chat, agents, vectorization) on or off for the whole portal; AI is enabled by default.  Requires Owner or DocSpaceAdmin (the EditPortalSettings permission); every other caller is refused. Disabling  it immediately hides the AI Agents folder from root folder listings, makes AI status checks report disabled,  and makes AI chat endpoints unreachable for every user on the tenant, not only the caller. This is a mutating,  idempotent, portal-wide call, and the change is pushed to already-connected clients over the real-time  notification hub rather than waiting for their next request. It returns the saved setting.
     * Responses:
     *  - 200: Saved AI access setting for the portal
     *  - 403: The caller is not a DocSpace administrator, so the AI access setting cannot be changed
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setTenantAiAccessSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-ai-access-settings/
     *
     *
     * @param tenantAiAccessSettingsDto  (optional)
     * @return [TenantAiAccessSettingsWrapper]
     */
    @POST("api/2.0/settings/ai-access")
    suspend fun setTenantAiAccessSettings(@Body tenantAiAccessSettingsDto: TenantAiAccessSettingsDto? = null): Response<TenantAiAccessSettingsWrapper>

    /**
     * PUT api/2.0/settings/emailactivation
     * Update the email activation settings
     * Updates the current user's own preference for whether the email confirmation prompt is displayed on their  account. Requires an authenticated session; every role may change its own setting, and the change never  affects any other user. This is a mutating, idempotent call. It returns the settings exactly as submitted,  without validating them against the account's actual email confirmation state, so `show` can be set to `true`  even after the address is already confirmed.
     * Responses:
     *  - 200: Email activation settings exactly as submitted
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateEmailActivationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-email-activation-settings/
     *
     *
     * @param emailActivationSettings  (optional)
     * @return [EmailActivationSettingsWrapper]
     */
    @PUT("api/2.0/settings/emailactivation")
    suspend fun updateEmailActivationSettings(@Body emailActivationSettings: EmailActivationSettings? = null): Response<EmailActivationSettingsWrapper>

    /**
     * PUT api/2.0/settings/invitationsettings
     * Update the user invitation settings
     * Sets whether the portal allows inviting new members and new guests. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). Disabling member or guest invitations only blocks creating new invitations  going forward; it does not revoke links already issued or remove members already invited. This is a mutating,  idempotent, portal-wide call. It returns the saved setting; read the current value at any time, including  anonymously, from `GET api/2.0/settings/invitationsettings`.
     * Responses:
     *  - 200: Saved user invitation settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateInvitationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-invitation-settings/
     *
     *
     * @param tenantUserInvitationSettingsRequestDto  (optional)
     * @return [TenantUserInvitationSettingsWrapper]
     */
    @PUT("api/2.0/settings/invitationsettings")
    suspend fun updateInvitationSettings(@Body tenantUserInvitationSettingsRequestDto: TenantUserInvitationSettingsRequestDto? = null): Response<TenantUserInvitationSettingsWrapper>

}
