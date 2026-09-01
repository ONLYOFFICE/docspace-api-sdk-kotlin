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

import onlyoffice.docspace.api.sdk.models.BackupStorageType
import onlyoffice.docspace.api.sdk.models.CronParams

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The backup schedule parameters.
 *
 * @param storageType The backup storage type.
 * @param storageParams The backup storage parameters.
 * @param cronParams The backup cron parameters.
 * @param lastBackupTime The date and time when the last backup was reated.
 * @param dump Specifies if a dump will be created or not.
 * @param backupsStored The maximum number of the stored backup copies.
 */


data class ScheduleDto (

    @Json(name = "storageType")
    val storageType: BackupStorageType,

    @Json(name = "storageParams")
    val storageParams: kotlin.collections.Map<kotlin.String, kotlin.String?>,

    @Json(name = "cronParams")
    val cronParams: CronParams,

    @Json(name = "lastBackupTime")
    val lastBackupTime: java.time.OffsetDateTime,

    @Json(name = "dump")
    val dump: kotlin.Boolean,

    @Json(name = "backupsStored")
    val backupsStored: kotlin.Int? = null

) {


}

