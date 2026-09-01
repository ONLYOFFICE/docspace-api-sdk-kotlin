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


package onlyoffice.docspace.api.sdk.apis.Security

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.CspRequestsDto
import onlyoffice.docspace.api.sdk.models.CspWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse

interface CSPApi {
    /**
     * POST api/2.0/security/csp
     * Configure CSP settings
     * Configures the CSP (Content Security Policy) settings for the current portal.
     * Responses:
     *  - 200: Ok
     *  - 400: Exception in Domains
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for configureCsp Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/configure-csp/
     *
     *
     * @param cspRequestsDto  (optional)
     * @return [CspWrapper]
     */
    @POST("api/2.0/security/csp")
    suspend fun configureCsp(@Body cspRequestsDto: CspRequestsDto? = null): Response<CspWrapper>

    /**
     * GET api/2.0/security/csp
     * Get CSP settings
     * Returns the CSP (Content Security Policy) settings for the current portal.
     * Responses:
     *  - 200: Ok
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCspSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-csp-settings/
     *
     *
     * @return [CspWrapper]
     */
    @GET("api/2.0/security/csp")
    suspend fun getCspSettings(): Response<CspWrapper>

}
