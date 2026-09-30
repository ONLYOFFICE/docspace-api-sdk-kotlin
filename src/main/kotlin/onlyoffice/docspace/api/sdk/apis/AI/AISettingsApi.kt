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

import onlyoffice.docspace.api.sdk.models.AiAiSettingsWrapper
import onlyoffice.docspace.api.sdk.models.AiAiUserSettingsWrapper
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiVectorizationSettingsWrapper

interface AISettingsApi {
    /**
     * GET api/2.0/ai/config
     * Get AI settings
     * Reports the portal's AI configuration and whether AI is usable at all, which is the first call a client makes before offering any AI feature. It takes no parameters and is proxied unchanged to the DocSpace AI service, so the answer is that service's settings payload. Among other things it says whether the portal runs on the central AI gateway, which decides whether provider profiles can be edited here at all. This is a read-only operation.
     * Responses:
     *  - 200: The portal's AI configuration and whether AI is usable at all.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsGet Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get/
     *
     *
     * @return [AiAiSettingsWrapper]
     */
    @GET("api/2.0/ai/config")
    suspend fun aiSettingsGet(): Response<AiAiSettingsWrapper>

    /**
     * GET api/2.0/ai/config/user
     * Get user AI settings
     * Returns the AI settings of the calling user, as opposed to the portal-wide ones. It takes no parameters - the user is the authenticated caller, and there is no way to read somebody else's settings - and is proxied unchanged to the DocSpace AI service. Use `GET api/2.0/ai/config` for the portal-wide configuration. This is a read-only operation.
     * Responses:
     *  - 200: The calling user's AI settings.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsGetUser Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-user/
     *
     *
     * @return [AiAiUserSettingsWrapper]
     */
    @GET("api/2.0/ai/config/user")
    suspend fun aiSettingsGetUser(): Response<AiAiUserSettingsWrapper>

    /**
     * GET api/2.0/ai/config/vectorization
     * Get vectorization settings
     * Returns the portal's vectorization settings - the embedding provider and the options used when portal content is indexed for retrieval. It takes no parameters and is proxied unchanged to the DocSpace AI service. Vectorization is a portal-wide setting, so there is no room-scoped form of it. Change it with `PUT api/2.0/ai/config/vectorization`.
     * Responses:
     *  - 200: The portal's vectorization settings.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsGetVectorization Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-vectorization/
     *
     *
     * @return [AiVectorizationSettingsWrapper]
     */
    @GET("api/2.0/ai/config/vectorization")
    suspend fun aiSettingsGetVectorization(): Response<AiVectorizationSettingsWrapper>

    /**
     * PUT api/2.0/ai/config/user
     * Update user AI settings
     * Replaces the AI settings of the calling user and returns the stored result. The body is proxied unchanged to the DocSpace AI service, which validates it, so a rejected value comes back with that service's verdict. Only the caller's own settings can be written. Portal-wide configuration is not touched by this operation.
     * Responses:
     *  - 200: The calling user's stored AI settings.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsSetUser Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-user/
     *
     *
     * @param requestBody The user's AI settings, proxied unchanged to the DocSpace AI service, which owns and validates the shape. Read the current one with `GET api/2.0/ai/config/user` and send it back changed.
     * @return [AiAiUserSettingsWrapper]
     */
    @PUT("api/2.0/ai/config/user")
    suspend fun aiSettingsSetUser(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<AiAiUserSettingsWrapper>

    /**
     * PUT api/2.0/ai/config/vectorization
     * Update vectorization settings
     * Replaces the portal's vectorization settings and returns the stored result. The body is proxied unchanged to the DocSpace AI service, which validates it, so a rejected value is reported with that service's own verdict rather than being checked here. Changing the embedding provider does not re-index anything already indexed - start that separately with `POST api/2.0/ai/vectorization/tasks`. This is a portal-wide setting and requires the permissions the AI service demands for it.
     * Responses:
     *  - 200: The stored vectorization settings.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsSetVectorization Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-vectorization/
     *
     *
     * @param requestBody The portal's vectorization settings, proxied unchanged to the DocSpace AI service, which owns and validates the shape. Read the current one with `GET api/2.0/ai/config/vectorization` and send it back changed.
     * @return [AiVectorizationSettingsWrapper]
     */
    @PUT("api/2.0/ai/config/vectorization")
    suspend fun aiSettingsSetVectorization(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<AiVectorizationSettingsWrapper>

}
