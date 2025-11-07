 /*
 * (c) Copyright Ascensio System SIA 2025
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
 * The text run parameters.
 *
 * @param fill The fill color of the text run in RGB format.
 * @param text The run text.
 * @param fontSize The font size of the text run in points.
 */


data class Run (

    /* The fill color of the text run in RGB format. */
    @Json(name = "fill")
    val fill: kotlin.collections.List<kotlin.Int>? = null,

    /* The run text. */
    @Json(name = "text")
    val text: kotlin.String? = null,

    /* The font size of the text run in points. */
    @Json(name = "font-size")
    val fontSize: kotlin.String? = null

) {


}

