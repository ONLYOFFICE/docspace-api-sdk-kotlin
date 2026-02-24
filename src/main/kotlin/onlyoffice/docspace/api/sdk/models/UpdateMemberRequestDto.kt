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
import onlyoffice.docspace.api.sdk.models.SexEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for updating the user information.
 *
 * @param userId The user ID.
 * @param disable Specifies whether to disable a user or not.
 * @param email The user email address.
 * @param isUser Specifies if this is a guest or a user.
 * @param firstName The user first name.
 * @param lastName The user last name.
 * @param department The list of the user departments.
 * @param title The user title.
 * @param location The user location.
 * @param sex 
 * @param birthday 
 * @param worksfrom 
 * @param comment The user comment.
 * @param contacts The list of the user contacts.
 * @param files The user avatar photo URL.
 * @param spam Specifies if tips, updates and offers are allowed to be sent to the user or not.
 */


data class UpdateMemberRequestDto (

    /* The user ID. */
    @Json(name = "userId")
    val userId: kotlin.String? = null,

    /* Specifies whether to disable a user or not. */
    @Json(name = "disable")
    val disable: kotlin.Boolean? = null,

    /* The user email address. */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* Specifies if this is a guest or a user. */
    @Json(name = "isUser")
    val isUser: kotlin.Boolean? = null,

    /* The user first name. */
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    /* The user last name. */
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    /* The list of the user departments. */
    @Json(name = "department")
    val department: kotlin.collections.List<java.util.UUID>? = null,

    /* The user title. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The user location. */
    @Json(name = "location")
    val location: kotlin.String? = null,

    @Json(name = "sex")
    val sex: SexEnum? = null,

    @Json(name = "birthday")
    val birthday: ApiDateTime? = null,

    @Json(name = "worksfrom")
    val worksfrom: ApiDateTime? = null,

    /* The user comment. */
    @Json(name = "comment")
    val comment: kotlin.String? = null,

    /* The list of the user contacts. */
    @Json(name = "contacts")
    val contacts: kotlin.collections.List<Contact>? = null,

    /* The user avatar photo URL. */
    @Json(name = "files")
    val files: kotlin.String? = null,

    /* Specifies if tips, updates and offers are allowed to be sent to the user or not. */
    @Json(name = "spam")
    val spam: kotlin.Boolean? = null

) {


}

