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

import onlyoffice.docspace.api.sdk.models.FileReferenceData
import onlyoffice.docspace.api.sdk.models.InfoConfigDto
import onlyoffice.docspace.api.sdk.models.Options
import onlyoffice.docspace.api.sdk.models.PermissionsConfig

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The document itself as the editors address it: what to fetch, under which revision key, and what this caller may  do with it.
 *
 * @param fileType The format the editors treat the content as, without the leading dot. For a file that had to be converted this  is the format it was converted to, not the one it is stored under.
 * @param info The facts the editor information panel shows about the document.
 * @param isLinkedForMe Whether the caller opened the original document rather than a link pointing at it, which matters only for  formats whose editing is restricted through links.
 * @param key Identifies the exact revision to the editors: everyone who receives the same key joins the same co-editing  session, and the key changes as soon as the document is saved.
 * @param permissions What this caller may do inside the editor - edit, comment, review, fill, download, print, copy and chat.
 * @param sharedLinkParam The name of the query parameter that carries the external share key. It is set only when the document was  opened through an external link.
 * @param sharedLinkKey The external share key this opening runs under, empty when the caller opened the document as a portal member.  The editors pass it back on every request they make for the document.
 * @param referenceData How another spreadsheet names this document in a formula. Pass it to `POST api/2.0/files/file/referencedata`  to resolve such a reference.
 * @param title The name the editors display. When a past version was opened, the moment that version was created is appended  to it in brackets.
 * @param url Where the editors fetch the content. It is addressed to the host the document service can reach, which is not  necessarily the address a browser should follow.
 * @param isForm Whether the document is a fillable PDF form. A PDF that the portal has never classified is inspected while the  configuration is built, so the answer is trustworthy even for a freshly uploaded file.
 * @param options Extra instructions for the editors, currently the watermark to draw over the document. It is empty when the  room sets no watermark.
 */


data class DocumentConfigDto (

    @Json(name = "fileType")
    val fileType: kotlin.String? = null,

    @Json(name = "info")
    val info: InfoConfigDto? = null,

    @Json(name = "isLinkedForMe")
    val isLinkedForMe: kotlin.Boolean? = null,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "permissions")
    val permissions: PermissionsConfig? = null,

    @Json(name = "sharedLinkParam")
    val sharedLinkParam: kotlin.String? = null,

    @Json(name = "sharedLinkKey")
    val sharedLinkKey: kotlin.String? = null,

    @Json(name = "referenceData")
    val referenceData: FileReferenceData? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "url")
    val url: java.net.URI? = null,

    @Json(name = "isForm")
    val isForm: kotlin.Boolean? = null,

    @Json(name = "options")
    val options: Options? = null

) {


}

