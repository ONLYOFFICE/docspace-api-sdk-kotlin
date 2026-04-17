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


package onlyoffice.docspace.api.sdk.apis.People

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.EmployeeActivationStatus
import onlyoffice.docspace.api.sdk.models.EmployeeFullArrayWrapper
import onlyoffice.docspace.api.sdk.models.EmployeeStatus
import onlyoffice.docspace.api.sdk.models.SortOrder
import onlyoffice.docspace.api.sdk.models.UpdateMembersRequestDto

interface UserStatusApi {
    /**
     * GET api/2.0/people/status/{status}
     * Get profiles by status
     * Returns a list of profiles filtered by the user status.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getByStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-by-status/
     *
     *
     * @param status The user status.
     * @param filterBy Specifies the criteria used to filter the profiles in the request. (optional)
     * @param count The maximum number of user profiles to retrieve. (optional)
     * @param startIndex The starting index for retrieving data in a paginated request. (optional)
     * @param sortBy Specifies the property or field name by which the results should be sorted. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterSeparator Represents the separator used to split multiple filter criteria in a query string. (optional)
     * @param filterValue A string value representing additional filter criteria used in query parameters. (optional)
     * @return [EmployeeFullArrayWrapper]
     */
    @GET("api/2.0/people/status/{status}")
    suspend fun getByStatus(@Path("status") status: EmployeeStatus, @Query("filterBy") filterBy: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterSeparator") filterSeparator: kotlin.String? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<EmployeeFullArrayWrapper>

    /**
     * PUT api/2.0/people/activationstatus/{activationstatus}
     * Set an activation status to the users
     * Sets the required activation status to the list of users with the IDs specified in the request.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateUserActivationStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-activation-status/
     *
     *
     * @param activationstatus The new user activation status.
     * @param updateMembersRequestDto The request parameters for updating the user information.
     * @return [EmployeeFullArrayWrapper]
     */
    @PUT("api/2.0/people/activationstatus/{activationstatus}")
    suspend fun updateUserActivationStatus(@Path("activationstatus") activationstatus: EmployeeActivationStatus, @Body updateMembersRequestDto: UpdateMembersRequestDto): Response<EmployeeFullArrayWrapper>

    /**
     * PUT api/2.0/people/status/{status}
     * Change a user status
     * Changes a status of the users with the IDs specified in the request.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 400: Incorrect status
     *  - 403: No permissions to perform this action or cannot change status for a specific user (yourself, owner, LDAP ...)
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateUserStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-status/
     *
     *
     * @param status The new user status.
     * @param updateMembersRequestDto The request parameters for updating the user information.
     * @return [EmployeeFullArrayWrapper]
     */
    @PUT("api/2.0/people/status/{status}")
    suspend fun updateUserStatus(@Path("status") status: EmployeeStatus, @Body updateMembersRequestDto: UpdateMembersRequestDto): Response<EmployeeFullArrayWrapper>

}
