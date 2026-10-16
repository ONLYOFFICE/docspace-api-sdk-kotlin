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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The value of a metadata field on an entry. Exactly one of the value properties is set, the one matching the field type:  `stringValue` for a string field, `numberValue` for a number field, `dateValue` for a date field,  `optionIds` for a single or multiple choice field.
 *
 * @param stringValue The string value.
 * @param numberValue The number value.
 * @param dateValue The date value.
 * @param optionIds The selected choice option IDs.
 */


data class MetadataValueDto (

    @Json(name = "stringValue")
    val stringValue: kotlin.String? = null,

    @Json(name = "numberValue")
    val numberValue: kotlin.Long? = null,

    @Json(name = "dateValue")
    val dateValue: ApiDateTime? = null,

    @Json(name = "optionIds")
    val optionIds: kotlin.collections.List<java.util.UUID>? = null

) {


}

