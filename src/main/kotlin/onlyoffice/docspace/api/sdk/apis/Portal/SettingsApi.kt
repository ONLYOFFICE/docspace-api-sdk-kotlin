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


package onlyoffice.docspace.api.sdk.apis.Portal

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TenantWrapper

interface SettingsApi {
    /**
     * PUT api/2.0/portal/continue
     * Restore a portal
     * Restores the current portal.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for continuePortal Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/continue-portal/
     *
     *
     * @return [Unit]
     */
    @PUT("api/2.0/portal/continue")
    suspend fun continuePortal(): Response<Unit>

    /**
     * DELETE api/2.0/portal/delete
     * Delete a portal
     * Deletes the current portal.
     * Responses:
     *  - 200: URL to the feedback form about removing a portal
     *  - 401: Unauthorized
     *
     * REST API Reference for deletePortal Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-portal/
     *
     *
     * @return [StringWrapper]
     */
    @DELETE("api/2.0/portal/delete")
    suspend fun deletePortal(): Response<StringWrapper>

    /**
     * GET api/2.0/portal
     * Get a portal
     * Returns the current portal information.
     * Responses:
     *  - 200: Current portal information
     *  - 401: Unauthorized
     *
     * REST API Reference for getPortalInformation Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-information/
     *
     *
     * @return [TenantWrapper]
     */
    @GET("api/2.0/portal")
    suspend fun getPortalInformation(): Response<TenantWrapper>

    /**
     * GET api/2.0/portal/path
     * Get a path to the portal
     * Returns the full absolute path to the current portal.
     * Responses:
     *  - 200: Portal path
     *  - 401: Unauthorized
     *
     * REST API Reference for getPortalPath Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-path/
     *
     *
     * @param virtualPath The virtual path for the portal resource access. (optional)
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/portal/path")
    suspend fun getPortalPath(@Query("virtualPath") virtualPath: kotlin.String? = null): Response<ObjectWrapper>

    /**
     * POST api/2.0/portal/delete
     * Send removal instructions
     * Sends the instructions to remove the current portal.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for sendDeleteInstructions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-delete-instructions/
     *
     *
     * @return [Unit]
     */
    @POST("api/2.0/portal/delete")
    suspend fun sendDeleteInstructions(): Response<Unit>

    /**
     * POST api/2.0/portal/suspend
     * Send suspension instructions
     * Sends the instructions to suspend the current portal.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for sendSuspendInstructions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-suspend-instructions/
     *
     *
     * @return [Unit]
     */
    @POST("api/2.0/portal/suspend")
    suspend fun sendSuspendInstructions(): Response<Unit>

    /**
     * PUT api/2.0/portal/suspend
     * Deactivate a portal
     * Deactivates the current portal.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for suspendPortal Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/suspend-portal/
     *
     *
     * @return [Unit]
     */
    @PUT("api/2.0/portal/suspend")
    suspend fun suspendPortal(): Response<Unit>

}
