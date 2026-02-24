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
 * Parameters for continuing an AI chat session.
 *
 * @param message The user message to append to the conversation.
 * @param files The optional collection of file identifiers to attach as context for the AI model.
 */


data class ContinueChatBody (

    /* The user message to append to the conversation. */
    @Json(name = "message")
    val message: kotlin.String?,

    /* The optional collection of file identifiers to attach as context for the AI model. */
    @Json(name = "files")
    val files: kotlin.collections.List<ContinueChatBodyFilesInner>? = null

) {


}

