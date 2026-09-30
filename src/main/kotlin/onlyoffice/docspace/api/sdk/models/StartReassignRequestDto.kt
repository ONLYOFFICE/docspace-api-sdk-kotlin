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

package onlyoffice.docspace.api.sdk.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for starting the reassignment process.
 *
 * @param fromUserId The ID of the user whose rooms and shared files are transferred away. The account has to have the `Terminated`  status already, and it cannot be a system account, the portal owner or the caller.
 * @param toUserId The ID of the user who receives the data. The account has to be an active room admin or DocSpace admin, so a  guest, a system account or a disabled account is rejected.
 * @param deleteProfile Specifies whether to delete the source profile once the transfer succeeds. When false, which is the default,  the emptied profile is kept and can be deleted later through `DELETE api/2.0/people/{userid}`.
 */


data class StartReassignRequestDto (

    @Json(name = "fromUserId")
    val fromUserId: java.util.UUID,

    @Json(name = "toUserId")
    val toUserId: java.util.UUID,

    @Json(name = "deleteProfile")
    val deleteProfile: kotlin.Boolean? = null

) {


}

