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

import onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsItem

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The custom color themes settings.
 *
 * @param themes The list of the custom color themes.
 * @param selected Specifies whether the custom color theme is selected.
 * @param limit The maximum number of the custom color themes.
 */


data class CustomColorThemesSettingsDto (

    @Json(name = "themes")
    val themes: kotlin.collections.List<CustomColorThemesSettingsItem>? = null,

    @Json(name = "selected")
    val selected: kotlin.Int? = null,

    @Json(name = "limit")
    val limit: kotlin.Int? = null

) {


}

