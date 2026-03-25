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
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.EmployeeFullArrayWrapper
import onlyoffice.docspace.api.sdk.models.UpdateMembersQuotaRequestDto

interface QuotaApi {
    /**
     * PUT api/2.0/people/resetquota
     * Reset a user quota limit
     * Resets a quota limit of users with the IDs specified in the request.
     * Responses:
     *  - 200: User detailed information
     *  - 402: Your pricing plan does not support this option
     *  - 403: The invitation link is invalid or its validity has expired
     *  - 409: Conflict - system user quota cannot be reset
     *  - 401: Unauthorized
     *
     * REST API Reference for resetUsersQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-users-quota/
     *
     *
     * @param updateMembersQuotaRequestDto  (optional)
     * @return [Call]<[EmployeeFullArrayWrapper]>
     */
    @PUT("api/2.0/people/resetquota")
    fun resetUsersQuota(@Body updateMembersQuotaRequestDto: UpdateMembersQuotaRequestDto? = null): Call<EmployeeFullArrayWrapper>

    /**
     * PUT api/2.0/people/userquota
     * Change a user quota limit
     * Changes a quota limit for the users with the IDs specified in the request.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 400: The entered quota value is invalid or greater than the total storage size
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for updateUserQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-quota/
     *
     *
     * @param updateMembersQuotaRequestDto  (optional)
     * @return [Call]<[EmployeeFullArrayWrapper]>
     */
    @PUT("api/2.0/people/userquota")
    fun updateUserQuota(@Body updateMembersQuotaRequestDto: UpdateMembersQuotaRequestDto? = null): Call<EmployeeFullArrayWrapper>

}
