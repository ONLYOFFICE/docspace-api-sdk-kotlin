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
import onlyoffice.docspace.api.sdk.models.ItemKeyValuePairObjectObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for restoring a portal from a backup.
 *
 * @param backupId The ID of the backup to restore from, as listed by `GET api/2.0/backup/getbackuphistory`. Send  anything that is not a GUID to restore from a file given by `storageParams` instead; an all-zero GUID  selects neither, because it parses as a GUID and then matches no record.
 * @param storageType The storage the archive is read from. It defaults to `Documents` and is only used when `backupId` is  not a GUID, because a known backup carries the storage of its own record.
 * @param storageParams The location of the archive, as an array of key and value pairs. The key read here is `filePath` -  not the `folderId` a backup is started with - and it holds a file ID for `Documents`, a  provider-specific file ID for `ThridpartyDocuments` and a path on the server for `Local`. It is only  used when `backupId` is not a GUID.
 * @param notify Chooses who is emailed when the restoring starts and when it finishes: every active user of the  portal when true, and its owner alone when false. Mail goes only to accounts that have been  activated, so this decides the audience rather than whether anybody is notified at all.
 * @param dump Restores the whole server rather than this one portal. It requires the space access permission.
 */


data class BackupRestoreDto (

    @Json(name = "backupId")
    val backupId: kotlin.String?,

    @Json(name = "storageType")
    val storageType: BackupStorageType? = null,

    @Json(name = "storageParams")
    val storageParams: kotlin.collections.List<ItemKeyValuePairObjectObject>? = null,

    @Json(name = "notify")
    val notify: kotlin.Boolean? = null,

    @Json(name = "dump")
    val dump: kotlin.Boolean? = null

) {


}

