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
 * What a chat model charges, split by the direction the tokens flow in.
 *
 * @param prompt The cost of one million tokens sent to the model, which includes the conversation history resent with  every turn and not just the newest message.
 * @param completion The cost of one million tokens the model writes back. It is normally the dearer of the two directions.
 * @param promptCacheRead The cost of one million prompt tokens served from the prompt cache. It is absent when the model does not  support prompt caching.
 * @param promptCacheWrite The cost of one million prompt tokens written to the prompt cache with the default lifetime. It is absent  when the model does not support prompt caching.
 * @param promptCacheWrite1H The cost of one million prompt tokens written to the prompt cache with a one-hour lifetime. It is absent  when the model offers no such option.
 */


data class AiChatPriceDto (

    @Json(name = "prompt")
    val prompt: kotlin.Double? = null,

    @Json(name = "completion")
    val completion: kotlin.Double? = null,

    @Json(name = "promptCacheRead")
    val promptCacheRead: kotlin.Double? = null,

    @Json(name = "promptCacheWrite")
    val promptCacheWrite: kotlin.Double? = null,

    @Json(name = "promptCacheWrite1H")
    val promptCacheWrite1H: kotlin.Double? = null

) {


}

