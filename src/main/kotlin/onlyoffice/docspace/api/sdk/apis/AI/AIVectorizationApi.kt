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

interface AIVectorizationApi {
    /**
     * POST api/2.0/ai/vectorization/tasks
     * Start a vectorization task
     * Starts a vectorization task over the supplied portal files. The indexing itself runs asynchronously on the .NET side.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiVectorizationStartTask Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-vectorization-start-task/
     *
     *
     * @param requestBody 
     * @return [AiSuccessResponse]
     */
    @POST("api/2.0/ai/vectorization/tasks")
    suspend fun aiVectorizationStartTask(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any>): Response<AiSuccessResponse>

}
