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
 * [0 - None, 1 - Files  only, 2 - Folders only, 3 - Documents only, 4 - Presentations only, 5 - Spreadsheets only, 7 - Images only, 8 - By user, 9 - By department, 10 - Archive only, 11 - By extension, 12 - Media only, 13 - Filling forms rooms, 14 - Editing rooms, 17 - Custom rooms, 20 - Public rooms, 22 - Pdf, 23 - Pdf form, 24 - Virtual data rooms, 25 - Diagrams only, 26 - Ai rooms]
 *
 * Values: None,FilesOnly,FoldersOnly,DocumentsOnly,PresentationsOnly,SpreadsheetsOnly,ImagesOnly,ByUser,ByDepartment,ArchiveOnly,ByExtension,MediaOnly,FillingFormsRooms,EditingRooms,CustomRooms,PublicRooms,Pdf,PdfForm,VirtualDataRooms,DiagramsOnly,AiRooms
 */

@JsonClass(generateAdapter = false)
enum class FilterType(val value: kotlin.Int) {

    @Json(name = "0")
    None(0),

    @Json(name = "1")
    FilesOnly(1),

    @Json(name = "2")
    FoldersOnly(2),

    @Json(name = "3")
    DocumentsOnly(3),

    @Json(name = "4")
    PresentationsOnly(4),

    @Json(name = "5")
    SpreadsheetsOnly(5),

    @Json(name = "7")
    ImagesOnly(7),

    @Json(name = "8")
    ByUser(8),

    @Json(name = "9")
    ByDepartment(9),

    @Json(name = "10")
    ArchiveOnly(10),

    @Json(name = "11")
    ByExtension(11),

    @Json(name = "12")
    MediaOnly(12),

    @Json(name = "13")
    FillingFormsRooms(13),

    @Json(name = "14")
    EditingRooms(14),

    @Json(name = "17")
    CustomRooms(17),

    @Json(name = "20")
    PublicRooms(20),

    @Json(name = "22")
    Pdf(22),

    @Json(name = "23")
    PdfForm(23),

    @Json(name = "24")
    VirtualDataRooms(24),

    @Json(name = "25")
    DiagramsOnly(25),

    @Json(name = "26")
    AiRooms(26);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FilterType) "$data" else null

        /**
         * Returns a valid [FilterType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FilterType? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

