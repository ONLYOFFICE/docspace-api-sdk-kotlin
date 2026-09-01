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

package onlyoffice.docspace.api.sdk.models

import onlyoffice.docspace.api.sdk.models.CultureSpecificExternalResources
import onlyoffice.docspace.api.sdk.models.DeepLinkDto
import onlyoffice.docspace.api.sdk.models.FirebaseDto
import onlyoffice.docspace.api.sdk.models.FolderType
import onlyoffice.docspace.api.sdk.models.FormGalleryDto
import onlyoffice.docspace.api.sdk.models.PasswordHasher
import onlyoffice.docspace.api.sdk.models.PluginsDto
import onlyoffice.docspace.api.sdk.models.RecaptchaType
import onlyoffice.docspace.api.sdk.models.TenantDomainValidator
import onlyoffice.docspace.api.sdk.models.TenantStatus
import onlyoffice.docspace.api.sdk.models.TenantTrustedDomainsType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The settings information.
 *
 * @param culture The language.
 * @param baseDomain The base domain.
 * @param cookieSettingsEnabled Specifies whether the cookie settings are enabled.
 * @param deepLink The deep link settings.
 * @param timezone The time zone.
 * @param trustedDomains The list of the trusted domains.
 * @param trustedDomainsType The type of the trusted domains.
 * @param utcOffset The UTC offset in the TimeSpan format.
 * @param utcHoursOffset The UTC offset in hours.
 * @param greetingSettings The greeting settings.
 * @param ownerId The owner ID.
 * @param nameSchemaId The team template ID.
 * @param enabledJoin Specifies if a user can join the portal or not.
 * @param enableAdmMess Specifies if a user can send a message to the administrator when accessing the DocSpace portal or not.
 * @param thirdpartyEnable Specifies if a user can connect third-party providers to the portal or not.
 * @param docSpace Specifies if this portal is a DocSpace portal or not.
 * @param standalone Indicates whether the system is running in standalone mode.
 * @param isAmi Specifies if this portal is the AMI instance or not.
 * @param wizardToken The wizard token.
 * @param passwordHash The password hash.
 * @param firebase The Firebase parameters.
 * @param version The portal version.
 * @param recaptchaType The type of CAPTCHA validation used.
 * @param recaptchaPublicKey The ReCAPTCHA public key.
 * @param debugInfo Specifies if the debug information will be sent or not.
 * @param socketUrl The socket URL.
 * @param tenantStatus The tenant status.
 * @param tenantAlias The tenant alias.
 * @param displayAbout Specifies whether to display the About portal section.
 * @param domainValidator The domain validator.
 * @param zendeskKey The Zendesk key.
 * @param tagManagerId The tag manager ID.
 * @param limitedAccessSpace Specifies whether the access to the space management is limited or not.
 * @param limitedAccessDevToolsForUsers Specifies whether the access to the Developer Tools is limited for users or not.
 * @param displayBanners Specifies whether to display the promotional banners.
 * @param aiEnabled Specifies whether AI functionality (chat, agents, vectorization) is enabled for the current tenant.  When `false`, all AI features are disabled and the AI Agents folder is hidden.
 * @param walletLowBalance Specifies whether the tenant wallet balance is currently below the low-balance threshold. Only returned to portal administrators.
 * @param userNameRegex The user name validation regex.
 * @param invitationLimit The maximum number of invitations to the portal.
 * @param plugins The plugins settings.
 * @param formGallery The form gallery settings.
 * @param maxImageUploadSize The maximum image upload size.
 * @param logoText The white label logo text.
 * @param externalResources The external resources settings.
 * @param defaultFolderType Specifies the default folder type for the current settings.
 * @param externalDbEnabled Specifies if an external database is connected for storing form results.
 */


