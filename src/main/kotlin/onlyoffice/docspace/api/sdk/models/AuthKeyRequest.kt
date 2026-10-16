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
 * One key of a provider and the value to store for it.
 *
 * @param name The key name, as `GET api/2.0/settings/authservice` lists it in `props`.
 * @param `value` The value to store. An empty string clears the key.
 * @param title Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 * @param type Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 * @param options Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 * @param dependsOn Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 * @param dependsOnValue Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 */


data class AuthKeyRequest (

    @Json(name = "name")
    val name: kotlin.String?,

    @Json(name = "value")
    val `value`: kotlin.String?,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "options")
    val options: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "dependsOn")
    val dependsOn: kotlin.String? = null,

    @Json(name = "dependsOnValue")
    val dependsOnValue: kotlin.String? = null

) {


}

