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
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.VectorizationStartRequestBody

interface VectorizationApi {
    /**
     * POST api/2.0/ai/vectorization/tasks
     * Start a vectorization task
     * Submits the specified files for vectorization. Each file is processed asynchronously by the configured embedding provider  and indexed for semantic search in AI chat sessions. Only files accessible to the current user can be vectorized.
     * Responses:
     *  - 200: The vectorization task was successfully submitted
     *  - 401: Unauthorized
     *
     * REST API Reference for startTask Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-task/
     *
     *
     * @param vectorizationStartRequestBody The vectorization parameters including file identifiers.
     * @return [Call]<[Unit]>
     */
    @POST("api/2.0/ai/vectorization/tasks")
    fun startTask(@Body vectorizationStartRequestBody: VectorizationStartRequestBody): Call<Unit>

}
