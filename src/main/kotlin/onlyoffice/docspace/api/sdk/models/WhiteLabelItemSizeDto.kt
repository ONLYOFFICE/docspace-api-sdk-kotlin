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
 * The pixel box a logo slot is drawn in, in the shape the imaging library reports a geometry.
 *
 * @param aspectRatio Whether the numbers are to be read as an aspect ratio rather than as pixels. Always `false` on the sizes  this API reports.
 * @param fillArea Whether an image would be scaled to cover the box rather than to fit inside it. Always `false` here.
 * @param greater Whether scaling would apply only to an image larger than the box. Always `false` here.
 * @param height The height of the box in pixels - one of the two fields of this object that carry information.
 * @param ignoreAspectRatio Whether scaling would be allowed to distort the image. Always `false` here.
 * @param isPercentage Whether `width` and `height` are to be read as percentages. Always `false` here, so both are pixels.
 * @param less Whether scaling would apply only to an image smaller than the box. Always `false` here.
 * @param limitPixels Whether the box is to be read as a total pixel-area budget instead of as two dimensions. Always `false`  here.
 * @param width The width of the box in pixels - the other field of this object that carries information.
 * @param x The horizontal offset of the box from the origin. Always `0` here.
 * @param y The vertical offset of the box from the origin. Always `0` here.
 */


data class WhiteLabelItemSizeDto (

    @Json(name = "aspectRatio")
    val aspectRatio: kotlin.Boolean? = null,

    @Json(name = "fillArea")
    val fillArea: kotlin.Boolean? = null,

    @Json(name = "greater")
    val greater: kotlin.Boolean? = null,

    @Json(name = "height")
    val height: kotlin.Int? = null,

    @Json(name = "ignoreAspectRatio")
    val ignoreAspectRatio: kotlin.Boolean? = null,

    @Json(name = "isPercentage")
    val isPercentage: kotlin.Boolean? = null,

    @Json(name = "less")
    val less: kotlin.Boolean? = null,

    @Json(name = "limitPixels")
    val limitPixels: kotlin.Boolean? = null,

    @Json(name = "width")
    val width: kotlin.Int? = null,

    @Json(name = "x")
    val x: kotlin.Int? = null,

    @Json(name = "y")
    val y: kotlin.Int? = null

) {


}

