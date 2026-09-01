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
 * @param lastUsed The date and time when the API key was last used.
 * @param createOn The date and time when the API key was created.
 * @param createBy The identifier of the user who created the API key.
 * @param expiresAt The date and time when the API key expires.
 */


data class ApiKeyResponseDto (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String?,

    @Json(name = "key")
    val key: kotlin.String?,

    @Json(name = "permissions")
    val permissions: kotlin.collections.List<kotlin.String>?,

    @Json(name = "isActive")
    val isActive: kotlin.Boolean,

    @Json(name = "keyPostfix")
    val keyPostfix: kotlin.String? = null,

    @Json(name = "lastUsed")
    val lastUsed: java.time.OffsetDateTime? = null,

    @Json(name = "createOn")
    val createOn: java.time.OffsetDateTime? = null,

    @Json(name = "createBy")
    val createBy: EmployeeDto? = null,

    @Json(name = "expiresAt")
    val expiresAt: java.time.OffsetDateTime? = null

) {


}

