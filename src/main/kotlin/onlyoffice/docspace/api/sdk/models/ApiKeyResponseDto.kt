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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.EmployeeDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The response data for the API key operations.
 *
 * @param id The ID of the key. This is the value to pass to `PUT api/2.0/keys/{keyId}` and  `DELETE api/2.0/keys/{keyId}`.
 * @param name The label given to the key when it was created or last updated.
 * @param key The secret to send in the `Authorization` header as `Bearer sk-...`. It is filled in only by the answer of  `POST api/2.0/keys` and cannot be read again afterwards, so it has to be stored at that moment.
 * @param permissions The scopes the key may use, as accepted by `GET api/2.0/keys/permissions`. An empty list means the key has no  scope restrictions.
 * @param isActive Whether the key may authenticate requests. A key deactivated through `PUT api/2.0/keys/{keyId}` stays in the  list with this field set to false.
 * @param keyPostfix The last four characters of the secret. It is the only part of the secret that later reads expose, and it is  meant for telling keys apart in a list.
 * @param lastUsed The UTC moment the key was last used to authenticate a request. It is empty for a key that has never been  used.
 * @param createOn The UTC moment the key was created.
 * @param createBy The portal member who created the key, and whose access the key acts with.
 * @param expiresAt The UTC moment the key stops working. It is empty for a key created without `expiresInDays`, which never  expires.
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
    val lastUsed: ApiDateTime? = null,

    @Json(name = "createOn")
    val createOn: ApiDateTime? = null,

    @Json(name = "createBy")
    val createBy: EmployeeDto? = null,

    @Json(name = "expiresAt")
    val expiresAt: ApiDateTime? = null

) {


}

