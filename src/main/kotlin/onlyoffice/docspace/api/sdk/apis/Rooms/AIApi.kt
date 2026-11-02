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


package onlyoffice.docspace.api.sdk.apis.Rooms

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AiProjectModelWrapper
import onlyoffice.docspace.api.sdk.models.AiProjectSourcesWrapper
import onlyoffice.docspace.api.sdk.models.AiSkillsWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.LinkAiProjectSourcesRequest
import onlyoffice.docspace.api.sdk.models.UnlinkAiProjectSourcesRequest
import onlyoffice.docspace.api.sdk.models.UpdateAiProjectModelRequest

interface AIApi {
    /**
     * GET api/2.0/files/rooms/{id}/model
     * Get the AI project model
     * Returns the AI model selected for the chat of an AI project, as the ID of an AI model profile. Any project member with read access may call it. The call is read-only. The result holds only the project's own choice: `profileId` is null when nobody has selected a model for the project yet, or when the selected profile has been removed from the portal since. In both cases the portal-wide model is used instead, which this operation does not return. To change the model, use `PUT api/2.0/files/rooms/{id}/model`.
     * Responses:
     *  - 200: The AI model profile selected for the project, or null when none is selected
     *  - 403: The caller may not read the project, or the AI features are turned off on the portal
     *  - 404: No AI project has this id
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getProjectModel Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-project-model/
     *
     *
     * @param id The room to act on, named by the identifier that `GET api/2.0/files/rooms` reports for it. Rooms kept in the  portal itself use whole numbers, while a room backed by a connected third-party account uses the string form  of the same listing.
     * @return [AiProjectModelWrapper]
     */
    @GET("api/2.0/files/rooms/{id}/model")
    suspend fun getProjectModel(@Path("id") id: kotlin.Int): Response<AiProjectModelWrapper>

    /**
     * GET api/2.0/files/rooms/{id}/sources
     * Get the AI project sources
     * Returns the Instructions and Knowledge rooms linked to an AI project as its sources.
     * Responses:
     *  - 200: The Instructions and Knowledge rooms linked to the project
     *  - 403: The caller may not read the project, or the AI features are turned off on the portal
     *  - 404: No AI project has this id
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getProjectSources Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-project-sources/
     *
     *
     * @param id The room to act on, named by the identifier that `GET api/2.0/files/rooms` reports for it. Rooms kept in the  portal itself use whole numbers, while a room backed by a connected third-party account uses the string form  of the same listing.
     * @return [AiProjectSourcesWrapper]
     */
    @GET("api/2.0/files/rooms/{id}/sources")
    suspend fun getProjectSources(@Path("id") id: kotlin.Int): Response<AiProjectSourcesWrapper>

    /**
     * GET api/2.0/files/rooms/{id}/skills
     * Get the skills of an AI room
     * Returns the skills of an Instructions room, or of the Instructions rooms linked to an AI project.
     * Responses:
     *  - 200: The Instructions rooms with their skills
     *  - 403: The caller may not read the room, or the AI features are turned off on the portal
     *  - 404: No active Instructions room or AI project has this id
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRoomSkills Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-skills/
     *
     *
     * @param id The room to act on, named by the identifier that `GET api/2.0/files/rooms` reports for it. Rooms kept in the  portal itself use whole numbers, while a room backed by a connected third-party account uses the string form  of the same listing.
     * @return [AiSkillsWrapper]
     */
    @GET("api/2.0/files/rooms/{id}/skills")
    suspend fun getRoomSkills(@Path("id") id: kotlin.Int): Response<AiSkillsWrapper>

