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

package onlyoffice.docspace.api.sdk.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param accessToken 
 * @param refreshToken 
 * @param expiresIn 
 * @param clientId 
 * @param clientSecret 
 * @param redirectUri 
 * @param timestamp 
 * @param isExpired 
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

