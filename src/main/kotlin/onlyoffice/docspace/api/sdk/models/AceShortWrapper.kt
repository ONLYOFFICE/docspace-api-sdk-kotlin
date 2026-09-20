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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One line of a document sharing list in display form: who the document is shared with and the label of their access  level, rather than an access record with identifiers. Entries that deny access and invitation links are left out,  so the list names only the subjects and links that can currently open the document.
 *
 * @param user Who or what the line stands for, as a display string: the display name of a member, the name of a group, or  the title given to a shared link when `isLink` is true. It is empty when the subject has no name to show - a  shared link that was never given a title, for instance.
 * @param permissions The access level of that subject as a localized label, not a code: inside a room it usually names the role the  subject holds there (Viewer, Editor, Room Manager), while outside a room it names the access itself  (Read Only, Full Access). The wording comes from the portal resources and is translated for the current  language, so show it to a person rather than compare it in code.
 * @param isLink Whether the line stands for a shared link instead of a member or a group. Clients use it to draw a link badge  where they would otherwise draw an avatar.
 */


data class AceShortWrapper (

    @Json(name = "user")
    val user: kotlin.String? = null,

    @Json(name = "permissions")
    val permissions: kotlin.String? = null,

    @Json(name = "isLink")
    val isLink: kotlin.Boolean? = null

) {


}

