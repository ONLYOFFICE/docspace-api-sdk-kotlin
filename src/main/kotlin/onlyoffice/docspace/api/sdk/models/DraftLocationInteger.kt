 /*
 * (c) Copyright Ascensio System SIA 2025
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
 * The file draft parameters.
 *
 * @param folderId The InProcess folder ID of the draft.
 * @param folderTitle The InProcess folder title of the draft.
 * @param fileId The draft ID.
 * @param fileTitle The draft title.
 */


data class DraftLocationInteger (

    /* The InProcess folder ID of the draft. */
    @Json(name = "folderId")
    val folderId: kotlin.Int? = null,

    /* The InProcess folder title of the draft. */
    @Json(name = "folderTitle")
    val folderTitle: kotlin.String? = null,

    /* The draft ID. */
    @Json(name = "fileId")
    val fileId: kotlin.Int? = null,

    /* The draft title. */
    @Json(name = "fileTitle")
    val fileTitle: kotlin.String? = null

) {


}

