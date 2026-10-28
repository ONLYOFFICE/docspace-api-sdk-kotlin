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

import onlyoffice.docspace.api.sdk.models.WhiteLabelItemPathDto
import onlyoffice.docspace.api.sdk.models.WhiteLabelItemSizeDto
import onlyoffice.docspace.api.sdk.models.WhiteLabelLogoType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One branding logo slot of the portal: the size it is drawn at, and where its images are served from.
 *
 * @param type Which branding slot this entry describes. `Notification` is part of the type but never appears here: that  logo is derived from the login-page one and used only in letters.
 * @param name The stable name of the same slot, which is what `GET api/2.0/settings/whitelabel/logos/isdefault` keys its  entries by. It is a name to match on, not a file name.
 * @param propertySize The pixel box the slot is drawn in. Only `width` and `height` carry information here; the resize flags and  offsets alongside them are left at their defaults and say nothing about how an uploaded image is treated.
 * @param path The absolute URLs to render the slot from, one per theme.
 */


data class WhiteLabelItemDto (

    @Json(name = "type")
    val type: WhiteLabelLogoType? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "size")
    val propertySize: WhiteLabelItemSizeDto? = null,

    @Json(name = "path")
    val path: WhiteLabelItemPathDto? = null

) {


}

