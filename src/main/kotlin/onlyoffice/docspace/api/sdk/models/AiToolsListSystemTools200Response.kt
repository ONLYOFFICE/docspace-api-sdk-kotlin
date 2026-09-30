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

import onlyoffice.docspace.api.sdk.models.AiTMCPItem

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param groups Tools by server name, covering both the host-configured system servers and the custom MCP servers registered for this scope.
 * @param errors Why a registered custom server could not be reached, keyed by server name. A server that answered is absent from this map.
 * @param system Names of the host-configured system servers among the keys of `groups`; everything else there was registered as a custom server.
 */


data class AiToolsListSystemTools200Response (

    @Json(name = "groups")
    val groups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<AiTMCPItem>>,

    @Json(name = "errors")
    val errors: kotlin.collections.Map<kotlin.String, kotlin.String>,

    @Json(name = "system")
    val system: kotlin.collections.List<kotlin.String>

) {


}

