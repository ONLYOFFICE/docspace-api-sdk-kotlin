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
 * The colour themes the portal offers, which of them is applied, and how many the plan allows.
 *
 * @param themes Every theme the portal can apply, ordered by ID, with the built-in ones first because they were created  first. It is never empty - the built-in themes cannot be deleted - and a custom theme is one whose ID is  higher than the built-in ones.
 * @param selected The ID of the theme in `themes` that is currently applied to the whole portal. Deleting the applied theme  moves it to the lowest remaining ID, so it can change without anyone having chosen a new one.
 * @param limit How many entries `themes` may hold in total, built-in ones included; `0` means the plan caps nothing. Once  the cap is reached `PUT api/2.0/settings/colortheme` drops a new theme silently instead of failing, so  compare this with the length of `themes` to tell whether a save took effect.
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