    /**
     * GET api/2.0/files/rooms/skills
     * Get the skills of Instructions rooms
     * Returns the skills of several Instructions rooms. Rooms the caller cannot read are left out.
     * Responses:
     *  - 200: The readable Instructions rooms among the requested ones, with their skills
     *  - 400: `roomIds` is empty or longer than 20 items
     *  - 403: The AI features are turned off on the portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRoomsSkills Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-skills/
     *
     *
     * @param roomIds IDs of the Instructions rooms, one `roomIds` query item per room; 1 to 20 items. (optional)
     * @return [AiSkillsWrapper]
     */
    @GET("api/2.0/files/rooms/skills")
    suspend fun getRoomsSkills(@Query("roomIds") roomIds: @JvmSuppressWildcards kotlin.collections.Set<kotlin.Int>? = null): Response<AiSkillsWrapper>

    /**
     * POST api/2.0/files/rooms/{id}/sources
     * Link sources to an AI project
     * Links Instructions and Knowledge rooms to an AI project as its sources, which gives every project member read access to them. The caller must manage the project and each listed room; rooms that are already linked are skipped.
     * Responses:
     *  - 204: The rooms are linked
     *  - 400: `roomIds` is empty or longer than 40 items, a room is not an active Instructions or Knowledge room the caller manages, or the project would hold more than 20 rooms of one kind
     *  - 403: The caller may not edit the project, or the AI features are turned off on the portal
     *  - 404: No AI project has this id
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for linkProjectSources Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/link-project-sources/
     *
     *
     * @param id ID of the project.
     * @param linkAiProjectSourcesRequest The rooms to link.
     * @return [Unit]
     */
    @POST("api/2.0/files/rooms/{id}/sources")
    suspend fun linkProjectSources(@Path("id") id: kotlin.Int, @Body linkAiProjectSourcesRequest: LinkAiProjectSourcesRequest): Response<Unit>

    /**
     * PUT api/2.0/files/rooms/{id}/model
     * Set the AI project model
     * Selects the AI model that answers in the chat of an AI project, replacing the previous choice, and returns the model now selected. Take `profileId` from the profiles that `GET api/2.0/ai/profiles/list` returns. The caller must be able to edit the project; reading it is not enough. The change applies to every member of the project, is recorded in the audit trail and notifies the project's open clients. Repeating the call with the same profile changes nothing. A model can only be replaced by another one: there is no operation that clears the selection and returns the project to the portal-wide model. The profile must exist on the portal and be able to chat; a profile known to serve only other kinds of tasks, such as image generation, is refused with 400.
     * Responses:
     *  - 200: The AI model profile now selected for the project
     *  - 400: The request body cannot be read or has no `profileId`, the portal has no AI model profile with this id, or the profile cannot be used for chat
     *  - 403: The caller may not edit the project, or the AI features are turned off on the portal
     *  - 404: No AI project has this id
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setProjectModel Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-project-model/
     *
     *
     * @param id ID of the project.
     * @param updateAiProjectModelRequest The model to set.
     * @return [AiProjectModelWrapper]
     */
    @PUT("api/2.0/files/rooms/{id}/model")
    suspend fun setProjectModel(@Path("id") id: kotlin.Int, @Body updateAiProjectModelRequest: UpdateAiProjectModelRequest): Response<AiProjectModelWrapper>

    /**
     * DELETE api/2.0/files/rooms/{id}/sources
     * Unlink sources from an AI project
     * Unlinks Instructions and Knowledge rooms from an AI project; project members lose the access the link gave them. The caller must manage the project, rights on the rooms are not checked; the rooms themselves are not changed.
     * Responses:
     *  - 204: The rooms are unlinked
     *  - 400: `roomIds` is empty or longer than 40 items
     *  - 403: The caller may not edit the project, or the AI features are turned off on the portal
     *  - 404: No AI project has this id
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for unlinkProjectSources Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-project-sources/
     *
     *
     * @param id ID of the project.
     * @param unlinkAiProjectSourcesRequest The rooms to unlink.
     * @return [Unit]
     */
    @HTTP(method = "DELETE", path = "api/2.0/files/rooms/{id}/sources", hasBody = true)
    suspend fun unlinkProjectSources(@Path("id") id: kotlin.Int, @Body unlinkAiProjectSourcesRequest: UnlinkAiProjectSourcesRequest): Response<Unit>

}
