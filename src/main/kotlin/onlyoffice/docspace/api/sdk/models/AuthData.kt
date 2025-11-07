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

import onlyoffice.docspace.api.sdk.models.OAuth20Token

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The authentication data.
 *
 * @param login The authentication login.
 * @param password The authentication password.
 * @param rawToken The authentication raw token.
 * @param url The authentication URL.
 * @param provider The authentication provider.
 * @param token 
 */


data class AuthData (

    /* The authentication login. */
    @Json(name = "login")
    val login: kotlin.String? = null,

    /* The authentication password. */
    @Json(name = "password")
    val password: kotlin.String? = null,

    /* The authentication raw token. */
    @Json(name = "rawToken")
    val rawToken: kotlin.String? = null,

    /* The authentication URL. */
    @Json(name = "url")
    val url: java.net.URI? = null,

    /* The authentication provider. */
    @Json(name = "provider")
    val provider: kotlin.String? = null,

    @Json(name = "token")
    val token: OAuth20Token? = null

) {


}

