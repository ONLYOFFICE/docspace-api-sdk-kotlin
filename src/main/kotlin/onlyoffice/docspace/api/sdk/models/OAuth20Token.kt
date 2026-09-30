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

package onlyoffice.docspace.api.sdk.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The OAuth 2.0 token issued by a third-party provider.
 *
 * @param accessToken The token sent to the provider with every request made on behalf of the account.
 * @param refreshToken The token used to obtain a new access token when the current one expires. A provider that issues no refresh  token leaves it empty, and the account then has to be connected again to keep working.
 * @param expiresIn How long the access token stays usable, in seconds counted from `timestamp`. Zero means the provider did not  say, and the token is then treated as expired.
 * @param clientId The OAuth 2.0 client ID of the application the token was issued to.
 * @param clientSecret The client secret of the application the token was issued to, needed when the token is refreshed.
 * @param redirectUri The redirect URL the authorization code behind this token was obtained with; providers require the same value  again when the token is refreshed.
 * @param timestamp When the token was issued, in UTC. This is the point `expires_in` is counted from.
 * @param isExpired Whether the access token can no longer be used and has to be refreshed. It is also true when the provider did  not say how long the token lives.
 */


data class OAuth20Token (

    @Json(name = "access_token")
    val accessToken: kotlin.String? = null,

    @Json(name = "refresh_token")
    val refreshToken: kotlin.String? = null,

    @Json(name = "expires_in")
    val expiresIn: kotlin.Long? = null,

    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    @Json(name = "client_secret")
    val clientSecret: kotlin.String? = null,

    @Json(name = "redirect_uri")
    val redirectUri: java.net.URI? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    @Json(name = "isExpired")
    val isExpired: kotlin.Boolean? = null

) {


}

