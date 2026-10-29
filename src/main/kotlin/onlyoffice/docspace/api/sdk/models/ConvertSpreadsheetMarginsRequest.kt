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
 * The margins of the output PDF file, each a length with its unit: mm, cm or in.
 *
 * @param left The left margin of the output PDF file.
 * @param right The right margin of the output PDF file.
 * @param top The top margin of the output PDF file.
 * @param bottom The bottom margin of the output PDF file.
 */


data class ConvertSpreadsheetMarginsRequest (

    @Json(name = "left")
    val left: kotlin.String? = null,

    @Json(name = "right")
    val right: kotlin.String? = null,

    @Json(name = "top")
    val top: kotlin.String? = null,

    @Json(name = "bottom")
    val bottom: kotlin.String? = null

) {


}

