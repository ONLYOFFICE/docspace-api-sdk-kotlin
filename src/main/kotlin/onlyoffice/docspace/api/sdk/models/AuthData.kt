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

import onlyoffice.docspace.api.sdk.models.OAuth20Token

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The credentials of a third-party storage account. The portal takes them when an account is connected and does not  give them back afterwards.
 *
 * @param login The account name at the storage service.
 * @param password The password of the account at the storage service.
 * @param rawToken The token of the account, kept as the raw JSON document the storage service issued it in.
 * @param url The address of the storage server the account lives on.
 * @param provider The storage service the credentials belong to, as the provider key the account was connected with.
 * @param token The same token as in `rawToken`, parsed into its OAuth 2.0 fields.
 */


data class AuthData (

    @Json(name = "login")
    val login: kotlin.String? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "rawToken")
    val rawToken: kotlin.String? = null,

    @Json(name = "url")
    val url: java.net.URI? = null,

    @Json(name = "provider")
    val provider: kotlin.String? = null,

    @Json(name = "token")
    val token: OAuth20Token? = null

) {


}

