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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.EmployeeDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The response data for the API key operations.
 *
 * @param id The API key unique identifier.
 * @param name The API key name.
 * @param key The full API key value (only returned when creating a new key).
 * @param permissions The list of permissions granted to the API key.
 * @param isActive Indicates whether the API key is active or not.
 * @param keyPostfix The API key postfix (used for identification).
 * @param lastUsed 
 * @param createOn 
 * @param createBy 
 * @param expiresAt 
 */


data class ApiKeyResponseDto (

    /* The API key unique identifier. */
    @Json(name = "id")
    val id: java.util.UUID,

    /* The API key name. */
    @Json(name = "name")
    val name: kotlin.String?,

    /* The full API key value (only returned when creating a new key). */
    @Json(name = "key")
    val key: kotlin.String?,

    /* The list of permissions granted to the API key. */
    @Json(name = "permissions")
    val permissions: kotlin.collections.List<kotlin.String>?,

    /* Indicates whether the API key is active or not. */
    @Json(name = "isActive")
    val isActive: kotlin.Boolean,

    /* The API key postfix (used for identification). */
    @Json(name = "keyPostfix")
    val keyPostfix: kotlin.String? = null,

    @Json(name = "lastUsed")
    val lastUsed: ApiDateTime? = null,

    @Json(name = "createOn")
    val createOn: ApiDateTime? = null,

    @Json(name = "createBy")
    val createBy: EmployeeDto? = null,

    @Json(name = "expiresAt")
    val expiresAt: ApiDateTime? = null

) {


}

