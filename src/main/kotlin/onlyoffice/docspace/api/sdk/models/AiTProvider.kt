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

import onlyoffice.docspace.api.sdk.models.AiProviderType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Minimal provider connection configuration. Used to connect to a provider API.
 *
 * @param type Provider type identifier.
 * @param name User-defined display name for this provider connection.
 * @param baseUrl Base URL of the provider API.
 * @param key API key or token. Optional for local providers (Ollama, LM Studio).
 */


data class AiTProvider (

    @Json(name = "type")
    val type: AiProviderType,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "baseUrl")
    val baseUrl: kotlin.String,

    @Json(name = "key")
    val key: kotlin.String? = null

) {


}

