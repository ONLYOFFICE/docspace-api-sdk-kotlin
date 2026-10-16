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

import onlyoffice.docspace.api.sdk.models.MetadataFieldOptionDto
import onlyoffice.docspace.api.sdk.models.MetadataFieldType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The metadata field information.
 *
 * @param id The field ID.
 * @param templateId The ID of the template the field belongs to.
 * @param name The field name.
 * @param type The field type.
 * @param options The choice options of the field.
 * @param order The field display order inside the template.
 */


data class MetadataFieldDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "templateId")
    val templateId: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "type")
    val type: MetadataFieldType? = null,

    @Json(name = "options")
    val options: kotlin.collections.List<MetadataFieldOptionDto>? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null

) {


}

