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
 * The part of an uploaded picture to use as the logo.
 *
 * @param tmpFile The picture to cut the logo out of, named by the path that `POST api/2.0/files/logos` returned for it. The  path may be used once and only by the account that uploaded it.
 * @param x The left edge of the rectangle cut out of the uploaded picture, counted in pixels from its left side. The  picture itself was already scaled down to fit 1280 by 1280 pixels when it was uploaded.
 * @param y The top edge of the rectangle cut out of the uploaded picture, counted in pixels from its top.
 * @param width How wide a piece of the uploaded picture to cut out, in pixels. It has to be sent together with the height,  and the portal builds the four logo sizes out of the piece.
 * @param height How tall a piece of the uploaded picture to cut out, in pixels. It has to be sent together with the width.
 */


data class LogoRequest (

    @Json(name = "tmpFile")
    val tmpFile: kotlin.String,

    @Json(name = "x")
    val x: kotlin.Int? = null,

    @Json(name = "y")
    val y: kotlin.Int? = null,

    @Json(name = "width")
    val width: kotlin.Int? = null,

    @Json(name = "height")
    val height: kotlin.Int? = null

) {


}

