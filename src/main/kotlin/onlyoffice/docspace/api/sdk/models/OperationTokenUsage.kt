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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Tokens an AI operation consumed, as recorded in the operation metadata. A kind the provider did not report is `0`.
 *
 * @param totalTokens All tokens of the request: prompt plus completion.
 * @param promptTokens Tokens sent to the model, cached ones included.
 * @param completionTokens Tokens the model generated, reasoning ones included.
 * @param cachedTokens Part of the prompt tokens read from the provider cache.
 * @param cacheWriteTokens Part of the prompt tokens written to the provider cache.
 * @param reasoningTokens Part of the completion tokens the model spent on reasoning.
 * @param imageTokens Tokens spent on images.
 */


data class OperationTokenUsage (

    @Json(name = "totalTokens")
    val totalTokens: kotlin.Long? = null,

    @Json(name = "promptTokens")
    val promptTokens: kotlin.Long? = null,

    @Json(name = "completionTokens")
    val completionTokens: kotlin.Long? = null,

    @Json(name = "cachedTokens")
    val cachedTokens: kotlin.Long? = null,

    @Json(name = "cacheWriteTokens")
    val cacheWriteTokens: kotlin.Long? = null,

    @Json(name = "reasoningTokens")
    val reasoningTokens: kotlin.Long? = null,

    @Json(name = "imageTokens")
    val imageTokens: kotlin.Long? = null

) {


}

