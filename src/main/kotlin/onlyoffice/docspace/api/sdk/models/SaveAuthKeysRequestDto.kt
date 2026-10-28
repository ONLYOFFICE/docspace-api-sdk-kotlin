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

import onlyoffice.docspace.api.sdk.models.AuthKeyRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The keys to store for one third-party authorization or storage provider.
 *
 * @param name The internal key of the provider, such as `google` or `box`. Take it from the `name` of  `GET api/2.0/settings/authservice`.
 * @param title Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 * @param description Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 * @param instruction Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 * @param canSet Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 * @param paid Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 * @param props The keys of the provider with their new values, by the key names `GET api/2.0/settings/authservice` lists in  `props`.
 */


data class SaveAuthKeysRequestDto (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "instruction")
    val instruction: kotlin.String? = null,

    @Json(name = "canSet")
    val canSet: kotlin.Boolean? = null,

    @Json(name = "paid")
    val paid: kotlin.Boolean? = null,

    @Json(name = "props")
    val props: kotlin.collections.List<AuthKeyRequest>? = null

) {


}

