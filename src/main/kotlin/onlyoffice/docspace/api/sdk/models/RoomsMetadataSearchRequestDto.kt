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

import onlyoffice.docspace.api.sdk.models.MetadataFilterConditionRequest
import onlyoffice.docspace.api.sdk.models.RoomType
import onlyoffice.docspace.api.sdk.models.SearchArea
import onlyoffice.docspace.api.sdk.models.SortOrder

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The typed form of the metadata search of the rooms: the same filter the rooms listing takes in the metadataTemplateId  and metadataFilters query parameters, with the conditions as objects instead of a JSON string.
 *
 * @param metadataTemplateId The ID of the metadata template the rooms must be assigned to. On its own it narrows the listing to the rooms  carrying the template; together with the conditions it also pins the template the filtered fields belong to.
 * @param metadataFilters The metadata filter conditions, combined with AND. A custom field is addressed by its name instead of the field ID.
 * @param includeHiddenMetadata Whether the text search, and the metadataMatches it reports, also look at the values of the hidden metadata  templates (created with visible false for the metadata a service keeps for itself, which the web client never  shows). False, the default, leaves them out, so an entry is not found by such a value; true takes them in.  metadataTemplateId and metadataFilters are not concerned: a hidden template or field named there is searched  either way.
 * @param filterValue The text to search for in the room titles and in the string metadata values of the rooms, the custom fields and  the template fields alike; a room found by its metadata says where in metadataMatches.
 * @param searchArea The section to search in: the active rooms (the default), the archive or the templates.
 * @param type The room types to search among.
 * @param count The number of rooms to return, from 1 to 100.
 * @param startIndex The zero-based index of the first room to return.
 * @param sortBy The field to sort by, a name of the SortedByType values.
 * @param sortOrder The sort order.
 */


data class RoomsMetadataSearchRequestDto (

    @Json(name = "metadataTemplateId")
    val metadataTemplateId: kotlin.Int? = null,

    @Json(name = "metadataFilters")
    val metadataFilters: kotlin.collections.List<MetadataFilterConditionRequest>? = null,

    @Json(name = "includeHiddenMetadata")
    val includeHiddenMetadata: kotlin.Boolean? = null,

    @Json(name = "filterValue")
    val filterValue: kotlin.String? = null,

    @Json(name = "searchArea")
    val searchArea: SearchArea? = null,

    @Json(name = "type")
    val type: kotlin.collections.List<RoomType>? = null,

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

