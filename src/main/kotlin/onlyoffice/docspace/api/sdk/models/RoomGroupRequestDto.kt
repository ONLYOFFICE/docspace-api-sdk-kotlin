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

import onlyoffice.docspace.api.sdk.models.DuplicateRequestDtoAllOfFileIds

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for creating a room group
 *
 * @param name Group name
 * @param icon Group icon
 * @param rooms The list of room IDs.
 */


data class RoomGroupRequestDto (

    /* Group name */
    @Json(name = "name")
    val name: kotlin.String,

    /* Group icon */
    @Json(name = "icon")
    val icon: kotlin.String,

    /* The list of room IDs. */
    @Json(name = "rooms")
    val rooms: kotlin.collections.List<DuplicateRequestDtoAllOfFileIds>

) {


}

