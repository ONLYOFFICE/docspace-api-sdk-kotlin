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

import onlyoffice.docspace.api.sdk.models.EmployeeType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The parameters for updating the type of the user or guest when reassigning rooms and shared files.
 *
 * @param type The type to convert the account to. Only `Guest` and `User` are accepted, because they are the types that  cannot own rooms; `RoomAdmin`, `DocSpaceAdmin` and `All` are rejected here and belong to  `PUT api/2.0/people/type/{type}`.
 * @param userId The ID of the account being converted. It has to be an active account other than the caller, and only the  portal owner may pass the ID of a DocSpace administrator.
 * @param reassignUserId The ID of the administrator who receives the rooms and the shared files of the converted account. It has to be  an active room admin or DocSpace admin other than the converted account, and when it is omitted the data goes  to the caller.
 */


data class StartUpdateUserTypeDto (

    @Json(name = "type")
    val type: EmployeeType? = null,

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "reassignUserId")
    val reassignUserId: java.util.UUID? = null

) {


}

