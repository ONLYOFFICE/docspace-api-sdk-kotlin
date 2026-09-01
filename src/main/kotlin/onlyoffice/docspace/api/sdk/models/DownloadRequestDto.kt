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

import onlyoffice.docspace.api.sdk.models.DownloadRequestDtoAllOfFileIds
import onlyoffice.docspace.api.sdk.models.DownloadRequestDtoAllOfFolderIds
import onlyoffice.docspace.api.sdk.models.DownloadRequestItemDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for downloading files.
 *
 * @param returnSingleOperation Specifies whether to return only the current operation
 * @param folderIds The list of folder IDs to be downloaded.
 * @param fileIds The list of file IDs to be downloaded.
 * @param fileConvertIds The list of file IDs which will be converted.
 */


data class DownloadRequestDto (

    @Json(name = "returnSingleOperation")
    val returnSingleOperation: kotlin.Boolean? = null,

    @Json(name = "folderIds")
    val folderIds: kotlin.collections.List<DownloadRequestDtoAllOfFolderIds>? = null,

    @Json(name = "fileIds")
    val fileIds: kotlin.collections.List<DownloadRequestDtoAllOfFileIds>? = null,

    @Json(name = "fileConvertIds")
    val fileConvertIds: kotlin.collections.List<DownloadRequestItemDto>? = null

) {


}

