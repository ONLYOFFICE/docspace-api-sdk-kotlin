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
import onlyoffice.docspace.api.sdk.models.EmployeeType
import onlyoffice.docspace.api.sdk.models.StartUpdateUserTypeDto
import onlyoffice.docspace.api.sdk.models.TaskProgressResponseWrapper
import onlyoffice.docspace.api.sdk.models.TerminateRequestDto
import onlyoffice.docspace.api.sdk.models.UpdateMembersRequestDto

interface UserTypeApi {
    /**
     * GET api/2.0/people/type/progress/{userid}
     * Get the progress of updating user type
     * Returns the progress of updating the user type.
     * Responses:
     *  - 200: Update type progress
     *  - 401: Unauthorized
     *
     * REST API Reference for getUserTypeUpdateProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-type-update-progress/
     *
     *
     * @param userid The user ID.
     * @return [Call]<[TaskProgressResponseWrapper]>
     */
    @GET("api/2.0/people/type/progress/{userid}")
    fun getUserTypeUpdateProgress(@Path("userid") userid: java.util.UUID): Call<TaskProgressResponseWrapper>

    /**
     * POST api/2.0/people/type
     * Start updating user type
     * Starts updating the type of the user or guest when reassigning rooms and shared files.
     * Responses:
     *  - 200: Update type progress
     *  - 400: Can not update user type
     *  - 401: Unauthorized
     *
     * REST API Reference for starUserTypetUpdate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/star-user-typet-update/
     *
     *
     * @param startUpdateUserTypeDto  (optional)
     * @return [Call]<[TaskProgressResponseWrapper]>
     */
    @POST("api/2.0/people/type")
    fun starUserTypetUpdate(@Body startUpdateUserTypeDto: StartUpdateUserTypeDto? = null): Call<TaskProgressResponseWrapper>

    /**
     * PUT api/2.0/people/type/terminate
     * Terminate updating user type
     * Terminates the process of updating the type of the user or guest.
     * Responses:
     *  - 200: Update type progress
     *  - 401: Unauthorized
     *
     * REST API Reference for terminateUserTypeUpdate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-user-type-update/
     *
     *
     * @param terminateRequestDto  (optional)
     * @return [Call]<[TaskProgressResponseWrapper]>
     */
    @PUT("api/2.0/people/type/terminate")
    fun terminateUserTypeUpdate(@Body terminateRequestDto: TerminateRequestDto? = null): Call<TaskProgressResponseWrapper>

    /**
     * PUT api/2.0/people/type/{type}
     * Change a user type
     * Changes a type of the users with the IDs specified in the request.
     * Responses:
     *  - 200: List of users with the detailed information
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for updateUserType Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-type/
     *
     *
     * @param type The new user type.
     * @param updateMembersRequestDto The request parameters for updating the user information.
     * @return [Call]<[EmployeeFullArrayWrapper]>
     */
    @PUT("api/2.0/people/type/{type}")
    fun updateUserType(@Path("type") type: EmployeeType, @Body updateMembersRequestDto: UpdateMembersRequestDto): Call<EmployeeFullArrayWrapper>

}
