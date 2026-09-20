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
 * The custom colour theme being saved, the theme being selected, or both.
 *
 * @param theme The theme to store, with its accent and button colours for the interface and for the text on it. An `id` that  matches a stored custom theme replaces it, an unknown `id` appends a new one, and an `id` belonging to a  built-in theme is treated as a request for a new custom theme rather than overwriting the built-in one. Once  the plan limit on custom themes is reached a new theme is silently not added, so compare the returned themes  against `limit` instead of assuming it was saved. Leave it out to change only the selection.
 * @param selected The theme the whole portal switches to, by theme ID. An ID matching no stored theme is ignored rather than  refused, and leaving it out keeps the selection as it is.
 */


data class CustomColorThemesSettingsRequestsDto (

    @Json(name = "theme")
    val theme: CustomColorThemesSettingsItem? = null,

    @Json(name = "selected")
    val selected: kotlin.Int? = null

) {


}

