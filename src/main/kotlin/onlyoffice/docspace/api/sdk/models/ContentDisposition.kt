 /*
 * (c) Copyright Ascensio System SIA 2025
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
 * @param dispositionType 
 * @param parameters 
 * @param fileName 
 * @param creationDate 
 * @param modificationDate 
 * @param `inline` 
 * @param readDate 
 * @param propertySize 
 */


data class ContentDisposition (

    @Json(name = "dispositionType")
    val dispositionType: kotlin.String? = null,

    @Json(name = "parameters")
    val parameters: kotlin.collections.List<kotlin.Any>? = null,

    @Json(name = "fileName")
    val fileName: kotlin.String? = null,

    @Json(name = "creationDate")
    val creationDate: java.time.OffsetDateTime? = null,

    @Json(name = "modificationDate")
    val modificationDate: java.time.OffsetDateTime? = null,

    @Json(name = "inline")
    val `inline`: kotlin.Boolean? = null,

    @Json(name = "readDate")
    val readDate: java.time.OffsetDateTime? = null,

    @Json(name = "size")
    val propertySize: kotlin.Long? = null

) {


}

