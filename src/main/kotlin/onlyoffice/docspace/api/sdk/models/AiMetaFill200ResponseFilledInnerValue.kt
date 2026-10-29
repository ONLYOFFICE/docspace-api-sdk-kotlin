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

import onlyoffice.docspace.api.sdk.models.AiMetadataValue

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param stringValue 
 * @param numberValue 
 * @param dateValue ISO 8601 date-time, UTC midnight of the date.
 * @param optionIds 
 */


data class AiMetaFill200ResponseFilledInnerValue (

    @Json(name = "stringValue")
    val stringValue: kotlin.String? = null,

    @Json(name = "numberValue")
    val numberValue: java.math.BigDecimal? = null,

    @Json(name = "dateValue")
    val dateValue: kotlin.String? = null,

    @Json(name = "optionIds")
    val optionIds: kotlin.collections.List<kotlin.String>? = null

) {


}

