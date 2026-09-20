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
 * Whether one branding slot still holds the built-in image or wordmark.
 *
 * @param name The stable name of the slot, matching the `name` of the same slot in  `GET api/2.0/settings/whitelabel/logos` - `LightSmall`, `LoginPage`, `Favicon`, `DocsEditor` and the rest,  plus `Notification`, which that list leaves out. The wordmark check reports the fixed name `logotext`  instead of a slot.
 * @param default Whether the slot has never been written for this portal, in which case the built-in image is what gets  rendered. It turns `false` once an image has been stored, for either the light or the dark theme, and back  to `true` after the matching restore operation. For `logotext` it stays `true` when the built-in wordmark  itself is saved, because saving that value counts as clearing the setting.
 */


data class IsDefaultWhiteLabelLogosDto (

    @Json(name = "name")
    val name: kotlin.String?,

    @Json(name = "default")
    val default: kotlin.Boolean

) {


}

