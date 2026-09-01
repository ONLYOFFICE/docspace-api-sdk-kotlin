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
 * A field-scoped validation error: which form field was rejected, and why.
 *
 * @param `field` The rejected field.
 * @param message The human-readable reason the field was rejected.
 */


data class AiTErrorData (

    @Json(name = "field")
    val `field`: AiTErrorData.`Field`,

    @Json(name = "message")
    val message: kotlin.String

) {

    /**
     * The rejected field.
     *
     * Values: key,url,nameField
     */
    @JsonClass(generateAdapter = false)
    enum class `Field`(val value: kotlin.String) {
        @Json(name = "key") key("key"),
        @Json(name = "url") url("url"),
        @Json(name = "name") nameField("name");
    }

}

