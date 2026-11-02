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

import onlyoffice.docspace.api.sdk.models.CustomFieldValueDto
import onlyoffice.docspace.api.sdk.models.EntryTemplateDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The metadata of an entry: the assigned templates with their values, and the custom fields holding a value.
 *
 * @param templates The assigned metadata templates, each field carrying its value on the entry.
 * @param customFields The custom fields with their values.
 * @param hasMetadataFields Whether the entry has a metadata field a user can see and fill, by hand or with the AI filling: a field of a  template in `templates` whose `visible` is true, or a custom field in `customFields`. False when both lists are  empty, when every template is hidden, or when none of the visible ones has a field. It says nothing about the  values: it stays true once every field is filled. The same flag is carried by the entry in a folder listing and  in the file and folder info responses as `hasMetadataFields`, so a client that has the listing needs no call here  to decide whether to offer the filling.
 */


data class EntryMetadataDto (

    @Json(name = "templates")
    val templates: kotlin.collections.List<EntryTemplateDto>? = null,

    @Json(name = "customFields")
    val customFields: kotlin.collections.List<CustomFieldValueDto>? = null,

    @Json(name = "hasMetadataFields")
    val hasMetadataFields: kotlin.Boolean? = null

) {


}

