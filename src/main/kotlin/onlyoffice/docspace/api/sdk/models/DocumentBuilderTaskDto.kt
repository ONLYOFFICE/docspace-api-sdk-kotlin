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

import onlyoffice.docspace.api.sdk.models.DistributedTaskStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The Document Builder task parameters.
 *
 * @param id The Document Builder task ID.
 * @param error The error message occurred during the document building process.
 * @param percentage The progress percentage of the document building process.
 * @param isCompleted Specifies whether the document building process is completed or not.
 * @param status 
 * @param resultFileId The result file ID.
 * @param resultFileName The result file name.
 * @param resultFileUrl The result file URL.
 */


data class DocumentBuilderTaskDto (

    /* The Document Builder task ID. */
    @Json(name = "id")
    val id: kotlin.String?,

    /* The error message occurred during the document building process. */
    @Json(name = "error")
    val error: kotlin.String?,

    /* The progress percentage of the document building process. */
    @Json(name = "percentage")
    val percentage: kotlin.Int,

    /* Specifies whether the document building process is completed or not. */
    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean,

    @Json(name = "status")
    val status: DistributedTaskStatus,

    /* The result file ID. */
    @Json(name = "resultFileId")
    val resultFileId: kotlin.Any?,

    /* The result file name. */
    @Json(name = "resultFileName")
    val resultFileName: kotlin.String?,

    /* The result file URL. */
    @Json(name = "resultFileUrl")
    val resultFileUrl: kotlin.String?

) {


}

