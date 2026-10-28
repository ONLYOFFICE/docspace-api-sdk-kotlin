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


interface DiscoveryApi {
    /**
     * OPTIONS .well-known/oauth-authorization-server
     * Probe the discovery endpoint
     * Answers the CORS preflight for the OAuth 2.0 Authorization Server metadata endpoint. The endpoint needs no authentication and reads nothing from the request: it always answers 200 with an empty body, and the CORS headers are added by the surrounding filter chain rather than by this handler. It changes no state, and it does not return the authorization server metadata document - issue a GET against the same path for that.
     * Responses:
     *  - 200: Preflight accepted; the response carries no body
     *
     * REST API Reference for handleOptions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/handle-options/
     *
     *
     * @return [Unit]
     */
    @OPTIONS(".well-known/oauth-authorization-server")
    suspend fun handleOptions(): Response<Unit>

}
