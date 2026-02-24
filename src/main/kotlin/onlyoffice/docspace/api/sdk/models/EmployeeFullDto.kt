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
 * @param title The user title.
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
 * @param birthday 
 * @param sex The user sex.
 * @param status 
 * @param activationStatus 
 * @param terminated 
 * @param department The user department.
 * @param workFrom 
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
 * @param mobilePhoneActivationStatus 
 * @param isSSO Specifies if the SSO settings are enabled for the user or not.
 * @param theme 
 * @param quotaLimit The user quota limit.
 * @param usedSpace The portal used space of the user.
 * @param shared Specifies if the user has access rights.
 * @param isCustomQuota Specifies if the user has a custom quota or not.
 * @param loginEventId The current login event ID.
 * @param authCookieLifetime The auth cookie lifetime in seconds.
 * @param createdBy 
 * @param registrationDate 
 * @param hasPersonalFolder Specifies if the user has a personal folder or not.
 * @param tfaAppEnabled Indicates whether the user has enabled two-factor authentication (TFA) using an authentication app.
 */


data class EmployeeFullDto (

    /* The user ID. */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    /* The HTML-encoded user's display name formatted according to the default format for the current culture. */
    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    /* The user title. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The user avatar. */
    @Json(name = "avatar")
    val avatar: kotlin.String? = null,

    /* The user original size avatar. */
    @Json(name = "avatarOriginal")
    val avatarOriginal: kotlin.String? = null,

    /* The user maximum size avatar. */
    @Json(name = "avatarMax")
    val avatarMax: kotlin.String? = null,

    /* The user medium size avatar. */
    @Json(name = "avatarMedium")
    val avatarMedium: kotlin.String? = null,

    /* The user small size avatar. */
    @Json(name = "avatarSmall")
    val avatarSmall: kotlin.String? = null,

    /* The user profile URL. */
    @Json(name = "profileUrl")
    val profileUrl: kotlin.String? = null,

    /* Specifies if the user has an avatar or not. */
    @Json(name = "hasAvatar")
    val hasAvatar: kotlin.Boolean? = null,

    /* Specifies if the user is anonymous or not. */
    @Json(name = "isAnonim")
    val isAnonim: kotlin.Boolean? = null,

    /* The user first name. */
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    /* The user last name. */
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    /* The user username. */
    @Json(name = "userName")
    val userName: kotlin.String? = null,

    /* The user email. */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* The list of user contacts. */
    @Json(name = "contacts")
    val contacts: kotlin.collections.List<Contact>? = null,

    @Json(name = "birthday")
    val birthday: ApiDateTime? = null,

    /* The user sex. */
    @Json(name = "sex")
    val sex: kotlin.String? = null,

    @Json(name = "status")
    val status: EmployeeStatus? = null,

    @Json(name = "activationStatus")
    val activationStatus: EmployeeActivationStatus? = null,

    @Json(name = "terminated")
    val terminated: ApiDateTime? = null,

    /* The user department. */
    @Json(name = "department")
    val department: kotlin.String? = null,

    @Json(name = "workFrom")
    val workFrom: ApiDateTime? = null,

    /* The list of user groups. */
    @Json(name = "groups")
    val groups: kotlin.collections.List<GroupSummaryDto>? = null,

    /* The user location. */
    @Json(name = "location")
    val location: kotlin.String? = null,

    /* The user notes. */
    @Json(name = "notes")
    val notes: kotlin.String? = null,

    /* Specifies if the user is an administrator or not. */
    @Json(name = "isAdmin")
    val isAdmin: kotlin.Boolean? = null,

    /* Specifies if the user is a room administrator or not. */
    @Json(name = "isRoomAdmin")
    val isRoomAdmin: kotlin.Boolean? = null,

    /* Specifies if the LDAP settings are enabled for the user or not. */
    @Json(name = "isLDAP")
    val isLDAP: kotlin.Boolean? = null,

    /* The list of the administrator modules. */
    @Json(name = "listAdminModules")
    val listAdminModules: kotlin.collections.List<kotlin.String>? = null,

    /* Specifies if the user is a portal owner or not. */
    @Json(name = "isOwner")
    val isOwner: kotlin.Boolean? = null,

    /* Specifies if the user is a portal visitor or not. */
    @Json(name = "isVisitor")
    val isVisitor: kotlin.Boolean? = null,

    /* Specifies if the user is a portal collaborator or not. */
    @Json(name = "isCollaborator")
    val isCollaborator: kotlin.Boolean? = null,

    /* The user culture code. */
    @Json(name = "cultureName")
    val cultureName: kotlin.String? = null,

    /* The user mobile phone number. */
    @Json(name = "mobilePhone")
    val mobilePhone: kotlin.String? = null,

    @Json(name = "mobilePhoneActivationStatus")
    val mobilePhoneActivationStatus: MobilePhoneActivationStatus? = null,

    /* Specifies if the SSO settings are enabled for the user or not. */
    @Json(name = "isSSO")
    val isSSO: kotlin.Boolean? = null,

    @Json(name = "theme")
    val theme: DarkThemeSettingsType? = null,

    /* The user quota limit. */
    @Json(name = "quotaLimit")
    val quotaLimit: kotlin.Long? = null,

    /* The portal used space of the user. */
    @Json(name = "usedSpace")
    val usedSpace: kotlin.Double? = null,

    /* Specifies if the user has access rights. */
    @Json(name = "shared")
    val shared: kotlin.Boolean? = null,

    /* Specifies if the user has a custom quota or not. */
    @Json(name = "isCustomQuota")
    val isCustomQuota: kotlin.Boolean? = null,

    /* The current login event ID. */
    @Json(name = "loginEventId")
    val loginEventId: kotlin.Int? = null,

    /* The auth cookie lifetime in seconds. */
    @Json(name = "authCookieLifetime")
    val authCookieLifetime: kotlin.Double? = null,

    @Json(name = "createdBy")
    val createdBy: EmployeeDto? = null,

    @Json(name = "registrationDate")
    val registrationDate: ApiDateTime? = null,

    /* Specifies if the user has a personal folder or not. */
    @Json(name = "hasPersonalFolder")
    val hasPersonalFolder: kotlin.Boolean? = null,

    /* Indicates whether the user has enabled two-factor authentication (TFA) using an authentication app. */
    @Json(name = "tfaAppEnabled")
    val tfaAppEnabled: kotlin.Boolean? = null

) {


}

