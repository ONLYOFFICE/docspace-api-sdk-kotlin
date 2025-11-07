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
 * The request parameters for creating a new API key.
 *
 * @param name The API key name.
 * @param permissions The list of permissions granted to the API key.
 * @param expiresInDays The number of days until the API key expires (null for no expiration).
 */


data class CreateApiKeyRequestDto (

    /* The API key name. */
    @Json(name = "name")
    val name: kotlin.String,

    /* The list of permissions granted to the API key. */
    @Json(name = "permissions")
    val permissions: kotlin.collections.List<kotlin.String>? = null,

    /* The number of days until the API key expires (null for no expiration). */
    @Json(name = "expiresInDays")
    val expiresInDays: kotlin.Int? = null

) {


}

