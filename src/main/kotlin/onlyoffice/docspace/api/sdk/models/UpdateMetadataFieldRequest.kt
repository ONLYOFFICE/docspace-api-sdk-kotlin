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

import onlyoffice.docspace.api.sdk.models.MetadataFieldOptionRequest
import onlyoffice.docspace.api.sdk.models.MetadataFieldType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The parameters of a metadata field update. Every property is optional: a property that is omitted keeps its current value.
 *
 * @param name The new field name.
 * @param type The new field type. The type can be changed only while the field has no values.
 * @param options The new choice options of the field. The options in use cannot be removed.
 * @param order The new display position of the field inside the template: the fields are shown by it ascending.
 */


data class UpdateMetadataFieldRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "type")
    val type: MetadataFieldType? = null,

    @Json(name = "options")
    val options: kotlin.collections.List<MetadataFieldOptionRequest>? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null

) {


}

