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
     * Reports the portal's combined AI configuration and readiness.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * Returns the current user's AI settings.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * Returns the portal's vectorization settings.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * Updates the current user's AI settings.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiSettingsSetUser Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-user/
     *
     *
     * @param requestBody 
     * @return [AiAiUserSettingsWrapper]
     */
    @PUT("api/2.0/ai/config/user")
    suspend fun aiSettingsSetUser(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any>): Response<AiAiUserSettingsWrapper>

    /**
     * PUT api/2.0/ai/config/vectorization
     * Update vectorization settings
     * Updates the portal's vectorization settings.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiSettingsSetVectorization Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-vectorization/
     *
     *
     * @param requestBody 
     * @return [AiVectorizationSettingsWrapper]
     */
    @PUT("api/2.0/ai/config/vectorization")
    suspend fun aiSettingsSetVectorization(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<AiVectorizationSettingsWrapper>

}
