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

import onlyoffice.docspace.api.sdk.models.FileEntryType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An item in the ordering request with its entry type and ID.
 *
 * @param entryId The entry unique identifier (file or folder).
 * @param entryType The entry type (file or folder).
 * @param order The order value.
 */


data class OrdersItemRequestDtoInteger (

    @Json(name = "entryId")
    val entryId: kotlin.Int,

    @Json(name = "entryType")
    val entryType: FileEntryType,

    @Json(name = "order")
    val order: kotlin.Int

) {


}

