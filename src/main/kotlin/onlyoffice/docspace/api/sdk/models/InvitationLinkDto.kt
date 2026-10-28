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
 * The portal's standing invitation link for one role: what it grants, how long it lasts, how often it was used.
 *
 * @param employeeType The role an account gets by joining through this link. A portal keeps at most one link per role, and the  role of an existing link cannot be changed - the link has to be deleted and created again.
 * @param id The identifier to address the link by in `PUT api/2.0/portal/users/invitationlink` and  `DELETE api/2.0/portal/users/invitationlink`. It survives a change of deadline or use limit, so it is  worth storing rather than re-reading.
 * @param expiration When the link stops working, in the portal time zone. It is empty for a link that never expires, which is  what omitting the deadline on create or update leaves behind.
 * @param isExpired Whether that deadline has already passed. A link without a deadline always reports `false`, and an expired  link is still returned rather than treated as gone - it can be revived by moving `expiration`.
 * @param maxUseCount How many accounts may join through the link in total. It is empty for a link with no use limit, and an  update may not lower it below `currentUseCount`.
 * @param currentUseCount How many accounts have already joined through the link. It only ever grows, and reaching `maxUseCount`  retires the link as surely as a passed deadline.
 * @param url The shortened address to hand to the people being invited. It is signed for the account that read it, so  two administrators are given two different URLs for one and the same link and both of them work; the `id`  above, not this string, is what identifies the link.
 */


data class InvitationLinkDto (

    @Json(name = "employeeType")
    val employeeType: EmployeeType,

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "expiration")
    val expiration: ApiDateTime? = null,

    @Json(name = "isExpired")
    val isExpired: kotlin.Boolean? = null,

    @Json(name = "maxUseCount")
    val maxUseCount: kotlin.Int? = null,

    @Json(name = "currentUseCount")
    val currentUseCount: kotlin.Int? = null,

    @Json(name = "url")
    val url: kotlin.String? = null

) {


}

