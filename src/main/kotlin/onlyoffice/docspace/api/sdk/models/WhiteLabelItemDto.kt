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

import onlyoffice.docspace.api.sdk.models.IMagickGeometry
import onlyoffice.docspace.api.sdk.models.WhiteLabelItemPathDto
import onlyoffice.docspace.api.sdk.models.WhiteLabelLogoType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The white label item parameters.
 *
 * @param type The white label logo type.
 * @param name The white label file name.
 * @param propertySize The white label file size.
 * @param path The white label file path.
 */


data class WhiteLabelItemDto (

    @Json(name = "type")
    val type: WhiteLabelLogoType? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "size")
    val propertySize: IMagickGeometry? = null,

    @Json(name = "path")
    val path: WhiteLabelItemPathDto? = null

) {


}

