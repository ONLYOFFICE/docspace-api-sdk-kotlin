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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * [1 - Light small, 2 - Login page, 3 - Favicon, 4 - Docs editor, 5 - Docs editor embed, 6 - Left menu, 7 - About page, 8 - Notification, 9 - Spreadsheet editor, 10 - Spreadsheet editor embed, 11 - Presentation editor, 12 - Presentation editor embed, 13 - Pdf editor, 14 - Pdf editor embed, 15 - Diagram editor, 16 - Diagram editor embed]
 *
 * Values: LightSmall,LoginPage,Favicon,DocsEditor,DocsEditorEmbed,LeftMenu,AboutPage,Notification,SpreadsheetEditor,SpreadsheetEditorEmbed,PresentationEditor,PresentationEditorEmbed,PdfEditor,PdfEditorEmbed,DiagramEditor,DiagramEditorEmbed
 */

@JsonClass(generateAdapter = false)
enum class WhiteLabelLogoType(val value: kotlin.Int) {

    @Json(name = "1")
    LightSmall(1),

    @Json(name = "2")
    LoginPage(2),

    @Json(name = "3")
    Favicon(3),

    @Json(name = "4")
    DocsEditor(4),

    @Json(name = "5")
    DocsEditorEmbed(5),

    @Json(name = "6")
    LeftMenu(6),

    @Json(name = "7")
    AboutPage(7),

    @Json(name = "8")
    Notification(8),

    @Json(name = "9")
    SpreadsheetEditor(9),

    @Json(name = "10")
    SpreadsheetEditorEmbed(10),

    @Json(name = "11")
    PresentationEditor(11),

    @Json(name = "12")
    PresentationEditorEmbed(12),

    @Json(name = "13")
    PdfEditor(13),

    @Json(name = "14")
    PdfEditorEmbed(14),

    @Json(name = "15")
    DiagramEditor(15),

    @Json(name = "16")
    DiagramEditorEmbed(16);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is WhiteLabelLogoType) "$data" else null

        /**
         * Returns a valid [WhiteLabelLogoType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): WhiteLabelLogoType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

