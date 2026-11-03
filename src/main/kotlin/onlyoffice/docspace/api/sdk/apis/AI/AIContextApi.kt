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

import onlyoffice.docspace.api.sdk.models.AiContextFolder
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiRoomSkill

interface AIContextApi {
    /**
     * GET api/2.0/ai/context/get-context-folders
     * Get context folders
     * Lists the Instructions rooms the caller can connect to a chat as context, grouped under the account they belong to (`docspace` for this portal). Only a room the caller can read that holds at least one skill is listed: one without skills would connect nothing. An empty list means there is nothing to connect. At most 1000 Instructions rooms are read; any beyond them are left out without a signal. Read the skills of one room with `GET api/2.0/ai/context/get-room-skills`. This is a read-only operation.
     * Responses:
     *  - 200: The Instructions rooms the caller can connect, grouped by account.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiContextGetContextFolders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-context-folders/
     *
     *
     * @return [kotlin.collections.List<AiContextFolder>]
     */
    @GET("api/2.0/ai/context/get-context-folders")
    suspend fun aiContextGetContextFolders(): Response<kotlin.collections.List<AiContextFolder>>

    /**
     * GET api/2.0/ai/context/get-knowledge-folders
     * Get knowledge folders
     * Lists the Knowledge rooms the caller can connect to a chat as its knowledge base, grouped under the account they belong to (`docspace` for this portal). A connected Knowledge room limits the knowledge search of a round to it (`actionArgs.knowledgeRooms`). An empty list means there is none the caller can read. At most 1000 Knowledge rooms are listed; any beyond them are left out without a signal. This is a read-only operation.
     * Responses:
     *  - 200: The Knowledge rooms the caller can connect, grouped by account.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiContextGetKnowledgeFolders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-knowledge-folders/
     *
     *
     * @return [kotlin.collections.List<AiContextFolder>]
     */
    @GET("api/2.0/ai/context/get-knowledge-folders")
    suspend fun aiContextGetKnowledgeFolders(): Response<kotlin.collections.List<AiContextFolder>>

    /**
     * GET api/2.0/ai/context/get-room-skill
     * Get room skill
     * Returns the Markdown file of one skill of an Instructions room as a JSON string. `roomId` and `skillId` are required, and the skill has to be one of that room's skills: the ID of any other file, readable or not, answers 404, as does a room that is not an Instructions room the caller can read. Only the first 256 KiB of the file are read, which covers the 64 K characters a chat passes to the model; a longer file comes back cut there without a signal. This is a read-only operation.
     * Responses:
     *  - 200: The skill's Markdown file as a JSON string, its first 256 KiB.
     *  - 400: `roomId` or `skillId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 404: The room is not an Instructions room the caller can read, or `skillId` is not one of its skills.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiContextGetRoomSkill Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skill/
     *
     *
     * @param roomId The Instructions room identifier.
     * @param skillId The skill identifier, as `GET api/2.0/ai/context/get-room-skills` lists it.
     * @param cloud The account the room belongs to. Only `docspace`, this portal, exists, and the value is not read; omit it. (optional)
     * @return [kotlin.String]
     */
    @GET("api/2.0/ai/context/get-room-skill")
    suspend fun aiContextGetRoomSkill(@Query("roomId") roomId: kotlin.String, @Query("skillId") skillId: kotlin.String, @Query("cloud") cloud: kotlin.String? = null): Response<kotlin.String>

    /**
     * GET api/2.0/ai/context/get-room-skills
     * Get room skills
     * Lists the skills of one Instructions room: the ID, name and description from the frontmatter of each skill file, not its body. `roomId` is required; `cloud` is accepted and not read. A room that is not an Instructions room the caller can read answers 404. Read the body of one skill with `GET api/2.0/ai/context/get-room-skill`. This is a read-only operation.
     * Responses:
     *  - 200: The skills of the room, frontmatter only.
     *  - 400: `roomId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 404: The room is not an Instructions room the caller can read.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiContextGetRoomSkills Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skills/
     *
     *
     * @param roomId The Instructions room identifier.
     * @param cloud The account the room belongs to. Only `docspace`, this portal, exists, and the value is not read; omit it. (optional)
     * @return [kotlin.collections.List<AiRoomSkill>]
     */
    @GET("api/2.0/ai/context/get-room-skills")
    suspend fun aiContextGetRoomSkills(@Query("roomId") roomId: kotlin.String, @Query("cloud") cloud: kotlin.String? = null): Response<kotlin.collections.List<AiRoomSkill>>

}
