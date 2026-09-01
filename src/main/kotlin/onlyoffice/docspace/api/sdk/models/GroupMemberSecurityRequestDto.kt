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
 * The group member security information.
 *
 * @param user The full list of user parameters.
 * @param groupAccess The access rights type.
 * @param overridden Specifies if the group access rights are overridden or not.
 * @param canEditAccess Specifies if the group member can edit the group access rights or not.
 * @param owner Specifies if the group member is a group owner or not.
 * @param userAccess The group member access rights to the files.
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

