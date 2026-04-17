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

import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.SsoSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.SsoSettingsV2Wrapper

interface SSOApi {
    /**
     * GET api/2.0/settings/ssov2/default
     * Get the default SSO settings
     * Returns the default portal SSO settings.
     * Responses:
     *  - 200: Default SSO settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getDefaultSsoSettingsV2 Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-sso-settings-v2/
     *
     *
     * @return [SsoSettingsV2Wrapper]
     */
    @GET("api/2.0/settings/ssov2/default")
    suspend fun getDefaultSsoSettingsV2(): Response<SsoSettingsV2Wrapper>

    /**
     * GET api/2.0/settings/ssov2
     * Get the SSO settings
     * Returns the current portal SSO settings.
     * Responses:
     *  - 200: SSO settings
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSsoSettingsV2 Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2/
     *
     *
     * @return [SsoSettingsV2Wrapper]
     */
    @GET("api/2.0/settings/ssov2")
    suspend fun getSsoSettingsV2(): Response<SsoSettingsV2Wrapper>

    /**
     * GET api/2.0/settings/ssov2/constants
     * Get the SSO settings constants
     * Returns the SSO settings constants.
     * Responses:
     *  - 200: The SSO settings constants: SSO name ID format type, SSO binding type, SSO signing algorithm type, SSO SP certificate action type, SSO IDP certificate action type
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSsoSettingsV2Constants Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2-constants/
     *
     *
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/settings/ssov2/constants")
    suspend fun getSsoSettingsV2Constants(): Response<ObjectWrapper>

    /**
     * DELETE api/2.0/settings/ssov2
     * Reset the SSO settings
     * Resets the SSO settings of the current portal.
     * Responses:
     *  - 200: Default SSO settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for resetSsoSettingsV2 Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-sso-settings-v2/
     *
     *
     * @return [SsoSettingsV2Wrapper]
     */
    @DELETE("api/2.0/settings/ssov2")
    suspend fun resetSsoSettingsV2(): Response<SsoSettingsV2Wrapper>

    /**
     * POST api/2.0/settings/ssov2
     * Save the SSO settings
     * Saves the SSO settings for the current portal.
     * Responses:
     *  - 200: SSO settings
     *  - 400: Settings could not be null
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveSsoSettingsV2 Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-sso-settings-v2/
     *
     *
     * @param ssoSettingsRequestsDto  (optional)
     * @return [SsoSettingsV2Wrapper]
     */
    @POST("api/2.0/settings/ssov2")
    suspend fun saveSsoSettingsV2(@Body ssoSettingsRequestsDto: SsoSettingsRequestsDto? = null): Response<SsoSettingsV2Wrapper>

}
