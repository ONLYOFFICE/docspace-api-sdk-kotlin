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

import onlyoffice.docspace.api.sdk.models.DocumentConfigDto
import onlyoffice.docspace.api.sdk.models.EditorConfigurationDto
import onlyoffice.docspace.api.sdk.models.EditorToolCallStateDto
import onlyoffice.docspace.api.sdk.models.EditorType
import onlyoffice.docspace.api.sdk.models.FileDtoInteger
import onlyoffice.docspace.api.sdk.models.QuotaScope
import onlyoffice.docspace.api.sdk.models.StartFillingMode

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The configuration parameters.
 *
 * @param document The document configuration.
 * @param documentType The document type.
 * @param editorConfig The editor configuration.
 * @param editorType The editor type.
 * @param editorUrl The editor URL.
 * @param file The file parameters.
 * @param token The token of the file configuration.
 * @param type The platform type.
 * @param errorMessage The error message.
 * @param startFilling Specifies if the file filling has started or not.
 * @param fillingStatus The file filling status.
 * @param startFillingMode The start filling mode.
 * @param fillingSessionId The file filling session ID.
 * @param quotaExceededScope Indicates which quota scope has been exceeded.
 * @param generationToolCallState The generation tool call state. Used to run the agent flow in the editor.
 */


data class ConfigurationDtoInteger (

    @Json(name = "document")
    val document: DocumentConfigDto,

    @Json(name = "documentType")
    val documentType: kotlin.String?,

    @Json(name = "editorConfig")
    val editorConfig: EditorConfigurationDto,

    @Json(name = "editorType")
    val editorType: EditorType,

    @Json(name = "editorUrl")
    val editorUrl: java.net.URI?,

    @Json(name = "file")
    val file: FileDtoInteger,

    @Json(name = "token")
    val token: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "errorMessage")
    val errorMessage: kotlin.String? = null,

    @Json(name = "startFilling")
    val startFilling: kotlin.Boolean? = null,

    @Json(name = "fillingStatus")
    val fillingStatus: kotlin.Boolean? = null,

    @Json(name = "startFillingMode")
    val startFillingMode: StartFillingMode? = null,

    @Json(name = "fillingSessionId")
    val fillingSessionId: kotlin.String? = null,

    @Json(name = "quotaExceededScope")
    val quotaExceededScope: QuotaScope? = null,

    @Json(name = "generationToolCallState")
    val generationToolCallState: EditorToolCallStateDto? = null

) {


}

