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
 * The third-party backup request parameters.
 *
 * @param url The connection URL for the sharepoint.
 * @param login The login.
 * @param password The password.
 * @param token The authentication token.
 * @param customerTitle The customer title.
 * @param providerKey The provider key.
 */


data class ThirdPartyBackupRequestDto (

    /* The connection URL for the sharepoint. */
    @Json(name = "url")
    val url: kotlin.String? = null,

    /* The login. */
    @Json(name = "login")
    val login: kotlin.String? = null,

    /* The password. */
    @Json(name = "password")
    val password: kotlin.String? = null,

    /* The authentication token. */
    @Json(name = "token")
    val token: kotlin.String? = null,

    /* The customer title. */
    @Json(name = "customerTitle")
    val customerTitle: kotlin.String? = null,

    /* The provider key. */
    @Json(name = "providerKey")
    val providerKey: kotlin.String? = null

) {


}

