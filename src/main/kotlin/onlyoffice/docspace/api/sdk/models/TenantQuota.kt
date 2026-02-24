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
 * The current tenant quota.
 *
 * @param tenantId The tenant ID.
 * @param name The tenant name.
 * @param price The tenant price.
 * @param priceCurrencySymbol The tenant price currency symbol.
 * @param priceISOCurrencySymbol The tenant price three-character ISO 4217 currency symbol.
 * @param productId The tenant product ID.
 * @param serviceName The service name.
 * @param serviceGroup The service group.
 * @param visible Specifies if the tenant quota is visible or not.
 * @param wallet Specifies if the tenant quota applies to the wallet or not
 * @param dueDate The quota due date.
 * @param features The tenant quota features.
 * @param maxFileSize The tenant maximum file size.
 * @param maxTotalSize The tenant maximum total size.
 * @param countUser The number of portal users.
 * @param countRoomAdmin The number of portal room administrators.
 * @param usersInRoom The number of room users.
 * @param countRoom The number of rooms.
 * @param nonProfit Specifies if the tenant quota is nonprofit or not.
 * @param trial Specifies if the tenant quota is trial or not.
 * @param free Specifies if the tenant quota is free or not.
 * @param update Specifies if the tenant quota is updated or not.
 * @param audit Specifies if the audit trail is available or not.
 * @param docsEdition Specifies if ONLYOFFICE Docs is included in the tenant quota or not.
 * @param ldap Specifies if the LDAP settings are available or not.
 * @param sso Specifies if the SSO settings are available or not.
 * @param statistic Specifies if the statistics settings are available or not.
 * @param branding Specifies if the branding settings are available or not.
 * @param customization Specifies if the customization settings are available or not.
 * @param lifetime Specifies if the license has the lifetime settings or not.
 * @param automationApi Specifies if the Automation API is available or not.
 * @param custom Specifies if the custom domain URL is available or not.
 * @param restore Specifies if the restore is enabled or not.
 * @param oauth Specifies if Oauth is available or not.
 * @param contentSearch Specifies if the content search is available or not.
 * @param thirdParty Specifies if the third-party accounts linking is available or not.
 * @param year Specifies if the tenant quota is yearly subscription or not.
 * @param countFreeBackup The number of free backups within a month.
 * @param backup Specifies if the backup anabled as a wallet service or not.
 * @param countAIAgent The number of AI agents.
 * @param aiTools Specifies if the AI tools anabled as a wallet service or not.
 * @param aiToolsWebSearch Specifies whether the web search is enabled as a subservice of AI tools.
 * @param aiToolsWebFetch Specifies whether the web fetch is enabled as a subservice of AI tools
 * @param aiToolsEmbedding Specifies whether the embedding is enabled as a subservice of AI tools
 * @param aiToolsDeepseek31Input Specifies whether the Deepseek 3.1 input tokens is enabled as a subservice of AI tools
 * @param aiToolsDeepseek31Output Specifies whether the Deepseek 3.1 output tokens is enabled as a subservice of AI tools
 * @param aiToolsClaude45Input Specifies whether the Claude 4.5 input tokens is enabled as a subservice of AI tools
 * @param aiToolsClaude45Output Specifies whether the Claude 4.5 output tokens is enabled as a subservice of AI tools
 * @param aiToolsGPT5Input Specifies whether the GPT 5 input tokens is enabled as a subservice of AI tools
 * @param aiToolsGPT5Output Specifies whether the GPT 5 output tokens is enabled as a subservice of AI tools
 * @param aiToolsDeepseek32Input Specifies whether the Deepseek 3.2 input tokens is enabled as a subservice of AI tools
 * @param aiToolsDeepseek32Output Specifies whether the Deepseek 3.2 output tokens is enabled as a subservice of AI tools
 * @param aiToolsGPT52Input Specifies whether the GPT 5.2 input tokens is enabled as a subservice of AI tools
 * @param aiToolsGPT52Output Specifies whether the GPT 5.2 output tokens is enabled as a subservice of AI tools
 * @param aiToolsGemini3ProInput Specifies whether the Gemini 3 Pro input tokens is enabled as a subservice of AI tools
 * @param aiToolsGemini3ProOutput Specifies whether the Gemini 3 Pro output tokens is enabled as a subservice of AI tools
 * @param aiToolsGemini3FlashInput Specifies whether the Gemini 3 Flash input tokens is enabled as a subservice of AI tools
 * @param aiToolsGemini3FlashOutput Specifies whether the Gemini 3 Flash output tokens is enabled as a subservice of AI tools
 */


