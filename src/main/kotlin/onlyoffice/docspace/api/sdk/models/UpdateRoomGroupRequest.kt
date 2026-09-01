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
 * The changes to apply to a room group: its name and the rooms to add or remove.
 *
 * @param roomsToAdd The list of room IDs to add to the group.
 * @param roomsToRemove The list of room IDs to remove from the group.
 * @param groupName The group name.
 */


data class UpdateRoomGroupRequest (

    @Json(name = "roomsToAdd")
    val roomsToAdd: kotlin.collections.List<DuplicateRequestDtoAllOfFileIds>? = null,

    @Json(name = "roomsToRemove")
    val roomsToRemove: kotlin.collections.List<DuplicateRequestDtoAllOfFileIds>? = null,

    @Json(name = "groupName")
    val groupName: kotlin.String? = null

) {


}

