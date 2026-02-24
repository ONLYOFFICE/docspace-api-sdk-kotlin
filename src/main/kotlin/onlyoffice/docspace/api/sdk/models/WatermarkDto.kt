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
 * The watermark settings.
 *
 * @param additions 
 * @param rotate The watermark text and image rotate.
 * @param imageScale The watermark image scale.
 * @param imageHeight The watermark image height.
 * @param imageWidth The watermark image width.
 * @param text The watermark text.
 * @param imageUrl The watermark image url.
 */


data class WatermarkDto (

    @Json(name = "additions")
    val additions: WatermarkAdditions,

    /* The watermark text and image rotate. */
    @Json(name = "rotate")
    val rotate: kotlin.Int,

    /* The watermark image scale. */
    @Json(name = "imageScale")
    val imageScale: kotlin.Int,

    /* The watermark image height. */
    @Json(name = "imageHeight")
    val imageHeight: kotlin.Double,

    /* The watermark image width. */
    @Json(name = "imageWidth")
    val imageWidth: kotlin.Double,

    /* The watermark text. */
    @Json(name = "text")
    val text: kotlin.String? = null,

    /* The watermark image url. */
    @Json(name = "imageUrl")
    val imageUrl: kotlin.String? = null

) {


}

