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

import onlyoffice.docspace.api.sdk.models.WatermarkAdditions

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for adding watermarks.
 *
 * @param enabled Specifies whether watermarks are on or off.
 * @param additions 
 * @param text The watermark text.
 * @param rotate The watermark text and image rotate angle.
 * @param imageScale The watermark image scale.
 * @param imageUrl The path to the temporary image file.
 * @param imageHeight The watermark image height.
 * @param imageWidth The watermark image width.
 */


data class WatermarkRequestDto (

    /* Specifies whether watermarks are on or off. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "additions")
    val additions: WatermarkAdditions? = null,

    /* The watermark text. */
    @Json(name = "text")
    val text: kotlin.String? = null,

    /* The watermark text and image rotate angle. */
    @Json(name = "rotate")
    val rotate: kotlin.Int? = null,

    /* The watermark image scale. */
    @Json(name = "imageScale")
    val imageScale: kotlin.Int? = null,

    /* The path to the temporary image file. */
    @Json(name = "imageUrl")
    val imageUrl: kotlin.String? = null,

    /* The watermark image height. */
    @Json(name = "imageHeight")
    val imageHeight: kotlin.Double? = null,

    /* The watermark image width. */
    @Json(name = "imageWidth")
    val imageWidth: kotlin.Double? = null

) {


}

