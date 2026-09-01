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

import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.EmployeeType
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
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
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getDeletePersonalFolderProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-delete-personal-folder-progress/
     *
     *
     * @return [TaskProgressResponseWrapper]
     */
    @GET("api/2.0/people/delete/personal/progress")
    suspend fun getDeletePersonalFolderProgress(): Response<TaskProgressResponseWrapper>

    /**
     * GET api/2.0/people/reassign/progress/{userid}
     * Get the reassignment progress
     * Returns the progress of the started data reassignment for the user with the ID specified in the request.
     * Responses:
     *  - 200: Reassignment progress
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getReassignProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reassign-progress/
     *
     *
     * @param userid The user ID.
     * @return [TaskProgressResponseWrapper]
     */
    @GET("api/2.0/people/reassign/progress/{userid}")
    suspend fun getReassignProgress(@Path("userid") userid: java.util.UUID): Response<TaskProgressResponseWrapper>

    /**
     * GET api/2.0/people/remove/progress/{userid}
     * Get the deletion progress
     * Returns the progress of the started data deletion for the user with the ID specified in the request.
     * Responses:
     *  - 200: Deletion progress
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRemoveProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-remove-progress/
     *
     *
     * @param userid The user ID.
     * @return [TaskProgressResponseWrapper]
     */
    @GET("api/2.0/people/remove/progress/{userid}")
    suspend fun getRemoveProgress(@Path("userid") userid: java.util.UUID): Response<TaskProgressResponseWrapper>

    /**
     * GET api/2.0/people/reassign/necessary
     * Check data for reassignment need
     * Checks whether the reassignment of rooms and shared files is required.
     * Responses:
     *  - 200: Boolean value: true if neccessary reassign
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for necessaryReassign Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/necessary-reassign/
     *
     *
     * @param userId The user ID. (optional)
     * @param type The expected user type. (optional)
     * @return [BooleanWrapper]
     */
    @GET("api/2.0/people/reassign/necessary")
    suspend fun necessaryReassign(@Query("UserId") userId: java.util.UUID? = null, @Query("Type") type: EmployeeType? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/people/self/delete
     * Send the deletion instructions
     * Sends the instructions for deleting a user profile.
     * Responses:
     *  - 200: Information message
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for sendInstructionsToDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-instructions-to-delete/
     *
     *
     * @return [StringWrapper]
     */
    @PUT("api/2.0/people/self/delete")
    suspend fun sendInstructionsToDelete(): Response<StringWrapper>

    /**
     * POST api/2.0/people/delete/personal/start
     * Delete the personal folder
     * Starts deleting the personal folder.
     * Responses:
     *  - 200: delete personal progress
     *  - 400: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startDeletePersonalFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-delete-personal-folder/
     *
     *
     * @return [TaskProgressResponseWrapper]
     */
    @POST("api/2.0/people/delete/personal/start")
    suspend fun startDeletePersonalFolder(): Response<TaskProgressResponseWrapper>

    /**
     * POST api/2.0/people/reassign/start
     * Start the data reassignment
     * Starts the data reassignment for the user with the ID specified in the request.
     * Responses:
     *  - 200: Reassignment progress
     *  - 400: Can not reassign data to user or from user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startReassign Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-reassign/
     *
     *
     * @param startReassignRequestDto  (optional)
     * @return [TaskProgressResponseWrapper]
     */
    @POST("api/2.0/people/reassign/start")
    suspend fun startReassign(@Body startReassignRequestDto: StartReassignRequestDto? = null): Response<TaskProgressResponseWrapper>

    /**
     * POST api/2.0/people/remove/start
     * Start the data deletion
     * Starts the data deletion for the user with the ID specified in the request.
     * Responses:
     *  - 200: Deletion progress
     *  - 400: User exception
     *  - 403: No permissions to perform this action
     *  - 404: User not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startRemove Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-remove/
     *
     *
     * @param terminateRequestDto  (optional)
     * @return [TaskProgressResponseWrapper]
     */
    @POST("api/2.0/people/remove/start")
    suspend fun startRemove(@Body terminateRequestDto: TerminateRequestDto? = null): Response<TaskProgressResponseWrapper>

    /**
     * PUT api/2.0/people/reassign/terminate
     * Terminate the data reassignment
     * Terminates the data reassignment for the user with the ID specified in the request.
     * Responses:
     *  - 200: Reassignment progress
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for terminateReassign Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-reassign/
     *
     *
     * @param terminateRequestDto  (optional)
     * @return [TaskProgressResponseWrapper]
     */
    @PUT("api/2.0/people/reassign/terminate")
    suspend fun terminateReassign(@Body terminateRequestDto: TerminateRequestDto? = null): Response<TaskProgressResponseWrapper>

    /**
     * PUT api/2.0/people/remove/terminate
     * Terminate the data deletion
     * Terminates the data deletion for the user with the ID specified in the request.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for terminateRemove Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-remove/
     *
     *
     * @param terminateRequestDto  (optional)
     * @return [Unit]
     */
    @PUT("api/2.0/people/remove/terminate")
    suspend fun terminateRemove(@Body terminateRequestDto: TerminateRequestDto? = null): Response<Unit>

}
