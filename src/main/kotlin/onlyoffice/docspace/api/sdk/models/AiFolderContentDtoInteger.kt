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

import onlyoffice.docspace.api.sdk.models.AiFileEntryBaseDto
import onlyoffice.docspace.api.sdk.models.AiFolderDtoInteger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The folder content information.
 *
 * @param pathParts 
 * @param total The total number of elements in the folder.
 * @param files The list of files in the folder.
 * @param folders The list of folders in the folder.
 * @param current The current folder information.
 * @param startIndex The folder start index.
 * @param count The number of folder elements.
 * @param new The new element index in the folder.
 */


data class AiFolderContentDtoInteger (

    @Json(name = "pathParts")
    val pathParts: kotlin.Any?,

    @Json(name = "total")
    val total: kotlin.Int,

    @Json(name = "files")
    val files: kotlin.collections.List<AiFileEntryBaseDto>? = null,

    @Json(name = "folders")
    val folders: kotlin.collections.List<AiFileEntryBaseDto>? = null,

    @Json(name = "current")
    val current: AiFolderDtoInteger? = null,

    @Json(name = "startIndex")
    val startIndex: kotlin.Int? = null,

    @Json(name = "count")
    val count: kotlin.Int? = null,

    @Json(name = "new")
    val new: kotlin.Int? = null

) {


}

