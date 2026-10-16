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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One metadata filter condition as the clients send it: an element of the metadataFilters JSON of the listings and of  the body of the search endpoints. All conditions are combined with AND.
 *
 * @param fieldId The ID of the template field the condition is on. A custom field is addressed by ASC.Files.Core.MetadataFilterConditionRequest.Name instead.
 * @param name The name of a custom field, for the conditions on the custom fields, which have no identifier outside. Either the  field ID or the name is given; the name is matched without regard to case.
 * @param op The operator, one of ASC.Files.Core.MetadataFilterOperators: eq or contains for a string field, eq, range,  gt, gte, lt or lte for a number field, range, gt, gte, lt or lte for a date field, in for a  choice field. Optional: an omitted operator is read as eq for a string, as range for a date, as in for a  choice, and for a number as eq when a value is given or as range when a bound is. A present one has to belong  to the field type and to the arguments: eq takes a value, range takes bounds.
 * @param `value` The value of a single-valued condition: the whole or a part of a string field, the exact value of a number field,  or the bound of a gt, gte, lt or lte condition on a number or a date field. A JSON number is accepted as  well as a string. A date given without a time (2026-06-30) names the whole day (UTC).
 * @param from The inclusive lower bound of a range. A date given without a time (2026-06-01) is the start of that day (UTC).
 * @param to The inclusive upper bound of a range. A date given without a time (2026-06-30) covers the whole day (UTC);  a value with a time is an instant and is taken as is.
 * @param optionIds The options any of which the choice field must hold.
 */


data class MetadataFilterConditionRequest (

    @Json(name = "fieldId")
    val fieldId: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "op")
    val op: kotlin.String? = null,

    @Json(name = "value")
    val `value`: kotlin.String? = null,

    @Json(name = "from")
    val from: kotlin.String? = null,

    @Json(name = "to")
    val to: kotlin.String? = null,

    @Json(name = "optionIds")
    val optionIds: kotlin.collections.List<java.util.UUID>? = null

) {


}

