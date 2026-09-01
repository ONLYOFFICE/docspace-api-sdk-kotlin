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
import onlyoffice.docspace.api.sdk.models.ExternalDbSyncFormResultDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The external DB synchronization task parameters.
 *
 * @param id The task ID.
 * @param percentage The progress percentage of the synchronization.
 * @param isCompleted Specifies whether the synchronization is completed or not.
 * @param status The status of the synchronization task.
 * @param forms The synchronization results for all original forms in the room.
 * @param error The error message if the synchronization failed.
 */


data class ExternalDbSyncTaskDto (

    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "percentage")
    val percentage: kotlin.Int,

    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean,

    @Json(name = "status")
    val status: DistributedTaskStatus,

    @Json(name = "forms")
    val forms: kotlin.collections.List<ExternalDbSyncFormResultDto>?,

    @Json(name = "error")
    val error: kotlin.String? = null

) {


}

