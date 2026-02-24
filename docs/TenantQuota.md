
# TenantQuota

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **tenantId** | **kotlin.Int** | The tenant ID. |  [optional] |
| **name** | **kotlin.String** | The tenant name. |  [optional] |
| **price** | **kotlin.Double** | The tenant price. |  [optional] |
| **priceCurrencySymbol** | **kotlin.String** | The tenant price currency symbol. |  [optional] |
| **priceISOCurrencySymbol** | **kotlin.String** | The tenant price three-character ISO 4217 currency symbol. |  [optional] |
| **productId** | **kotlin.String** | The tenant product ID. |  [optional] |
| **serviceName** | **kotlin.String** | The service name. |  [optional] |
| **serviceGroup** | **kotlin.String** | The service group. |  [optional] |
| **visible** | **kotlin.Boolean** | Specifies if the tenant quota is visible or not. |  [optional] |
| **wallet** | **kotlin.Boolean** | Specifies if the tenant quota applies to the wallet or not |  [optional] |
| **dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The quota due date. |  [optional] |
| **features** | **kotlin.String** | The tenant quota features. |  [optional] |
| **maxFileSize** | **kotlin.Long** | The tenant maximum file size. |  [optional] |
| **maxTotalSize** | **kotlin.Long** | The tenant maximum total size. |  [optional] |
| **countUser** | **kotlin.Int** | The number of portal users. |  [optional] |
| **countRoomAdmin** | **kotlin.Int** | The number of portal room administrators. |  [optional] |
| **usersInRoom** | **kotlin.Int** | The number of room users. |  [optional] |
| **countRoom** | **kotlin.Int** | The number of rooms. |  [optional] |
| **nonProfit** | **kotlin.Boolean** | Specifies if the tenant quota is nonprofit or not. |  [optional] |
| **trial** | **kotlin.Boolean** | Specifies if the tenant quota is trial or not. |  [optional] |
| **free** | **kotlin.Boolean** | Specifies if the tenant quota is free or not. |  [optional] |
| **update** | **kotlin.Boolean** | Specifies if the tenant quota is updated or not. |  [optional] |
| **audit** | **kotlin.Boolean** | Specifies if the audit trail is available or not. |  [optional] |
| **docsEdition** | **kotlin.Boolean** | Specifies if ONLYOFFICE Docs is included in the tenant quota or not. |  [optional] |
| **ldap** | **kotlin.Boolean** | Specifies if the LDAP settings are available or not. |  [optional] |
| **sso** | **kotlin.Boolean** | Specifies if the SSO settings are available or not. |  [optional] |
| **statistic** | **kotlin.Boolean** | Specifies if the statistics settings are available or not. |  [optional] |
| **branding** | **kotlin.Boolean** | Specifies if the branding settings are available or not. |  [optional] |
| **customization** | **kotlin.Boolean** | Specifies if the customization settings are available or not. |  [optional] |
| **lifetime** | **kotlin.Boolean** | Specifies if the license has the lifetime settings or not. |  [optional] |
| **automationApi** | **kotlin.Boolean** | Specifies if the Automation API is available or not. |  [optional] |
| **custom** | **kotlin.Boolean** | Specifies if the custom domain URL is available or not. |  [optional] |
| **restore** | **kotlin.Boolean** | Specifies if the restore is enabled or not. |  [optional] |
| **oauth** | **kotlin.Boolean** | Specifies if Oauth is available or not. |  [optional] |
| **contentSearch** | **kotlin.Boolean** | Specifies if the content search is available or not. |  [optional] |
| **thirdParty** | **kotlin.Boolean** | Specifies if the third-party accounts linking is available or not. |  [optional] |
| **year** | **kotlin.Boolean** | Specifies if the tenant quota is yearly subscription or not. |  [optional] |
| **countFreeBackup** | **kotlin.Int** | The number of free backups within a month. |  [optional] |
| **backup** | **kotlin.Boolean** | Specifies if the backup anabled as a wallet service or not. |  [optional] |
| **countAIAgent** | **kotlin.Int** | The number of AI agents. |  [optional] |
| **aiTools** | **kotlin.Boolean** | Specifies if the AI tools anabled as a wallet service or not. |  [optional] |
| **aiToolsWebSearch** | **kotlin.Boolean** | Specifies whether the web search is enabled as a subservice of AI tools. |  [optional] |
| **aiToolsWebFetch** | **kotlin.Boolean** | Specifies whether the web fetch is enabled as a subservice of AI tools |  [optional] |
| **aiToolsEmbedding** | **kotlin.Boolean** | Specifies whether the embedding is enabled as a subservice of AI tools |  [optional] |
| **aiToolsDeepseek31Input** | **kotlin.Boolean** | Specifies whether the Deepseek 3.1 input tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsDeepseek31Output** | **kotlin.Boolean** | Specifies whether the Deepseek 3.1 output tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsClaude45Input** | **kotlin.Boolean** | Specifies whether the Claude 4.5 input tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsClaude45Output** | **kotlin.Boolean** | Specifies whether the Claude 4.5 output tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsGPT5Input** | **kotlin.Boolean** | Specifies whether the GPT 5 input tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsGPT5Output** | **kotlin.Boolean** | Specifies whether the GPT 5 output tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsDeepseek32Input** | **kotlin.Boolean** | Specifies whether the Deepseek 3.2 input tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsDeepseek32Output** | **kotlin.Boolean** | Specifies whether the Deepseek 3.2 output tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsGPT52Input** | **kotlin.Boolean** | Specifies whether the GPT 5.2 input tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsGPT52Output** | **kotlin.Boolean** | Specifies whether the GPT 5.2 output tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsGemini3ProInput** | **kotlin.Boolean** | Specifies whether the Gemini 3 Pro input tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsGemini3ProOutput** | **kotlin.Boolean** | Specifies whether the Gemini 3 Pro output tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsGemini3FlashInput** | **kotlin.Boolean** | Specifies whether the Gemini 3 Flash input tokens is enabled as a subservice of AI tools |  [optional] |
| **aiToolsGemini3FlashOutput** | **kotlin.Boolean** | Specifies whether the Gemini 3 Flash output tokens is enabled as a subservice of AI tools |  [optional] |



