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

import onlyoffice.docspace.api.sdk.models.AiSuggestedQuestion

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The starter questions of an attached form, and whether they are ready.
 *
 * @param status `ready` - the questions are there; `pending` - they are being generated and arrive over the socket, ask again later; `unavailable` - the attachment is not a form that can have any.
 * @param questions The questions; empty unless `status` is `ready`.
 */


data class AiSuggestedQuestionsResult (

    @Json(name = "status")
    val status: AiSuggestedQuestionsResult.Status,

    @Json(name = "questions")
    val questions: kotlin.collections.List<AiSuggestedQuestion>

) {

    /**
     * `ready` - the questions are there; `pending` - they are being generated and arrive over the socket, ask again later; `unavailable` - the attachment is not a form that can have any.
     *
     * Values: ready,pending,unavailable
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "ready") ready("ready"),
        @Json(name = "pending") pending("pending"),
        @Json(name = "unavailable") unavailable("unavailable");
    }

}

