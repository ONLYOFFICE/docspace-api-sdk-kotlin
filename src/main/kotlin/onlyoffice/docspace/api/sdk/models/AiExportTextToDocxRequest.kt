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

import onlyoffice.docspace.api.sdk.models.AiExportTextToDocxRequestFolderId

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param title Document title (also the file name).
 * @param content Markdown content to convert.
 * @param folderId 
 * @param format Output format: `Docx` (the default when omitted), `Pdf`, or `Md`, which stores the markdown verbatim instead of converting it.
 */


data class AiExportTextToDocxRequest (

    @Json(name = "title")
    val title: kotlin.String,

    @Json(name = "content")
    val content: kotlin.String,

    @Json(name = "folderId")
    val folderId: AiExportTextToDocxRequestFolderId,

    @Json(name = "format")
    val format: AiExportTextToDocxRequest.Format? = null

) {

    /**
     * Output format: `Docx` (the default when omitted), `Pdf`, or `Md`, which stores the markdown verbatim instead of converting it.
     *
     * Values: Docx,Pdf,Md
     */
    @JsonClass(generateAdapter = false)
    enum class Format(val value: kotlin.String) {
        @Json(name = "Docx") Docx("Docx"),
        @Json(name = "Pdf") Pdf("Pdf"),
        @Json(name = "Md") Md("Md");
    }

}

