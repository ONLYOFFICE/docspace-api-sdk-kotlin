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

interface AIContextApi {
    /**
     * GET api/2.0/ai/context/get-context-folders
     * Get context folders
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiContextGetContextFolders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-context-folders/
     *
     *
     * @return [AiSuccessResponse]
     */
    @GET("api/2.0/ai/context/get-context-folders")
    suspend fun aiContextGetContextFolders(): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/context/get-room-skill
     * Get room skill
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiContextGetRoomSkill Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skill/
     *
     *
     * @param cloud 
     * @param roomId 
     * @param skillId 
     * @return [AiSuccessResponse]
     */
    @GET("api/2.0/ai/context/get-room-skill")
    suspend fun aiContextGetRoomSkill(@Query("cloud") cloud: kotlin.String, @Query("roomId") roomId: kotlin.String, @Query("skillId") skillId: kotlin.String): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/context/get-room-skills
     * Get room skills
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiContextGetRoomSkills Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skills/
     *
     *
     * @param cloud 
     * @param roomId 
     * @return [AiSuccessResponse]
     */
    @GET("api/2.0/ai/context/get-room-skills")
    suspend fun aiContextGetRoomSkills(@Query("cloud") cloud: kotlin.String, @Query("roomId") roomId: kotlin.String): Response<AiSuccessResponse>

}
