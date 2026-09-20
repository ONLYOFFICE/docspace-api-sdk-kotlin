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
 * One web plugin available to the portal: its manifest, where to load it from, and the state the portal keeps.
 *
 * @param name The plugin's manifest name, which is what every other operation of this group addresses it by and what  makes it unique within the portal - an installation-wide plugin wins the name over a portal one.
 * @param version The plugin's own version from its manifest. The portal does not compare it against anything; it is there  for a person to read.
 * @param description The plugin's description from its manifest, in the language the manifest was written in. The translations  of it are in `descriptionLocale`.
 * @param license The licence the plugin is published under, as its manifest states it. Nothing checks it.
 * @param author Who wrote the plugin, as its manifest states it - not the portal member who uploaded it, who is  `createBy`.
 * @param homePage The plugin's own page, for a person to read more about it. It is empty when the manifest names none.
 * @param pluginName The global the plugin registers itself under in the browser once its script has run, which is how a  client reaches it. It is distinct from `name`, the identifier the portal uses.
 * @param scopes Which parts of the interface the plugin hooks into, as one comma-separated string rather than a list.
 * @param image The plugin's icon exactly as its manifest declares it, which is normally a file name inside the plugin's  own package rather than an absolute address - resolve it against the directory `url` points into.
 * @param createBy The portal member who uploaded the plugin. For a plugin that ships with the installation it is an empty  profile, since no member put it there.
 * @param createOn When the plugin was uploaded. It stays at its zero value for a plugin that ships with the installation.
 * @param enabled Whether the portal loads the plugin. It is the state this portal stored, so an installation-wide plugin  can be on for one portal and off for another.
 * @param system Whether the plugin ships with the installation rather than having been uploaded here. A system plugin  cannot be deleted through `DELETE api/2.0/settings/webplugins/{name}`, only switched off.
 * @param url The address of the plugin's script, which a client loads to run it. It ends in a `hash` query taken from  `version`, so the address changes whenever the plugin is updated and an old one may be cached.
 * @param cssUrl The absolute address of the plugin's stylesheet, empty for a plugin that ships none.
 * @param settings The settings string the portal keeps for the plugin, stored and returned verbatim - only the plugin knows  its shape. It is empty until `PUT api/2.0/settings/webplugins/{name}` saves one.
 * @param minDocSpaceVersion The oldest portal version the plugin declares it works with. It is a claim from the manifest and is not  enforced, so a plugin can be loaded on an older portal and simply misbehave; compare it with the `version`  of `GET api/2.0/settings`.
 * @param nameLocale The plugin's name translated, keyed by culture name. A culture that is missing falls back to `name`, and  the whole map is empty for a plugin that ships no translations.
 * @param descriptionLocale The plugin's description translated, keyed the same way as `nameLocale` and falling back to  `description`.
 * @param runtime How the script at `url` is to be loaded - as an ES module or as a classic script. It is empty for a  plugin whose manifest does not say, which a client treats as a classic script.
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

