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
 * The request parameters for updating an existing API key.
 *
 * @param name The new label of the key, up to 30 characters. Omit it to keep the current name.
 * @param permissions The scopes that replace the current ones. Every value has to come from `GET api/2.0/keys/permissions`, an  unknown value or an empty array is rejected, and omitting the field keeps the current scopes.
 * @param isActive Whether the key may authenticate requests. Set it to false to stop the key without deleting it and to true to  let it work again; omit it to keep the current state.
 */


data class UpdateApiKeyRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "permissions")
    val permissions: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null

) {


}

