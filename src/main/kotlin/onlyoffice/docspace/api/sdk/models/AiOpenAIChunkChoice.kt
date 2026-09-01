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

import onlyoffice.docspace.api.sdk.models.AiOpenAIChoiceDelta
import onlyoffice.docspace.api.sdk.models.AiOpenAIFinishReason

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One choice of a streaming completion, carrying the part this chunk adds.
 *
 * @param index The zero-based position of the choice. This service emits a single choice, so always 0.
 * @param delta What this chunk adds to the choice.
 * @param finishReason Why the completion stopped, or null while it is still streaming.
 */


data class AiOpenAIChunkChoice (

    @Json(name = "index")
    val index: java.math.BigDecimal,

    @Json(name = "delta")
    val delta: AiOpenAIChoiceDelta,

    @Json(name = "finish_reason")
    val finishReason: AiOpenAIFinishReason?

) {


}

