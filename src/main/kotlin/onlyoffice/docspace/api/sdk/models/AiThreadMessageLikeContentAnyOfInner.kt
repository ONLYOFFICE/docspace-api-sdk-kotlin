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

import onlyoffice.docspace.api.sdk.models.AiThreadMessageLikeContentAnyOfInnerAudio
import onlyoffice.docspace.api.sdk.models.AiThreadMessageLikeContentAnyOfInnerInterrupt

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type Part kind: `text`, `reasoning`, `source`, `image`, `file`, `audio`, `data` or `tool-call`.
 * @param text The text of a `text` or `reasoning` part.
 * @param parentId Id of the part this one belongs to, on `text`, `reasoning`, `source` and `tool-call` parts. On a `reasoning` part the chat library keeps the provider's thinking signature here.
 * @param sourceType A `source` part's source kind; always `url`.
 * @param id A `source` part's id.
 * @param url A `source` part's URL.
 * @param title A `source` part's title.
 * @param image An `image` part's picture, as a URL (usually a `data:` URL). For an image the user attached, a JSON string `{ ref, title, kind: image }` naming the stored attachment instead.
 * @param mimeType A `file` part's media type. For a file the user attached, a JSON string `{ ref, title, kind: file, path, type }` naming the stored attachment instead - the chat library carries the reference here.
 * @param `data` A `file` part's content; empty when the part references an attachment. (A `data` part would carry its payload here too, as any JSON value; neither the chat library nor this service writes one.)
 * @param filename The file name of a `file` or `image` part.
 * @param name An `image` part's display name, or a `data` part's name.
 * @param audio 
 * @param toolCallId A `tool-call` part's call id.
 * @param toolName A `tool-call` part's tool name.
 * @param args A `tool-call` part's arguments.
 * @param argsText A `tool-call` part's arguments as the model streamed them, JSON text.
 * @param result 
 * @param isError Whether a `tool-call` part's result is an error.
 * @param artifact 
 * @param interrupt 
 * @param messages Messages of a sub-agent run inside a `tool-call` part.
 * @param metadata Provider-specific data of a `tool-call` part - for a Gemini call, `{ thoughtSignature }`, which has to be sent back with the call.
 */


data class AiThreadMessageLikeContentAnyOfInner (

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "text")
    val text: kotlin.String? = null,

    @Json(name = "parentId")
    val parentId: kotlin.String? = null,

    @Json(name = "sourceType")
    val sourceType: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "url")
    val url: kotlin.String? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "image")
    val image: kotlin.String? = null,

    @Json(name = "mimeType")
    val mimeType: kotlin.String? = null,

    @Json(name = "data")
    val `data`: kotlin.String? = null,

    @Json(name = "filename")
    val filename: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "audio")
    val audio: AiThreadMessageLikeContentAnyOfInnerAudio? = null,

    @Json(name = "toolCallId")
    val toolCallId: kotlin.String? = null,

    @Json(name = "toolName")
    val toolName: kotlin.String? = null,

    @Json(name = "args")
    val args: kotlin.Any? = null,

    @Json(name = "argsText")
    val argsText: kotlin.String? = null,

    @Json(name = "result")
    val result: kotlin.Any? = null,

    @Json(name = "isError")
    val isError: kotlin.Boolean? = null,

    @Json(name = "artifact")
    val artifact: kotlin.Any? = null,

    @Json(name = "interrupt")
    val interrupt: AiThreadMessageLikeContentAnyOfInnerInterrupt? = null,

    @Json(name = "messages")
    val messages: kotlin.collections.List<kotlin.Any>? = null,

    @Json(name = "metadata")
    val metadata: kotlin.Any? = null

) {


}

