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
     * Returns the storage space used by one portal module, broken down per data category the module tracks (for  example per room type), together with a human-readable size and whether the category is disabled. Requires  Owner or DocSpaceAdmin (the EditPortalSettings permission). `id` identifies the module by the same GUID the  portal's module catalog uses; a module that does not exist, or one that does not report space usage at all,  returns an empty list rather than an error. This is a read-only, idempotent call, and the list is not  paginated. Sizes are already formatted as display strings (for example `1.5 GB`), not raw byte counts.
     * Responses:
     *  - 200: Per-category space usage statistics for the requested module
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
     * @param id The identifier of the object the operation acts on, as the listing operation of that kind of object reports  it. It has to match the shape the route declares - a GUID where the route is typed as one - since a value of  another shape does not match the route at all and is answered as not found.
     * @return [UsageSpaceStatItemArrayWrapper]
     */
    @GET("api/2.0/settings/statistics/spaceusage/{id}")
    suspend fun getSpaceUsageStatistics(@Path("id") id: java.util.UUID): Response<UsageSpaceStatItemArrayWrapper>

}
