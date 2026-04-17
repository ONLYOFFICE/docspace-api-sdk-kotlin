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

import onlyoffice.docspace.api.sdk.models.AiModelCapabilities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * AI model settings information.
 *
 * @param id The model identifier.
 * @param capabilities 
 * @param alias The display name for the model.
 * @param isEnabled Whether the model is enabled for use in chat.
 * @param isRecommended Whether the model is recommended (defined in configuration).
 */


data class ModelSettingsDto (

    /* The model identifier. */
    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "capabilities")
    val capabilities: AiModelCapabilities,

    /* The display name for the model. */
    @Json(name = "alias")
    val alias: kotlin.String? = null,

    /* Whether the model is enabled for use in chat. */
    @Json(name = "isEnabled")
    val isEnabled: kotlin.Boolean? = null,

    /* Whether the model is recommended (defined in configuration). */
    @Json(name = "isRecommended")
    val isRecommended: kotlin.Boolean? = null

) {


}

