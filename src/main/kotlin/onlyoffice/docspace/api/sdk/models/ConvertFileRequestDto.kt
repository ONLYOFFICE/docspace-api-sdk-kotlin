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

import onlyoffice.docspace.api.sdk.models.ConvertDocumentLayoutRequest
import onlyoffice.docspace.api.sdk.models.ConvertDocumentRendererRequest
import onlyoffice.docspace.api.sdk.models.ConvertPdfRequest
import onlyoffice.docspace.api.sdk.models.ConvertSpreadsheetLayoutRequest
import onlyoffice.docspace.api.sdk.models.ConvertThumbnailRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * What to convert, where to keep the result, and the parameters the document service is handed. Everything below the  first two fields is the contract of the document service itself, named and shaped exactly as it names it, so that  the portal passes the request on rather than translating it. What the portal can read off the file - its format,  its name and the key of its revision - is not asked for and cannot be overridden.
 *
 * @param fileId The id of the portal file to convert, as reported by a folder listing such as `GET api/2.0/files/{folderId}`.
 * @param outputtype The extension of the format to convert to, without the dot. The formats a source can become are listed under  `extsConvertible` in `GET api/2.0/files/settings`, keyed by the source extension, both with a leading dot there.
 * @param folderId The id of the folder to save the converted file in, as reported by a folder listing such as  `GET api/2.0/files/{folderId}`.
 * @param codePage The encoding of a csv or txt source, as a code page number: 1251 for Cyrillic, 65001 for UTF-8, and so on.  Leaving it out lets the document service guess, which garbles non-latin text.
 * @param delimiter The character separating the values of a csv source: 0 - none, 1 - tab, 2 - semicolon, 3 - colon, 4 - comma,  5 - space.
 * @param documentLayout The layout of forms printed as pdf documents or images.
 * @param documentRenderer How the text of a pdf, xps or oxps source is read back.
 * @param password The password of the source document, for a document that is protected with one.
 * @param region The culture code whose currency, date and time formats a spreadsheet converted to PDF is shown in.
 * @param thumbnail How a thumbnail is fitted, when the target format is an image.
 * @param spreadsheetLayout How a spreadsheet is laid out on the page, when it is converted to PDF.
 * @param pdf The PDF settings, used when the target format is PDF.
 */


data class ConvertFileRequestDto (

    @Json(name = "fileId")
    val fileId: kotlin.Int,

    @Json(name = "outputtype")
    val outputtype: kotlin.String?,

    @Json(name = "folderId")
    val folderId: kotlin.Int? = null,

    @Json(name = "codePage")
    val codePage: kotlin.Int? = null,

    @Json(name = "delimiter")
    val delimiter: kotlin.Int? = null,

    @Json(name = "documentLayout")
    val documentLayout: ConvertDocumentLayoutRequest? = null,

    @Json(name = "documentRenderer")
    val documentRenderer: ConvertDocumentRendererRequest? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "region")
    val region: kotlin.String? = null,

    @Json(name = "thumbnail")
    val thumbnail: ConvertThumbnailRequest? = null,

    @Json(name = "spreadsheetLayout")
    val spreadsheetLayout: ConvertSpreadsheetLayoutRequest? = null,

    @Json(name = "pdf")
    val pdf: ConvertPdfRequest? = null

) {


}

