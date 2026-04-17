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

import onlyoffice.docspace.api.sdk.models.AiChatPrice
import onlyoffice.docspace.api.sdk.models.AiModelCapabilities
import onlyoffice.docspace.api.sdk.models.CurrencyInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The AI model information.
 *
 * @param providerTitle The human-readable display name of the AI provider (e.g., OpenAI, Anthropic).
 * @param modelId The model identifier as recognized by the AI provider (e.g., gpt-4o, claude-sonnet-4-20250514).
 * @param providerId The unique identifier of the AI provider that offers this model.
 * @param alias The display name for the model.
 * @param capabilities 
 * @param price 
 * @param currency 
 */


data class ModelDto (

    /* The human-readable display name of the AI provider (e.g., OpenAI, Anthropic). */
    @Json(name = "providerTitle")
    val providerTitle: kotlin.String?,

    /* The model identifier as recognized by the AI provider (e.g., gpt-4o, claude-sonnet-4-20250514). */
    @Json(name = "modelId")
    val modelId: kotlin.String?,

    /* The unique identifier of the AI provider that offers this model. */
    @Json(name = "providerId")
    val providerId: kotlin.Int? = null,

    /* The display name for the model. */
    @Json(name = "alias")
    val alias: kotlin.String? = null,

    @Json(name = "capabilities")
    val capabilities: AiModelCapabilities? = null,

    @Json(name = "price")
    val price: AiChatPrice? = null,

    @Json(name = "currency")
    val currency: CurrencyInfo? = null

) {


}

