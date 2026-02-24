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
 * 
 *
 * @param embeddingModel The name of the embedding model used for document vectorization.
 * @param knowledgeSearchToolName The tool name used by the AI assistant for knowledge base search.
 * @param webSearchToolName The tool name used by the AI assistant for web search.
 * @param webCrawlingToolName The tool name used by the AI assistant for web page crawling.
 * @param generateDocxToolName The tool name used by the AI to launch docx creation in the editor.
 * @param generateFormToolName The tool name used by the AI assistant to launch form creation in the editor.
 * @param generatePresentationToolName The tool name used by the AI assistant to launch presentation creation in the editor.
 * @param webSearchEnabled Indicates whether web search is enabled for AI chat sessions.
 * @param webSearchNeedReset Indicates whether the web search API key needs to be reconfigured.
 * @param vectorizationEnabled Indicates whether document vectorization is enabled.
 * @param vectorizationNeedReset Indicates whether the embedding provider API key needs to be reconfigured.
 * @param aiReady Indicates whether the AI subsystem is fully configured and operational.
 * @param aiReadyNeedReset Indicates whether the AI provider API key needs to be reconfigured.
 * @param portalMcpServerId The unique identifier of the portal-level MCP server, if configured.
 */


data class AiSettingsDto (

    /* The name of the embedding model used for document vectorization. */
    @Json(name = "embeddingModel")
    val embeddingModel: kotlin.String?,

    /* The tool name used by the AI assistant for knowledge base search. */
    @Json(name = "knowledgeSearchToolName")
    val knowledgeSearchToolName: kotlin.String?,

    /* The tool name used by the AI assistant for web search. */
    @Json(name = "webSearchToolName")
    val webSearchToolName: kotlin.String?,

    /* The tool name used by the AI assistant for web page crawling. */
    @Json(name = "webCrawlingToolName")
    val webCrawlingToolName: kotlin.String?,

    /* The tool name used by the AI to launch docx creation in the editor. */
    @Json(name = "generateDocxToolName")
    val generateDocxToolName: kotlin.String?,

    /* The tool name used by the AI assistant to launch form creation in the editor. */
    @Json(name = "generateFormToolName")
    val generateFormToolName: kotlin.String?,

    /* The tool name used by the AI assistant to launch presentation creation in the editor. */
    @Json(name = "generatePresentationToolName")
    val generatePresentationToolName: kotlin.String?,

    /* Indicates whether web search is enabled for AI chat sessions. */
    @Json(name = "webSearchEnabled")
    val webSearchEnabled: kotlin.Boolean? = null,

    /* Indicates whether the web search API key needs to be reconfigured. */
    @Json(name = "webSearchNeedReset")
    val webSearchNeedReset: kotlin.Boolean? = null,

    /* Indicates whether document vectorization is enabled. */
    @Json(name = "vectorizationEnabled")
    val vectorizationEnabled: kotlin.Boolean? = null,

    /* Indicates whether the embedding provider API key needs to be reconfigured. */
    @Json(name = "vectorizationNeedReset")
    val vectorizationNeedReset: kotlin.Boolean? = null,

    /* Indicates whether the AI subsystem is fully configured and operational. */
    @Json(name = "aiReady")
    val aiReady: kotlin.Boolean? = null,

    /* Indicates whether the AI provider API key needs to be reconfigured. */
    @Json(name = "aiReadyNeedReset")
    val aiReadyNeedReset: kotlin.Boolean? = null,

    /* The unique identifier of the portal-level MCP server, if configured. */
    @Json(name = "portalMcpServerId")
    val portalMcpServerId: java.util.UUID? = null

) {


}

