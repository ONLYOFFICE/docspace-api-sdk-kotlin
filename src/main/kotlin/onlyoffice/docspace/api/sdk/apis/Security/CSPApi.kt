 /*
 * (c) Copyright Ascensio System SIA 2025
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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.CspRequestsDto
import onlyoffice.docspace.api.sdk.models.CspWrapper

interface CSPApi {
    /**
     * POST api/2.0/security/csp
     * Configure CSP settings
     * Configures the CSP (Content Security Policy) settings for the current portal.
     * Responses:
     *  - 200: Ok
     *  - 400: Exception in Domains
     *  - 401: Unauthorized
     *
     * REST API Reference for configureCsp Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/configure-csp/
     *
     *
     * @param cspRequestsDto  (optional)
     * @return [Call]<[CspWrapper]>
     */
    @POST("api/2.0/security/csp")
    fun configureCsp(@Body cspRequestsDto: CspRequestsDto? = null): Call<CspWrapper>

    /**
     * GET api/2.0/security/csp
     * Get CSP settings
     * Returns the CSP (Content Security Policy) settings for the current portal.
     * Responses:
     *  - 200: Ok
     *
     * REST API Reference for getCspSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-csp-settings/
     *
     *
     * @return [Call]<[CspWrapper]>
     */
    @GET("api/2.0/security/csp")
    fun getCspSettings(): Call<CspWrapper>

}
