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
import onlyoffice.docspace.api.sdk.models.FileShareLink
import onlyoffice.docspace.api.sdk.models.GroupSummaryDto
import onlyoffice.docspace.api.sdk.models.SubjectType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One access entry on a file, a folder or a room: who holds it, at which level, and what the caller may change about  it.
 *
 * @param isLocked Whether this entry is the caller's own, which is why they cannot change its level. Link entries never report  it.
 * @param isOwner Whether the subject created the entry the access is given on, and so cannot be removed from it.
 * @param canEditAccess Whether the caller may change the level of this entry. It is false on the caller's own entry, on every link,  and whenever the caller may not hand out access at all.
 * @param canEditInternal Whether the caller may switch this link between being open to anybody and asking the visitor to sign in to the  portal first.
 * @param canEditDenyDownload Whether the caller may forbid downloading through this link. Only a link of a virtual data room reports true,  and only while the room itself still allows downloads.
 * @param canEditExpirationDate Whether the caller may move the moment this link stops working.
 * @param canRevoke Whether the caller may take this entry away altogether, which for a link means deleting the link.
 * @param subjectType What the entry was given to, which tells which of the three subject fields is filled in: an account, a group,  or one of the kinds of link.
 * @param access The level the subject holds on the entry. On a link entry it is the level the link hands to whoever opens it,  and in a batch answer `Varies` means the subject holds different levels on the listed entries.
 * @param sharedTo 
 * @param sharedToUser The account the entry belongs to. It is filled in only when `subjectType` says an account, and is null for a  group entry and for a link.
 * @param sharedToGroup The portal group the entry belongs to, which hands the level to everybody in it. It is filled in only for a  group entry, and is null otherwise.
 * @param sharedLink The sharing link the entry stands for, together with everything set on it. It is filled in only for a link  entry, and is null for an account or a group.
 */


data class FileShareDto (

    @Json(name = "isLocked")
    val isLocked: kotlin.Boolean,

    @Json(name = "isOwner")
    val isOwner: kotlin.Boolean,

    @Json(name = "canEditAccess")
    val canEditAccess: kotlin.Boolean,

    @Json(name = "canEditInternal")
    val canEditInternal: kotlin.Boolean,

    @Json(name = "canEditDenyDownload")
    val canEditDenyDownload: kotlin.Boolean,

    @Json(name = "canEditExpirationDate")
    val canEditExpirationDate: kotlin.Boolean,

    @Json(name = "canRevoke")
    val canRevoke: kotlin.Boolean,

    @Json(name = "subjectType")
    val subjectType: SubjectType,

    @Json(name = "access")
    val access: FileShare? = null,

    @Json(name = "sharedTo")
    val sharedTo: kotlin.Any? = null,

    @Json(name = "sharedToUser")
    val sharedToUser: EmployeeFullDto? = null,

    @Json(name = "sharedToGroup")
    val sharedToGroup: GroupSummaryDto? = null,

    @Json(name = "sharedLink")
    val sharedLink: FileShareLink? = null

) {


}

