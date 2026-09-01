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


package onlyoffice.docspace.api.sdk.apis.People

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.EmailMemberRequestDto
import onlyoffice.docspace.api.sdk.models.EmployeeFullWrapper
import onlyoffice.docspace.api.sdk.models.UpdateMembersRequestDto

interface GuestsApi {
    /**
     * POST api/2.0/people/guests/share/approve
     * Approve a guest sharing link
     * Approves a guest sharing link and returns the detailed information about a guest.
     * Responses:
     *  - 200: Detailed profile information
     *  - 404: User not found
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for approveGuestShareLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/approve-guest-share-link/
     *
     *
     * @param emailMemberRequestDto  (optional)
     * @return [EmployeeFullWrapper]
     */
    @POST("api/2.0/people/guests/share/approve")
    suspend fun approveGuestShareLink(@Body emailMemberRequestDto: EmailMemberRequestDto? = null): Response<EmployeeFullWrapper>

    /**
     * DELETE api/2.0/people/guests
     * Delete guests
     * Deletes guests from the list and excludes them from rooms to which they were invited.
     * Responses:
     *  - 200: Request parameters for deleting guests
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteGuests Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-guests/
     *
     *
     * @param updateMembersRequestDto  (optional)
     * @return [Unit]
     */
    @HTTP(method = "DELETE", path = "api/2.0/people/guests", hasBody = true)
    suspend fun deleteGuests(@Body updateMembersRequestDto: UpdateMembersRequestDto? = null): Response<Unit>

}
