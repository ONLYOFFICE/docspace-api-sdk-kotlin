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
 * The rooms that are to go back to the default storage limit of the portal.
 *
 * @param roomIds The rooms to reset, named by the identifiers that `GET api/2.0/files/rooms` reports. Only whole numbers are  processed, so identifiers of rooms kept in a connected third-party account are skipped without an error.
 */


data class UpdateRoomsRoomIdsRequestDto (

    @Json(name = "roomIds")
    val roomIds: kotlin.collections.List<DuplicateRequestDtoAllOfFileIds>? = null

) {


}

