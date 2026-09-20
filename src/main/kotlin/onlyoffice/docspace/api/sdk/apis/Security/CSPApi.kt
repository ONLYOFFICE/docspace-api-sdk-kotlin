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
     * Replaces the list of external domains the portal's Content Security Policy trusts and returns the policy  header the portal serves to browsers from that moment on. The list in `domains` replaces the stored one, so an  omitted or empty list falls back to the portal's built-in policy, and every entry that is sent becomes an  allowed source for scripts, styles, images, fonts, frames, media and connections at once. An entry may be a  host, a host with a scheme, or a wildcard host such as `*.example.com`; it has to form a valid absolute  address and may contain ASCII characters only, and an entry that does not is refused with 400 before anything  is saved. The caller needs the portal-settings right of a DocSpace administrator, and the request is also  refused with 403 when the header built from the list grows past the size configured for the installation, 15  KB by default. The change applies to the whole portal at once and is idempotent. Read the current state with  `GET api/2.0/security/csp`.
     * Responses:
     *  - 200: The stored domains and the policy header the portal now serves
     *  - 400: An entry of `domains` is not a valid address or holds non-ASCII characters
     *  - 403: The caller does not have the portal-settings right of a DocSpace administrator, or the built policy header exceeds the size allowed for the installation
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
     * Returns the Content Security Policy this portal serves: `domains`, the external hosts an administrator has  allowed, and `header`, the whole policy value built from them together with the portal's own defaults and the  integrations it has switched on. The operation is anonymous and reachable cross-origin - no token is needed -  because the login and editor front-ends read it before anyone has signed in. It is read-only for the caller,  but it does repair the portal's cached policy when the cache has lost it, so a call can rebuild the header  instead of only reading it. The answer honours `If-Modified-Since`: send back the `Last-Modified` value of an  earlier answer and an unchanged policy comes back as an empty not-modified response rather than a body.  `domains` is an empty list on a portal nobody has configured, while `header` is filled from the defaults even  then. Change the allowed domains with `POST api/2.0/security/csp`, which does need a DocSpace administrator.
     * Responses:
     *  - 200: The allowed domains and the full policy header the portal serves
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
