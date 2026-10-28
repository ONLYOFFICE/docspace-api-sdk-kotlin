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
     * Start the authorization flow
     * Starts the OAuth2 authorization code flow for the client named by client_id. The caller has to present the portal signature cookie, and a request without a valid one is not refused with 401 or 403 but redirected to the portal login page, carrying the client ID so the flow can resume after signing in. When the user has not yet consented to the requested scopes the browser is redirected to the consent page; once the consent exists the browser is redirected to the client's redirect URI with the authorization code and, when one was sent, the original state. A caller that cannot follow redirects may send the X-Disable-Redirect header, and then the response is 200 with an empty body and the target URL in the X-Redirect-URI header. The code returned here is exchanged for tokens at the token endpoint.
     * Responses:
     *  - 302: Redirect to the login page, to the consent page, or back to the client's redirect URI with an authorization code
     *  - 200: Returned instead of the redirect when the request carries the X-Disable-Redirect header: the target URL is sent in the X-Redirect-URI response header and the body is empty
     *  - 400: Invalid request parameters
     *
     * REST API Reference for authorizeOAuth Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/authorize-oauth/
     *
     *
     * @param responseType The OAuth 2.0 response type. Only code is supported: this server issues an authorization code, never a token, from this endpoint.
     * @param clientId The identifier the client was given when it was registered. It selects both the client shown on the consent screen and the set of redirect URIs the request is checked against.
     * @param redirectUri Where to send the user once authorization is complete. It has to be one of the redirect URIs registered for the client, otherwise the request is refused.
     * @param scope The permissions being asked for, as a space-separated list. Every scope has to be one the client is registered for, and the consent screen lists exactly these.
     * @return [Unit]
     */
    @GET("oauth2/authorize")
    suspend fun authorizeOAuth(@Query("response_type") responseType: kotlin.String, @Query("client_id") clientId: kotlin.String, @Query("redirect_uri") redirectUri: kotlin.String, @Query("scope") scope: kotlin.String): Response<Unit>

    /**
     * POST oauth2/token
     * Exchange the authorization code
     * Exchanges an authorization code for an access token. The request is form-encoded and has to carry the grant type, the code, the same redirect URI that was used to obtain the code, and the client credentials: the client authenticates itself here rather than through the portal signature cookie the authorization endpoint uses. The response carries the access token, its type and its lifetime in seconds, plus a refresh token when the client is configured for the refresh token grant. Client authentication that fails is answered with 401, while a malformed, unknown or expired code is answered with 400. The code is single use, so replaying it fails.
     * Responses:
     *  - 200: Successfully exchanged authorization code for access token
     *  - 400: Invalid request parameters
     *  - 401: Client authentication failed: the client ID is unknown or the client secret does not match
     *
     * REST API Reference for exchangeToken Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/exchange-token/
     *
     *
     * @param grantType Which exchange is being performed: authorization_code to redeem a code, refresh_token to renew an access token. (optional)
     * @param code The authorization code returned by the authorization endpoint. It may be redeemed once. (optional)
     * @param redirectUri The same redirect URI that was used to obtain the code. The exchange fails when it differs. (optional)
     * @param clientId The identifier of the client redeeming the code. (optional)
     * @param clientSecret The secret of the client redeeming the code. It is omitted by a public client, which proves itself with a PKCE code verifier instead. (optional)
     * @return [ExchangeToken200Response]
     */
    @FormUrlEncoded
    @POST("oauth2/token")
    suspend fun exchangeToken(@Field("grant_type") grantType: kotlin.String? = null, @Field("code") code: kotlin.String? = null, @Field("redirect_uri") redirectUri: kotlin.String? = null, @Field("client_id") clientId: kotlin.String? = null, @Field("client_secret") clientSecret: kotlin.String? = null): Response<ExchangeToken200Response>

    /**
     * POST oauth2/authorize
     * Submit the consent decision
     * Submits the user's consent decision for the scopes an authorization request asked for. It is the form post the consent page makes, so it carries the client ID, the state and the agreed scopes as multipart form data, along with the same portal signature cookie the authorization request needed. On success the browser is redirected to the client's redirect URI with an authorization code, or, when the request carries the X-Disable-Redirect header, answered 200 with that URL in the X-Redirect-URI header. The consent is stored per user and client, so a later authorization request for the same scopes no longer stops at the consent page.
     * Responses:
     *  - 302: Redirect to the client's redirect URI with authorization code
     *  - 200: Returned instead of the redirect when the request carries the X-Disable-Redirect header: the target URL is sent in the X-Redirect-URI response header and the body is empty
     *  - 400: Invalid request parameters
     *
     * REST API Reference for submitConsent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/submit-consent/
     *
     *
     * @param clientId The client the consent is being given to. It has to be the same client the authorization request named. (optional)
     * @param state The opaque value carried through from the authorization request, returned unchanged on the redirect so the client can match the answer to its request. (optional)
     * @param scope The scopes the user agreed to, as a space-separated list. Anything the user declined is left out, so this may be narrower than what was requested. (optional)
     * @return [Unit]
     */
    @Multipart
    @POST("oauth2/authorize")
    suspend fun submitConsent(@Part("client_id") clientId: kotlin.String? = null, @Part("state") state: kotlin.String? = null, @Part("scope") scope: kotlin.String? = null): Response<Unit>

}
