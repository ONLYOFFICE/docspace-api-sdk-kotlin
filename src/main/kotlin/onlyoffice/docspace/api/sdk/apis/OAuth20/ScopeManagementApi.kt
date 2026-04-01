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


package onlyoffice.docspace.api.sdk.apis.OAuth20

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ProblemDetail
import onlyoffice.docspace.api.sdk.models.ScopeResponse

interface ScopeManagementApi {
    /**
     * GET api/2.0/scopes
     * List available OAuth2 scopes
     * Retrieves a list of all available OAuth2 scopes for the specified tenant. The scopes define the permissions that can be requested by OAuth2 clients. The list is ordered alphabetically, with the 'openid' scope always appearing first.
     * Responses:
     *  - 200: Scopes successfully retrieved
     *  - 400: Invalid request parameters
     *  - 403: Insufficient permissions to list scopes
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for getScopes Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-scopes/
     *
     *
     * @return [ScopeResponse]
     */
    @GET("api/2.0/scopes")
    suspend fun getScopes(): Response<ScopeResponse>

}
