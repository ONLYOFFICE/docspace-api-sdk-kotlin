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
import onlyoffice.docspace.api.sdk.models.SearchArea

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A personal collection of rooms: the name and icon it was given, the account that owns it, and the rooms it gathers  at the moment it was read.
 *
 * @param id The identifier of the group, which addresses it in every other group operation and is kept for as long as the  group exists.
 * @param name The name its owner gave the group, stored trimmed of surrounding spaces. Names are not unique, so two groups  of the same account can be told apart only by their identifier.
 * @param icon The built-in cover chosen for the group, carrying the cover identifier and its rendering in each available  size. Null when the group has no icon, either because it was never given one or because the icon was cleared  by setting it to an empty value.
 * @param userId The account that created the group and the only one able to read, change or delete it; for any other member of  the portal the group does not exist.
 * @param searchArea The section the group belongs to, which categorizes it within the application's structure. This property determines  which area of the interface the group is associated with and affects how its rooms are filtered and displayed.  Common values include Active for standard rooms, Forms for form-based rooms, Archive for archived content, and  Templates for template rooms. The search area ensures that when retrieving a group, only rooms that belong to  the specified section are included in the results, maintaining proper organizational boundaries within the system.
 * @param rooms The rooms the group gathers, those stored in the portal first and those on connected third-party accounts  after them. Null when the group was asked for without its members, and an empty array when the group holds no  room the caller can still see. A room moved to the archive is left out until it is taken out of the archive.
 * @param totalRooms How many rooms the group shows: the same rooms `rooms` lists, so archived ones are not counted either. It is  filled even when the rooms themselves were not asked for, which makes it the cheap way to tell an empty group  from a populated one.
 */


data class RoomGroupDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "icon")
    val icon: MultiSizeLogoCover? = null,

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "searchArea")
    val searchArea: SearchArea? = null,

    @Json(name = "rooms")
    val rooms: kotlin.collections.List<FileEntryBaseDto>? = null,

    @Json(name = "totalRooms")
    val totalRooms: kotlin.Int? = null

) {


}

