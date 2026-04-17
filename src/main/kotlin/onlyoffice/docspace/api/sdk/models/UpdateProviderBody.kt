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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Parameters for updating an AI provider's configuration.
 *
 * @param title The new display title for the AI provider. If null, the title is not changed.
 * @param url The new API endpoint URL for the AI provider. If null, the URL is not changed.
 * @param key The new authentication API key for the AI provider. If null, the key is not changed.
 * @param modelSettings Optional list of model settings changes to apply atomically with the provider update.
 */


data class UpdateProviderBody (

    /* The new display title for the AI provider. If null, the title is not changed. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The new API endpoint URL for the AI provider. If null, the URL is not changed. */
    @Json(name = "url")
    val url: kotlin.String? = null,

    /* The new authentication API key for the AI provider. If null, the key is not changed. */
    @Json(name = "key")
    val key: kotlin.String? = null,

    /* Optional list of model settings changes to apply atomically with the provider update. */
    @Json(name = "modelSettings")
    val modelSettings: kotlin.collections.Set<ModelSettingsItemDto>? = null

) {


}

