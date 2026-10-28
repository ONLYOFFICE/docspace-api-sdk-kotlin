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

import onlyoffice.docspace.api.sdk.models.ColorThemeColorsRequestDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A colour theme to store.
 *
 * @param id The id of the custom theme to replace, or an id no stored theme has to add a new one.
 * @param name Accepted for compatibility with earlier clients and not read: a custom theme is always stored without a name.
 * @param main The accent and button colours of the interface. Left out, a stored theme keeps its own.
 * @param text The colours of the text shown on the accent and on the buttons. Left out, a stored theme keeps its own.
 */


data class CustomColorThemeRequestDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "main")
    val main: ColorThemeColorsRequestDto? = null,

    @Json(name = "text")
    val text: ColorThemeColorsRequestDto? = null

) {


}

