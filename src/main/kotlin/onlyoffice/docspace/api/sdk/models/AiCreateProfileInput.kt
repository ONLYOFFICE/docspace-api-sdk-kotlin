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

import onlyoffice.docspace.api.sdk.models.AiBuiltinProviderType
import onlyoffice.docspace.api.sdk.models.AiProviderType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Input for creating a new profile — the same shape as  {@link  Profile }  without the engine-generated fields (`id`, `createdAt`).
 *
 * @param name User-defined profile display name.
 * @param providerType Provider type for this profile. Use `external` to delegate all HTTP transport to  {@link  PlatformAdapter.externalFetch  }  while reusing an existing provider's response parser — see  {@link  Profile.basedOn }  for the format selector.
 * @param baseUrl Base URL of the provider API.
 * @param modelId Selected model ID within this provider.
 * @param basedOn Selects the response-format parser used by the `external` provider. Ignored for any other `providerType`.  Supported values are `openai`, `anthropic`, `mistral` and `openrouter`. Remaining values (`genai`, `stabilityai`, …) are accepted by the type but not yet implemented; passing one raises an error at request time.
 * @param key API key or token. Optional for local providers.
 * @param headers Extra HTTP headers sent with every request to this provider. Merged into the SDK client's default headers; an explicit `Authorization` here wins over the one derived from  {@link  key  } . Honoured by the OpenAI-family providers.
 * @param reasoning Whether extended thinking is enabled for this profile's model.
 * @param capabilities Bitmask of capabilities supported by the selected model.
 * @param canUseTool Result of the live tool-capability probe performed at create time and on changes to `modelId` / `providerType` / `baseUrl`. `undefined` means the probe has never run for this profile (legacy record).
 * @param useResponsesApi Result of the live Responses-API probe (parallel to  {@link  canUseTool  } ). `true` means the model speaks `/v1/responses` and the OpenAI provider must route through `client.responses.create` — required for gpt-5+ reasoning models that reject `reasoning_effort` together with `tools` on `/v1/chat/completions`. Probed at create time and whenever `modelId` / `providerType` / `baseUrl` change. `undefined` means the probe never ran (legacy record) — readers treat that as `false`.
 * @param isCloudProvider Whether this profile uses a cloud-hosted provider (e.g. ONLYOFFICE DocSpace).
 * @param useProxy Route every provider request through the host's `fetchProxy` instead of the global `fetch`. Useful when the host runs the widget in a sandbox without direct network access (CORS, custom auth, etc.). Has no effect when the  {@link  PlatformAdapter.fetchProxy  }  is not configured.
 */


data class AiCreateProfileInput (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "providerType")
    val providerType: AiProviderType,

    @Json(name = "baseUrl")
    val baseUrl: kotlin.String,

    @Json(name = "modelId")
    val modelId: kotlin.String,

    @Json(name = "basedOn")
    val basedOn: AiBuiltinProviderType? = null,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Json(name = "reasoning")
    val reasoning: kotlin.Boolean? = null,

    @Json(name = "capabilities")
    val capabilities: java.math.BigDecimal? = null,

    @Json(name = "canUseTool")
    val canUseTool: kotlin.Boolean? = null,

    @Json(name = "useResponsesApi")
    val useResponsesApi: kotlin.Boolean? = null,

    @Json(name = "isCloudProvider")
    val isCloudProvider: kotlin.Boolean? = null,

    @Json(name = "useProxy")
    val useProxy: kotlin.Boolean? = null

) {


}

