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


package onlyoffice.docspace.api.sdk.apis.AI

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiOpenaiChatCompletions403Response

interface AIOpenAIPassthroughApi {
    /**
     * POST api/2.0/ai/openai/{profileId}/v1/chat/completions
     * OpenAI chat completions passthrough
     * OpenAI-compatible chat completions for the document editor's AI plugin. The profile is resolved server-side, its credentials are attached, and the body is forwarded to the provider verbatim - the payload is owned by the plugin's SDK on one end and the provider on the other. A client disconnect cancels the provider call.
     * Responses:
     *  - 200: The provider's own response, relayed verbatim with its status and content type.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: No profile with this identifier exists for the caller.
     *  - 413: The request body is larger than this route accepts.
     *  - 429: Relayed verbatim from the AI provider, which is rate-limiting this portal's key.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *  - 502: The AI provider could not be reached, or answered with a failure of its own.
     *
     * REST API Reference for aiOpenaiChatCompletions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-chat-completions/
     *
     *
     * @param profileId The AI provider profile identifier.
     * @param requestBody An OpenAI Chat Completions request, forwarded to the provider byte for byte. The shape is the provider's, not this API's, so consult the provider's own reference; the model and the credentials come from the profile in the path and must not be sent here.
     * @return [kotlin.collections.Map<kotlin.String, kotlin.Any?>]
     */
    @POST("api/2.0/ai/openai/{profileId}/v1/chat/completions")
    suspend fun aiOpenaiChatCompletions(@Path("profileId") profileId: kotlin.String, @Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<kotlin.collections.Map<kotlin.String, kotlin.Any?>>

    /**
     * POST api/2.0/ai/openai/{profileId}/v1/images/generations
     * OpenAI image generation passthrough
     * OpenAI-compatible image generation for the document editor's AI plugin, working exactly as the chat-completions passthrough does: the profile named by `profileId` is resolved server-side, its credentials are attached, and the body reaches the provider unchanged. The provider's status and body are relayed verbatim, so its 429 and its own error envelope surface as they stand. A body larger than this route accepts is refused before it is forwarded. A client disconnect aborts the provider call.
     * Responses:
     *  - 200: The provider's own response, relayed verbatim with its status and content type.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: No profile with this identifier exists for the caller.
     *  - 413: The request body is larger than this route accepts.
     *  - 429: Relayed verbatim from the AI provider, which is rate-limiting this portal's key.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *  - 502: The AI provider could not be reached, or answered with a failure of its own.
     *
     * REST API Reference for aiOpenaiImagesGenerations Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-images-generations/
     *
     *
     * @param profileId The AI provider profile identifier.
     * @param requestBody An OpenAI image-generation request, forwarded to the provider byte for byte. The shape is the provider's, not this API's, and the credentials come from the profile in the path.
     * @return [kotlin.collections.Map<kotlin.String, kotlin.Any?>]
     */
    @POST("api/2.0/ai/openai/{profileId}/v1/images/generations")
    suspend fun aiOpenaiImagesGenerations(@Path("profileId") profileId: kotlin.String, @Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<kotlin.collections.Map<kotlin.String, kotlin.Any?>>

}
