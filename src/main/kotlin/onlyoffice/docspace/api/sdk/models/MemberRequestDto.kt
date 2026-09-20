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
 * @param password The password in plain text. It is checked against the portal password policy and rejected with 400 when it is  too weak. When neither this field nor `passwordHash` is sent, a random password is generated and nobody  learns it, so the account can only be used after a password recovery.
 * @param passwordHash The password already hashed by the client, which is what the portal stores. It is a PBKDF2-HMACSHA256 hash of  the plain password, computed with the salt, the iteration count and the key size the portal settings publish,  and written as lowercase hexadecimal. When it is sent, `password` is ignored and the password policy is not  applied.
 * @param email The email address of the new account, up to 255 characters. It is required in practice and has to be a real  address, and it becomes the sign-in name of the account.
 * @param type The type of the new account: `User`, `RoomAdmin` or `DocSpaceAdmin`. `Guest` is not accepted here, and the  value is ignored entirely when `fromInviteLink` is set, because the invitation link decides the type. When no  paid seat is free, the account is created as `User` whatever was asked for.
 * @param isUser Only chooses which entry the operation writes to the audit trail - the one for a guest or the one for a  member. It does not change the type of the account; `type` and the invitation link do that.
 * @param firstName The first name, up to 255 characters. It is checked together with `lastName`, and a pair the portal does not  accept as a name answers 400.
 * @param lastName The last name, up to 255 characters. It is checked together with `firstName`, and a pair the portal does not  accept as a name answers 400.
 * @param department The groups to put the new account into, by group ID. Read the IDs from `GET api/2.0/group`; an ID that  matches no group is skipped without an error.
 * @param location The free-text location shown on the profile. It is stored as it is given and is not validated.
 * @param comment The free-text note kept with the profile, shown to administrators. It is stored as it is given.
 * @param contacts The additional ways to reach the person, each as a type and a value pair. The type is a free-text label such  as `email`, `phone`, `skype` or `telegram`, and an entry with an empty value is dropped.
 * @param files The address the portal downloads the avatar from. It has to use HTTPS unless the request itself came over  HTTP, an address the portal refuses to fetch is rejected, and passing the default avatar path means no  avatar is downloaded.
 * @param fromInviteLink Set it to true when the account is created by somebody accepting an invitation, which makes `key` required  and lets the link decide the type. With the default false the caller has to hold the permission to add an  account of the requested type.
 * @param key The key of the invitation link being accepted, taken from the link itself. It is read only when  `fromInviteLink` is true, and an expired or already used key answers 403.
 * @param cultureName The interface language of the new account, as a culture code. It is applied whether or not the portal has  that culture enabled, so send a code the portal supports.
 * @param target Not used. The handler reads nothing from this field, and it is kept only so that existing clients keep  working.
 * @param spam Whether the account agrees to receive tips, updates and offers. It defaults to false, which means no such  mail is sent.
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

