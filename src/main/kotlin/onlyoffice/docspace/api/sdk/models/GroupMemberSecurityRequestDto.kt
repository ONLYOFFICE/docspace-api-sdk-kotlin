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

import onlyoffice.docspace.api.sdk.models.EmployeeFullDto
import onlyoffice.docspace.api.sdk.models.FileShare

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One member of a portal group together with the access that member has on the file or folder the group was granted  rights to. Every line of the answer describes the same file or folder and differs only in the member and in the  level that applies to them.
 *
 * @param user The member the line is about, as the portal reports the account: the display name, the avatar and the portal  role to show next to the access level.
 * @param groupAccess The level granted to the group as a whole on this file or folder. It belongs to the group record rather than  to the member, so the same value repeats on every line of the answer; a group whose record was set back to  none is answered with an empty list instead.
 * @param overridden Whether `userAccess` is the level that decides what the member may do. When it is false the member inherits  `groupAccess`, and the creator of the file or folder is always reported as overridden because of the room  manager level forced onto them.
 * @param canEditAccess Whether the caller may still change the level of this member. It comes back false on the line of the member  who created the file or folder, on the line of the caller themselves, and on every line at once when the  caller may read the file or folder but not manage access to it.
 * @param owner Whether this member created the file or folder - the owner of the entry, not the owner of the group. Their  level is reported as a room manager one and cannot be taken away through this group.
 * @param userAccess The level granted to this member alone on the same file or folder, or `null` when the member has no record of  their own and the group level is what applies. The member who created the file or folder is always reported  here as a room manager, whatever their own record says.
 */


data class GroupMemberSecurityRequestDto (

    @Json(name = "user")
    val user: EmployeeFullDto,

    @Json(name = "groupAccess")
    val groupAccess: FileShare,

    @Json(name = "overridden")
    val overridden: kotlin.Boolean,

    @Json(name = "canEditAccess")
    val canEditAccess: kotlin.Boolean,

    @Json(name = "owner")
    val owner: kotlin.Boolean,

    @Json(name = "userAccess")
    val userAccess: FileShare? = null

) {


}

