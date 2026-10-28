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

import onlyoffice.docspace.api.sdk.models.MetadataFieldRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for creating a metadata template.
 *
 * @param name The template name.
 * @param visible Specifies if the template is visible in the UI pickers.
 * @param fields The template metadata fields.
 */


data class CreateMetadataTemplateRequestDto (

    @Json(name = "name")
    val name: kotlin.String?,

    @Json(name = "visible")
    val visible: kotlin.Boolean? = null,

    @Json(name = "fields")
    val fields: kotlin.collections.List<MetadataFieldRequest>? = null

) {


}

