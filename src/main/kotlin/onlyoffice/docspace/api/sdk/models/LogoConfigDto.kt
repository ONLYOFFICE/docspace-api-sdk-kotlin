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
 * The logo the editor shows, resolved for the file type and the layout of this opening.
 *
 * @param image The logo for the current layout and file type, as the portal branding defines it.
 * @param imageDark The variant for a dark interface theme.
 * @param imageLight The variant for a light interface theme.
 * @param imageEmbedded The variant for the framed viewer. It is empty in every layout but the embedded one.
 * @param url Where clicking the logo takes the user.
 * @param visible Whether the logo is shown at all; the mobile layout hides it.
 */


data class LogoConfigDto (

    @Json(name = "image")
    val image: kotlin.String? = null,

    @Json(name = "imageDark")
    val imageDark: kotlin.String? = null,

    @Json(name = "imageLight")
    val imageLight: kotlin.String? = null,

    @Json(name = "imageEmbedded")
    val imageEmbedded: kotlin.String? = null,

    @Json(name = "url")
    val url: kotlin.String? = null,

    @Json(name = "visible")
    val visible: kotlin.Boolean? = null

) {


}

