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
 * How a thumbnail is fitted. A field left out takes the document service default.
 *
 * @param aspect The mode to fit the image to the height and width specified:  0 - stretch file to fit height and width;  1 - keep the aspect for the image;  2 - convert the metric size of the page into pixels at 96 dpi.
 * @param first Whether a thumbnail is made of the first page only; false makes one of every page.
 * @param height The thumbnail height in pixels; not used with aspect 2.
 * @param width The thumbnail width in pixels; not used with aspect 2.
 */


data class ConvertThumbnailRequest (

    @Json(name = "aspect")
    val aspect: kotlin.Int? = null,

    @Json(name = "first")
    val first: kotlin.Boolean? = null,

    @Json(name = "height")
    val height: kotlin.Int? = null,

    @Json(name = "width")
    val width: kotlin.Int? = null

) {


}

