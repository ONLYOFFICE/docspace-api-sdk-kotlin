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
 * Web-search provider configuration. Credentials and provider selection for the built-in web-search tool group.
 *
 * @param provider Provider identifier (e.g. `exa`).
 * @param key API key for the provider. Optional for self-hosted or keyless setups.
 * @param baseUrl Optional override for the provider's base URL.
 * @param isCloudProvider Whether this provider is cloud-hosted (vs. self-hosted).
 * @param headers Extra HTTP headers sent with each request to the ONLYOFFICE / cloud backend (e.g. `X-Tenant`). Merged after the derived `Authorization` header, so a custom header of the same name wins.
 */


data class AiWebSearchConfig (

    @Json(name = "provider")
    val provider: kotlin.String,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "baseUrl")
    val baseUrl: kotlin.String? = null,

    @Json(name = "isCloudProvider")
    val isCloudProvider: kotlin.Boolean? = null,

    @Json(name = "headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

) {


}

