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

import onlyoffice.docspace.api.sdk.models.ConvertSpreadsheetMarginsRequest
import onlyoffice.docspace.api.sdk.models.ConvertSpreadsheetPageSizeRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * How a spreadsheet converted to PDF is laid out on the page. A field left out takes the document service default.
 *
 * @param ignorePrintArea Whether the print area chosen in the spreadsheet is ignored; false converts only that area.
 * @param orientation The page orientation of the output PDF file: portrait or landscape.
 * @param fitToHeight The number of pages the converted area is fitted into in height; 0 does not fit it.
 * @param scale The scale of the output PDF file, in percent.
 * @param fitToWidth The number of pages the converted area is fitted into in width; 0 does not fit it.
 * @param headings Whether the row and column headings are printed in the output PDF file.
 * @param gridLines Whether the grid lines are printed in the output PDF file.
 * @param margins The margins of the output PDF file.
 * @param pageSize The page size of the output PDF file.
 */


data class ConvertSpreadsheetLayoutRequest (

    @Json(name = "ignorePrintArea")
    val ignorePrintArea: kotlin.Boolean? = null,

    @Json(name = "orientation")
    val orientation: kotlin.String? = null,

    @Json(name = "fitToHeight")
    val fitToHeight: kotlin.Int? = null,

    @Json(name = "scale")
    val scale: kotlin.Int? = null,

    @Json(name = "fitToWidth")
    val fitToWidth: kotlin.Int? = null,

    @Json(name = "headings")
    val headings: kotlin.Boolean? = null,

    @Json(name = "gridLines")
    val gridLines: kotlin.Boolean? = null,

    @Json(name = "margins")
    val margins: ConvertSpreadsheetMarginsRequest? = null,

    @Json(name = "pageSize")
    val pageSize: ConvertSpreadsheetPageSizeRequest? = null

) {


}

