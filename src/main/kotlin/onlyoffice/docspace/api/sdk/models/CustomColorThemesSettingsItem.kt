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

import onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsColorItem

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The custom color theme settings.
 *
 * @param id The custom color theme ID.
 * @param name The custom color theme name.
 * @param main The custom color theme main colors.
 * @param text The custom color theme text colors.
 */


data class CustomColorThemesSettingsItem (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "main")
    val main: CustomColorThemesSettingsColorItem? = null,

    @Json(name = "text")
    val text: CustomColorThemesSettingsColorItem? = null

) {


}

