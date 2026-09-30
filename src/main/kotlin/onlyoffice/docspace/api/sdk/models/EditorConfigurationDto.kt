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
 * How the editors behave for this opening: the mode, the language, the interface, and who is editing.
 *
 * @param lang The culture the editor interface is shown in, taken from the profile of the caller.
 * @param mode `edit` when this session may write the document, `view` when it may only read it.
 * @param callbackUrl Where the editors post the document back to when they save it. A client must not call it itself; it is the  address the document service uses.
 * @param coEditing How co-editing starts out for this session and whether the user may switch it in the interface.
 * @param createUrl Where the editor sends the user when they ask for a new document of the same type. It is empty when creating  one is not offered here.
 * @param customization How the editor interface is dressed for this portal, this document and this layout.
 * @param embedded The addresses the framed viewer needs. It is filled in only for the embedded layout.
 * @param encryptionKeys The caller's end-to-end encryption keys, added only when the document lies in a private room, so that the  editors can decrypt it in the browser. It is empty everywhere else.
 * @param modeWrite Whether this session may write; it is what the mode above says in one word.
 * @param plugins Which editor plugins are offered. The portal currently offers none, so the list inside comes back empty.
 * @param recent The documents offered in the editor's recent list. It is left out altogether when there is nothing to offer.
 * @param templates Always empty: the portal no longer passes creation templates through the editor configuration.
 * @param user The account the editors attribute changes to. It is empty for an anonymous session opened through an external  link, and the editors then ask for a name themselves.
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

