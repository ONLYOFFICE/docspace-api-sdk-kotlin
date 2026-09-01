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

import onlyoffice.docspace.api.sdk.models.EmployeeDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The web plugin information.
 *
 * @param name The web plugin name.
 * @param version The web plugin version.
 * @param description The web plugin description.
 * @param license The web plugin license.
 * @param author The web plugin author.
 * @param homePage The web plugin home page URL.
 * @param pluginName The name by which the web plugin is registered in the window object.
 * @param scopes The web plugin scopes.
 * @param image The web plugin image.
 * @param createBy The user who created the web plugin.
 * @param createOn The date and time when the web plugin was created.
 * @param enabled Specifies if the web plugin is enabled or not.
 * @param system Specifies if the web plugin is system or not.
 * @param url The web plugin URL.
 * @param cssUrl The web plugin css URL.
 * @param settings The web plugin settings.
 * @param minDocSpaceVersion The minimum version of DocSpace with which the plugin is guaranteed to work.
 * @param nameLocale The web plugin localized name.
 * @param descriptionLocale The web plugin localized description.
 * @param runtime The web plugin loading method
 */


data class WebPluginDto (

    @Json(name = "name")
    val name: kotlin.String?,

    @Json(name = "version")
    val version: kotlin.String?,

    @Json(name = "description")
    val description: kotlin.String?,

    @Json(name = "license")
    val license: kotlin.String?,

    @Json(name = "author")
    val author: kotlin.String?,

    @Json(name = "homePage")
    val homePage: kotlin.String?,

    @Json(name = "pluginName")
    val pluginName: kotlin.String?,

    @Json(name = "scopes")
    val scopes: kotlin.String?,

    @Json(name = "image")
    val image: kotlin.String?,

    @Json(name = "createBy")
    val createBy: EmployeeDto,

    @Json(name = "createOn")
    val createOn: java.time.OffsetDateTime,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean,

    @Json(name = "system")
    val system: kotlin.Boolean,

    @Json(name = "url")
    val url: kotlin.String?,

    @Json(name = "cssUrl")
    val cssUrl: kotlin.String?,

    @Json(name = "settings")
    val settings: kotlin.String?,

    @Json(name = "minDocSpaceVersion")
    val minDocSpaceVersion: kotlin.String? = null,

    @Json(name = "nameLocale")
    val nameLocale: kotlin.collections.Map<kotlin.String, kotlin.String?>? = null,

    @Json(name = "descriptionLocale")
    val descriptionLocale: kotlin.collections.Map<kotlin.String, kotlin.String?>? = null,

    @Json(name = "runtime")
    val runtime: kotlin.String? = null

) {


}

