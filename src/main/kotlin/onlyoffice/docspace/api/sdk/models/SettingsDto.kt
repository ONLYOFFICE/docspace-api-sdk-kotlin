 /*
 * (c) Copyright Ascensio System SIA 2025
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
 * @param deepLink 
 * @param timezone The time zone.
 * @param trustedDomains The list of the trusted domains.
 * @param trustedDomainsType 
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
 * @param passwordHash 
 * @param firebase 
 * @param version The portal version.
 * @param recaptchaType 
 * @param recaptchaPublicKey The ReCAPTCHA public key.
 * @param debugInfo Specifies if the debug information will be sent or not.
 * @param socketUrl The socket URL.
 * @param tenantStatus 
 * @param tenantAlias The tenant alias.
 * @param displayAbout Specifies whether to display the About portal section.
 * @param domainValidator 
 * @param zendeskKey The Zendesk key.
 * @param tagManagerId The tag manager ID.
 * @param limitedAccessSpace Specifies whether the access to the space management is limited or not.
 * @param limitedAccessDevToolsForUsers Specifies whether the access to the Developer Tools is limited for users or not.
 * @param displayBanners Specifies whether to display the promotional banners.
 * @param userNameRegex The user name validation regex.
 * @param invitationLimit The maximum number of invitations to the portal.
 * @param plugins 
 * @param formGallery 
 * @param maxImageUploadSize The maximum image upload size.
 * @param logoText The white label logo text.
 * @param externalResources 
 */


data class SettingsDto (

    /* The language. */
    @Json(name = "culture")
    val culture: kotlin.String?,

    /* The base domain. */
    @Json(name = "baseDomain")
    val baseDomain: kotlin.String?,

    /* Specifies whether the cookie settings are enabled. */
    @Json(name = "cookieSettingsEnabled")
    val cookieSettingsEnabled: kotlin.Boolean,

    @Json(name = "deepLink")
    val deepLink: DeepLinkDto,

    /* The time zone. */
    @Json(name = "timezone")
    val timezone: kotlin.String? = null,

    /* The list of the trusted domains. */
    @Json(name = "trustedDomains")
    val trustedDomains: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "trustedDomainsType")
    val trustedDomainsType: TenantTrustedDomainsType? = null,

    /* The UTC offset in the TimeSpan format. */
    @Json(name = "utcOffset")
    val utcOffset: kotlin.String? = null,

    /* The UTC offset in hours. */
    @Json(name = "utcHoursOffset")
    val utcHoursOffset: kotlin.Double? = null,

    /* The greeting settings. */
    @Json(name = "greetingSettings")
    val greetingSettings: kotlin.String? = null,

    /* The owner ID. */
    @Json(name = "ownerId")
    val ownerId: java.util.UUID? = null,

    /* The team template ID. */
    @Json(name = "nameSchemaId")
    val nameSchemaId: kotlin.String? = null,

    /* Specifies if a user can join the portal or not. */
    @Json(name = "enabledJoin")
    val enabledJoin: kotlin.Boolean? = null,

    /* Specifies if a user can send a message to the administrator when accessing the DocSpace portal or not. */
    @Json(name = "enableAdmMess")
    val enableAdmMess: kotlin.Boolean? = null,

    /* Specifies if a user can connect third-party providers to the portal or not. */
    @Json(name = "thirdpartyEnable")
    val thirdpartyEnable: kotlin.Boolean? = null,

    /* Specifies if this portal is a DocSpace portal or not. */
    @Json(name = "docSpace")
    val docSpace: kotlin.Boolean? = null,

    /* Indicates whether the system is running in standalone mode. */
    @Json(name = "standalone")
    val standalone: kotlin.Boolean? = null,

    /* Specifies if this portal is the AMI instance or not. */
    @Json(name = "isAmi")
    val isAmi: kotlin.Boolean? = null,

    /* The wizard token. */
    @Json(name = "wizardToken")
    val wizardToken: kotlin.String? = null,

    @Json(name = "passwordHash")
    val passwordHash: PasswordHasher? = null,

    @Json(name = "firebase")
    val firebase: FirebaseDto? = null,

    /* The portal version. */
    @Json(name = "version")
    val version: kotlin.String? = null,

    @Json(name = "recaptchaType")
    val recaptchaType: RecaptchaType? = null,

    /* The ReCAPTCHA public key. */
    @Json(name = "recaptchaPublicKey")
    val recaptchaPublicKey: kotlin.String? = null,

    /* Specifies if the debug information will be sent or not. */
    @Json(name = "debugInfo")
    val debugInfo: kotlin.Boolean? = null,

    /* The socket URL. */
    @Json(name = "socketUrl")
    val socketUrl: kotlin.String? = null,

    @Json(name = "tenantStatus")
    val tenantStatus: TenantStatus? = null,

    /* The tenant alias. */
    @Json(name = "tenantAlias")
    val tenantAlias: kotlin.String? = null,

    /* Specifies whether to display the About portal section. */
    @Json(name = "displayAbout")
    val displayAbout: kotlin.Boolean? = null,

    @Json(name = "domainValidator")
    val domainValidator: TenantDomainValidator? = null,

    /* The Zendesk key. */
    @Json(name = "zendeskKey")
    val zendeskKey: kotlin.String? = null,

    /* The tag manager ID. */
    @Json(name = "tagManagerId")
    val tagManagerId: kotlin.String? = null,

    /* Specifies whether the access to the space management is limited or not. */
    @Json(name = "limitedAccessSpace")
    val limitedAccessSpace: kotlin.Boolean? = null,

    /* Specifies whether the access to the Developer Tools is limited for users or not. */
    @Json(name = "limitedAccessDevToolsForUsers")
    val limitedAccessDevToolsForUsers: kotlin.Boolean? = null,

    /* Specifies whether to display the promotional banners. */
    @Json(name = "displayBanners")
    val displayBanners: kotlin.Boolean? = null,

    /* The user name validation regex. */
    @Json(name = "userNameRegex")
    val userNameRegex: kotlin.String? = null,

    /* The maximum number of invitations to the portal. */
    @Json(name = "invitationLimit")
    val invitationLimit: kotlin.Int? = null,

    @Json(name = "plugins")
    val plugins: PluginsDto? = null,

    @Json(name = "formGallery")
    val formGallery: FormGalleryDto? = null,

    /* The maximum image upload size. */
    @Json(name = "maxImageUploadSize")
    val maxImageUploadSize: kotlin.Long? = null,

    /* The white label logo text. */
    @Json(name = "logoText")
    val logoText: kotlin.String? = null,

    @Json(name = "externalResources")
    val externalResources: CultureSpecificExternalResources? = null

) {


}

