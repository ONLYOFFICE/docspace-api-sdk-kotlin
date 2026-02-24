 /*
 * (c) Copyright Ascensio System SIA 2025
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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.EmployeeType
import onlyoffice.docspace.api.sdk.models.StartReassignRequestDto
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TaskProgressResponseWrapper
import onlyoffice.docspace.api.sdk.models.TerminateRequestDto

interface UserDataApi {
    /**
     * GET api/2.0/people/delete/personal/progress
     * Get the progress of deleting the personal folder
     * Returns the progress of deleting the personal folder.
     * Responses:
     *  - 200: Deletion progress
     *  - 401: Unauthorized
     *
     * REST API Reference for getDeletePersonalFolderProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-delete-personal-folder-progress/
     *
     *
     * @return [Call]<[TaskProgressResponseWrapper]>
     */
    @GET("api/2.0/people/delete/personal/progress")
    fun getDeletePersonalFolderProgress(): Call<TaskProgressResponseWrapper>

    /**
     * GET api/2.0/people/reassign/progress/{userid}
     * Get the reassignment progress
     * Returns the progress of the started data reassignment for the user with the ID specified in the request.
     * Responses:
     *  - 200: Reassignment progress
     *  - 401: Unauthorized
     *
     * REST API Reference for getReassignProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reassign-progress/
     *
     *
     * @param userid The user ID.
     * @return [Call]<[TaskProgressResponseWrapper]>
     */
    @GET("api/2.0/people/reassign/progress/{userid}")
    fun getReassignProgress(@Path("userid") userid: java.util.UUID): Call<TaskProgressResponseWrapper>

    /**
     * GET api/2.0/people/remove/progress/{userid}
     * Get the deletion progress
     * Returns the progress of the started data deletion for the user with the ID specified in the request.
     * Responses:
     *  - 200: Deletion progress
     *  - 401: Unauthorized
     *
     * REST API Reference for getRemoveProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-remove-progress/
     *
     *
     * @param userid The user ID.
     * @return [Call]<[TaskProgressResponseWrapper]>
     */
    @GET("api/2.0/people/remove/progress/{userid}")
    fun getRemoveProgress(@Path("userid") userid: java.util.UUID): Call<TaskProgressResponseWrapper>

    /**
     * GET api/2.0/people/reassign/necessary
     * Check data for reassignment need
     * Checks whether the reassignment of rooms and shared files is required.
     * Responses:
     *  - 200: Boolean value: true if neccessary reassign
     *  - 401: Unauthorized
     *
     * REST API Reference for necessaryReassign Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/necessary-reassign/
     *
     *
     * @param userId The user ID. (optional)
     * @param type The expected user type. (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @GET("api/2.0/people/reassign/necessary")
    fun necessaryReassign(@Query("UserId") userId: java.util.UUID? = null, @Query("Type") type: EmployeeType? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/people/self/delete
     * Send the deletion instructions
     * Sends the instructions for deleting a user profile.
     * Responses:
     *  - 200: Information message
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for sendInstructionsToDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-instructions-to-delete/
     *
     *
     * @return [Call]<[StringWrapper]>
     */
    @PUT("api/2.0/people/self/delete")
    fun sendInstructionsToDelete(): Call<StringWrapper>

    /**
     * POST api/2.0/people/delete/personal/start
     * Delete the personal folder
     * Starts deleting the personal folder.
     * Responses:
     *  - 200: delete personal progress
     *  - 400: Access denied
     *  - 401: Unauthorized
     *
     * REST API Reference for startDeletePersonalFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-delete-personal-folder/
     *
     *
     * @return [Call]<[TaskProgressResponseWrapper]>
     */
    @POST("api/2.0/people/delete/personal/start")
    fun startDeletePersonalFolder(): Call<TaskProgressResponseWrapper>

    /**
     * POST api/2.0/people/reassign/start
     * Start the data reassignment
     * Starts the data reassignment for the user with the ID specified in the request.
     * Responses:
     *  - 200: Reassignment progress
     *  - 400: Can not reassign data to user or from user
     *  - 401: Unauthorized
     *
     * REST API Reference for startReassign Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-reassign/
     *
     *
     * @param startReassignRequestDto  (optional)
     * @return [Call]<[TaskProgressResponseWrapper]>
     */
    @POST("api/2.0/people/reassign/start")
    fun startReassign(@Body startReassignRequestDto: StartReassignRequestDto? = null): Call<TaskProgressResponseWrapper>

    /**
     * POST api/2.0/people/remove/start
     * Start the data deletion
     * Starts the data deletion for the user with the ID specified in the request.
     * Responses:
     *  - 200: Deletion progress
     *  - 400: User exception
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *  - 404: User not found
     *
     * REST API Reference for startRemove Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-remove/
     *
     *
     * @param terminateRequestDto  (optional)
     * @return [Call]<[TaskProgressResponseWrapper]>
     */
    @POST("api/2.0/people/remove/start")
    fun startRemove(@Body terminateRequestDto: TerminateRequestDto? = null): Call<TaskProgressResponseWrapper>

    /**
     * PUT api/2.0/people/reassign/terminate
     * Terminate the data reassignment
     * Terminates the data reassignment for the user with the ID specified in the request.
     * Responses:
     *  - 200: Reassignment progress
     *  - 401: Unauthorized
     *
     * REST API Reference for terminateReassign Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-reassign/
     *
     *
     * @param terminateRequestDto  (optional)
     * @return [Call]<[TaskProgressResponseWrapper]>
     */
    @PUT("api/2.0/people/reassign/terminate")
    fun terminateReassign(@Body terminateRequestDto: TerminateRequestDto? = null): Call<TaskProgressResponseWrapper>

    /**
     * PUT api/2.0/people/remove/terminate
     * Terminate the data deletion
     * Terminates the data deletion for the user with the ID specified in the request.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for terminateRemove Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-remove/
     *
     *
     * @param terminateRequestDto  (optional)
     * @return [Call]<[Unit]>
     */
    @PUT("api/2.0/people/remove/terminate")
    fun terminateRemove(@Body terminateRequestDto: TerminateRequestDto? = null): Call<Unit>

}