data class TenantQuota (

    /* The tenant ID. */
    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    /* The tenant name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The tenant price. */
    @Json(name = "price")
    val price: kotlin.Double? = null,

    /* The tenant price currency symbol. */
    @Json(name = "priceCurrencySymbol")
    val priceCurrencySymbol: kotlin.String? = null,

    /* The tenant price three-character ISO 4217 currency symbol. */
    @Json(name = "priceISOCurrencySymbol")
    val priceISOCurrencySymbol: kotlin.String? = null,

    /* The tenant product ID. */
    @Json(name = "productId")
    val productId: kotlin.String? = null,

    /* The service name. */
    @Json(name = "serviceName")
    val serviceName: kotlin.String? = null,

    /* The service group. */
    @Json(name = "serviceGroup")
    val serviceGroup: kotlin.String? = null,

    /* Specifies if the tenant quota is visible or not. */
    @Json(name = "visible")
    val visible: kotlin.Boolean? = null,

    /* Specifies if the tenant quota applies to the wallet or not */
    @Json(name = "wallet")
    val wallet: kotlin.Boolean? = null,

    /* The quota due date. */
    @Json(name = "dueDate")
    val dueDate: java.time.OffsetDateTime? = null,

    /* The tenant quota features. */
    @Json(name = "features")
    val features: kotlin.String? = null,

    /* The tenant maximum file size. */
    @Json(name = "maxFileSize")
    val maxFileSize: kotlin.Long? = null,

    /* The tenant maximum total size. */
    @Json(name = "maxTotalSize")
    val maxTotalSize: kotlin.Long? = null,

    /* The number of portal users. */
    @Json(name = "countUser")
    val countUser: kotlin.Int? = null,

    /* The number of portal room administrators. */
    @Json(name = "countRoomAdmin")
    val countRoomAdmin: kotlin.Int? = null,

    /* The number of room users. */
    @Json(name = "usersInRoom")
    val usersInRoom: kotlin.Int? = null,

    /* The number of rooms. */
    @Json(name = "countRoom")
    val countRoom: kotlin.Int? = null,

    /* Specifies if the tenant quota is nonprofit or not. */
    @Json(name = "nonProfit")
    val nonProfit: kotlin.Boolean? = null,

    /* Specifies if the tenant quota is trial or not. */
    @Json(name = "trial")
    val trial: kotlin.Boolean? = null,

    /* Specifies if the tenant quota is free or not. */
    @Json(name = "free")
    val free: kotlin.Boolean? = null,

    /* Specifies if the tenant quota is updated or not. */
    @Json(name = "update")
    val update: kotlin.Boolean? = null,

    /* Specifies if the audit trail is available or not. */
    @Json(name = "audit")
    val audit: kotlin.Boolean? = null,

    /* Specifies if ONLYOFFICE Docs is included in the tenant quota or not. */
    @Json(name = "docsEdition")
    val docsEdition: kotlin.Boolean? = null,

    /* Specifies if the LDAP settings are available or not. */
    @Json(name = "ldap")
    val ldap: kotlin.Boolean? = null,

    /* Specifies if the SSO settings are available or not. */
    @Json(name = "sso")
    val sso: kotlin.Boolean? = null,

    /* Specifies if the statistics settings are available or not. */
    @Json(name = "statistic")
    val statistic: kotlin.Boolean? = null,

    /* Specifies if the branding settings are available or not. */
    @Json(name = "branding")
    val branding: kotlin.Boolean? = null,

    /* Specifies if the customization settings are available or not. */
    @Json(name = "customization")
    val customization: kotlin.Boolean? = null,

    /* Specifies if the license has the lifetime settings or not. */
    @Json(name = "lifetime")
    val lifetime: kotlin.Boolean? = null,

    /* Specifies if the Automation API is available or not. */
    @Json(name = "automationApi")
    val automationApi: kotlin.Boolean? = null,

    /* Specifies if the custom domain URL is available or not. */
    @Json(name = "custom")
    val custom: kotlin.Boolean? = null,

    /* Specifies if the restore is enabled or not. */
    @Json(name = "restore")
    val restore: kotlin.Boolean? = null,

    /* Specifies if Oauth is available or not. */
    @Json(name = "oauth")
    val oauth: kotlin.Boolean? = null,

    /* Specifies if the content search is available or not. */
    @Json(name = "contentSearch")
    val contentSearch: kotlin.Boolean? = null,

    /* Specifies if the third-party accounts linking is available or not. */
    @Json(name = "thirdParty")
    val thirdParty: kotlin.Boolean? = null,

    /* Specifies if the tenant quota is yearly subscription or not. */
    @Json(name = "year")
    val year: kotlin.Boolean? = null,

    /* The number of free backups within a month. */
    @Json(name = "countFreeBackup")
    val countFreeBackup: kotlin.Int? = null,

    /* Specifies if the backup anabled as a wallet service or not. */
    @Json(name = "backup")
    val backup: kotlin.Boolean? = null,

    /* The number of AI agents. */
    @Json(name = "countAIAgent")
    val countAIAgent: kotlin.Int? = null,

    /* Specifies if the AI tools anabled as a wallet service or not. */
    @Json(name = "aiTools")
    val aiTools: kotlin.Boolean? = null,

    /* Specifies whether the web search is enabled as a subservice of AI tools. */
    @Json(name = "aiToolsWebSearch")
    val aiToolsWebSearch: kotlin.Boolean? = null,

    /* Specifies whether the web fetch is enabled as a subservice of AI tools */
    @Json(name = "aiToolsWebFetch")
    val aiToolsWebFetch: kotlin.Boolean? = null,

    /* Specifies whether the embedding is enabled as a subservice of AI tools */
    @Json(name = "aiToolsEmbedding")
    val aiToolsEmbedding: kotlin.Boolean? = null,

    /* Specifies whether the Deepseek 3.1 input tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsDeepseek31Input")
    val aiToolsDeepseek31Input: kotlin.Boolean? = null,

    /* Specifies whether the Deepseek 3.1 output tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsDeepseek31Output")
    val aiToolsDeepseek31Output: kotlin.Boolean? = null,

    /* Specifies whether the Claude 4.5 input tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsClaude45Input")
    val aiToolsClaude45Input: kotlin.Boolean? = null,

    /* Specifies whether the Claude 4.5 output tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsClaude45Output")
    val aiToolsClaude45Output: kotlin.Boolean? = null,

    /* Specifies whether the GPT 5 input tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsGPT5Input")
    val aiToolsGPT5Input: kotlin.Boolean? = null,

    /* Specifies whether the GPT 5 output tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsGPT5Output")
    val aiToolsGPT5Output: kotlin.Boolean? = null,

    /* Specifies whether the Deepseek 3.2 input tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsDeepseek32Input")
    val aiToolsDeepseek32Input: kotlin.Boolean? = null,

    /* Specifies whether the Deepseek 3.2 output tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsDeepseek32Output")
    val aiToolsDeepseek32Output: kotlin.Boolean? = null,

    /* Specifies whether the GPT 5.2 input tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsGPT52Input")
    val aiToolsGPT52Input: kotlin.Boolean? = null,

    /* Specifies whether the GPT 5.2 output tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsGPT52Output")
    val aiToolsGPT52Output: kotlin.Boolean? = null,

    /* Specifies whether the Gemini 3 Pro input tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsGemini3ProInput")
    val aiToolsGemini3ProInput: kotlin.Boolean? = null,

    /* Specifies whether the Gemini 3 Pro output tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsGemini3ProOutput")
    val aiToolsGemini3ProOutput: kotlin.Boolean? = null,

    /* Specifies whether the Gemini 3 Flash input tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsGemini3FlashInput")
    val aiToolsGemini3FlashInput: kotlin.Boolean? = null,

    /* Specifies whether the Gemini 3 Flash output tokens is enabled as a subservice of AI tools */
    @Json(name = "aiToolsGemini3FlashOutput")
    val aiToolsGemini3FlashOutput: kotlin.Boolean? = null

) {


}

