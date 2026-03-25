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

import onlyoffice.docspace.api.sdk.models.ContinueChatBodyFilesInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Parameters for starting a new AI chat session.
 *
 * @param message The initial user message to send to the AI assistant.
 * @param contextFolderId The optional collection of file identifiers to attach as context for the AI model.
 * @param files The list of attached files.
 */


data class StartNewChatBody (

    /* The initial user message to send to the AI assistant. */
    @Json(name = "message")
    val message: kotlin.String?,

    /* The optional collection of file identifiers to attach as context for the AI model. */
    @Json(name = "contextFolderId")
    val contextFolderId: kotlin.Int? = null,

    /* The list of attached files. */
    @Json(name = "files")
    val files: kotlin.collections.List<ContinueChatBodyFilesInner>? = null

) {


}

