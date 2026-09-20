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
 * What the installation allows to be done with web plugins.
 *
 * @param enabled Whether web plugins run on this portal at all. While it is `false` the operations under  `api/2.0/settings/webplugins` are of no use, whatever the other two flags say. All three are `false`  unless the installation switched plugins on in its configuration.
 * @param upload Whether an administrator may add a plugin of their own through  `POST api/2.0/settings/webplugins`. While it is `false` only the plugins that ship with the installation  are available.
 * @param delete Whether an added plugin may be removed again through `DELETE api/2.0/settings/webplugins/{name}`. The  plugins that ship with the installation cannot be removed regardless of this flag.
 */


data class PluginsDto (

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "upload")
    val upload: kotlin.Boolean? = null,

    @Json(name = "delete")
    val delete: kotlin.Boolean? = null

) {


}

