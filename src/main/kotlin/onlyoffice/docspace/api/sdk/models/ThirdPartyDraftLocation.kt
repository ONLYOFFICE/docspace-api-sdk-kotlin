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
 * Where the caller's own filling draft of a form is kept.
 *
 * @param folderId The folder holding the draft: the sub-folder that the room for filling keeps for drafts of this particular  form.
 * @param folderTitle The title of that folder, which the portal takes from the form itself when the form is released for filling.
 * @param fileId The draft itself - the copy the caller fills in, not the original form, and the identifier to pass to the file  operations while filling.
 * @param fileTitle The title of the draft, which the portal builds from the name of the person filling it and the name of the  form. Null when the draft the record points at no longer exists.
 */


data class ThirdPartyDraftLocation (

    @Json(name = "folderId")
    val folderId: kotlin.String? = null,

    @Json(name = "folderTitle")
    val folderTitle: kotlin.String? = null,

    @Json(name = "fileId")
    val fileId: kotlin.String? = null,

    @Json(name = "fileTitle")
    val fileTitle: kotlin.String? = null

) {


}

