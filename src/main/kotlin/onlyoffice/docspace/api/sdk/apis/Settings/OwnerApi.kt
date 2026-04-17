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


package onlyoffice.docspace.api.sdk.apis.Settings

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.OwnerChangeInstructionsWrapper
import onlyoffice.docspace.api.sdk.models.OwnerIdSettingsRequestDto

interface OwnerApi {
    /**
     * POST api/2.0/settings/owner
     * Send the owner change instructions
     * Sends the instructions to change the DocSpace owner.
     * Responses:
     *  - 200: Message about changing the portal owner
     *  - 400: Owner's email is not activated
     *  - 403: Collaborator can not be an owner
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for sendOwnerChangeInstructions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-owner-change-instructions/
     *
     *
     * @param ownerIdSettingsRequestDto  (optional)
     * @return [OwnerChangeInstructionsWrapper]
     */
    @POST("api/2.0/settings/owner")
    suspend fun sendOwnerChangeInstructions(@Body ownerIdSettingsRequestDto: OwnerIdSettingsRequestDto? = null): Response<OwnerChangeInstructionsWrapper>

    /**
     * PUT api/2.0/settings/owner
     * Update the portal owner
     * Updates the current portal owner with a new one specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 400: The user could not be found
     *  - 409: 
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updatePortalOwner Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-portal-owner/
     *
     *
     * @param ownerIdSettingsRequestDto  (optional)
     * @return [Unit]
     */
    @PUT("api/2.0/settings/owner")
    suspend fun updatePortalOwner(@Body ownerIdSettingsRequestDto: OwnerIdSettingsRequestDto? = null): Response<Unit>

}
