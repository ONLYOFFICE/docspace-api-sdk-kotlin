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

import onlyoffice.docspace.api.sdk.models.BatchRequestDtoAllOfDestFolderId
import onlyoffice.docspace.api.sdk.models.BatchRequestDtoAllOfFileIds
import onlyoffice.docspace.api.sdk.models.BatchRequestDtoAllOfFolderIds
import onlyoffice.docspace.api.sdk.models.FileConflictResolveType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for copying/moving files.
 *
 * @param returnSingleOperation Specifies whether to return only the current operation
 * @param folderIds The list of folder IDs to be copied/moved.
 * @param fileIds The list of file IDs to be copied/moved.
 * @param destFolderId 
 * @param conflictResolveType 
 * @param deleteAfter Specifies whether to delete the source files/folders after they are moved or copied to the destination folder.
 * @param content Specifies whether to copy or move the folder content or not.
 * @param toFillOut Specifies whether the file is copied for filling out
 */


data class BatchRequestDto (

    /* Specifies whether to return only the current operation */
    @Json(name = "returnSingleOperation")
    val returnSingleOperation: kotlin.Boolean? = null,

    /* The list of folder IDs to be copied/moved. */
    @Json(name = "folderIds")
    val folderIds: kotlin.collections.List<BatchRequestDtoAllOfFolderIds>? = null,

    /* The list of file IDs to be copied/moved. */
    @Json(name = "fileIds")
    val fileIds: kotlin.collections.List<BatchRequestDtoAllOfFileIds>? = null,

    @Json(name = "destFolderId")
    val destFolderId: BatchRequestDtoAllOfDestFolderId? = null,

    @Json(name = "conflictResolveType")
    val conflictResolveType: FileConflictResolveType? = null,

    /* Specifies whether to delete the source files/folders after they are moved or copied to the destination folder. */
    @Json(name = "deleteAfter")
    val deleteAfter: kotlin.Boolean? = null,

    /* Specifies whether to copy or move the folder content or not. */
    @Json(name = "content")
    val content: kotlin.Boolean? = null,

    /* Specifies whether the file is copied for filling out */
    @Json(name = "toFillOut")
    val toFillOut: kotlin.Boolean? = null

) {


}

