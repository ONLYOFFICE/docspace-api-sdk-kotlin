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


package onlyoffice.docspace.api.sdk.apis.Files

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.FolderArrayWrapper
import onlyoffice.docspace.api.sdk.models.UpdateRoomsQuotaRequestDto
import onlyoffice.docspace.api.sdk.models.UpdateRoomsRoomIdsRequestDto

interface QuotaApi {
    /**
     * PUT api/2.0/files/rooms/resetquota
     * Reset the room quota limit
     * Returns every listed room to the default room quota of the portal and streams the updated rooms back in the  order they were given. This is not the same as removing the limit: the room stops carrying its own value and  starts following the portal default, which a portal administrator can change at any time. The per-room quota  feature has to be on, the caller must be a manager of each listed room, and an archived room or a room in the  trash is refused. The list is not transactional, so rooms processed before a failing one keep the default and  the rest keep what they had. Only numeric room ids are processed, which means ids of rooms stored in a  connected third-party account are silently skipped. Use `PUT api/2.0/files/rooms/roomquota` to set an explicit  value, and a quota of -1 in `PUT api/2.0/files/rooms/{id}` to leave the room with no custom limit at all.
     * Responses:
     *  - 200: The rooms as they are after the default limit was restored
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for resetRoomQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-room-quota/
     *
     *
     * @param updateRoomsRoomIdsRequestDto  (optional)
     * @return [FolderArrayWrapper]
     */
    @PUT("api/2.0/files/rooms/resetquota")
    suspend fun resetRoomQuota(@Body updateRoomsRoomIdsRequestDto: UpdateRoomsRoomIdsRequestDto? = null): Response<FolderArrayWrapper>

    /**
     * PUT api/2.0/files/rooms/roomquota
     * Change the room quota limit
     * Sets the same custom storage limit, in bytes, on every listed room and streams the updated rooms back in the  order they were given. The per-room quota feature has to be on for the portal, and the value must stay within  the portal own limit, otherwise the call is refused before anything is written. The caller must be a manager  of each listed room, and an archived room or a room in the trash is refused. The list is not transactional:  rooms processed before the offending one keep their new limit, so a failed call has to be checked room by  room. Only numeric room ids are processed, which means ids of rooms stored in a connected third-party account  are silently skipped. A room whose limit already equals the requested value is left untouched and still  returned. To go back to the portal default use `PUT api/2.0/files/rooms/resetquota`, and to drop the custom  limit entirely send a quota of -1 to `PUT api/2.0/files/rooms/{id}`.
     * Responses:
     *  - 200: The rooms as they are after the new limit was applied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateRoomsQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-rooms-quota/
     *
     *
     * @param updateRoomsQuotaRequestDto  (optional)
     * @return [FolderArrayWrapper]
     */
    @PUT("api/2.0/files/rooms/roomquota")
    suspend fun updateRoomsQuota(@Body updateRoomsQuotaRequestDto: UpdateRoomsQuotaRequestDto? = null): Response<FolderArrayWrapper>

}
