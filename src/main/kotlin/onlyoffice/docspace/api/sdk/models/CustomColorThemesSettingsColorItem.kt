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
 * The custom color theme color parameters.
 *
 * @param accent The accent color.
 * @param buttons The button color.
 */


data class CustomColorThemesSettingsColorItem (

    /* The accent color. */
    @Json(name = "accent")
    val accent: kotlin.String? = null,

    /* The button color. */
    @Json(name = "buttons")
    val buttons: kotlin.String? = null

) {


}

