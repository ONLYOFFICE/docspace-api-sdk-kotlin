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

import onlyoffice.docspace.api.sdk.models.AiChatPriceDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One AI model or service on the price list: how to name it, who provides it, and what it costs.
 *
 * @param id The model identifier to send to the AI operations. It is the value to branch on, while `alias` is for display  only.
 * @param alias The model name as the vendor writes it, meant to be shown to a person rather than matched on.
 * @param provider Who runs the model. Two entries can share a provider, and one provider's models can be priced quite  differently, so the price always belongs to the entry and never to the provider.
 * @param image The absolute URL of the provider's icon, for rendering next to the entry.
 * @param price What the entry costs, in the currency the answer names. Amounts per token are normalised per million  tokens, so they are not the price of a single call.
 * @param link The provider's own page for the model, for a person to read the model's terms. It is empty when the  provider publishes none.
 */


data class AiEntryPricingDtoAiChatPriceDto (

    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "alias")
    val alias: kotlin.String?,

    @Json(name = "provider")
    val provider: kotlin.String?,

    @Json(name = "image")
    val image: kotlin.String?,

    @Json(name = "price")
    val price: AiChatPriceDto,

    @Json(name = "link")
    val link: kotlin.String?

) {


}

