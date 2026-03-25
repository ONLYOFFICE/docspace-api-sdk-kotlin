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

import onlyoffice.docspace.api.sdk.models.EmployeeActivationStatus
import onlyoffice.docspace.api.sdk.models.EmployeeStatus
import onlyoffice.docspace.api.sdk.models.MobilePhoneActivationStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The user information.
 *
 * @param id The user ID.
 * @param firstName The user's first name.
 * @param lastName The user's last name.
 * @param userName The user username.
 * @param birthDate The user birthday.
 * @param sex The user sex (male or female).
 * @param status 
 * @param activationStatus 
 * @param terminatedDate The date and time when the user account was terminated.
 * @param title The user title.
 * @param workFromDate The user registration date.
 * @param email The user email address.
 * @param contacts The list of user contacts in the string format.
 * @param contactsList The list of user contacts.
 * @param location The user location.
 * @param notes The user notes.
 * @param removed Specifies if the user account was removed or not.
 * @param lastModified The date and time when the user account was last modified.
 * @param tenantId The tenant ID.
 * @param isActive Specifies if the user is active or not.
 * @param cultureName The user culture code.
 * @param mobilePhone The user mobile phone.
 * @param mobilePhoneActivationStatus 
 * @param sid The LDAP user identifier.
 * @param ldapQouta The LDAP user quota attribute.
 * @param ssoNameId The SSO SAML user identifier.
 * @param ssoSessionId The SSO SAML user session identifier.
 * @param createDate The date and time when the user account was created.
 * @param createdBy The ID of the user who created the current user account.
 * @param spam Specifies if tips, updates and offers are allowed to be sent to the user or not.
 * @param checkActivation Indicates whether the activation status of the employee or recipient is unchecked or inactive.  Depending on the context, this property evaluates the activation or eligibility status accordingly.
 */


data class UserInfo (

    /* The user ID. */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    /* The user's first name. */
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    /* The user's last name. */
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    /* The user username. */
    @Json(name = "userName")
    val userName: kotlin.String? = null,

    /* The user birthday. */
    @Json(name = "birthDate")
    val birthDate: java.time.OffsetDateTime? = null,

    /* The user sex (male or female). */
    @Json(name = "sex")
    val sex: kotlin.Boolean? = null,

    @Json(name = "status")
    val status: EmployeeStatus? = null,

    @Json(name = "activationStatus")
    val activationStatus: EmployeeActivationStatus? = null,

    /* The date and time when the user account was terminated. */
    @Json(name = "terminatedDate")
    val terminatedDate: java.time.OffsetDateTime? = null,

    /* The user title. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The user registration date. */
    @Json(name = "workFromDate")
    val workFromDate: java.time.OffsetDateTime? = null,

    /* The user email address. */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* The list of user contacts in the string format. */
    @Json(name = "contacts")
    val contacts: kotlin.String? = null,

    /* The list of user contacts. */
    @Json(name = "contactsList")
    val contactsList: kotlin.collections.List<kotlin.String>? = null,

    /* The user location. */
    @Json(name = "location")
    val location: kotlin.String? = null,

    /* The user notes. */
    @Json(name = "notes")
    val notes: kotlin.String? = null,

    /* Specifies if the user account was removed or not. */
    @Json(name = "removed")
    val removed: kotlin.Boolean? = null,

    /* The date and time when the user account was last modified. */
    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null,

    /* The tenant ID. */
    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    /* Specifies if the user is active or not. */
    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null,

    /* The user culture code. */
    @Json(name = "cultureName")
    val cultureName: kotlin.String? = null,

    /* The user mobile phone. */
    @Json(name = "mobilePhone")
    val mobilePhone: kotlin.String? = null,

    @Json(name = "mobilePhoneActivationStatus")
    val mobilePhoneActivationStatus: MobilePhoneActivationStatus? = null,

    /* The LDAP user identifier. */
    @Json(name = "sid")
    val sid: kotlin.String? = null,

    /* The LDAP user quota attribute. */
    @Json(name = "ldapQouta")
    val ldapQouta: kotlin.Long? = null,

    /* The SSO SAML user identifier. */
    @Json(name = "ssoNameId")
    val ssoNameId: kotlin.String? = null,

    /* The SSO SAML user session identifier. */
    @Json(name = "ssoSessionId")
    val ssoSessionId: kotlin.String? = null,

    /* The date and time when the user account was created. */
    @Json(name = "createDate")
    val createDate: java.time.OffsetDateTime? = null,

    /* The ID of the user who created the current user account. */
    @Json(name = "createdBy")
    val createdBy: java.util.UUID? = null,

    /* Specifies if tips, updates and offers are allowed to be sent to the user or not. */
    @Json(name = "spam")
    val spam: kotlin.Boolean? = null,

    /* Indicates whether the activation status of the employee or recipient is unchecked or inactive.  Depending on the context, this property evaluates the activation or eligibility status accordingly. */
    @Json(name = "checkActivation")
    val checkActivation: kotlin.Boolean? = null

) {


}

