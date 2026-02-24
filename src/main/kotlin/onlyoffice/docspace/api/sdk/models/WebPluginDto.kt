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
 * @param createBy 
 * @param createOn The date and time when the web plugin was created.
 * @param enabled Specifies if the web plugin is enabled or not.
 * @param system Specifies if the web plugin is system or not.
 * @param url The web plugin URL.
 * @param cssUrl The web plugin css URL.
 * @param settings The web plugin settings.
 * @param minDocSpaceVersion The minimum version of DocSpace with which the plugin is guaranteed to work.
 * @param nameLocale The web plugin localized name.
 * @param descriptionLocale The web plugin localized description.
 */


data class WebPluginDto (

    /* The web plugin name. */
    @Json(name = "name")
    val name: kotlin.String?,

    /* The web plugin version. */
    @Json(name = "version")
    val version: kotlin.String?,

    /* The web plugin description. */
    @Json(name = "description")
    val description: kotlin.String?,

    /* The web plugin license. */
    @Json(name = "license")
    val license: kotlin.String?,

    /* The web plugin author. */
    @Json(name = "author")
    val author: kotlin.String?,

    /* The web plugin home page URL. */
    @Json(name = "homePage")
    val homePage: kotlin.String?,

    /* The name by which the web plugin is registered in the window object. */
    @Json(name = "pluginName")
    val pluginName: kotlin.String?,

    /* The web plugin scopes. */
    @Json(name = "scopes")
    val scopes: kotlin.String?,

    /* The web plugin image. */
    @Json(name = "image")
    val image: kotlin.String?,

    @Json(name = "createBy")
    val createBy: EmployeeDto,

    /* The date and time when the web plugin was created. */
    @Json(name = "createOn")
    val createOn: java.time.OffsetDateTime,

    /* Specifies if the web plugin is enabled or not. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean,

    /* Specifies if the web plugin is system or not. */
    @Json(name = "system")
    val system: kotlin.Boolean,

    /* The web plugin URL. */
    @Json(name = "url")
    val url: kotlin.String?,

    /* The web plugin css URL. */
    @Json(name = "cssUrl")
    val cssUrl: kotlin.String?,

    /* The web plugin settings. */
    @Json(name = "settings")
    val settings: kotlin.String?,

    /* The minimum version of DocSpace with which the plugin is guaranteed to work. */
    @Json(name = "minDocSpaceVersion")
    val minDocSpaceVersion: kotlin.String? = null,

    /* The web plugin localized name. */
    @Json(name = "nameLocale")
    val nameLocale: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    /* The web plugin localized description. */
    @Json(name = "descriptionLocale")
    val descriptionLocale: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

) {


}