data class SettingsDto (

    @Json(name = "culture")
    val culture: kotlin.String?,

    @Json(name = "baseDomain")
    val baseDomain: kotlin.String?,

    @Json(name = "cookieSettingsEnabled")
    val cookieSettingsEnabled: kotlin.Boolean,

    @Json(name = "deepLink")
    val deepLink: DeepLinkDto,

    @Json(name = "timezone")
    val timezone: kotlin.String? = null,

    @Json(name = "trustedDomains")
    val trustedDomains: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "trustedDomainsType")
    val trustedDomainsType: TenantTrustedDomainsType? = null,

    @Json(name = "utcOffset")
    val utcOffset: kotlin.String? = null,

    @Json(name = "utcHoursOffset")
    val utcHoursOffset: kotlin.Double? = null,

    @Json(name = "greetingSettings")
    val greetingSettings: kotlin.String? = null,

    @Json(name = "ownerId")
    val ownerId: java.util.UUID? = null,

    @Json(name = "nameSchemaId")
    val nameSchemaId: kotlin.String? = null,

    @Json(name = "enabledJoin")
    val enabledJoin: kotlin.Boolean? = null,

    @Json(name = "enableAdmMess")
    val enableAdmMess: kotlin.Boolean? = null,

    @Json(name = "thirdpartyEnable")
    val thirdpartyEnable: kotlin.Boolean? = null,

    @Json(name = "docSpace")
    val docSpace: kotlin.Boolean? = null,

    @Json(name = "standalone")
    val standalone: kotlin.Boolean? = null,

    @Json(name = "isAmi")
    val isAmi: kotlin.Boolean? = null,

    @Json(name = "wizardToken")
    val wizardToken: kotlin.String? = null,

    @Json(name = "passwordHash")
    val passwordHash: PasswordHasher? = null,

    @Json(name = "firebase")
    val firebase: FirebaseDto? = null,

    @Json(name = "version")
    val version: kotlin.String? = null,

    @Json(name = "recaptchaType")
    val recaptchaType: RecaptchaType? = null,

    @Json(name = "recaptchaPublicKey")
    val recaptchaPublicKey: kotlin.String? = null,

    @Json(name = "debugInfo")
    val debugInfo: kotlin.Boolean? = null,

    @Json(name = "socketUrl")
    val socketUrl: kotlin.String? = null,

    @Json(name = "tenantStatus")
    val tenantStatus: TenantStatus? = null,

    @Json(name = "tenantAlias")
    val tenantAlias: kotlin.String? = null,

    @Json(name = "displayAbout")
    val displayAbout: kotlin.Boolean? = null,

    @Json(name = "domainValidator")
    val domainValidator: TenantDomainValidator? = null,

    @Json(name = "zendeskKey")
    val zendeskKey: kotlin.String? = null,

    @Json(name = "tagManagerId")
    val tagManagerId: kotlin.String? = null,

    @Json(name = "limitedAccessSpace")
    val limitedAccessSpace: kotlin.Boolean? = null,

    @Json(name = "limitedAccessDevToolsForUsers")
    val limitedAccessDevToolsForUsers: kotlin.Boolean? = null,

    @Json(name = "displayBanners")
    val displayBanners: kotlin.Boolean? = null,

    @Json(name = "aiEnabled")
    val aiEnabled: kotlin.Boolean? = null,

    @Json(name = "walletLowBalance")
    val walletLowBalance: kotlin.Boolean? = null,

    @Json(name = "userNameRegex")
    val userNameRegex: kotlin.String? = null,

    @Json(name = "invitationLimit")
    val invitationLimit: kotlin.Int? = null,

    @Json(name = "plugins")
    val plugins: PluginsDto? = null,

    @Json(name = "formGallery")
    val formGallery: FormGalleryDto? = null,

    @Json(name = "maxImageUploadSize")
    val maxImageUploadSize: kotlin.Long? = null,

    @Json(name = "logoText")
    val logoText: kotlin.String? = null,

    @Json(name = "externalResources")
    val externalResources: CultureSpecificExternalResources? = null,

    @Json(name = "defaultFolderType")
    val defaultFolderType: FolderType? = null,

    @Json(name = "externalDbEnabled")
    val externalDbEnabled: kotlin.Boolean? = null

) {


}

