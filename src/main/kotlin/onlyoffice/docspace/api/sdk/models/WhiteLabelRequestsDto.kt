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

import onlyoffice.docspace.api.sdk.models.ItemKeyValuePairStringLogoRequestsDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for configuring the white label branding settings.
 *
 * @param logoText The text to display alongside or in place of the logo.
 * @param logo The white label tenant IDs with their logos (light or dark).
 */


data class WhiteLabelRequestsDto (

    /* The text to display alongside or in place of the logo. */
    @Json(name = "logoText")
    val logoText: kotlin.String? = null,

    /* The white label tenant IDs with their logos (light or dark). */
    @Json(name = "logo")
    val logo: kotlin.collections.List<ItemKeyValuePairStringLogoRequestsDto>? = null

) {


}

