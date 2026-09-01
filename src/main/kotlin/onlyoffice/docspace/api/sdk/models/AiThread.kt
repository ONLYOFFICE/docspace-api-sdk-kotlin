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

import onlyoffice.docspace.api.sdk.models.AiModel
import onlyoffice.docspace.api.sdk.models.AiTProvider

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Chat conversation metadata. Represents a single chat session (thread).
 *
 * @param threadId Unique thread identifier (UUID).
 * @param title Optional thread title. Auto-generated from the first message if not set.
 * @param lastEditDate Timestamp (ms since epoch) of the last message in this thread. Used for sorting.
 * @param provider Provider configuration at the time of last message. Used for thread-level provider display.
 * @param model Model info at the time of last message.
 * @param profileId ID of the profile used for this thread. Links to  {@link  Profile.id } .
 */


data class AiThread (

    @Json(name = "threadId")
    val threadId: kotlin.String,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "lastEditDate")
    val lastEditDate: java.math.BigDecimal? = null,

    @Json(name = "provider")
    val provider: AiTProvider? = null,

    @Json(name = "model")
    val model: AiModel? = null,

    @Json(name = "profileId")
    val profileId: kotlin.String? = null

) {


}

