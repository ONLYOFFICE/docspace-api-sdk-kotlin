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

import onlyoffice.docspace.api.sdk.models.Paragraph

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The document watermark parameters.
 *
 * @param width Defines the watermark width measured in millimeters.
 * @param height Defines the watermark height measured in millimeters.
 * @param margins Defines the watermark margins measured in millimeters.
 * @param fill Defines the watermark fill color.
 * @param rotate Defines the watermark rotation angle.
 * @param transparent Defines the watermark transparency percentage.
 * @param paragraphs The list of paragraphs of the watermark.
 */


data class WatermarkOnDraw (

    @Json(name = "width")
    val width: kotlin.Double? = null,

    @Json(name = "height")
    val height: kotlin.Double? = null,

    @Json(name = "margins")
    val margins: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "fill")
    val fill: kotlin.String? = null,

    @Json(name = "rotate")
    val rotate: kotlin.Int? = null,

    @Json(name = "transparent")
    val transparent: kotlin.Double? = null,

    @Json(name = "paragraphs")
    val paragraphs: kotlin.collections.List<Paragraph>? = null

) {


}

