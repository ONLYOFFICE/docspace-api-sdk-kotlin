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
 * The parameters of a metadata field value.
 *
 * @param fieldId The field ID.
 * @param stringValue The string value.
 * @param numberValue The number value.
 * @param dateValue The date value. A value without a time zone offset is treated as UTC, the same way the metadata filters treat their date bounds.
 * @param optionIds The selected choice option IDs.
 */


data class MetadataValueRequest (

    @Json(name = "fieldId")
    val fieldId: kotlin.Int,

    @Json(name = "stringValue")
    val stringValue: kotlin.String? = null,

    @Json(name = "numberValue")
    val numberValue: kotlin.Long? = null,

    @Json(name = "dateValue")
    val dateValue: java.time.OffsetDateTime? = null,

    @Json(name = "optionIds")
    val optionIds: kotlin.collections.List<java.util.UUID>? = null

) {


}

