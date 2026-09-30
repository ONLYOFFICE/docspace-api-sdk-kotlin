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
import onlyoffice.docspace.api.sdk.models.AiVectorizationStartTask200Response
import onlyoffice.docspace.api.sdk.models.AiVectorizationStartTaskRequest

interface AIVectorizationApi {
    /**
     * POST api/2.0/ai/vectorization/tasks
     * Start a vectorization task
     * Queues the indexing of the portal files named in the body so their contents can be retrieved during a chat round. The body is proxied unchanged to the DocSpace AI service, which validates it and owns the job. Indexing is asynchronous and fire-and-forget: the answer acknowledges the request without carrying a job handle, so there is nothing to poll and progress is not reported here. The embedding provider used is the one in `GET api/2.0/ai/config/vectorization`, and changing that setting does not re-index anything already indexed - queue it again for that.
     * Responses:
     *  - 200: Confirms the indexing was queued. It carries no job handle, so there is nothing to poll.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiVectorizationStartTask Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-vectorization-start-task/
     *
     *
     * @param aiVectorizationStartTaskRequest The files to index, proxied unchanged to the DocSpace AI service, which owns and validates the shape.
     * @return [AiVectorizationStartTask200Response]
     */
    @POST("api/2.0/ai/vectorization/tasks")
    suspend fun aiVectorizationStartTask(@Body aiVectorizationStartTaskRequest: AiVectorizationStartTaskRequest): Response<AiVectorizationStartTask200Response>

}
