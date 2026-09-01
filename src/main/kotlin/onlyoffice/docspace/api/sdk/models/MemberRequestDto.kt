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

import onlyoffice.docspace.api.sdk.models.Contact
import onlyoffice.docspace.api.sdk.models.EmployeeType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The user request parameters.
 *
 * @param password The user password.
 * @param passwordHash The user password hash.
 * @param email The user email address.
 * @param type The user type.
 * @param isUser Specifies if this is a guest or a user.
 * @param firstName The user first name.
 * @param lastName The user last name.
 * @param department The list of the user departments IDs.
 * @param location The user location.
 * @param comment The user comment.
 * @param contacts The list of the user contacts.
 * @param files The avatar photo URL.
 * @param fromInviteLink Specifies if the user is added via the invitation link or not.
 * @param key The user key.
 * @param cultureName The user culture code.
 * @param target The user target ID.
 * @param spam Specifies if tips, updates and offers are allowed to be sent to the user or not.
 */


data class MemberRequestDto (

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "passwordHash")
    val passwordHash: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "type")
    val type: EmployeeType? = null,

    @Json(name = "isUser")
    val isUser: kotlin.Boolean? = null,

    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    @Json(name = "department")
    val department: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "location")
    val location: kotlin.String? = null,

    @Json(name = "comment")
    val comment: kotlin.String? = null,

    @Json(name = "contacts")
    val contacts: kotlin.collections.List<Contact>? = null,

    @Json(name = "files")
    val files: kotlin.String? = null,

    @Json(name = "fromInviteLink")
    val fromInviteLink: kotlin.Boolean? = null,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "cultureName")
    val cultureName: kotlin.String? = null,

    @Json(name = "target")
    val target: java.util.UUID? = null,

    @Json(name = "spam")
    val spam: kotlin.Boolean? = null

) {


}

