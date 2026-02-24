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
 * @param document 
 * @param documentType The document type.
 * @param editorConfig 
 * @param editorType 
 * @param editorUrl The editor URL.
 * @param file 
 * @param token The token of the file configuration.
 * @param type The platform type.
 * @param errorMessage The error message.
 * @param startFilling Specifies if the file filling has started or not.
 * @param fillingStatus The file filling status.
 * @param startFillingMode 
 * @param fillingSessionId The file filling session ID.
 * @param quotaExceededScope 
 * @param generationToolCallState 
 */


data class ConfigurationDtoInteger (

    @Json(name = "document")
    val document: DocumentConfigDto,

    /* The document type. */
    @Json(name = "documentType")
    val documentType: kotlin.String?,

    @Json(name = "editorConfig")
    val editorConfig: EditorConfigurationDto,

    @Json(name = "editorType")
    val editorType: EditorType,

    /* The editor URL. */
    @Json(name = "editorUrl")
    val editorUrl: java.net.URI?,

    @Json(name = "file")
    val file: FileDtoInteger,

    /* The token of the file configuration. */
    @Json(name = "token")
    val token: kotlin.String? = null,

    /* The platform type. */
    @Json(name = "type")
    val type: kotlin.String? = null,

    /* The error message. */
    @Json(name = "errorMessage")
    val errorMessage: kotlin.String? = null,

    /* Specifies if the file filling has started or not. */
    @Json(name = "startFilling")
    val startFilling: kotlin.Boolean? = null,

    /* The file filling status. */
    @Json(name = "fillingStatus")
    val fillingStatus: kotlin.Boolean? = null,

    @Json(name = "startFillingMode")
    val startFillingMode: StartFillingMode? = null,

    /* The file filling session ID. */
    @Json(name = "fillingSessionId")
    val fillingSessionId: kotlin.String? = null,

    @Json(name = "quotaExceededScope")
    val quotaExceededScope: QuotaScope? = null,

    @Json(name = "generationToolCallState")
    val generationToolCallState: EditorToolCallStateDto? = null

) {


}

