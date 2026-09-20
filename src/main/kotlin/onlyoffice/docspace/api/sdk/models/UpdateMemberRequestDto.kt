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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for updating the user information.
 *
 * @param userId The account the change applies to. It is read from this body by `POST api/2.0/people/email`, while  `PUT api/2.0/people/{userid}` takes the account from the route and ignores this field.
 * @param disable Set it to true to give the account the `Terminated` status and end every session it has, and to false to  bring it back. It is applied only when the caller edits somebody else, and omitting it keeps the current  status.
 * @param email The new email address, up to 255 characters. It is read only by `POST api/2.0/people/email`, which either  mails a confirmation letter or, for an administrator acting on somebody else, applies the address at once;  `PUT api/2.0/people/{userid}` ignores it.
 * @param isUser Set it to true to turn the account into a guest and to false to turn it back into a member. Either direction  takes a seat and can answer 402, it is applied only when the caller edits somebody else, and a request to  make the portal owner, a DocSpace administrator or a module administrator a guest is ignored.
 * @param firstName The new first name, up to 255 characters. It is applied only to the caller's own profile, is left alone on an  LDAP or SSO account, and a pair the portal does not accept as a name answers 400.
 * @param lastName The new last name, up to 255 characters. It is applied only to the caller's own profile, is left alone on an  LDAP or SSO account, and a pair the portal does not accept as a name answers 400.
 * @param department The groups the profile should belong to, by group ID, replacing the current ones. It is applied only to the  caller's own profile.
 * @param location The new free-text location shown on the profile. It is applied only to the caller's own profile and is left  alone on an LDAP or SSO account.
 * @param comment The new free-text note kept with the profile. It is applied only to the caller's own profile.
 * @param contacts The additional ways to reach the person, replacing the current ones. Each entry is a free-text type such as  `email`, `phone`, `skype` or `telegram` and its value, an entry with an empty value is dropped, and the field  is applied only to the caller's own profile.
 * @param files The address the portal downloads the new avatar from. It is applied only to the caller's own profile, has to  use HTTPS unless the request itself came over HTTP, and passing the address the profile already uses  downloads nothing.
 * @param spam Whether the account agrees to receive tips, updates and offers. It is applied only to the caller's own  profile, and omitting it on such a request stores false rather than keeping the current value.
 */


data class UpdateMemberRequestDto (

    @Json(name = "userId")
    val userId: kotlin.String? = null,

    @Json(name = "disable")
    val disable: kotlin.Boolean? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

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

    @Json(name = "spam")
    val spam: kotlin.Boolean? = null

) {


}

