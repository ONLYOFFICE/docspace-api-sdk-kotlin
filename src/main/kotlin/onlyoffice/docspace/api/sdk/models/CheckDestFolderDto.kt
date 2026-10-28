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

import onlyoffice.docspace.api.sdk.models.CheckDestFolderResult
import onlyoffice.docspace.api.sdk.models.FileEntryBaseDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The verdict on placing the requested files in the destination folder.
 *
 * @param result Whether the destination folder accepts all of the requested files, only some of them or none at all.
 * @param files The requested files the destination accepts, each with the information it was listed under. The files it  rejects are absent, so an empty list means that none of them is accepted.
 */


data class CheckDestFolderDto (

    @Json(name = "result")
    val result: CheckDestFolderResult? = null,

    @Json(name = "files")
    val files: kotlin.collections.List<FileEntryBaseDto>? = null

) {


}

