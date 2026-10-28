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

import onlyoffice.docspace.api.sdk.models.AiThreadMessageLike

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Resolved thread state returned by `ThreadsEngine.openOrCreate`.
 *
 * @param threadId The thread that was opened, or the one just created.
 * @param title Empty string for existing threads — the engine doesn't re-fetch.
 * @param priorMessages The messages already in the thread - empty for a thread that was just created.
 */


data class AiOpenOrCreateResult (

    @Json(name = "threadId")
    val threadId: kotlin.String,

    @Json(name = "title")
    val title: kotlin.String,

    @Json(name = "priorMessages")
    val priorMessages: kotlin.collections.List<AiThreadMessageLike>

) {


}

