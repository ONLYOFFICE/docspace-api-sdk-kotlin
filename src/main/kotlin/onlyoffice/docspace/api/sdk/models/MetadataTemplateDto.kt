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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.EmployeeDto
import onlyoffice.docspace.api.sdk.models.MetadataFieldDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The metadata template information.
 *
 * @param id The template ID.
 * @param name The template name.
 * @param visible Specifies if the template is visible in the UI pickers.
 * @param createBy The user who created the template. A user who has since left the portal comes back as the lost user placeholder.
 * @param createOn The template creation date.
 * @param modifiedBy The user who changed the template itself last: its name or its visibility. The creator until somebody changes  it; a change of a field is recorded on the field, not here.
 * @param modifiedOn The date when the template was modified last.
 * @param fields The template metadata fields.
 */


data class MetadataTemplateDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "visible")
    val visible: kotlin.Boolean? = null,

    @Json(name = "createBy")
    val createBy: EmployeeDto? = null,

    @Json(name = "createOn")
    val createOn: ApiDateTime? = null,

    @Json(name = "modifiedBy")
    val modifiedBy: EmployeeDto? = null,

    @Json(name = "modifiedOn")
    val modifiedOn: ApiDateTime? = null,

    @Json(name = "fields")
    val fields: kotlin.collections.List<MetadataFieldDto>? = null

) {


}

