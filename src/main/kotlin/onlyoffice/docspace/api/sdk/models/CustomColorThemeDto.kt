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

import onlyoffice.docspace.api.sdk.models.ColorThemeColorsDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One colour theme of the portal interface.
 *
 * @param id The theme id; the built-in themes have the lowest ids.
 * @param name The theme name; empty for a custom theme.
 * @param main The accent and button colours of the interface.
 * @param text The colours of the text shown on the accent and on the buttons.
 */


data class CustomColorThemeDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "main")
    val main: ColorThemeColorsDto? = null,

    @Json(name = "text")
    val text: ColorThemeColorsDto? = null

) {


}

