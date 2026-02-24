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
 * The file sharing information and access rights.
 *
 * @param isLocked Specifies if the access right is locked or not.
 * @param isOwner Specifies if the user is an owner of the specified file or not.
 * @param canEditAccess Specifies if the user can edit the access to the specified file or not.
 * @param canEditInternal Indicates whether internal editing permissions are granted.
 * @param canEditDenyDownload Determines whether the user has permission to modify the deny download setting for the file share.
 * @param canEditExpirationDate Indicates whether the expiration date of access permissions can be edited.
 * @param canRevoke Specifies whether the file sharing access can be revoked by the current user.
 * @param subjectType 
 * @param access 
 * @param sharedTo The user who has the access to the specified file.
 * @param sharedToUser 
 * @param sharedToGroup 
 * @param sharedLink 
 */


data class FileShareDto (

    /* Specifies if the access right is locked or not. */
    @Json(name = "isLocked")
    val isLocked: kotlin.Boolean,

    /* Specifies if the user is an owner of the specified file or not. */
    @Json(name = "isOwner")
    val isOwner: kotlin.Boolean,

    /* Specifies if the user can edit the access to the specified file or not. */
    @Json(name = "canEditAccess")
    val canEditAccess: kotlin.Boolean,

    /* Indicates whether internal editing permissions are granted. */
    @Json(name = "canEditInternal")
    val canEditInternal: kotlin.Boolean,

    /* Determines whether the user has permission to modify the deny download setting for the file share. */
    @Json(name = "canEditDenyDownload")
    val canEditDenyDownload: kotlin.Boolean,

    /* Indicates whether the expiration date of access permissions can be edited. */
    @Json(name = "canEditExpirationDate")
    val canEditExpirationDate: kotlin.Boolean,

    /* Specifies whether the file sharing access can be revoked by the current user. */
    @Json(name = "canRevoke")
    val canRevoke: kotlin.Boolean,

    @Json(name = "subjectType")
    val subjectType: SubjectType,

    @Json(name = "access")
    val access: FileShare? = null,

    /* The user who has the access to the specified file. */
    @Json(name = "sharedTo")
    @Deprecated(message = "This property is deprecated.")
    val sharedTo: kotlin.Any? = null,

    @Json(name = "sharedToUser")
    val sharedToUser: EmployeeFullDto? = null,

    @Json(name = "sharedToGroup")
    val sharedToGroup: GroupSummaryDto? = null,

    @Json(name = "sharedLink")
    val sharedLink: FileShareLink? = null

) {


}

