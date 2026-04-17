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

import onlyoffice.docspace.api.sdk.models.ModelSettingsItemDto
import onlyoffice.docspace.api.sdk.models.ProviderType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request parameters for creating a new AI provider.
 *
 * @param title The display title for the AI provider.
 * @param key The authentication API key for the AI provider.
 * @param type 
 * @param url The API endpoint URL for the AI provider. Required for OpenAiCompatible type; optional for other types that have default URLs.
 * @param modelSettings Optional list of model settings to configure atomically with the provider creation.
 */


data class CreateProviderRequestDto (

    /* The display title for the AI provider. */
    @Json(name = "title")
    val title: kotlin.String?,

    /* The authentication API key for the AI provider. */
    @Json(name = "key")
    val key: kotlin.String?,

    @Json(name = "type")
    val type: ProviderType? = null,

    /* The API endpoint URL for the AI provider. Required for OpenAiCompatible type; optional for other types that have default URLs. */
    @Json(name = "url")
    val url: kotlin.String? = null,

    /* Optional list of model settings to configure atomically with the provider creation. */
    @Json(name = "modelSettings")
    val modelSettings: kotlin.collections.Set<ModelSettingsItemDto>? = null

) {


}

