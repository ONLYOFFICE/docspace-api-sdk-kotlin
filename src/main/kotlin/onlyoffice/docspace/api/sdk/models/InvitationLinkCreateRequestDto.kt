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
 * The role a new invitation link grants, and the limits placed on it.
 *
 * @param employeeType The role whoever follows the link joins with. Only `DocSpaceAdmin`, `RoomAdmin` and `User` are accepted, and  the role cannot be changed afterwards - delete the link and create one for the other role instead.
 * @param expiration When the link stops letting anyone in, read in the portal time zone. It has to lie in the future; leaving it  out creates a link with no deadline at all.
 * @param maxUseCount How many accounts may join through the link in total. Leaving it out creates a link with no use limit; the  uses spent so far are reported as `currentUseCount`.
 */


data class InvitationLinkCreateRequestDto (

    @Json(name = "employeeType")
    val employeeType: EmployeeType,

    @Json(name = "expiration")
    val expiration: java.time.OffsetDateTime? = null,

    @Json(name = "maxUseCount")
    val maxUseCount: kotlin.Int? = null

) {


}

