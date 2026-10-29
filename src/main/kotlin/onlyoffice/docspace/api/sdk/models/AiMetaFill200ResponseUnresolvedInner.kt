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
 * 
 *
 * @param name 
 * @param reason 
 * @param fieldId 
 */


data class AiMetaFill200ResponseUnresolvedInner (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "reason")
    val reason: AiMetaFill200ResponseUnresolvedInner.Reason,

    @Json(name = "fieldId")
    val fieldId: java.math.BigDecimal? = null

) {

    /**
     * 
     *
     * Values: already_set,not_found,invalid_value,unknown_option,write_failed
     */
    @JsonClass(generateAdapter = false)
    enum class Reason(val value: kotlin.String) {
        @Json(name = "already_set") already_set("already_set"),
        @Json(name = "not_found") not_found("not_found"),
        @Json(name = "invalid_value") invalid_value("invalid_value"),
        @Json(name = "unknown_option") unknown_option("unknown_option"),
        @Json(name = "write_failed") write_failed("write_failed");
    }

}

