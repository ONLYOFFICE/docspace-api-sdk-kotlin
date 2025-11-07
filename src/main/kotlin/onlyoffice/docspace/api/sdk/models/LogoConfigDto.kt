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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The logo config parameters.
 *
 * @param image The image of the logo.
 * @param imageDark The dark image of the logo.
 * @param imageLight The light image of the logo.
 * @param imageEmbedded The embedded image of the logo.
 * @param url The url link of the logo.
 * @param visible Specifies if the logo is visible.
 */


data class LogoConfigDto (

    /* The image of the logo. */
    @Json(name = "image")
    val image: kotlin.String? = null,

    /* The dark image of the logo. */
    @Json(name = "imageDark")
    val imageDark: kotlin.String? = null,

    /* The light image of the logo. */
    @Json(name = "imageLight")
    val imageLight: kotlin.String? = null,

    /* The embedded image of the logo. */
    @Json(name = "imageEmbedded")
    val imageEmbedded: kotlin.String? = null,

    /* The url link of the logo. */
    @Json(name = "url")
    val url: kotlin.String? = null,

    /* Specifies if the logo is visible. */
    @Json(name = "visible")
    val visible: kotlin.Boolean? = null

) {


}

