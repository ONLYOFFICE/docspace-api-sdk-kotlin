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

import onlyoffice.docspace.api.sdk.models.AuthKey

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The storage information.
 *
 * @param id The storage ID.
 * @param title The storage title.
 * @param current Specifies if this is the current portal storage or not.
 * @param isSet Specifies if this storage can be set or not.
 * @param properties The list of storage authentication keys.
 */


data class StorageDto (

    /* The storage ID. */
    @Json(name = "id")
    val id: kotlin.String?,

    /* The storage title. */
    @Json(name = "title")
    val title: kotlin.String?,

    /* Specifies if this is the current portal storage or not. */
    @Json(name = "current")
    val current: kotlin.Boolean,

    /* Specifies if this storage can be set or not. */
    @Json(name = "isSet")
    val isSet: kotlin.Boolean,

    /* The list of storage authentication keys. */
    @Json(name = "properties")
    val properties: kotlin.collections.List<AuthKey>? = null

) {


}

