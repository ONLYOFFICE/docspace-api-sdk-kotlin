
# AiSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **embeddingModel** | **kotlin.String** | The name of the embedding model used for document vectorization. |  |
| **modelAliases** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Mapping of model identifiers to human-readable aliases. |  |
| **knowledgeSearchToolName** | **kotlin.String** | The tool name used by the AI assistant for knowledge base search. |  |
| **webSearchToolName** | **kotlin.String** | The tool name used by the AI assistant for web search. |  |
| **webCrawlingToolName** | **kotlin.String** | The tool name used by the AI assistant for web page crawling. |  |
| **generateDocxToolName** | **kotlin.String** | The tool name used by the AI to launch docx creation in the editor. |  |
| **generateFormToolName** | **kotlin.String** | The tool name used by the AI assistant to launch form creation in the editor. |  |
| **generatePresentationToolName** | **kotlin.String** | The tool name used by the AI assistant to launch presentation creation in the editor. |  |
| **webSearchEnabled** | **kotlin.Boolean** | Indicates whether web search is enabled for AI chat sessions. |  [optional] |
| **webSearchNeedReset** | **kotlin.Boolean** | Indicates whether the web search API key needs to be reconfigured. |  [optional] |
| **vectorizationEnabled** | **kotlin.Boolean** | Indicates whether document vectorization is enabled. |  [optional] |
| **vectorizationNeedReset** | **kotlin.Boolean** | Indicates whether the embedding provider API key needs to be reconfigured. |  [optional] |
| **aiReady** | **kotlin.Boolean** | Indicates whether the AI subsystem is fully configured and operational. |  [optional] |
| **aiReadyNeedReset** | **kotlin.Boolean** | Indicates whether the AI provider API key needs to be reconfigured. |  [optional] |
| **portalMcpServerId** | [**java.util.UUID**](java.util.UUID.md) | The unique identifier of the portal-level MCP server, if configured. |  [optional] |
| **systemAiEnabled** | **kotlin.Boolean** | Indicates whether the system-level AI provider is enabled. |  [optional] |



