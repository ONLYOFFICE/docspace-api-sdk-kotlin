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
 * The backup schedule of a portal.
 *
 * @param storageType The storage the scheduled archives are written to, reported as a number rather than as the name the  schedule was created with.
 * @param storageParams The settings of the storage, as an object keyed by parameter name - not as the array of key and value  pairs the schedule was created with, so it cannot be sent back unchanged. For every storage type  except `ThirdPartyConsumer` the `folderId` key is built from the stored base path.
 * @param cronParams When the backup runs, read back from the stored cron expression. `day` is 0 for a daily schedule,  because a daily one has no day.
 * @param lastBackupTime The date and time the schedule last ran at. It is `0001-01-01T00:00:00` until the schedule has run  for the first time.
 * @param dump Specifies whether this schedule backs up the whole server instead of one portal.
 * @param backupsStored The number of scheduled copies kept. It is null, not 0, when the schedule keeps an unlimited number.
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

