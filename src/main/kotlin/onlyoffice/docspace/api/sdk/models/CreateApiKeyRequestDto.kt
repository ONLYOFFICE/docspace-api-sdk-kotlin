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
 * The request parameters for creating a new API key.
 *
 * @param name The label that tells this key apart in the key list. It is required, may be up to 30 characters long, and does  not have to be unique.
 * @param permissions The scopes the key may use. Every value has to come from `GET api/2.0/keys/permissions`, an unknown value or  an empty array is rejected, and passing `*` or omitting the field records a key without scope restrictions.
 * @param expiresInDays The lifetime of the key in days, counted from the moment it is created, from 1 to 365. Omit it to create a key  that never expires.
 */


data class CreateApiKeyRequestDto (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "permissions")
    val permissions: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "expiresInDays")
    val expiresInDays: kotlin.Int? = null

) {


}

