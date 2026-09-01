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

import onlyoffice.docspace.api.sdk.models.AiChatModelPricing
import onlyoffice.docspace.api.sdk.models.AiEmbeddingModelPricing
import onlyoffice.docspace.api.sdk.models.AiImageModelPricing
import onlyoffice.docspace.api.sdk.models.AiWebSearchPricing
import onlyoffice.docspace.api.sdk.models.CurrencyInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The AI price list: per-model pricing for every model kind, in a single currency.
 *
 * @param chat The pricing of every available chat model.
 * @param embedding The pricing of every available embedding model.
 * @param image The pricing of every available image model.
 * @param search The pricing of every available web search provider.
 * @param currency The currency the AI prices are quoted in.
 */


data class AiPricesResponse (

    @Json(name = "chat")
    val chat: kotlin.collections.List<AiChatModelPricing>?,

    @Json(name = "embedding")
    val embedding: kotlin.collections.List<AiEmbeddingModelPricing>?,

    @Json(name = "image")
    val image: kotlin.collections.List<AiImageModelPricing>?,

    @Json(name = "search")
    val search: kotlin.collections.List<AiWebSearchPricing>?,

    @Json(name = "currency")
    val currency: CurrencyInfo

) {


}

