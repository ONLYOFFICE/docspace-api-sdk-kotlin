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
import onlyoffice.docspace.api.sdk.models.FolderIntegerArrayWrapper
import onlyoffice.docspace.api.sdk.models.UpdateRoomsQuotaRequestDtoInteger
import onlyoffice.docspace.api.sdk.models.UpdateRoomsRoomIdsRequestDtoInteger

interface QuotaApi {
    /**
     * PUT api/2.0/files/rooms/resetquota
     * Reset the room quota limit
     * Resets the quota limit for the rooms with the IDs specified in the request.
     * Responses:
     *  - 200: List of rooms with the detailed information
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
     * @param updateRoomsRoomIdsRequestDtoInteger  (optional)
     * @return [FolderIntegerArrayWrapper]
     */
    @PUT("api/2.0/files/rooms/resetquota")
    suspend fun resetRoomQuota(@Body updateRoomsRoomIdsRequestDtoInteger: UpdateRoomsRoomIdsRequestDtoInteger? = null): Response<FolderIntegerArrayWrapper>

    /**
     * PUT api/2.0/files/rooms/roomquota
     * Change the room quota limit
     * Changes the quota limit for the rooms with the IDs specified in the request.
     * Responses:
     *  - 200: List of rooms with the detailed information
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
     * @param updateRoomsQuotaRequestDtoInteger  (optional)
     * @return [FolderIntegerArrayWrapper]
     */
    @PUT("api/2.0/files/rooms/roomquota")
    suspend fun updateRoomsQuota(@Body updateRoomsQuotaRequestDtoInteger: UpdateRoomsQuotaRequestDtoInteger? = null): Response<FolderIntegerArrayWrapper>

}
