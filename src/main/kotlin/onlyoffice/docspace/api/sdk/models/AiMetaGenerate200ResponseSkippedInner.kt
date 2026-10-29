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
 * @param id 
 * @param reason 
 * @param title 
 */


data class AiMetaGenerate200ResponseSkippedInner (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "reason")
    val reason: AiMetaGenerate200ResponseSkippedInner.Reason,

    @Json(name = "title")
    val title: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: unsupported,limit,forbidden,not_found,empty,failed
     */
    @JsonClass(generateAdapter = false)
    enum class Reason(val value: kotlin.String) {
        @Json(name = "unsupported") unsupported("unsupported"),
        @Json(name = "limit") limit("limit"),
        @Json(name = "forbidden") forbidden("forbidden"),
        @Json(name = "not_found") not_found("not_found"),
        @Json(name = "empty") empty("empty"),
        @Json(name = "failed") failed("failed");
    }

}

