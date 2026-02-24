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
 * The thumbnails data parameters.
 *
 * @param original The thumbnail original photo.
 * @param retina The thumbnail retina.
 * @param max The thumbnail maximum size photo.
 * @param big The thumbnail big size photo.
 * @param medium The thumbnail medium size photo.
 * @param small The thumbnail small size photo.
 */


data class ThumbnailsDataDto (

    /* The thumbnail original photo. */
    @Json(name = "original")
    val original: kotlin.String? = null,

    /* The thumbnail retina. */
    @Json(name = "retina")
    val retina: kotlin.String? = null,

    /* The thumbnail maximum size photo. */
    @Json(name = "max")
    val max: kotlin.String? = null,

    /* The thumbnail big size photo. */
    @Json(name = "big")
    val big: kotlin.String? = null,

    /* The thumbnail medium size photo. */
    @Json(name = "medium")
    val medium: kotlin.String? = null,

    /* The thumbnail small size photo. */
    @Json(name = "small")
    val small: kotlin.String? = null

) {


}

