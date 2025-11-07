 /*
 * (c) Copyright Ascensio System SIA 2025
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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param isCompleted 
 * @param progress 
 * @param error 
 * @param warning 
 * @param link 
 * @param tenantId 
 * @param backupProgressEnum 
 * @param taskId 
 */


data class BackupProgress (

    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean? = null,

    @Json(name = "progress")
    val progress: kotlin.Int? = null,

    @Json(name = "error")
    val error: kotlin.String? = null,

    @Json(name = "warning")
    val warning: kotlin.String? = null,

    @Json(name = "link")
    val link: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    @Json(name = "backupProgressEnum")
    val backupProgressEnum: BackupProgressEnum? = null,

    @Json(name = "taskId")
    val taskId: kotlin.String? = null

) {


}

