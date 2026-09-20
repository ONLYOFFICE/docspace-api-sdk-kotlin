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
 * The name, the icon and the rooms of a room group to create.
 *
 * @param name The name to show the group under. Surrounding spaces are trimmed before it is stored, a name that is blank  once trimmed is refused, and the name does not have to differ from the names of the caller's other groups.
 * @param icon The icon of the group, given as the identifier of one of the built-in covers listed by  `GET api/2.0/files/rooms/covers`. An uploaded image cannot be used, and any value that is not one of those  identifiers is refused.
 * @param rooms The rooms to gather in the group, each given as a number for a room stored in the portal or as a string for a  room on a connected third-party account. Every identifier has to name a room the caller can read; repeats are  collapsed, and an element of any other shape - a decimal number, a number sent as a string, null - is refused.
 */


data class RoomGroupRequestDto (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "icon")
    val icon: kotlin.String,

    @Json(name = "rooms")
    val rooms: kotlin.collections.List<DuplicateRequestDtoAllOfFileIds>

) {


}

