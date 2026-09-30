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
import onlyoffice.docspace.api.sdk.models.Cron
import onlyoffice.docspace.api.sdk.models.ItemKeyValuePairObjectObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for setting the backup schedule.
 *
 * @param storageType The storage the scheduled archives are written to. It defaults to `Documents`, and it decides which  keys `storageParams` has to carry.
 * @param storageParams The settings of the chosen storage, as an array of key and value pairs. `Documents` and  `ThridpartyDocuments` need `folderId`, `Local` needs `filePath`, `ThirdPartyConsumer` needs `module`  plus the settings of that consumer, and `DataStore` needs none.
 * @param backupsStored The number of scheduled copies to keep, from 1 to 30. It defaults to 1, and only the copies this  schedule creates are counted and removed - archives started by hand are left alone.
 * @param cronParams When the backup runs. It is required: a request without it fails rather than falling back to a  default.
 * @param dump Schedules a backup of the whole server rather than of this one portal. It requires the space access  permission and works on a standalone installation only.
 */


data class BackupScheduleDto (

    @Json(name = "storageType")
    val storageType: BackupStorageType? = null,

    @Json(name = "storageParams")
    val storageParams: kotlin.collections.List<ItemKeyValuePairObjectObject>? = null,

    @Json(name = "backupsStored")
    val backupsStored: kotlin.Int? = null,

    @Json(name = "cronParams")
    val cronParams: Cron? = null,

    @Json(name = "dump")
    val dump: kotlin.Boolean? = null

) {


}

