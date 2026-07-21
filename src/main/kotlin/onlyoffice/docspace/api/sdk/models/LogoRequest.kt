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
 * The logo request parameters.
 *
 * @param tmpFile The path to the temporary image file.
 * @param x The X coordinate of the rectangle starting point.
 * @param y The Y coordinate of the rectangle starting point.
 * @param width The rectangle width.
 * @param height The rectangle height.
 */


data class LogoRequest (

    /* The path to the temporary image file. */
    @Json(name = "tmpFile")
    val tmpFile: kotlin.String,

    /* The X coordinate of the rectangle starting point. */
    @Json(name = "x")
    val x: kotlin.Int? = null,

    /* The Y coordinate of the rectangle starting point. */
    @Json(name = "y")
    val y: kotlin.Int? = null,

    /* The rectangle width. */
    @Json(name = "width")
    val width: kotlin.Int? = null,

    /* The rectangle height. */
    @Json(name = "height")
    val height: kotlin.Int? = null

) {


}

