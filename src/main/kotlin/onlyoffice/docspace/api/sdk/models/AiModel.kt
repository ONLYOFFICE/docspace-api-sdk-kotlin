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
 * AI model metadata. Describes a single model available from a provider.
 *
 * @param id Model identifier as used by the provider API (e.g. `gpt-4o`, `claude-sonnet-4-20250514`).
 * @param name Human-readable model name for display in the UI.
 * @param provider Provider that offers this model.
 * @param reasoning Whether this model supports extended thinking / chain-of-thought reasoning.
 * @param capabilities Bitmask of model capabilities (Chat, Image, Vision, Tools, etc.). Used to filter models per  {@link  ActionType  } .
 */


data class AiModel (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "provider")
    val provider: AiProviderType,

    @Json(name = "reasoning")
    val reasoning: kotlin.Boolean? = null,

    @Json(name = "capabilities")
    val capabilities: java.math.BigDecimal? = null

) {


}

