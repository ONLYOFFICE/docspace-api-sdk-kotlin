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

import onlyoffice.docspace.api.sdk.models.AuthKeyDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One third-party authorization or storage provider and the keys the portal connects to it with.
 *
 * @param name The internal key of the provider, such as `google` or `box`. It is the `name` that  `POST api/2.0/settings/authservice` takes to select the provider.
 * @param title The provider name as it is shown in the interface.
 * @param description A sentence about what connecting the provider gives the portal, shown next to it in the interface.
 * @param instruction The steps an administrator has to take on the provider side to obtain the keys, shown in the interface.
 * @param canSet Whether this provider accepts keys through the API at all. A provider whose keys are fixed by the  installation reports `false`, and saving keys for it is refused.
 * @param paid Whether the provider is a paid option. A paid one can only be connected while the portal plan includes  third-party storage or the installation is licensed as self-hosted.
 * @param props The keys the provider defines, with the values last saved and how the settings form shows each of them.  It is `null` for a provider that forbids changes (`canSet` is `false`): its keys are not read at all.
 */


data class AuthServiceDto (

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
    val props: kotlin.collections.List<AuthKeyDto>? = null

) {


}

