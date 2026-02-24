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
 * 
 *
 * @param aspectRatio 
 * @param fillArea 
 * @param greater 
 * @param height 
 * @param ignoreAspectRatio 
 * @param isPercentage 
 * @param less 
 * @param limitPixels 
 * @param width 
 * @param x 
 * @param y 
 */


data class IMagickGeometry (

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

