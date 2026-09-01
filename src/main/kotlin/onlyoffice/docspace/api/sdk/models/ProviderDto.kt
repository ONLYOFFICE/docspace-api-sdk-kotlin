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
 * The provider information.
 *
 * @param name The provider name.
 * @param key The provider key.
 * @param connected Specifies whether the provider is connected.
 * @param oauth Specifies if the provider is OAuth.
 * @param redirectUrl The provider redirect URL.
 * @param requiredConnectionUrl The required connection URL flag.
 * @param clientId The provider OAuth client ID.
 */


data class ProviderDto (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "connected")
    val connected: kotlin.Boolean? = null,

    @Json(name = "oauth")
    val oauth: kotlin.Boolean? = null,

    @Json(name = "redirectUrl")
    val redirectUrl: kotlin.String? = null,

    @Json(name = "requiredConnectionUrl")
    val requiredConnectionUrl: kotlin.Boolean? = null,

    @Json(name = "clientId")
    val clientId: kotlin.String? = null

) {


}

