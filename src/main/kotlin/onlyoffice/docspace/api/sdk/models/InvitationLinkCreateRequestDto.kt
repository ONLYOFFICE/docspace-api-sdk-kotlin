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
 * The request parameters for creating an invitation link.
 *
 * @param employeeType 
 * @param expiration The expiration date of the invitation link.
 * @param maxUseCount The maximum number of times the invitation link can be used.
 */


data class InvitationLinkCreateRequestDto (

    @Json(name = "employeeType")
    val employeeType: EmployeeType,

    /* The expiration date of the invitation link. */
    @Json(name = "expiration")
    val expiration: java.time.OffsetDateTime? = null,

    /* The maximum number of times the invitation link can be used. */
    @Json(name = "maxUseCount")
    val maxUseCount: kotlin.Int? = null

) {


}

