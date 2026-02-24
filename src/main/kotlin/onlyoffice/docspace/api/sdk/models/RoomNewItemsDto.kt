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

import onlyoffice.docspace.api.sdk.models.FileEntryBaseDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The room new items information.
 *
 * @param room 
 * @param items The list of file entry items.
 */


data class RoomNewItemsDto (

    @Json(name = "room")
    val room: FileEntryBaseDto? = null,

    /* The list of file entry items. */
    @Json(name = "items")
    val items: kotlin.collections.List<FileEntryBaseDto>? = null

) {


}

