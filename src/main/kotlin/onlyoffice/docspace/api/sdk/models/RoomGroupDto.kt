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
import onlyoffice.docspace.api.sdk.models.MultiSizeLogoCover

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The room security parameters.
 *
 * @param id The group ID.
 * @param name Group name
 * @param icon 
 * @param userId The user ID.
 * @param rooms The list of rooms in the group.
 * @param totalRooms Total number of rooms in the group.
 */


data class RoomGroupDto (

    /* The group ID. */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* Group name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "icon")
    val icon: MultiSizeLogoCover? = null,

    /* The user ID. */
    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    /* The list of rooms in the group. */
    @Json(name = "rooms")
    val rooms: kotlin.collections.List<FileEntryBaseDto>? = null,

    /* Total number of rooms in the group. */
    @Json(name = "totalRooms")
    val totalRooms: kotlin.Int? = null

) {


}

