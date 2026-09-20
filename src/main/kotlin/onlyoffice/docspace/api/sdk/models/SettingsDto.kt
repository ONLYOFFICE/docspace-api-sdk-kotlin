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
 * The general configuration of the current portal, as the client shell needs it before and after sign-in.
 *
 * @param culture The default language of the portal as a culture name, which is what unauthenticated pages are rendered in.  A signed-in member may have a language of their own, and that one is not reported here.
 * @param baseDomain The domain new portals of this installation are created under, which is what a portal name is checked  against and appended to. It is empty on an installation that serves a single portal on a fixed address.
 * @param cookieSettingsEnabled Whether the portal limits how long an authentication session stays valid. The limit itself is read with  `GET api/2.0/settings/cookiesettings`; while this is `false` a session is honoured for a year.
 * @param deepLink What a mobile client needs to hand a document link over to the installed application instead of opening it  in the browser. Its fields are empty strings when the installation configures no application.
 * @param timezone The portal time zone as an IANA identifier, which is the zone every date this API returns in portal time  is expressed in. Filled in for a signed-in caller only.
 * @param trustedDomains The mail domains a new member may register or be invited from without confirming the address. It is filled  in for a signed-in caller, and for an anonymous one only while `enabledJoin` is `true`; it is empty  whenever `trustedDomainsType` is not `Custom`.
 * @param trustedDomainsType How the mail domains above are applied: no domain trusted, every domain trusted, or only the listed ones.  Filled in under the same conditions as `trustedDomains`.
 * @param utcOffset The portal's offset from UTC as a time span, positive east of UTC. Filled in for a signed-in caller only,  and taken at the moment of the call, so it already reflects daylight saving time.
 * @param utcHoursOffset The same offset in hours, fractional for a zone that is not on a whole hour. It is there so a client does  not have to parse `utcOffset`.
 * @param greetingSettings The portal title shown on the login page and in letters. It falls back to the product name in the portal  language while the portal has been given no title of its own.
 * @param ownerId The portal owner, the one account that cannot be removed or demoted. Filled in for a signed-in caller  only, and the empty GUID for an anonymous one.
 * @param nameSchemaId The naming scheme the portal uses for its own vocabulary - what a member, a group or a room is called in  the interface. `GET api/2.0/settings/customschemas/{id}` spells that vocabulary out. Filled in for a  signed-in caller only.
 * @param enabledJoin Whether someone who is not invited may still register, which is the case when the portal trusts every mail  domain or a list of them. It is computed for an anonymous caller only and left out entirely for a  signed-in one, so a missing value is not a `false`.
 * @param enableAdmMess Whether the login page may offer the form for writing to the portal administrators. It is also `true`  while the portal's payment has lapsed, whatever the setting says, so it can be set on a portal where an  administrator switched the form off.
 * @param thirdpartyEnable Whether the login page may offer sign-in through an external identity provider. It is computed for an  anonymous caller only; `GET api/2.0/capabilities` reports the same thing with the list of providers.
 * @param docSpace Always `true` in this product. It exists so a client that also talks to older ONLYOFFICE portals can tell  them apart, and is not a feature switch.
 * @param standalone Whether this is a server installation someone administers themselves rather than a portal in the cloud.  Several fields below and a number of operations behave differently in the two, so a client that has to  branch on the deployment reads it here.
 * @param isAmi Whether the installation runs from an Amazon machine image, which is a server installation that can read  its own instance metadata. It is `false` on every cloud portal.
 * @param wizardToken The token that authorizes the first-run setup wizard. It is handed out to anonymous callers only, and only  while the wizard has not been completed; once it has, the field stays empty for good.
 * @param passwordHash The parameters for hashing a password in the client before it is sent - the salt, the iteration count and  the hash size. It is filled in for an anonymous caller and, for a signed-in one, only when  `withPassword=true` is asked for. Hash with exactly these parameters and send the result as  `passwordHash`, since the portal cannot reproduce the hash from a different set.
 * @param firebase The Firebase project a mobile or web client sends push registrations to. Filled in for a signed-in caller  only, and its own fields are empty strings on an installation that configures no Firebase project.
 * @param version The product version of the portal, empty when the installation does not publish one. It is the version of  the server, not of this API, whose own version is fixed at 2.0.
 * @param recaptchaType Which CAPTCHA the login form has to render, decided by the installation's configuration. Computed for an  anonymous caller only.
 * @param recaptchaPublicKey The site key for the CAPTCHA named by `recaptchaType`, safe to embed in a page. It is empty when the  installation configures no CAPTCHA, in which case the login form asks for none.
 * @param debugInfo Whether the client may collect and send diagnostic information. Filled in for a signed-in caller only, and  `false` unless the installation switched it on.
 * @param socketUrl The address of the socket service that pushes live updates to a client. It is filled in for a signed-in  caller and for an anonymous one who arrives with an external sharing link, and is empty when the  installation runs no socket service - a client then has to poll.
 * @param tenantStatus The lifecycle state of the portal. Anything other than active means most operations are refused for the  moment, because the portal is being transferred, restored, encrypted or removed.
 * @param tenantAlias The portal's own name within the installation, which together with `baseDomain` forms the address it is  reached at. `PUT api/2.0/portal/portalrename` changes it.
 * @param displayAbout Whether the interface may show the About page. A cloud portal always may; a server installation may unless  its plan includes branding and the vendor details hide the page.
 * @param domainValidator The rules a portal name is checked against - its length limits and the pattern it has to match - so a  client can validate a rename before sending it. Filled in for a signed-in caller only.
 * @param zendeskKey The key that lets the client open the vendor's support chat, empty when the installation configures none.  Filled in for a signed-in caller only.
 * @param tagManagerId The Google Tag Manager container the client should load, empty when the installation configures none.  Filled in for a signed-in caller only.
 * @param limitedAccessSpace Whether the space-management section is restricted to the portal owner. Filled in for a signed-in caller  only.
 * @param limitedAccessDevToolsForUsers Whether the Developer Tools section is hidden from members who are not administrators. Filled in for a  signed-in caller only.
 * @param displayBanners Whether the interface may show the vendor's promotional banners. A cloud portal always reports `true`; on  a server installation it follows the banner setting. Filled in for a signed-in caller only.
 * @param aiEnabled Whether the AI features - chat, agents and vectorisation - may be used on this portal. While it is  `false` the AI Agents folder is hidden and the AI operations are refused. Filled in for a signed-in caller  only.
 * @param walletLowBalance Whether the portal wallet has already dropped below its low-balance threshold, so a client can warn about  AI operations being cut off. It is reported to DocSpace administrators only and left empty for everyone  else, which is not the same as a healthy balance.
 * @param userNameRegex The pattern a member's first and last name has to match, so a client can validate a name before sending  it. It is a .NET regular expression and is applied to each name part separately.
 * @param invitationLimit How many invitations the portal may still send in the current window. Filled in for a signed-in caller  only, and set to the maximum value of a 32-bit integer on an installation that limits nothing.
 * @param plugins What the installation allows to be done with web plugins. Filled in for a signed-in caller only, with all  three flags `false` unless the installation switched plugins on.
 * @param formGallery Where the ready-made form templates are served from and which extension they carry. Filled in for a  signed-in caller only.
 * @param maxImageUploadSize The largest image the portal accepts as a logo or an avatar, in bytes. Filled in for a signed-in caller  only, and a larger upload is refused rather than resized.
 * @param logoText The wordmark to print next to the portal logo. It falls back to the built-in one while the portal has  stored no text of its own, so it is never empty.
 * @param externalResources The addresses of the vendor's help, support, forum and video resources, already picked for the portal  language. An entry is missing when the installation configures no address for it or the resource is  switched off, which `GET api/2.0/settings/rebranding/additional` reports flag by flag.
 * @param defaultFolderType The section the client should open after sign-in, which is the caller's own preference rather than a  portal-wide one. Filled in for a signed-in caller only.
 * @param externalDbEnabled Whether the installation has an external database wired up for form results, without which the operations  that write form results there are refused. Filled in for a signed-in caller only.
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

