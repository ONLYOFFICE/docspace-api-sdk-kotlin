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
 * The files and folders to move or copy, the folder they go to, and the way name clashes are settled.
 *
 * @param returnSingleOperation Which operations the answer carries: `true` returns the operation this call started and nothing else, `false`  returns every operation of the same kind that the caller has running or unread. When nothing was queued, which  happens for an empty selection, `true` falls back to the full list.
 * @param folderIds The folders to move or copy, by id. A number addresses a folder stored in the portal itself, a string  addresses a folder on a connected third-party account, and both kinds may be sent in one list.
 * @param fileIds The files to move or copy, by id. A number addresses a file stored in the portal itself, a string addresses a  file on a connected third-party account, and both kinds may be sent in one list.
 * @param destFolderId 
 * @param conflictResolveType What happens to an item whose name is already taken in the destination folder: `skip` leaves it where it is,  `overwrite` replaces the entry at the destination, and `duplicate` places it beside that entry under a name  with a numeric suffix. `GET api/2.0/files/fileops/move` reports which items would clash.
 * @param deleteAfter Whether the finished operation is still reported: `false` keeps its final record readable through  `GET api/2.0/files/fileops` until it has been read once, `true` drops the record as soon as the work is done.  It deletes nothing: a move takes the sources away in any case, and a copy always leaves them.
 * @param content What is taken from a listed folder: `false` moves or copies the folder itself, `true` takes only what it  contains, so its files and subfolders land in the destination and the folder is not recreated there.
 * @param toFillOut Marks every copied PDF form as a draft prepared for filling, which is how such a copy reports its filling  status in a virtual data room. Files that are not forms are left unaffected.
 */


data class BatchRequestDto (

    @Json(name = "returnSingleOperation")
    val returnSingleOperation: kotlin.Boolean? = null,

    @Json(name = "folderIds")
    val folderIds: kotlin.collections.List<BatchRequestDtoAllOfFolderIds>? = null,

    @Json(name = "fileIds")
    val fileIds: kotlin.collections.List<BatchRequestDtoAllOfFileIds>? = null,

    @Json(name = "destFolderId")
    val destFolderId: BatchRequestDtoAllOfDestFolderId? = null,

    @Json(name = "conflictResolveType")
    val conflictResolveType: FileConflictResolveType? = null,

    @Json(name = "deleteAfter")
    val deleteAfter: kotlin.Boolean? = null,

    @Json(name = "content")
    val content: kotlin.Boolean? = null,

    @Json(name = "toFillOut")
    val toFillOut: kotlin.Boolean? = null

) {


}

