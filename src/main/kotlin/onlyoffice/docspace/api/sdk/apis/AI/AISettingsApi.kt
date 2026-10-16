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
import onlyoffice.docspace.api.sdk.models.AiSettingsWrapper
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse
import onlyoffice.docspace.api.sdk.models.AiUserSettingsWrapper
import onlyoffice.docspace.api.sdk.models.AiVectorizationSettingsWrapper

interface AISettingsApi {
    /**
     * GET api/2.0/ai/config
     * Get AI settings
     * Reports the portal's AI configuration and whether AI is usable at all, which is the first call a client makes before offering any AI feature. It takes no parameters and is proxied unchanged to the DocSpace AI service, so the answer is that service's settings payload. Among other things it says whether the portal runs on the central AI gateway, which decides whether provider profiles can be edited here at all. This is a read-only operation.
     * Responses:
     *  - 200: The portal's AI configuration and whether AI is usable at all.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsGet Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get/
     *
     *
     * @return [AiSettingsWrapper]
     */
    @GET("api/2.0/ai/config")
    suspend fun aiSettingsGet(): Response<AiSettingsWrapper>

    /**
     * GET api/2.0/ai/config/tool-mode
     * Get the tool permission mode
     * Returns the calling user's tool permission mode as the DocSpace AI service spells it - `{ mode }` with the service's `ToolPermissionMode` enum (`Ask`, `Auto`, `Allow`), proxied unchanged. The chat reads the same value in its own spelling through `GET api/2.0/ai/preferences/get-tool-permission-mode`. This is a read-only operation.
     * Responses:
     *  - 200: The calling user's tool permission mode, as `{ mode }`.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsGetToolMode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-tool-mode/
     *
     *
     * @return [AiSuccessResponse]
     */
    @GET("api/2.0/ai/config/tool-mode")
    suspend fun aiSettingsGetToolMode(): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/config/user
     * Get user AI settings
     * Returns the AI settings of the calling user, as opposed to the portal-wide ones. It takes no parameters - the user is the authenticated caller, and there is no way to read somebody else's settings - and is proxied unchanged to the DocSpace AI service. Use `GET api/2.0/ai/config` for the portal-wide configuration. This is a read-only operation.
     * Responses:
     *  - 200: The calling user's AI settings.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsGetUser Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-user/
     *
     *
     * @return [AiUserSettingsWrapper]
     */
    @GET("api/2.0/ai/config/user")
    suspend fun aiSettingsGetUser(): Response<AiUserSettingsWrapper>

    /**
     * GET api/2.0/ai/config/vectorization
     * Get vectorization settings
     * Returns the portal's vectorization settings - the embedding provider and the options used when portal content is indexed for retrieval. It takes no parameters and is proxied unchanged to the DocSpace AI service. Vectorization is a portal-wide setting, so there is no room-scoped form of it. Change it with `PUT api/2.0/ai/config/vectorization`.
     * Responses:
     *  - 200: The portal's vectorization settings.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
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
     * PUT api/2.0/ai/config/tool-mode
     * Set the tool permission mode
     * Stores the calling user's tool permission mode and returns the stored result. The body (`{ mode }`) is proxied unchanged to the DocSpace AI service, which rejects a value outside its `ToolPermissionMode` enum. The mode applies to every chat of the user in the portal.
     * Responses:
     *  - 200: The calling user's stored tool permission mode, as `{ mode }`.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsSetToolMode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-tool-mode/
     *
     *
     * @param aiSettingsSetToolModeRequest `{ mode }` with the AI service's `ToolPermissionMode` enum, proxied unchanged; the service rejects anything outside the enum.
     * @return [AiSuccessResponse]
     */
    @PUT("api/2.0/ai/config/tool-mode")
    suspend fun aiSettingsSetToolMode(@Body aiSettingsSetToolModeRequest: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<AiSuccessResponse>

    /**
     * PUT api/2.0/ai/config/user
     * Update user AI settings
     * Replaces the AI settings of the calling user and returns the stored result. `chatRecommendedModelVisible` is required and has to be a real boolean - a body the JSON parser cannot read, such as one sent as text/plain, used to arrive empty and answer 200 having stored nothing. The body is then proxied to the DocSpace AI service, which validates the rest, so a rejected value comes back with that service's verdict. Only the caller's own settings can be written. Portal-wide configuration is not touched by this operation.
     * Responses:
     *  - 200: The calling user's stored AI settings.
     *  - 400: `chatRecommendedModelVisible` is missing or not a boolean.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsSetUser Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-user/
     *
     *
     * @param aiSettingsSetUserRequest The user's AI settings: `chatRecommendedModelVisible` as a boolean, required. Read the current one with `GET api/2.0/ai/config/user` and send it back changed.
     * @return [AiUserSettingsWrapper]
     */
    @PUT("api/2.0/ai/config/user")
    suspend fun aiSettingsSetUser(@Body aiSettingsSetUserRequest: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<AiUserSettingsWrapper>

    /**
     * PUT api/2.0/ai/config/vectorization
     * Update vectorization settings
     * Replaces the portal's vectorization settings and returns the stored result. The body is proxied unchanged to the DocSpace AI service, which validates it, so a rejected value is reported with that service's own verdict rather than being checked here. Changing the embedding provider does not re-index anything already indexed - start that separately with `POST api/2.0/ai/vectorization/tasks`. This is a portal-wide setting and requires the permissions the AI service demands for it.
     * Responses:
     *  - 200: The stored vectorization settings.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiSettingsSetVectorization Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-vectorization/
     *
     *
     * @param aiSettingsSetVectorizationRequest The portal's vectorization settings, proxied unchanged to the DocSpace AI service, which owns and validates the shape. Read the current one with `GET api/2.0/ai/config/vectorization` and send it back changed.
     * @return [AiVectorizationSettingsWrapper]
     */
    @PUT("api/2.0/ai/config/vectorization")
    suspend fun aiSettingsSetVectorization(@Body aiSettingsSetVectorizationRequest: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<AiVectorizationSettingsWrapper>

}
