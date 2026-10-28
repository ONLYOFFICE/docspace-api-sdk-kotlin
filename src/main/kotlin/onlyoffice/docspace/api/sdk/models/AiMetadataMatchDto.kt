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
 * Where a text search met the metadata of a file, a folder or a room: one string value that holds the searched text,  with the field it belongs to.
 *
 * @param templateId The ID of the metadata template the matching field belongs to. Null for a custom field, which belongs to no  template the API shows.
 * @param fieldId The ID of the matching template field. Null for a custom field, which is addressed by its name alone.
 * @param fieldName The name of the matching field: the template field or the custom field as it is shown in the entry metadata.
 * @param `value` The stored value that holds the searched text, as it was written, not only the matching part of it.
 */


data class AiMetadataMatchDto (

    @Json(name = "templateId")
    val templateId: kotlin.Int? = null,

    @Json(name = "fieldId")
    val fieldId: kotlin.Int? = null,

    @Json(name = "fieldName")
    val fieldName: kotlin.String? = null,

    @Json(name = "value")
    val `value`: kotlin.String? = null

) {


}

