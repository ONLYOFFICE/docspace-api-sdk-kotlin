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
     * Get the personal folder deletion progress
     * Returns the current state of the personal folder deletion queued for the authenticated account.  The job must have been queued by `POST api/2.0/people/delete/personal/start` first: when nothing is queued for  the caller the operation answers 200 with an empty body.  It takes no parameters and reports on the caller only, so an administrator cannot watch the folder deletion of  another user through it.  The call is read-only and is the polling operation of this flow - repeat it until `isCompleted` is true, and  read `error` for the message left by a failed job.  A queued personal folder deletion cannot be cancelled, so the only outcome to wait for is its completion.
     * Responses:
     *  - 200: The state of the queued personal folder deletion, or an empty body when nothing is queued for the caller
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
     * Returns the current state of the data reassignment queued for the user with the ID specified in the request.  A reassignment must have been queued by `POST api/2.0/people/reassign/start` first: when nothing is queued for  that user the operation answers 200 with an empty body.  The caller needs the permission to edit users, and only the portal owner may track a reassignment whose source  user is a DocSpace administrator.  The call is read-only and is the polling operation of the reassignment flow - repeat it until `isCompleted` is  true, reading `percentage` for the 0 to 100 progress and `error` for the message left by a failed job.  Use `PUT api/2.0/people/reassign/terminate` to cancel a job that is still running.
     * Responses:
     *  - 200: The state of the queued reassignment, or an empty body when nothing is queued for the user
     *  - 403: No permissions to perform this action
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
     * @param userid The ID of the user the operation applies to, taken from the route. For a progress operation it has to be the  same ID that was passed when the job was started.
     * @return [TaskProgressResponseWrapper]
     */
    @GET("api/2.0/people/reassign/progress/{userid}")
    suspend fun getReassignProgress(@Path("userid") userid: java.util.UUID): Response<TaskProgressResponseWrapper>

    /**
     * GET api/2.0/people/remove/progress/{userid}
     * Get the deletion progress
     * Returns the current state of the data deletion queued for the user with the ID specified in the request.  A deletion must have been queued by `POST api/2.0/people/remove/start` first: when nothing is queued for that  user the operation answers 200 with an empty body.  The caller needs the permission to edit users.  The call is read-only and is the polling operation of the deletion flow - repeat it until `isCompleted` is  true, reading `percentage` for the 0 to 100 progress and `error` for the message left by a failed job.  Use `PUT api/2.0/people/remove/terminate` to cancel a job that is still running.
     * Responses:
     *  - 200: The state of the queued deletion, or an empty body when nothing is queued for the user
     *  - 403: No permissions to perform this action
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
     * @param userid The ID of the user the operation applies to, taken from the route. For a progress operation it has to be the  same ID that was passed when the job was started.
     * @return [TaskProgressResponseWrapper]
     */
    @GET("api/2.0/people/remove/progress/{userid}")
    suspend fun getRemoveProgress(@Path("userid") userid: java.util.UUID): Response<TaskProgressResponseWrapper>

    /**
     * GET api/2.0/people/reassign/necessary
     * Check data for reassignment need
     * Reports whether the rooms and the shared files of a user have to be reassigned before that user can be removed  or changed to the type passed in `type`.  Call it before `DELETE api/2.0/people/{userid}` or before a type change to find out whether  `POST api/2.0/people/reassign/start` has to run first.  The caller needs the permission to add and remove users of the requested type, and must be the portal owner  when the checked user is a DocSpace administrator.  The call is read-only and answers true when the user owns at least one room, or - when `type` is `Guest` -  when the user still has shared files.  A false answer means the user can be removed or converted without a reassignment.
     * Responses:
     *  - 200: True if the data of the user has to be reassigned before the removal or the type change
     *  - 403: No permissions to perform this action
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
     * @param userId The ID of the user whose rooms and shared files are checked. (optional)
     * @param type The type the user is about to be changed to, which decides what counts as data that has to be reassigned:  `RoomAdmin`, `DocSpaceAdmin` and `User` are checked for owned rooms only, while `Guest` is also checked for  files that are still shared. The default is `All`, which checks owned rooms only. (optional)
     * @return [BooleanWrapper]
     */
    @GET("api/2.0/people/reassign/necessary")
    suspend fun necessaryReassign(@Query("UserId") userId: java.util.UUID? = null, @Query("Type") type: EmployeeType? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/people/self/delete
     * Send the deletion instructions
     * Emails the caller a confirmation link that lets them delete their own profile, and is the first step of the  self-service profile removal.  It acts on the authenticated account only and takes no parameters, so it cannot be used to remove somebody  else - an administrator removes another user through `DELETE api/2.0/people/{userid}`.  The caller has to be a regular portal account: the portal owner and an account imported from LDAP are  rejected, because neither can delete itself.  The call sends mail and does not change the profile; the deletion happens later, when the caller follows the  emailed link and the client calls `DELETE api/2.0/people/@self` with the confirmation token from it.  The answer is a ready-to-display message naming the address the link was sent to, and the address is wrapped  in bold HTML markup, so strip the markup before showing it outside a web page.  Repeated calls are throttled, and each one sends a new link.
     * Responses:
     *  - 200: The message stating which address the confirmation link was sent to
     *  - 403: The caller is the portal owner or an LDAP account and cannot delete their own profile
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
     * Queues an asynchronous job that empties the personal folder of the authenticated account.  The operation takes no parameters and always acts on the caller, so it cannot be used to empty the folder of  another user.  Only an account whose type is `Guest` may call it; every other type is rejected, because only a guest has a  personal folder that can be emptied this way.  The job does not finish within this call: poll `GET api/2.0/people/delete/personal/progress` until  `isCompleted` is true.  The job deletes the files permanently and cannot be undone or cancelled - there is no terminate operation for  this flow, unlike the user data deletion.
     * Responses:
     *  - 200: The state of the queued personal folder deletion
     *  - 403: The caller is not a guest, so there is no personal folder to empty
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
     * Queues an asynchronous job that transfers the rooms and the shared files owned by one portal user to another.  The source user must already have the `Terminated` status - disable the account through  `PUT api/2.0/people/status/{status}` before calling this - and the destination user must be an active room  admin or DocSpace admin, so a guest, a system account or a disabled account is rejected.  The caller needs the permission to edit users, cannot reassign their own data, and must be the portal owner to  reassign the data of another DocSpace administrator or of a People module administrator.  The transfer does not finish within this call: poll `GET api/2.0/people/reassign/progress/{userid}` with the  source user ID until `isCompleted` is true, and cancel it through `PUT api/2.0/people/reassign/terminate`.  Pass `deleteProfile` as true to delete the source profile once the transfer succeeds, otherwise the emptied  profile is kept.  Use `GET api/2.0/people/reassign/necessary` first to find out whether the user owns anything that has to be  reassigned at all.
     * Responses:
     *  - 200: The state of the queued reassignment
     *  - 400: The destination user is not an active room or DocSpace admin, or the source user is a system account, the portal owner, the caller, or is not disabled
     *  - 403: No permissions to perform this action
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
     * Queues an asynchronous job that erases the data of the user with the ID specified in the request.  The account must already have the `Terminated` status - disable it through  `PUT api/2.0/people/status/{status}` first - and it cannot be the portal owner or the caller.  The caller needs the permission to edit users, has to be a DocSpace admin to erase the data of a room admin,  and has to be the portal owner to erase the data of another DocSpace admin.  The erasure does not finish within this call: poll `GET api/2.0/people/remove/progress/{userid}` with the same  user ID until `isCompleted` is true, and cancel it through `PUT api/2.0/people/remove/terminate`.  This operation destroys the data and cannot be undone; to keep the rooms and the shared files of the account  instead, transfer them first through `POST api/2.0/people/reassign/start`.  An unknown ID and a rejected precondition both answer 400 and name the ID they rejected.
     * Responses:
     *  - 200: The state of the queued deletion
     *  - 400: No user has the specified ID, or the account is the portal owner, the caller, or is not disabled
     *  - 403: No permissions to perform this action
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
     * Cancels the data reassignment queued for the user with the ID specified in the request.  The caller needs the permission to edit users, and only the portal owner may cancel a reassignment whose  source user is a DocSpace administrator.  The operation is idempotent: when nothing is queued for that user it answers 200 with an empty body, and  repeating it on an already cancelled job changes nothing.  Cancelling removes the job from the queue and does not undo the transfers it has already made, and a cancelled  job cannot be resumed - start a new one through `POST api/2.0/people/reassign/start`.  The returned progress reports `status` as `Canceled` and `isCompleted` as true.
     * Responses:
     *  - 200: The state of the cancelled reassignment, or an empty body when nothing was queued for the user
     *  - 403: No permissions to perform this action
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
     * Cancels the data deletion queued for the user with the ID specified in the request.  The caller needs the permission to edit users.  The operation is idempotent and returns no body: it drops the job from the queue, and doing so when nothing is  queued, or when the job has already finished, changes nothing and still answers 200.  Cancelling does not restore the data the job has already erased, and a cancelled job cannot be resumed - start  a new one through `POST api/2.0/people/remove/start`.  To find out whether the job is still running, read  `GET api/2.0/people/remove/progress/{userid}` before and after this call.
     * Responses:
     *  - 200: The queued deletion is cancelled, or there was nothing to cancel. No content is returned
     *  - 403: No permissions to perform this action
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
