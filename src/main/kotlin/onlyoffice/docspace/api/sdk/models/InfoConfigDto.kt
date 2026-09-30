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

import onlyoffice.docspace.api.sdk.models.AceShortWrapper
import onlyoffice.docspace.api.sdk.models.EditorType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The facts the editor information panel shows about the open document.
 *
 * @param favorite Whether the caller has this document among their favorites. It is empty when favorites do not apply - for an  anonymous caller, for a guest, and for an encrypted document.
 * @param folder The place of the document as a readable path, its folders joined from the root downwards. It is empty in the  embedded layout, which shows no such panel.
 * @param owner The display name of the owner of the document. It is empty for an anonymous session.
 * @param sharingSettings Who the document is shared with, as the information panel lists it. An empty list means it is shared with  nobody beyond its owner.
 * @param type The layout the information panel is rendered for.
 * @param uploaded When the document was created on the portal, already formatted for reading in the culture of the caller rather  than as a machine timestamp.
 */


data class InfoConfigDto (

    @Json(name = "favorite")
    val favorite: kotlin.Boolean? = null,

    @Json(name = "folder")
    val folder: kotlin.String? = null,

    @Json(name = "owner")
    val owner: kotlin.String? = null,

    @Json(name = "sharingSettings")
    val sharingSettings: kotlin.collections.List<AceShortWrapper>? = null,

    @Json(name = "type")
    val type: EditorType? = null,

    @Json(name = "uploaded")
    val uploaded: kotlin.String? = null

) {


}

