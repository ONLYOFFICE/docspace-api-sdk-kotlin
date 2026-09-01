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

import onlyoffice.docspace.api.sdk.models.CoEditingConfig
import onlyoffice.docspace.api.sdk.models.CustomizationConfigDto
import onlyoffice.docspace.api.sdk.models.EmbeddedConfig
import onlyoffice.docspace.api.sdk.models.EncryptionKeyDto
import onlyoffice.docspace.api.sdk.models.PluginsConfig
import onlyoffice.docspace.api.sdk.models.RecentConfig
import onlyoffice.docspace.api.sdk.models.TemplatesConfig
import onlyoffice.docspace.api.sdk.models.UserConfig

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The editor configuration parameters.
 *
 * @param lang The language of the editor configuration.
 * @param mode The mode of the editor configuration.
 * @param callbackUrl The callback URL of the editor.
 * @param coEditing The co-editing configuration parameters.
 * @param createUrl The creation URL of the editor.
 * @param customization The customization configuration.
 * @param embedded The configuration parameters for the embedded document type.
 * @param encryptionKeys The encryption keys of the editor configuration.
 * @param modeWrite Specifies if the mode is write of the editor configuration.
 * @param plugins The configuration settings to connect the special add-ons.
 * @param recent The recent configuration of the editor.
 * @param templates The templates of the editor configuration.
 * @param user The configuration parameters of the user currently viewing or editing the document.
 */


data class EditorConfigurationDto (

    @Json(name = "lang")
    val lang: kotlin.String?,

    @Json(name = "mode")
    val mode: kotlin.String?,

    @Json(name = "callbackUrl")
    val callbackUrl: java.net.URI? = null,

    @Json(name = "coEditing")
    val coEditing: CoEditingConfig? = null,

    @Json(name = "createUrl")
    val createUrl: kotlin.String? = null,

    @Json(name = "customization")
    val customization: CustomizationConfigDto? = null,

    @Json(name = "embedded")
    val embedded: EmbeddedConfig? = null,

    @Json(name = "encryptionKeys")
    val encryptionKeys: kotlin.collections.List<EncryptionKeyDto>? = null,

    @Json(name = "modeWrite")
    val modeWrite: kotlin.Boolean? = null,

    @Json(name = "plugins")
    val plugins: PluginsConfig? = null,

    @Json(name = "recent")
    val recent: kotlin.collections.List<RecentConfig>? = null,

    @Json(name = "templates")
    val templates: kotlin.collections.List<TemplatesConfig>? = null,

    @Json(name = "user")
    val user: UserConfig? = null

) {


}

