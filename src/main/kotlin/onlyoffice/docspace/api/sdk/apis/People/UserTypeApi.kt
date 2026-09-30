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
import onlyoffice.docspace.api.sdk.models.EmployeeType
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.StartUpdateUserTypeDto
import onlyoffice.docspace.api.sdk.models.TaskProgressResponseWrapper
import onlyoffice.docspace.api.sdk.models.TerminateRequestDto
import onlyoffice.docspace.api.sdk.models.UpdateMembersRequestDto

interface UserTypeApi {
    /**
     * GET api/2.0/people/type/progress/{userid}
     * Get the user type change progress
     * Returns the current state of the user type change queued for the user with the ID specified in the request.  A conversion must have been queued by `POST api/2.0/people/type` first: when nothing is queued for that user  the operation answers 200 with an empty body.  The caller needs the permission to add and remove users.  The call is read-only and is the polling operation of this flow - repeat it until `isCompleted` is true,  reading `percentage` for the 0 to 100 progress and `error` for the message left by a failed job.  Use `PUT api/2.0/people/type/terminate` to cancel a conversion that is still running.
     * Responses:
     *  - 200: The state of the queued user type change, or an empty body when nothing is queued for the user
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getUserTypeUpdateProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-type-update-progress/
     *
     *
     * @param userid The ID of the user the operation applies to, taken from the route. For a progress operation it has to be the  same ID that was passed when the job was started.
     * @return [TaskProgressResponseWrapper]
     */
    @GET("api/2.0/people/type/progress/{userid}")
    suspend fun getUserTypeUpdateProgress(@Path("userid") userid: java.util.UUID): Response<TaskProgressResponseWrapper>

    /**
     * POST api/2.0/people/type
     * Start updating user type
     * Queues an asynchronous job that converts one account to `Guest` or `User` and, in the same job, hands the  rooms and the shared files of that account over to another administrator.  Only `Guest` and `User` are accepted here, because they are the types that cannot own rooms; for any other  type use `PUT api/2.0/people/type/{type}`, which converts immediately and transfers nothing.  The caller needs the permission to add and remove users of the requested type, has to be the portal owner to  convert a DocSpace administrator, and converting to `Guest` also requires the portal to allow inviting guests.  The account being converted has to be active and cannot be the caller, and the recipient - `reassignUserId`,  or the caller when it is omitted - has to be an active room admin or DocSpace admin other than that account.  The conversion does not finish within this call: poll `GET api/2.0/people/type/progress/{userid}` with the  converted user ID until `isCompleted` is true, and cancel it through `PUT api/2.0/people/type/terminate`.  A failure inside the running job is reported in the `error` field of the progress, not as a status code here.
     * Responses:
     *  - 200: The state of the queued user type change
     *  - 400: The requested type is neither Guest nor User, the account is a system account, disabled or the caller, the recipient is the same account or is not an active admin, or a non-owner tried to convert a DocSpace admin
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startUserTypeUpdate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-user-type-update/
     *
     *
     * @param startUpdateUserTypeDto  (optional)
     * @return [TaskProgressResponseWrapper]
     */
    @POST("api/2.0/people/type")
    suspend fun startUserTypeUpdate(@Body startUpdateUserTypeDto: StartUpdateUserTypeDto? = null): Response<TaskProgressResponseWrapper>

    /**
     * PUT api/2.0/people/type/terminate
     * Terminate updating user type
     * Cancels the user type change queued for the user with the ID specified in the request.  The caller needs the permission to add and remove users.  The operation is idempotent: when nothing is queued for that user it answers 200 with an empty body, and  repeating it on an already cancelled job changes nothing.  Cancelling removes the job from the queue and does not undo the type change or the transfers it has already  made, and a cancelled job cannot be resumed - start a new one through `POST api/2.0/people/type`.  The returned progress reports `status` as `Canceled` and `isCompleted` as true.
     * Responses:
     *  - 200: The state of the cancelled user type change, or an empty body when nothing was queued for the user
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for terminateUserTypeUpdate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-user-type-update/
     *
     *
     * @param terminateRequestDto  (optional)
     * @return [TaskProgressResponseWrapper]
     */
    @PUT("api/2.0/people/type/terminate")
    suspend fun terminateUserTypeUpdate(@Body terminateRequestDto: TerminateRequestDto? = null): Response<TaskProgressResponseWrapper>

    /**
     * PUT api/2.0/people/type/{type}
     * Change a user type
     * Changes the type of the existing portal users listed in `userIds` to the type given in the route, in one call.  The caller needs the permission to add and remove users of the requested type, cannot change their own type or  the type of the portal owner, and cannot use this operation at all while being a guest; changing somebody to  `Guest` additionally requires the portal to allow inviting guests.  Every listed account has to be visible to the caller and must not be disabled.  The change is applied immediately: each converted user gets a notification email and raises a `UserUpdated`  webhook, and the accounts are processed one by one, so a rejection in the middle leaves the users before it  already converted - re-read them before retrying.  The answer streams the converted users with their detailed information, in the order they were processed.  Converting somebody to a paid type takes a paid seat, so the operation answers 402 when the tariff or the  paid-user quota does not allow one more.  This operation only moves the type and leaves the rooms and the shared files of the account where they are -  to hand them over to another admin in the same step, use `POST api/2.0/people/type` instead.
     * Responses:
     *  - 200: The converted users with their detailed information
     *  - 402: The tariff or the paid-user quota does not allow one more paid user
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateUserType Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-type/
     *
     *
     * @param type The type to convert the listed accounts to, taken from the route: `User`, `Guest`, `RoomAdmin` or  `DocSpaceAdmin`. `RoomAdmin` and `DocSpaceAdmin` take a paid seat.
     * @param updateMembersRequestDto The accounts to convert. Only `userIds` is read by this operation; `resendAll` belongs to the invitation  operations and is ignored here.
     * @return [EmployeeFullArrayWrapper]
     */
    @PUT("api/2.0/people/type/{type}")
    suspend fun updateUserType(@Path("type") type: EmployeeType, @Body updateMembersRequestDto: UpdateMembersRequestDto): Response<EmployeeFullArrayWrapper>

}
