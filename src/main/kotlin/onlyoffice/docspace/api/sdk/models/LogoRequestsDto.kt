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
 * The request parameters for the theme-specific logo configurations.
 *
 * @param light The URL or base64-encoded image data for the light theme logo.
 * @param dark The URL or base64-encoded image data for the dark theme logo.
 */


data class LogoRequestsDto (

    /* The URL or base64-encoded image data for the light theme logo. */
    @Json(name = "light")
    val light: kotlin.String? = null,

    /* The URL or base64-encoded image data for the dark theme logo. */
    @Json(name = "dark")
    val dark: kotlin.String? = null

) {


}

