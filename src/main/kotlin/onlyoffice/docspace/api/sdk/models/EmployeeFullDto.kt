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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.Contact
import onlyoffice.docspace.api.sdk.models.DarkThemeSettingsType
import onlyoffice.docspace.api.sdk.models.EmployeeActivationStatus
import onlyoffice.docspace.api.sdk.models.EmployeeDto
import onlyoffice.docspace.api.sdk.models.EmployeeStatus
import onlyoffice.docspace.api.sdk.models.GroupSummaryDto
import onlyoffice.docspace.api.sdk.models.MobilePhoneActivationStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The full list of user parameters.
 *
 * @param id The user ID.
 * @param displayName The HTML-encoded user's display name formatted according to the default format for the current culture.
 * @param avatar The user avatar.
 * @param avatarOriginal The user original size avatar.
 * @param avatarMax The user maximum size avatar.
 * @param avatarMedium The user medium size avatar.
 * @param avatarSmall The user small size avatar.
 * @param profileUrl The user profile URL.
 * @param hasAvatar Specifies if the user has an avatar or not.
 * @param isAnonim Specifies if the user is anonymous or not.
 * @param firstName The user first name.
 * @param lastName The user last name.
 * @param userName The user username.
 * @param email The user email.
 * @param contacts The list of user contacts.
 * @param status The user status.
 * @param activationStatus The user activation status.
 * @param terminated The date when the user account was terminated.
 * @param department The user department.
 * @param groups The list of user groups.
 * @param location The user location.
 * @param notes The user notes.
 * @param isAdmin Specifies if the user is an administrator or not.
 * @param isRoomAdmin Specifies if the user is a room administrator or not.
 * @param isLDAP Specifies if the LDAP settings are enabled for the user or not.
 * @param listAdminModules The list of the administrator modules.
 * @param isOwner Specifies if the user is a portal owner or not.
 * @param isVisitor Specifies if the user is a portal visitor or not.
 * @param isCollaborator Specifies if the user is a portal collaborator or not.
 * @param cultureName The user culture code.
 * @param mobilePhone The user mobile phone number.
 * @param mobilePhoneActivationStatus The user mobile phone activation status.
 * @param isSSO Specifies if the SSO settings are enabled for the user or not.
 * @param theme The user theme settings.
 * @param quotaLimit The user quota limit.
 * @param usedSpace The portal used space of the user.
 * @param shared Specifies if the user has access rights.
 * @param isCustomQuota Specifies if the user has a custom quota or not.
 * @param loginEventId The current login event ID.
 * @param authCookieLifetime The auth cookie lifetime in seconds.
 * @param createdBy The user who created the current user.
 * @param registrationDate The user registration date.
 * @param hasPersonalFolder Specifies if the user has a personal folder or not.
 * @param tfaAppEnabled Indicates whether the user has enabled two-factor authentication (TFA) using an authentication app.
 */


data class EmployeeFullDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "avatar")
    val avatar: kotlin.String? = null,

    @Json(name = "avatarOriginal")
    val avatarOriginal: kotlin.String? = null,

    @Json(name = "avatarMax")
    val avatarMax: kotlin.String? = null,

    @Json(name = "avatarMedium")
    val avatarMedium: kotlin.String? = null,

    @Json(name = "avatarSmall")
    val avatarSmall: kotlin.String? = null,

    @Json(name = "profileUrl")
    val profileUrl: kotlin.String? = null,

    @Json(name = "hasAvatar")
    val hasAvatar: kotlin.Boolean? = null,

    @Json(name = "isAnonim")
    val isAnonim: kotlin.Boolean? = null,

    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    @Json(name = "userName")
    val userName: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "contacts")
    val contacts: kotlin.collections.List<Contact>? = null,

    @Json(name = "status")
    val status: EmployeeStatus? = null,

    @Json(name = "activationStatus")
    val activationStatus: EmployeeActivationStatus? = null,

    @Json(name = "terminated")
    val terminated: ApiDateTime? = null,

    @Json(name = "department")
    val department: kotlin.String? = null,

    @Json(name = "groups")
    val groups: kotlin.collections.List<GroupSummaryDto>? = null,

    @Json(name = "location")
    val location: kotlin.String? = null,

    @Json(name = "notes")
    val notes: kotlin.String? = null,

    @Json(name = "isAdmin")
    val isAdmin: kotlin.Boolean? = null,

    @Json(name = "isRoomAdmin")
    val isRoomAdmin: kotlin.Boolean? = null,

    @Json(name = "isLDAP")
    val isLDAP: kotlin.Boolean? = null,

    @Json(name = "listAdminModules")
    val listAdminModules: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "isOwner")
    val isOwner: kotlin.Boolean? = null,

    @Json(name = "isVisitor")
    val isVisitor: kotlin.Boolean? = null,

    @Json(name = "isCollaborator")
    val isCollaborator: kotlin.Boolean? = null,

    @Json(name = "cultureName")
    val cultureName: kotlin.String? = null,

    @Json(name = "mobilePhone")
    val mobilePhone: kotlin.String? = null,

    @Json(name = "mobilePhoneActivationStatus")
    val mobilePhoneActivationStatus: MobilePhoneActivationStatus? = null,

    @Json(name = "isSSO")
    val isSSO: kotlin.Boolean? = null,

    @Json(name = "theme")
    val theme: DarkThemeSettingsType? = null,

    @Json(name = "quotaLimit")
    val quotaLimit: kotlin.Long? = null,

    @Json(name = "usedSpace")
    val usedSpace: kotlin.Double? = null,

    @Json(name = "shared")
    val shared: kotlin.Boolean? = null,

    @Json(name = "isCustomQuota")
    val isCustomQuota: kotlin.Boolean? = null,

    @Json(name = "loginEventId")
    val loginEventId: kotlin.Int? = null,

    @Json(name = "authCookieLifetime")
    val authCookieLifetime: kotlin.Double? = null,

    @Json(name = "createdBy")
    val createdBy: EmployeeDto? = null,

    @Json(name = "registrationDate")
    val registrationDate: ApiDateTime? = null,

    @Json(name = "hasPersonalFolder")
    val hasPersonalFolder: kotlin.Boolean? = null,

    @Json(name = "tfaAppEnabled")
    val tfaAppEnabled: kotlin.Boolean? = null

) {


}

