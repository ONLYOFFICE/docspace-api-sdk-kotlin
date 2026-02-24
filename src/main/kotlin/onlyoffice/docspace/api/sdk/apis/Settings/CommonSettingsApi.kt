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
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsWrapper
import onlyoffice.docspace.api.sdk.models.DeepLinkConfigurationRequestsDto
import onlyoffice.docspace.api.sdk.models.DefaultProductRequestDto
import onlyoffice.docspace.api.sdk.models.DnsSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.EmailActivationSettings
import onlyoffice.docspace.api.sdk.models.EmailActivationSettingsWrapper
import onlyoffice.docspace.api.sdk.models.MailDomainSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.PaymentSettingsWrapper
import onlyoffice.docspace.api.sdk.models.STRINGArrayWrapper
import onlyoffice.docspace.api.sdk.models.SettingsWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.StudioDefaultPageSettingsWrapper
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
     *
     * REST API Reference for closeAdminHelper Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/close-admin-helper/
     *
     *
     * @return [Call]<[Unit]>
     */
    @PUT("api/2.0/settings/closeadminhelper")
    fun closeAdminHelper(): Call<Unit>

    /**
     * PUT api/2.0/settings/wizard/complete
     * Complete the Wizard settings
     * Completes the Wizard settings.
     * Responses:
     *  - 200: Wizard settings
     *  - 400: Incorrect email address/The password is empty
     *  - 402: You must enter a license key or license key is not correct or license expired or user quota does not match the license
     *  - 401: Unauthorized
     *
     * REST API Reference for completeWizard Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/complete-wizard/
     *
     *
     * @param wizardRequestsDto  (optional)
     * @return [Call]<[WizardSettingsWrapper]>
     */
    @PUT("api/2.0/settings/wizard/complete")
    fun completeWizard(@Body wizardRequestsDto: WizardRequestsDto? = null): Call<WizardSettingsWrapper>

    /**
     * POST api/2.0/settings/deeplink
     * Configure the deep link settings
     * Saves the deep link configuration settings for the portal.
     * Responses:
     *  - 200: Deep link configuration updated
     *  - 400: Invalid deep link configuration
     *  - 401: Unauthorized
     *
     * REST API Reference for configureDeepLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/configure-deep-link/
     *
     *
     * @param deepLinkConfigurationRequestsDto  (optional)
     * @return [Call]<[TenantDeepLinkSettingsWrapper]>
     */
    @POST("api/2.0/settings/deeplink")
    fun configureDeepLink(@Body deepLinkConfigurationRequestsDto: DeepLinkConfigurationRequestsDto? = null): Call<TenantDeepLinkSettingsWrapper>

    /**
     * DELETE api/2.0/settings/colortheme
     * Delete a color theme
     * Deletes the portal color theme with the ID specified in the request.
     * Responses:
     *  - 200: Portal theme settings: custom color theme settings, selected or not, limit
     *  - 401: Unauthorized
     *
     * REST API Reference for deletePortalColorTheme Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-portal-color-theme/
     *
     *
     * @param id The ID of the portal theme to delete.
     * @return [Call]<[CustomColorThemesSettingsWrapper]>
     */
    @DELETE("api/2.0/settings/colortheme")
    fun deletePortalColorTheme(@Query("id") id: kotlin.Int): Call<CustomColorThemesSettingsWrapper>

    /**
     * GET api/2.0/settings/deeplink
     * Get the deep link settings
     * Returns the deep link settings.
     * Responses:
     *  - 200: Ok
     *
     * REST API Reference for getDeepLinkSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-deep-link-settings/
     *
     *
     * @return [Call]<[TenantDeepLinkSettingsWrapper]>
     */
    @GET("api/2.0/settings/deeplink")
    fun getDeepLinkSettings(): Call<TenantDeepLinkSettingsWrapper>

    /**
     * GET api/2.0/settings/payment
     * Get the payment settings
     * Returns the portal payment settings.
     * Responses:
     *  - 200: Payment settings: sales email, feedback and support URL, link to pay for a portal, Standalone or not, current license, maximum quota quantity
     *  - 401: Unauthorized
     *
     * REST API Reference for getPaymentSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-settings/
     *
     *
     * @return [Call]<[PaymentSettingsWrapper]>
     */
    @GET("api/2.0/settings/payment")
    fun getPaymentSettings(): Call<PaymentSettingsWrapper>

    /**
     * GET api/2.0/settings/colortheme
     * Get a color theme
     * Returns the portal color theme.
     * Responses:
     *  - 200: Settings of the portal themes
     *
     * REST API Reference for getPortalColorTheme Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-color-theme/
     *
     *
     * @return [Call]<[CustomColorThemesSettingsWrapper]>
     */
    @GET("api/2.0/settings/colortheme")
    fun getPortalColorTheme(): Call<CustomColorThemesSettingsWrapper>

    /**
     * GET api/2.0/settings/machine
     * Get hostname
     * Returns the portal hostname.
     * Responses:
     *  - 200: Portal hostname
     *  - 401: Unauthorized
     *
     * REST API Reference for getPortalHostname Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-hostname/
     *
     *
     * @return [Call]<[ObjectWrapper]>
     */
    @GET("api/2.0/settings/machine")
    fun getPortalHostname(): Call<ObjectWrapper>

    /**
     * GET api/2.0/settings/logo
     * Get a portal logo
     * Returns the portal logo image URL.
     * Responses:
     *  - 200: Portal logo image URL
     *  - 401: Unauthorized
     *
     * REST API Reference for getPortalLogo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-logo/
     *
     *
     * @return [Call]<[StringWrapper]>
     */
    @GET("api/2.0/settings/logo")
    fun getPortalLogo(): Call<StringWrapper>

    /**
     * GET api/2.0/settings
     * Get the portal settings
     * Returns a list of all the available portal settings with the current values for each parameter.
     * Responses:
     *  - 200: Settings
     *
     * REST API Reference for getPortalSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-settings/
     *
     *
     * @param withpassword Specifies whether to include the password hashing configuration in the response. (optional)
     * @return [Call]<[SettingsWrapper]>
     */
    @GET("api/2.0/settings")
    fun getPortalSettings(@Query("withpassword") withpassword: kotlin.Boolean? = null): Call<SettingsWrapper>

    /**
     * GET api/2.0/settings/socket
     * Get the socket settings
     * Returns the socket settings.
     * Responses:
     *  - 200: Socket settings: hub URL
     *  - 401: Unauthorized
     *
     * REST API Reference for getSocketSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-socket-settings/
     *
     *
     * @return [Call]<[ObjectWrapper]>
     */
    @GET("api/2.0/settings/socket")
    fun getSocketSettings(): Call<ObjectWrapper>

    /**
     * GET api/2.0/settings/cultures
     * Get supported languages
     * Returns a list of all the available portal languages in the format of a two-letter or four-letter language code (e.g. de, en-US, etc.).
     * Responses:
     *  - 200: List of all the available portal languages
     *
     * REST API Reference for getSupportedCultures Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-supported-cultures/
     *
     *
     * @return [Call]<[STRINGArrayWrapper]>
     */
    @GET("api/2.0/settings/cultures")
    fun getSupportedCultures(): Call<STRINGArrayWrapper>

    /**
     * GET api/2.0/settings/invitationsettings
     * Get the user invitation settings
     * Returns the portal user invitation settings.
     * Responses:
     *  - 200: portal user invitation settings
     *
     * REST API Reference for getTenantUserInvitationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-user-invitation-settings/
     *
     *
     * @return [Call]<[TenantUserInvitationSettingsWrapper]>
     */
    @GET("api/2.0/settings/invitationsettings")
    fun getTenantUserInvitationSettings(): Call<TenantUserInvitationSettingsWrapper>

    /**
     * GET api/2.0/settings/timezones
     * Get time zones
     * Returns a list of all the available portal time zones.
     * Responses:
     *  - 200: List of all the available time zones with their IDs and display names
     *  - 401: Unauthorized
     *
     * REST API Reference for getTimeZones Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-time-zones/
     *
     *
     * @return [Call]<[TimezonesRequestsArrayWrapper]>
     */
    @GET("api/2.0/settings/timezones")
    fun getTimeZones(): Call<TimezonesRequestsArrayWrapper>

    /**
     * PUT api/2.0/settings/defaultfolder
     * Set the default folder
     * Sets the default folder.
     * Responses:
     *  - 200: Message about saving settings successfully
     *  - 401: Unauthorized
     *
     * REST API Reference for saveDefaultFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-default-folder/
     *
     *
     * @param defaultProductRequestDto  (optional)
     * @return [Call]<[StudioDefaultPageSettingsWrapper]>
     */
    @PUT("api/2.0/settings/defaultfolder")
    fun saveDefaultFolder(@Body defaultProductRequestDto: DefaultProductRequestDto? = null): Call<StudioDefaultPageSettingsWrapper>

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
     *
     * REST API Reference for saveDnsSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-dns-settings/
     *
     *
     * @param dnsSettingsRequestsDto  (optional)
     * @return [Call]<[StringWrapper]>
     */
    @PUT("api/2.0/settings/dns")
    fun saveDnsSettings(@Body dnsSettingsRequestsDto: DnsSettingsRequestsDto? = null): Call<StringWrapper>

    /**
     * POST api/2.0/settings/maildomainsettings
     * Save the mail domain settings
     * Saves the mail domain settings specified in the request to the portal.
     * Responses:
     *  - 200: Message about the result of saving the mail domain settings
     *  - 401: Unauthorized
     *
     * REST API Reference for saveMailDomainSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-mail-domain-settings/
     *
     *
     * @param mailDomainSettingsRequestsDto  (optional)
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/settings/maildomainsettings")
    fun saveMailDomainSettings(@Body mailDomainSettingsRequestsDto: MailDomainSettingsRequestsDto? = null): Call<StringWrapper>

    /**
     * PUT api/2.0/settings/colortheme
     * Save a color theme
     * Saves the portal color theme specified in the request.
     * Responses:
     *  - 200: Portal theme settings
     *  - 401: Unauthorized
     *
     * REST API Reference for savePortalColorTheme Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-portal-color-theme/
     *
     *
     * @param customColorThemesSettingsRequestsDto  (optional)
     * @return [Call]<[CustomColorThemesSettingsWrapper]>
     */
    @PUT("api/2.0/settings/colortheme")
    fun savePortalColorTheme(@Body customColorThemesSettingsRequestsDto: CustomColorThemesSettingsRequestsDto? = null): Call<CustomColorThemesSettingsWrapper>

    /**
     * PUT api/2.0/settings/emailactivation
     * Update the email activation settings
     * Updates the email activation settings.
     * Responses:
     *  - 200: Updated email activation settings
     *  - 401: Unauthorized
     *
     * REST API Reference for updateEmailActivationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-email-activation-settings/
     *
     *
     * @param emailActivationSettings  (optional)
     * @return [Call]<[EmailActivationSettingsWrapper]>
     */
    @PUT("api/2.0/settings/emailactivation")
    fun updateEmailActivationSettings(@Body emailActivationSettings: EmailActivationSettings? = null): Call<EmailActivationSettingsWrapper>

    /**
     * PUT api/2.0/settings/invitationsettings
     * Update user invitation settings
     * Updates the portal user invitation settings.
     * Responses:
     *  - 200: Updated user invitation settings
     *  - 401: Unauthorized
     *
     * REST API Reference for updateInvitationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-invitation-settings/
     *
     *
     * @param tenantUserInvitationSettingsRequestDto  (optional)
     * @return [Call]<[TenantUserInvitationSettingsWrapper]>
     */
    @PUT("api/2.0/settings/invitationsettings")
    fun updateInvitationSettings(@Body tenantUserInvitationSettingsRequestDto: TenantUserInvitationSettingsRequestDto? = null): Call<TenantUserInvitationSettingsWrapper>

}
