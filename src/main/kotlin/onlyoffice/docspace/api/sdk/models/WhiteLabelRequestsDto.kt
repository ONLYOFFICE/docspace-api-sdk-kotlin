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

import onlyoffice.docspace.api.sdk.models.ItemKeyValuePairStringLogoRequestsDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The branding a portal is given: the wordmark, the logo images, or both.
 *
 * @param logoText The wordmark printed next to or instead of a logo image, on the login page, in the editors and in  notification letters. An empty or blank value, and the built-in `ONLYOFFICE` itself, clear the setting rather  than store it. The text is not rendered into the logo images, which carry their own wordmark.
 * @param logo The logo images to store, each entry naming a logo slot in its `key` - the numeric `type` published by  `GET api/2.0/settings/whitelabel/logos` - and carrying the two theme images in its value. A slot left out of  the list keeps the image it has, so this is a partial update rather than a replacement of the whole branding.  Saving the login-page slot also rebuilds the notification logo from it.
 */


data class WhiteLabelRequestsDto (

    @Json(name = "logoText")
    val logoText: kotlin.String? = null,

    @Json(name = "logo")
    val logo: kotlin.collections.List<ItemKeyValuePairStringLogoRequestsDto>? = null

) {


}

