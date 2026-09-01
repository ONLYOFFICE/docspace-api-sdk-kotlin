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

import onlyoffice.docspace.api.sdk.models.AiAttachmentFormKeysInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Persistent record for a single attachment (file or image) referenced from a user message. Files carry extracted text in `content`; images carry base64 data in `base64`. Metadata (`title`, `path`, `type`) is always present for display purposes regardless of whether the heavy payload is loaded.
 *
 * @param id Storage-assigned UUID.
 * @param kind file | image.
 * @param title Display label (filename or user-visible title).
 * @param createdAt Storage-assigned creation timestamp.
 * @param source Origin of the attachment. `user` — uploaded by the user in the composer (the default when unset, for backward compatibility). `tool` — produced by a tool call (e.g. `generate_image`). Lets the integrator's adapter route or apply policies (separate bucket, quotas, TTL, CDN) per source.
 * @param content Extracted text for files.
 * @param base64 Base64 data URL for images.
 * @param path Original host file path (for files).
 * @param type ONLYOFFICE file type code (for files).
 * @param messageId Owning message id once linked. Unset while the attachment is a draft.
 * @param threadId Owning thread id once linked. Unset while the attachment is a draft.
 * @param entityId Opaque scope token (entity / room) the attachment was created in. Drafts carry it so an entity switch keeps in-flight composer state isolated; once linked to a message the field is redundant with the thread's own entity binding.
 * @param canAnalyze Whether the attached form can be analyzed.
 * @param formKeys Keys of the fields inside the form. `key` is the field identifier, `text` its human-readable label.
 */


data class AiAttachment (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "kind")
    val kind: AiAttachment.Kind,

    @Json(name = "title")
    val title: kotlin.String,

    @Json(name = "createdAt")
    val createdAt: java.math.BigDecimal,

    @Json(name = "source")
    val source: AiAttachment.Source? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "base64")
    val base64: kotlin.String? = null,

    @Json(name = "path")
    val path: kotlin.String? = null,

    @Json(name = "type")
    val type: java.math.BigDecimal? = null,

    @Json(name = "messageId")
    val messageId: kotlin.String? = null,

    @Json(name = "threadId")
    val threadId: kotlin.String? = null,

    @Json(name = "entityId")
    val entityId: kotlin.String? = null,

    @Json(name = "canAnalyze")
    val canAnalyze: kotlin.Boolean? = null,

    @Json(name = "formKeys")
    val formKeys: kotlin.collections.List<AiAttachmentFormKeysInner>? = null

) {

    /**
     * file | image.
     *
     * Values: file,image
     */
    @JsonClass(generateAdapter = false)
    enum class Kind(val value: kotlin.String) {
        @Json(name = "file") file("file"),
        @Json(name = "image") image("image");
    }
    /**
     * Origin of the attachment. `user` — uploaded by the user in the composer (the default when unset, for backward compatibility). `tool` — produced by a tool call (e.g. `generate_image`). Lets the integrator's adapter route or apply policies (separate bucket, quotas, TTL, CDN) per source.
     *
     * Values: user,tool
     */
    @JsonClass(generateAdapter = false)
    enum class Source(val value: kotlin.String) {
        @Json(name = "user") user("user"),
        @Json(name = "tool") tool("tool");
    }

}

