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

import onlyoffice.docspace.api.sdk.models.AiEntryPricingDtoAiChatPriceDto
import onlyoffice.docspace.api.sdk.models.AiEntryPricingDtoAiEmbeddingPriceDto
import onlyoffice.docspace.api.sdk.models.AiEntryPricingDtoAiImagePriceDto
import onlyoffice.docspace.api.sdk.models.AiEntryPricingDtoDecimal
import onlyoffice.docspace.api.sdk.models.CurrencyInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * What the AI features cost out of the portal wallet, grouped by the kind of model, in one currency.
 *
 * @param chat The chat models on offer, each priced per million prompt and completion tokens. A model listed here is one  the installation can bill for, not necessarily one this portal may use -  `GET api/2.0/portal/payment/ai-model/restrictions` says which are allowed.
 * @param embedding The embedding models on offer, priced per million tokens of input; an embedding model has no completion  side, so its price object carries `prompt` alone.
 * @param image The image models on offer, priced per million prompt and completion tokens plus a price for each image  produced.
 * @param webSearch The web search providers on offer. Their `price` is a bare number - the cost of one search - rather than  an object, because there are no tokens to distinguish.
 * @param currency The currency every price above is expressed in, with its ISO code and symbol. One answer never mixes  currencies, so this is the only place to read it.
 */


data class AiPricesDto (

    @Json(name = "chat")
    val chat: kotlin.collections.List<AiEntryPricingDtoAiChatPriceDto>?,

    @Json(name = "embedding")
    val embedding: kotlin.collections.List<AiEntryPricingDtoAiEmbeddingPriceDto>?,

    @Json(name = "image")
    val image: kotlin.collections.List<AiEntryPricingDtoAiImagePriceDto>?,

    @Json(name = "webSearch")
    val webSearch: kotlin.collections.List<AiEntryPricingDtoDecimal>?,

    @Json(name = "currency")
    val currency: CurrencyInfo

) {


}

