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

import onlyoffice.docspace.api.sdk.models.EmployeeFullArrayWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.UpdateMembersQuotaRequestDto

interface QuotaApi {
    /**
     * PUT api/2.0/people/resetquota
     * Reset a user quota limit
     * Drops the personal storage limit of the listed accounts, so that each of them follows the portal default  again.  The caller needs the permission to edit the portal settings, which in practice means a DocSpace  administrator or the portal owner.  On a hosted portal the tariff has to include the storage statistics feature, otherwise the operation answers  402; a standalone installation has no such condition.  It takes only `userIds` - the `quota` field of the request body is not read here - and system accounts are  dropped from the list without an error.  The accounts are processed one by one and the answer holds the ones that were reached, each already showing  the portal default as its limit.  Nothing is deleted and no space is freed; only the limit that applies changes.  Use `PUT api/2.0/people/userquota` to give an account its own limit instead.
     * Responses:
     *  - 200: The accounts that now follow the portal default limit
     *  - 402: The tariff of a hosted portal does not include the storage statistics feature
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for resetUsersQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-users-quota/
     *
     *
     * @param updateMembersQuotaRequestDto  (optional)
     * @return [EmployeeFullArrayWrapper]
     */
    @PUT("api/2.0/people/resetquota")
    suspend fun resetUsersQuota(@Body updateMembersQuotaRequestDto: UpdateMembersQuotaRequestDto? = null): Response<EmployeeFullArrayWrapper>

    /**
     * PUT api/2.0/people/userquota
     * Change a user quota limit
     * Gives the listed accounts their own storage limit, replacing the portal default for each of them.  The caller needs the permission to edit the portal settings, which in practice means a DocSpace  administrator or the portal owner.  `quota` is a whole number of bytes: a value of 0 or more becomes the personal limit, while any negative value  switches the personal limit off and hands the account back to the portal default.  The value has to fit the portal: a limit larger than the total storage the tariff allows, or larger than the  portal-wide quota on a standalone installation, is rejected with 400, and so is a value that is not a whole  number.  System accounts are dropped from the list without an error, the accounts are processed one by one, and the  answer holds the ones that were reached.  Setting a limit does not free any space and does not delete anything: an account already over its new limit  simply cannot add more.  Use `PUT api/2.0/people/resetquota` to return accounts to the portal default.
     * Responses:
     *  - 200: The accounts whose limit was changed
     *  - 400: The value is not a whole number of bytes, or it exceeds the storage the portal allows
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateUserQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-quota/
     *
     *
     * @param updateMembersQuotaRequestDto  (optional)
     * @return [EmployeeFullArrayWrapper]
     */
    @PUT("api/2.0/people/userquota")
    suspend fun updateUserQuota(@Body updateMembersQuotaRequestDto: UpdateMembersQuotaRequestDto? = null): Response<EmployeeFullArrayWrapper>

}
