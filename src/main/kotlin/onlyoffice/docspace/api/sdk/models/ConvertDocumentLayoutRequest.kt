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
 * The layout of forms printed as pdf documents or images.
 *
 * @param drawPlaceHolders Whether an empty form field shows its placeholder text in the result; false leaves it blank.
 * @param drawFormHighlight Whether form fields keep their highlight colour in the result; false draws them without it.
 * @param isPrint Whether the print mode is turned on. It only applies to a docx converted into pdf: with the print mode off  the highlight flag does nothing and the placeholder flag saves the forms in the pdf.
 */


data class ConvertDocumentLayoutRequest (

    @Json(name = "drawPlaceHolders")
    val drawPlaceHolders: kotlin.Boolean? = null,

    @Json(name = "drawFormHighlight")
    val drawFormHighlight: kotlin.Boolean? = null,

    @Json(name = "isPrint")
    val isPrint: kotlin.Boolean? = null

) {


}

