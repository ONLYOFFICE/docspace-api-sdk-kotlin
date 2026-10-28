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

import onlyoffice.docspace.api.sdk.models.FilterType
import onlyoffice.docspace.api.sdk.models.MetadataFilterConditionRequest
import onlyoffice.docspace.api.sdk.models.SortOrder

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The typed form of the metadata search of a folder: the same filter the folder listing takes in the metadataTemplateId  and metadataFilters query parameters, with the conditions as objects instead of a JSON string.
 *
 * @param metadataTemplateId The ID of the metadata template the entries must be assigned to. On its own it narrows the listing to the entries  carrying the template; together with the conditions it also pins the template the filtered fields belong to.
 * @param metadataFilters The metadata filter conditions, combined with AND. A custom field is addressed by its name instead of the field ID.
 * @param includeHiddenMetadata Whether the text search, and the metadataMatches it reports, also look at the values of the hidden metadata  templates (created with visible false for the metadata a service keeps for itself, which the web client never  shows). False, the default, leaves them out, so an entry is not found by such a value; true takes them in.  metadataTemplateId and metadataFilters are not concerned: a hidden template or field named there is searched  either way.
 * @param filterValue The text to search for in the titles and in the string metadata values of the entries, the custom fields and the  template fields alike; an entry found by its metadata says where in metadataMatches.
 * @param withSubFolders Specifies whether to search the whole subtree of the folder (the default) or its direct children only.
 * @param filterType The filter type.
 * @param count The number of entries to return, from 1 to 100.
 * @param startIndex The zero-based index of the first entry to return.
 * @param sortBy The field to sort by, a name of the SortedByType values.
 * @param sortOrder The sort order.
 */


data class FolderMetadataSearch (

    @Json(name = "metadataTemplateId")
    val metadataTemplateId: kotlin.Int? = null,

    @Json(name = "metadataFilters")
    val metadataFilters: kotlin.collections.List<MetadataFilterConditionRequest>? = null,

    @Json(name = "includeHiddenMetadata")
    val includeHiddenMetadata: kotlin.Boolean? = null,

    @Json(name = "filterValue")
    val filterValue: kotlin.String? = null,

    @Json(name = "withSubFolders")
    val withSubFolders: kotlin.Boolean? = null,

    @Json(name = "filterType")
    val filterType: FilterType? = null,

    @Json(name = "count")
    val count: kotlin.Int? = null,

    @Json(name = "startIndex")
    val startIndex: kotlin.Int? = null,

    @Json(name = "sortBy")
    val sortBy: kotlin.String? = null,

    @Json(name = "sortOrder")
    val sortOrder: SortOrder? = null

) {


}

