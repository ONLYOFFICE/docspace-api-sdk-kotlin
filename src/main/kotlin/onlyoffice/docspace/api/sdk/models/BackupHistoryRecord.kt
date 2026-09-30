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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One stored backup of a portal.
 *
 * @param id The ID of the backup, which is the same value as the `taskId` the backup was started with. Pass it to  `DELETE api/2.0/backup/deletebackup/{id}` or as the `backupId` of  `POST api/2.0/backup/startrestore`.
 * @param fileName The name of the stored archive. It is built from the portal alias and the moment the backup started,  or from `workspace` instead of the alias for a backup of the whole server.
 * @param storageType The storage the archive was written to, reported as a number rather than as a name.
 * @param createdOn The date and time the backup was stored at, in UTC.
 * @param expiresOn The date and time a background cleaner removes this backup at. Only a backup written to `DataStore`  expires, one day after it was stored; for every other storage type this is `0001-01-01T00:00:00`,  which means the backup is kept until it is deleted by hand or pushed out by the stored-copies limit  of a schedule.
 */


data class BackupHistoryRecord (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "fileName")
    val fileName: kotlin.String?,

    @Json(name = "storageType")
    val storageType: BackupStorageType,

    @Json(name = "createdOn")
    val createdOn: java.time.OffsetDateTime,

    @Json(name = "expiresOn")
    val expiresOn: java.time.OffsetDateTime

) {


}

