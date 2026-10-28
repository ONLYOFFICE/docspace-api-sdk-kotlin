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
 * The file whose versions are deleted, and the versions to delete.
 *
 * @param fileId The file whose history the versions are taken from; only files stored in the portal itself are addressed here.
 * @param versions The version numbers to remove, as reported by `GET api/2.0/files/file/{fileId}/history`. At least one number  has to be sent: an empty list removes the file itself instead of one of its versions. The number of the  current version is refused outright, while a number that no longer exists is passed over without a complaint.
 * @param returnSingleOperation Which operations the answer carries: `true` returns the operation this call started and nothing else, `false`  returns every operation of the same kind that the caller has running or unread. When nothing was queued, which  happens for an empty selection, `true` falls back to the full list.
 * @param deleteAfter Whether the finished operation is still reported: `false` keeps its final record readable through  `GET api/2.0/files/fileops` until it has been read once, `true` drops the record as soon as the work is done.  It does not postpone the deletion and does not delete anything of its own.
 */


data class DeleteVersionBatchRequestDto (

    @Json(name = "fileId")
    val fileId: kotlin.Int,

    @Json(name = "versions")
    val versions: kotlin.collections.List<kotlin.Int>?,

    @Json(name = "returnSingleOperation")
    val returnSingleOperation: kotlin.Boolean? = null,

    @Json(name = "deleteAfter")
    val deleteAfter: kotlin.Boolean? = null

) {


}

