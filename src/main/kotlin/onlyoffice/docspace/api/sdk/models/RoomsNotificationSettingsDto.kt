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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The rooms the calling user has silenced.
 *
 * @param disabledRooms The identifiers of the silenced rooms, in the order they were added, and belonging to the caller's own  account alone. They are kept as opaque values, so a numeric identifier of a portal room and a string  identifier of a room on a connected third-party account both appear here, and an identifier stays on the  list after its room is deleted. An empty list means nothing is silenced.
 */


data class RoomsNotificationSettingsDto (

    @Json(name = "disabledRooms")
    val disabledRooms: kotlin.collections.List<kotlin.Any>? = null

) {


}

