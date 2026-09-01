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
 * @param name The new name for the API key.
 * @param permissions The new list of permissions for the API key.
 * @param isActive Indicates whether the API key should be active or not.
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

