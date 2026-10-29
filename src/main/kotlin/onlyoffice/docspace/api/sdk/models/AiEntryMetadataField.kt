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

import onlyoffice.docspace.api.sdk.models.AiEntryMetadataFieldOptionsInner
import onlyoffice.docspace.api.sdk.models.AiMetadataValue

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param type `MetadataFieldType`: 0 String, 1 Date, 2 Number, 3 SingleChoice, 4 MultiChoice.
 * @param options 
 * @param `value` 
 */


data class AiEntryMetadataField (

    @Json(name = "id")
    val id: java.math.BigDecimal,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "type")
    val type: java.math.BigDecimal,

    @Json(name = "options")
    val options: kotlin.collections.List<AiEntryMetadataFieldOptionsInner>,

    @Json(name = "value")
    val `value`: AiMetadataValue? = null

) {


}

