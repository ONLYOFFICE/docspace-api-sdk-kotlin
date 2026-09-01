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
 * The request parameters for adding watermarks.
 *
 * @param enabled Specifies whether watermarks are on or off.
 * @param additions Specifies whether to display the following addditional information or not: username, user email, user IP address, current date and room name.
 * @param text The watermark text.
 * @param rotate The watermark text and image rotate angle.
 * @param imageScale The watermark image scale.
 * @param imageUrl The path to the temporary image file.
 * @param imageHeight The watermark image height.
 * @param imageWidth The watermark image width.
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

