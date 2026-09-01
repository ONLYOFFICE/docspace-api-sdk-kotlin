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
 * The third-party request parameters.
 *
 * @param customerTitle The customer title.
 * @param providerKey The provider key.
 * @param url The connection URL for the sharepoint.
 * @param login The third-party request login.
 * @param password The third-party request password.
 * @param token The authentication token.
 * @param providerId The provider ID.
 */


data class ThirdPartyRequestDto (

    @Json(name = "customerTitle")
    val customerTitle: kotlin.String?,

    @Json(name = "providerKey")
    val providerKey: kotlin.String?,

    @Json(name = "url")
    val url: kotlin.String? = null,

    @Json(name = "login")
    val login: kotlin.String? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "token")
    val token: kotlin.String? = null,

    @Json(name = "providerId")
    val providerId: kotlin.Int? = null

) {


}

