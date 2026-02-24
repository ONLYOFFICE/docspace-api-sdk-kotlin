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


package onlyoffice.docspace.api.sdk.apis.Security

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.LoginEventArrayWrapper
import onlyoffice.docspace.api.sdk.models.MessageAction
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface LoginHistoryApi {
    /**
     * POST api/2.0/security/audit/login/report
     * Generate the login history report
     * Generates the login history report.
     * Responses:
     *  - 200: URL to the xlsx report file
     *  - 402: Your pricing plan does not support this option
     *  - 401: Unauthorized
     *
     * REST API Reference for createLoginHistoryReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-login-history-report/
     *
     *
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/security/audit/login/report")
    fun createLoginHistoryReport(): Call<StringWrapper>

    /**
     * GET api/2.0/security/audit/login/last
     * Get login history
     * Returns all the latest user login activity, including successful logins and error logs.
     * Responses:
     *  - 200: List of login events
     *  - 402: Your pricing plan does not support this option
     *  - 401: Unauthorized
     *
     * REST API Reference for getLastLoginEvents Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-last-login-events/
     *
     *
     * @return [Call]<[LoginEventArrayWrapper]>
     */
    @GET("api/2.0/security/audit/login/last")
    fun getLastLoginEvents(): Call<LoginEventArrayWrapper>

    /**
     * GET api/2.0/security/audit/login/filter
     * Get filtered login events
     * Returns a list of the login events by the parameters specified in the request.
     * Responses:
     *  - 200: List of filtered login events
     *  - 402: Your pricing plan does not support this option
     *  - 401: Unauthorized
     *
     * REST API Reference for getLoginEventsByFilter Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-events-by-filter/
     *
     *
     * @param userId The ID of the user whose login events are being queried. (optional)
     * @param action The login-related action to filter events by. (optional)
     * @param from The starting date and time for filtering login events. (optional)
     * @param to The ending date and time for filtering login events. (optional)
     * @param count The number of login events to retrieve in the query. (optional)
     * @param startIndex The starting index for fetching a subset of login events from the query results. (optional)
     * @return [Call]<[LoginEventArrayWrapper]>
     */
    @GET("api/2.0/security/audit/login/filter")
    fun getLoginEventsByFilter(@Query("userId") userId: java.util.UUID? = null, @Query("action") action: MessageAction? = null, @Query("from") from: ApiDateTime? = null, @Query("to") to: ApiDateTime? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Call<LoginEventArrayWrapper>

}
