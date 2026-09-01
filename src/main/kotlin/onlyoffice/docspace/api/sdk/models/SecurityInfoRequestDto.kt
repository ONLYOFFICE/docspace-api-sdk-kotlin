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
import onlyoffice.docspace.api.sdk.models.FileShareParams

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The security information request parameters.
 *
 * @param folderIds The list of the shared folder IDs.
 * @param fileIds The list of the shared file IDs.
 * @param share The collection of sharing parameters.
 * @param notify Specifies whether to notify users about the shared file or not.
 * @param sharingMessage The message to send when notifying about the shared file.
 */


data class SecurityInfoRequestDto (

    @Json(name = "folderIds")
    val folderIds: kotlin.collections.List<DuplicateRequestDtoAllOfFileIds>? = null,

    @Json(name = "fileIds")
    val fileIds: kotlin.collections.List<DuplicateRequestDtoAllOfFileIds>? = null,

    @Json(name = "share")
    val share: kotlin.collections.List<FileShareParams>? = null,

    @Json(name = "notify")
    val notify: kotlin.Boolean? = null,

    @Json(name = "sharingMessage")
    val sharingMessage: kotlin.String? = null

) {


}

