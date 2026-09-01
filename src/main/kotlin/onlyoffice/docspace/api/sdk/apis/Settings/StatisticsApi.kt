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


package onlyoffice.docspace.api.sdk.apis.Settings

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.UsageSpaceStatItemArrayWrapper

interface StatisticsApi {
    /**
     * GET api/2.0/settings/statistics/spaceusage/{id}
     * Get the space usage statistics
     * Returns the space usage statistics for the module with the ID specified in the request.
     * Responses:
     *  - 200: Module space usage statistics
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSpaceUsageStatistics Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-space-usage-statistics/
     *
     *
     * @param id The ID extracted from the route parameters.
     * @return [UsageSpaceStatItemArrayWrapper]
     */
    @GET("api/2.0/settings/statistics/spaceusage/{id}")
    suspend fun getSpaceUsageStatistics(@Path("id") id: java.util.UUID): Response<UsageSpaceStatItemArrayWrapper>

}
