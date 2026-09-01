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

import onlyoffice.docspace.api.sdk.models.AiThreadMessageLikeContent
import onlyoffice.docspace.api.sdk.models.AiThreadMessageLikeStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param role Message author role.
 * @param content 
 * @param id Storage-assigned message id (absent on inbound drafts).
 * @param createdAt Creation timestamp, ISO-8601 on the wire.
 * @param status 
 * @param metadata Arbitrary per-message metadata.
 * @param attachments Attachments linked to the message.
 */


data class AiThreadMessageLike (

    @Json(name = "role")
    val role: AiThreadMessageLike.Role,

    @Json(name = "content")
    val content: AiThreadMessageLikeContent,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "createdAt")
    val createdAt: kotlin.String? = null,

    @Json(name = "status")
    val status: AiThreadMessageLikeStatus? = null,

    @Json(name = "metadata")
    val metadata: kotlin.Any? = null,

    @Json(name = "attachments")
    val attachments: kotlin.collections.List<kotlin.Any>? = null

) {

    /**
     * Message author role.
     *
     * Values: user,assistant,system
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "user") user("user"),
        @Json(name = "assistant") assistant("assistant"),
        @Json(name = "system") system("system");
    }

}

