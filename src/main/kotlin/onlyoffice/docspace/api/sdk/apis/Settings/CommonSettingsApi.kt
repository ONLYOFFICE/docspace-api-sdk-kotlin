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
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.PaymentSettingsWrapper
import onlyoffice.docspace.api.sdk.models.STRINGArrayWrapper
import onlyoffice.docspace.api.sdk.models.SettingsWrapper
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
     * Closes the administrator helper notification.
     * Responses:
     *  - 200: Ok
     *  - 405: Not available
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
     * Completes the Wizard settings.
     * Responses:
     *  - 200: Wizard settings
     *  - 400: Incorrect email address/The password is empty
     *  - 402: You must enter a license key or license key is not correct or license expired or user quota does not match the license
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
     * Saves the deep link configuration settings for the portal.
     * Responses:
     *  - 200: Deep link configuration updated
     *  - 400: Invalid deep link configuration
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
     * Deletes the portal color theme with the ID specified in the request.
     * Responses:
     *  - 200: Portal theme settings: custom color theme settings, selected or not, limit
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
     * @param id The ID of the portal theme to delete.
     * @return [CustomColorThemesSettingsWrapper]
     */
    @DELETE("api/2.0/settings/colortheme")
    suspend fun deletePortalColorTheme(@Query("id") id: kotlin.Int): Response<CustomColorThemesSettingsWrapper>

    /**
     * GET api/2.0/settings/deeplink
     * Get the deep link settings
     * Returns the deep link settings.
     * Responses:
     *  - 200: Ok
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
     * Returns the portal payment settings.
     * Responses:
     *  - 200: Payment settings: sales email, feedback and support URL, link to pay for a portal, Standalone or not, current license, maximum quota quantity
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
     * Returns the portal color theme.
     * Responses:
     *  - 200: Settings of the portal themes
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
     * Get hostname
     * Returns the portal hostname.
     * Responses:
     *  - 200: Portal hostname
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
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/settings/machine")
    suspend fun getPortalHostname(): Response<ObjectWrapper>

    /**
     * GET api/2.0/settings/logo
     * Get a portal logo
     * Returns the portal logo image URL.
     * Responses:
     *  - 200: Portal logo image URL
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
     * Returns a list of all the available portal settings with the current values for each parameter.
     * Responses:
     *  - 200: Settings
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
     * @param withpassword Specifies whether to include the password hashing configuration in the response. (optional)
     * @return [SettingsWrapper]
     */
    @GET("api/2.0/settings")
    suspend fun getPortalSettings(@Query("withpassword") withpassword: kotlin.Boolean? = null): Response<SettingsWrapper>

    /**
     * GET api/2.0/settings/socket
     * Get the socket settings
     * Returns the socket settings.
     * Responses:
     *  - 200: Socket settings: hub URL
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
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/settings/socket")
    suspend fun getSocketSettings(): Response<ObjectWrapper>

    /**
     * GET api/2.0/settings/cultures
     * Get supported languages
     * Returns a list of all the available portal languages in the format of a two-letter or four-letter language code (e.g. de, en-US, etc.).
     * Responses:
     *  - 200: List of all the available portal languages
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
     * Get the AI access settings for the portal
     * Returns the current portal-level AI access settings that control whether all AI functionality  (chat, agents, vectorization) is available for the portal. AI is enabled by default.
     * Responses:
     *  - 200: AI access settings
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
     * Returns the portal user invitation settings.
     * Responses:
     *  - 200: portal user invitation settings
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
     * Returns a list of all the available portal time zones.
     * Responses:
     *  - 200: List of all the available time zones with their IDs and display names
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
     * Sets the default folder.
     * Responses:
     *  - 200: Message about saving settings successfully
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
     * Saves the DNS settings specified in the request to the current portal.
     * Responses:
     *  - 200: Message about changing DNS
     *  - 400: Invalid domain name/incorrect length of doman name
     *  - 402: Your pricing plan does not support this option
     *  - 405: Method not allowed
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
     * Saves the mail domain settings specified in the request to the portal.
     * Responses:
     *  - 200: Message about the result of saving the mail domain settings
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
     * Saves the portal color theme specified in the request.
     * Responses:
     *  - 200: Portal theme settings
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
     * Set the AI access for the portal
     * Updates the portal-level AI access settings. When AI is disabled, all AI features are turned off:  the AI Agents folder is hidden from root folder listings, AI status checks immediately return disabled,  and AI chat endpoints become inaccessible. Only users with the DocSpaceAdmin role  (EditPortalSettings permission) can change this setting.
     * Responses:
     *  - 200: Updated AI access settings
     *  - 403: You don't have enough permission to change the AI access settings
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
     * Updates the email activation settings.
     * Responses:
     *  - 200: Updated email activation settings
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
     * Update user invitation settings
     * Updates the portal user invitation settings.
     * Responses:
     *  - 200: Updated user invitation settings
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
