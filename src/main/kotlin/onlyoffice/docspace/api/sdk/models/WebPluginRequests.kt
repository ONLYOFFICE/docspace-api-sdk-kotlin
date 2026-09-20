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
 * The state the portal keeps for an installed web plugin: whether it runs, and its own settings blob.
 *
 * @param settings The configuration the plugin reads at run time, as a JSON document serialised into a string. Its shape is  defined by the plugin and not by the portal, which stores it encrypted for this portal alone. It replaces  whatever was stored rather than merging into it, so send `{}` when there is nothing to keep.
 * @param enabled Whether the plugin runs in this portal. Switching it on adds the domains its manifest declares to the portal  Content Security Policy and switching it off takes them away again; connected clients are told of the new  state without a reload.
 */


data class WebPluginRequests (

    @Json(name = "settings")
    val settings: kotlin.String?,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null

) {


}

