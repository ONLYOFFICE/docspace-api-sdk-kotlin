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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.EmployeeType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The invitation link parameters.
 *
 * @param employeeType 
 * @param id The ID of the invitation link.
 * @param expiration 
 * @param isExpired Indicates whether the invitation link has expired.
 * @param maxUseCount The maximum number of times the invitation link can be used.
 * @param currentUseCount The current number of times the invitation link has been used.
 * @param url The URL of the invitation link.
 */


data class InvitationLinkDto (

    @Json(name = "employeeType")
    val employeeType: EmployeeType,

    /* The ID of the invitation link. */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "expiration")
    val expiration: ApiDateTime? = null,

    /* Indicates whether the invitation link has expired. */
    @Json(name = "isExpired")
    val isExpired: kotlin.Boolean? = null,

    /* The maximum number of times the invitation link can be used. */
    @Json(name = "maxUseCount")
    val maxUseCount: kotlin.Int? = null,

    /* The current number of times the invitation link has been used. */
    @Json(name = "currentUseCount")
    val currentUseCount: kotlin.Int? = null,

    /* The URL of the invitation link. */
    @Json(name = "url")
    val url: kotlin.String? = null

) {


}

