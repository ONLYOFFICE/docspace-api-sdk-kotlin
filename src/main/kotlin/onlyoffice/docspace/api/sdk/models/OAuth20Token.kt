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
 * @param accessToken Access token
 * @param refreshToken Refresh token
 * @param expiresIn Expires in
 * @param clientId Client id
 * @param clientSecret Client secret
 * @param redirectUri Redirect uri
 * @param timestamp Timestamp
 * @param isExpired Is expired
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

