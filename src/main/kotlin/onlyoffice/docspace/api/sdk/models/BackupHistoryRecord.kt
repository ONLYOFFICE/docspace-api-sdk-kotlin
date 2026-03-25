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
 * The backup history parameters.
 *
 * @param id The backup ID.
 * @param fileName The backup file name.
 * @param storageType 
 * @param createdOn The backup creation date.
 * @param expiresOn The backup expiration date.
 */


data class BackupHistoryRecord (

    /* The backup ID. */
    @Json(name = "id")
    val id: java.util.UUID,

    /* The backup file name. */
    @Json(name = "fileName")
    val fileName: kotlin.String?,

    @Json(name = "storageType")
    val storageType: BackupStorageType,

    /* The backup creation date. */
    @Json(name = "createdOn")
    val createdOn: java.time.OffsetDateTime,

    /* The backup expiration date. */
    @Json(name = "expiresOn")
    val expiresOn: java.time.OffsetDateTime

) {


}

