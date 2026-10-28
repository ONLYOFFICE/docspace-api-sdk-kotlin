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

import onlyoffice.docspace.api.sdk.models.WatermarkAdditions

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The watermark drawn over the documents of a room.
 *
 * @param enabled Whether the room draws a watermark at all. Sending the object with this turned off removes the watermark the  room has, and the rest of the fields are then irrelevant.
 * @param additions Which details of the reader and of the room are stamped into the watermark alongside the text. The values  combine, so several of them can be added together to stamp more than one.
 * @param text The fixed line drawn over the document, shown before the details selected alongside it. It is the whole  watermark when no details are added.
 * @param rotate How far the watermark is turned, in degrees, with negative values turning it anticlockwise. Zero draws it  horizontally across the page.
 * @param imageScale How large the watermark image is drawn, as a percentage of its own size. It applies to the image form of the  watermark only.
 * @param imageUrl The picture to use instead of a text watermark, named by the path that `POST api/2.0/files/logos` returned for  an image uploaded beforehand. The portal copies it into the room when the setting is saved.
 * @param imageHeight The height the watermark image is drawn with, in pixels, used together with the width to keep its proportions.
 * @param imageWidth The width the watermark image is drawn with, in pixels, used together with the height to keep its proportions.
 */


data class WatermarkRequestDto (

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "additions")
    val additions: WatermarkAdditions? = null,

    @Json(name = "text")
    val text: kotlin.String? = null,

    @Json(name = "rotate")
    val rotate: kotlin.Int? = null,

    @Json(name = "imageScale")
    val imageScale: kotlin.Int? = null,

    @Json(name = "imageUrl")
    val imageUrl: kotlin.String? = null,

    @Json(name = "imageHeight")
    val imageHeight: kotlin.Double? = null,

    @Json(name = "imageWidth")
    val imageWidth: kotlin.Double? = null

) {


}

