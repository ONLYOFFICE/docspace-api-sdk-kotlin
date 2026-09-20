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
 * The request parameters for starting a backup.
 *
 * @param storageType The storage the archive is written to. It defaults to `Documents`, and it decides which keys  `storageParams` has to carry.
 * @param storageParams The settings of the chosen storage, as an array of key and value pairs. `Documents` needs an integer  `folderId`, `ThridpartyDocuments` a provider-specific non-integer `folderId`, `Local` a `filePath`,  `ThirdPartyConsumer` a `module` plus the settings of that consumer, and `DataStore` none. The  `subdir` key is added by the operation itself and must not be sent.
 * @param dump Backs up the whole server rather than this one portal. It requires the space access permission and  works on a standalone installation only.
 */


data class BackupDto (

    @Json(name = "storageType")
    val storageType: BackupStorageType? = null,

    @Json(name = "storageParams")
    val storageParams: kotlin.collections.List<ItemKeyValuePairObjectObject>? = null,

    @Json(name = "dump")
    val dump: kotlin.Boolean? = null

) {


}

