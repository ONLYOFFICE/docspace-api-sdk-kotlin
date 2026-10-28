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
 * 
 *
 * @param accessToken The token to send as a Bearer credential when calling the portal on the user behalf.
 * @param tokenType How the access token is to be presented. It is always Bearer.
 * @param expiresIn How many seconds the access token stays valid, counted from the moment it was issued.
 * @param refreshToken The token that buys a new access token once the current one expires. It is present only when the client is registered for the refresh token grant.
 */


data class ExchangeToken200Response (

    @Json(name = "access_token")
    val accessToken: kotlin.String? = null,

    @Json(name = "token_type")
    val tokenType: kotlin.String? = null,

    @Json(name = "expires_in")
    val expiresIn: kotlin.Int? = null,

    @Json(name = "refresh_token")
    val refreshToken: kotlin.String? = null

) {


}

