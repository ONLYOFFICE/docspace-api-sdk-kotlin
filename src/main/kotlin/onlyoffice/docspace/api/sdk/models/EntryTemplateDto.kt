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

import onlyoffice.docspace.api.sdk.models.EntryFieldDto
import onlyoffice.docspace.api.sdk.models.MetadataConflictResolveType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A metadata template assigned to an entry: the template with every field of it, each field carrying its value on the entry.
 *
 * @param id The template ID.
 * @param name The template name.
 * @param visible Specifies if the template is visible in the UI pickers.
 * @param cascade Whether the template cascades from this entry to the folders and files below it. Only a folder or a room can  cascade; on a file the value is always false.
 * @param conflictResolveType How the cascade of this entry treats a value an entry below already holds. Null while the template does not  cascade from this entry.
 * @param fields The template fields with their values on the entry.
 */


data class EntryTemplateDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "visible")
    val visible: kotlin.Boolean? = null,

    @Json(name = "cascade")
    val cascade: kotlin.Boolean? = null,

    @Json(name = "conflictResolveType")
    val conflictResolveType: MetadataConflictResolveType? = null,

    @Json(name = "fields")
    val fields: kotlin.collections.List<EntryFieldDto>? = null

) {


}

