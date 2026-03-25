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

import onlyoffice.docspace.api.sdk.models.BackupProgressEnum
import onlyoffice.docspace.api.sdk.models.DistributedTaskStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The backup progress parameters.
 *
 * @param isCompleted Specifies if the backup is completed or not.
 * @param progress The backup progress in percentage.
 * @param error The backup error message.
 * @param warning The backup warning message.
 * @param link The backup link.
 * @param tenantId The tenant ID.
 * @param backupProgressEnum 
 * @param status 
 * @param taskId The task ID.
 */


data class BackupProgress (

    /* Specifies if the backup is completed or not. */
    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean? = null,

    /* The backup progress in percentage. */
    @Json(name = "progress")
    val progress: kotlin.Int? = null,

    /* The backup error message. */
    @Json(name = "error")
    val error: kotlin.String? = null,

    /* The backup warning message. */
    @Json(name = "warning")
    val warning: kotlin.String? = null,

    /* The backup link. */
    @Json(name = "link")
    val link: kotlin.String? = null,

    /* The tenant ID. */
    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    @Json(name = "backupProgressEnum")
    val backupProgressEnum: BackupProgressEnum? = null,

    @Json(name = "status")
    val status: DistributedTaskStatus? = null,

    /* The task ID. */
    @Json(name = "taskId")
    val taskId: kotlin.String? = null

) {


}

