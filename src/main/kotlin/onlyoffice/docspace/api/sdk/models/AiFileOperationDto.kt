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

import onlyoffice.docspace.api.sdk.models.AiDistributedTaskStatus
import onlyoffice.docspace.api.sdk.models.AiFileEntryBaseDto
import onlyoffice.docspace.api.sdk.models.AiFileOperationType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The file operation information.
 *
 * @param id The file operation ID.
 * @param operation The file operation type.
 * @param progress The file operation progress in percentage.
 * @param error The file operation error message.
 * @param processed The file operation processing status.
 * @param finished Specifies if the file operation is finished or not.
 * @param url The file operation URL.
 * @param files The list of files of the file operation.
 * @param folders The list of folders of the file operation.
 * @param status The status of the distributed task related to the file operation.
 */


data class AiFileOperationDto (

    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "Operation")
    val operation: AiFileOperationType,

    @Json(name = "progress")
    val progress: kotlin.Int,

    @Json(name = "error")
    val error: kotlin.String?,

    @Json(name = "processed")
    val processed: kotlin.String?,

    @Json(name = "finished")
    val finished: kotlin.Boolean,

    @Json(name = "url")
    val url: java.net.URI? = null,

    @Json(name = "files")
    val files: kotlin.collections.List<AiFileEntryBaseDto>? = null,

    @Json(name = "folders")
    val folders: kotlin.collections.List<AiFileEntryBaseDto>? = null,

    @Json(name = "status")
    val status: AiDistributedTaskStatus? = null

) {


}

