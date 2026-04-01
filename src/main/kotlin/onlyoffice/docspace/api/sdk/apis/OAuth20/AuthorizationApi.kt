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

import onlyoffice.docspace.api.sdk.models.ExchangeToken200Response

interface AuthorizationApi {
    /**
     * GET oauth2/authorize
     * OAuth2 Authorization Endpoint
     * Initiates the OAuth2 authorization flow.
     * Responses:
     *  - 200: Authorization page
     *  - 400: Invalid request parameters
     *
     * REST API Reference for authorizeOAuth Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authorize-oauth/
     *
     *
     * @param responseType The OAuth 2.0 response type, must be 'code' for authorization code flow.
     * @param clientId The client identifier issued to the client during registration.
     * @param redirectUri The URL to redirect to after authorization is complete.
     * @param scope The space-separated list of requested scope permissions.
     * @return [Unit]
     */
    @GET("oauth2/authorize")
    suspend fun authorizeOAuth(@Query("response_type") responseType: kotlin.String, @Query("client_id") clientId: kotlin.String, @Query("redirect_uri") redirectUri: kotlin.String, @Query("scope") scope: kotlin.String): Response<Unit>

    /**
     * POST oauth2/token
     * OAuth2 Token Endpoint
     * Exchange authorization code for access token
     * Responses:
     *  - 200: Successfully exchanged authorization code for access token
     *  - 400: Invalid request parameters
     *
     * REST API Reference for exchangeToken Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/exchange-token/
     *
     *
     * @param grantType The OAuth2 grant type, must be 'authorization_code' for the authorization code flow. (optional)
     * @param code A temporary authorization code that is sent to the client to be exchanged for a token. (optional)
     * @param redirectUri The URL where the user will be redirected after successful or unsuccessful authentication. (optional)
     * @param clientId The client identifier issued to the client during registration. (optional)
     * @param clientSecret The client secret issued to the client during registration. (optional)
     * @return [ExchangeToken200Response]
     */
    @FormUrlEncoded
    @POST("oauth2/token")
    suspend fun exchangeToken(@Field("grant_type") grantType: kotlin.String? = null, @Field("code") code: kotlin.String? = null, @Field("redirect_uri") redirectUri: kotlin.String? = null, @Field("client_id") clientId: kotlin.String? = null, @Field("client_secret") clientSecret: kotlin.String? = null): Response<ExchangeToken200Response>

    /**
     * POST oauth2/authorize
     * OAuth2 consent endpoint
     * Sends consent approval
     * Responses:
     *  - 302: Redirect to the client's redirect URI with authorization code
     *  - 400: Invalid request parameters
     *
     * REST API Reference for submitConsent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/submit-consent/
     *
     *
     * @param clientId The client identifier issued to the client during registration. (optional)
     * @param state The random string used to solve the CSRF vulnerability problem. (optional)
     * @param scope The space-separated list of requested scope permissions. (optional)
     * @return [Unit]
     */
    @Multipart
    @POST("oauth2/authorize")
    suspend fun submitConsent(@Part("client_id") clientId: kotlin.String? = null, @Part("state") state: kotlin.String? = null, @Part("scope") scope: kotlin.String? = null): Response<Unit>

}
