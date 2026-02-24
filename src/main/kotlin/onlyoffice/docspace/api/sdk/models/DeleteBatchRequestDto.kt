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

import onlyoffice.docspace.api.sdk.models.DeleteBatchRequestDtoAllOfFileIds
import onlyoffice.docspace.api.sdk.models.DeleteBatchRequestDtoAllOfFolderIds

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for deleting files.
 *
 * @param returnSingleOperation Specifies whether to return only the current operation
 * @param folderIds The list of folder IDs to be deleted.
 * @param fileIds The list of file IDs to be deleted.
 * @param deleteAfter Specifies whether to delete a file after the editing session is finished or not
 * @param immediately Specifies whether to move a file to the \\Trash\\ folder or delete it immediately.
 */


data class DeleteBatchRequestDto (

    /* Specifies whether to return only the current operation */
    @Json(name = "returnSingleOperation")
    val returnSingleOperation: kotlin.Boolean? = null,

    /* The list of folder IDs to be deleted. */
    @Json(name = "folderIds")
    val folderIds: kotlin.collections.List<DeleteBatchRequestDtoAllOfFolderIds>? = null,

    /* The list of file IDs to be deleted. */
    @Json(name = "fileIds")
    val fileIds: kotlin.collections.List<DeleteBatchRequestDtoAllOfFileIds>? = null,

    /* Specifies whether to delete a file after the editing session is finished or not */
    @Json(name = "deleteAfter")
    val deleteAfter: kotlin.Boolean? = null,

    /* Specifies whether to move a file to the \\Trash\\ folder or delete it immediately. */
    @Json(name = "immediately")
    val immediately: kotlin.Boolean? = null

) {


}

