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

import onlyoffice.docspace.api.sdk.models.DuplicateRequestDtoAllOfFileIds
import onlyoffice.docspace.api.sdk.models.DuplicateRequestDtoAllOfFolderIds

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The files and folders to duplicate.
 *
 * @param returnSingleOperation Which operations the answer carries: `true` returns the operation this call started and nothing else, `false`  returns every operation of the same kind that the caller has running or unread. When nothing was queued, which  happens for an empty selection, `true` falls back to the full list.
 * @param folderIds The folders to duplicate, by id; the copy of each one is created in the folder that already holds it. A number  addresses a folder stored in the portal itself, a string addresses a folder on a connected third-party  account, and both kinds may be sent in one list.
 * @param fileIds The files to duplicate, by id; the copy of each one is created in the folder that already holds it. A number  addresses a file stored in the portal itself, a string addresses a file on a connected third-party account,  and both kinds may be sent in one list.
 */


data class DuplicateRequestDto (

    @Json(name = "returnSingleOperation")
    val returnSingleOperation: kotlin.Boolean? = null,

    @Json(name = "folderIds")
    val folderIds: kotlin.collections.List<DuplicateRequestDtoAllOfFolderIds>? = null,

    @Json(name = "fileIds")
    val fileIds: kotlin.collections.List<DuplicateRequestDtoAllOfFileIds>? = null

) {


}

