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

import onlyoffice.docspace.api.sdk.models.UserInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A user the editor may offer: to be mentioned in a comment, or to be picked when protecting a document.
 *
 * @param user The account itself, in the shape the people listings use.
 * @param email Where a mention notification for this user is delivered.
 * @param id The account id as text, the same value the account object carries; it is what identifies the user in a sharing  request built from this list.
 * @param image An absolute address of the medium-sized avatar. A generated default avatar is reported when the user never  uploaded one, so the field is never empty.
 * @param hasAccess Not filled in by the operations that return this list: it always comes back false. Whether a user can already  open the document has to be read from the sharing settings of the file.
 * @param name The name to display, assembled the way the portal is configured to show names.
 */


data class MentionWrapper (

    @Json(name = "user")
    val user: UserInfo? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "image")
    val image: kotlin.String? = null,

    @Json(name = "hasAccess")
    val hasAccess: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null

) {


}

