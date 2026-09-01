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
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse

interface AIOpenAIPassthroughApi {
    /**
     * POST api/2.0/ai/openai/{profileId}/v1/chat/completions
     * OpenAI-compatible chat completions proxied to the profile's provider
     * OpenAI-compatible chat completions for the document editor's AI plugin. The profile is resolved server-side, its credentials are attached, and the body is forwarded to the provider verbatim - the payload is owned by the plugin's SDK on one end and the provider on the other. A client disconnect cancels the provider call.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiOpenaiChatCompletions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-chat-completions/
     *
     *
     * @param profileId The AI provider profile identifier.
     * @param requestBody 
     * @return [AiSuccessResponse]
     */
    @POST("api/2.0/ai/openai/{profileId}/v1/chat/completions")
    suspend fun aiOpenaiChatCompletions(@Path("profileId") profileId: kotlin.String, @Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any>): Response<AiSuccessResponse>

    /**
     * POST api/2.0/ai/openai/{profileId}/v1/images/generations
     * OpenAI-compatible image generation proxied to the profile's provider
     * OpenAI-compatible image generation for the document editor's AI plugin. As with the chat-completions passthrough, the profile's credentials are attached server-side and the body reaches the provider unchanged.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiOpenaiImagesGenerations Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-images-generations/
     *
     *
     * @param profileId The AI provider profile identifier.
     * @param requestBody 
     * @return [AiSuccessResponse]
     */
    @POST("api/2.0/ai/openai/{profileId}/v1/images/generations")
    suspend fun aiOpenaiImagesGenerations(@Path("profileId") profileId: kotlin.String, @Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any>): Response<AiSuccessResponse>

}
