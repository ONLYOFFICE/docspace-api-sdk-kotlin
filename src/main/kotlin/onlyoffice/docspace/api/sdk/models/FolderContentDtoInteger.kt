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

import onlyoffice.docspace.api.sdk.models.FileEntryBaseDto
import onlyoffice.docspace.api.sdk.models.FolderDtoInteger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The folder content information.
 *
 * @param pathParts The folder path.
 * @param total The total number of elements in the folder.
 * @param files The list of files in the folder.
 * @param folders The list of folders in the folder.
 * @param current 
 * @param startIndex The folder start index.
 * @param count The number of folder elements.
 * @param new The new element index in the folder.
 */


data class FolderContentDtoInteger (

    /* The folder path. */
    @Json(name = "pathParts")
    val pathParts: kotlin.Any?,

    /* The total number of elements in the folder. */
    @Json(name = "total")
    val total: kotlin.Int,

    /* The list of files in the folder. */
    @Json(name = "files")
    val files: kotlin.collections.List<FileEntryBaseDto>? = null,

    /* The list of folders in the folder. */
    @Json(name = "folders")
    val folders: kotlin.collections.List<FileEntryBaseDto>? = null,

    @Json(name = "current")
    val current: FolderDtoInteger? = null,

    /* The folder start index. */
    @Json(name = "startIndex")
    val startIndex: kotlin.Int? = null,

    /* The number of folder elements. */
    @Json(name = "count")
    val count: kotlin.Int? = null,

    /* The new element index in the folder. */
    @Json(name = "new")
    val new: kotlin.Int? = null

) {


}

