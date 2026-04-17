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

import onlyoffice.docspace.api.sdk.models.ProviderType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request parameters for previewing models available from a provider before saving it.
 *
 * @param key The authentication API key for the AI provider.
 * @param type 
 * @param url The API endpoint URL. Required for OpenAiCompatible type; optional for other types that have default URLs.
 */


data class PreviewProviderModelsRequestDto (

    /* The authentication API key for the AI provider. */
    @Json(name = "key")
    val key: kotlin.String?,

    @Json(name = "type")
    val type: ProviderType? = null,

    /* The API endpoint URL. Required for OpenAiCompatible type; optional for other types that have default URLs. */
    @Json(name = "url")
    val url: kotlin.String? = null

) {


}

