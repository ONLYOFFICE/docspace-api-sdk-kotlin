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
 * One entry to move to a given position inside its folder.
 *
 * @param entryId The file or folder to move.
 * @param entryType Which of the two the identifier names, because a file and a folder may carry the same number.
 * @param order The position the entry is to take, counting from 1. The entry that held it, and everything after it, is  shifted to make room. A dotted path such as 1.2.3 is accepted as well, of which only the last segment is  read.
 */


data class OrdersItemRequestDto (

    @Json(name = "entryId")
    val entryId: kotlin.Int,

    @Json(name = "entryType")
    val entryType: FileEntryType,

    @Json(name = "order")
    val order: kotlin.Int

) {


}

