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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The group parameters.
 *
 * @param name The group name.
 * @param category The group category ID.
 * @param id The group ID.
 * @param isLDAP Specifies if the LDAP settings are enabled for the group or not.
 * @param parent The parent group ID.
 * @param isSystem Indicates whether the group is a system group.
 * @param manager 
 * @param members The list of group members.
 * @param shared Specifies whether the group can be shared or not.
 * @param membersCount The number of group members.
 */


data class GroupDto (

    /* The group name. */
    @Json(name = "name")
    val name: kotlin.String?,

    /* The group category ID. */
    @Json(name = "category")
    val category: java.util.UUID,

    /* The group ID. */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Specifies if the LDAP settings are enabled for the group or not. */
    @Json(name = "isLDAP")
    val isLDAP: kotlin.Boolean,

    /* The parent group ID. */
    @Json(name = "parent")
    val parent: java.util.UUID? = null,

    /* Indicates whether the group is a system group. */
    @Json(name = "isSystem")
    val isSystem: kotlin.Boolean? = null,

    @Json(name = "manager")
    val manager: EmployeeFullDto? = null,

    /* The list of group members. */
    @Json(name = "members")
    val members: kotlin.collections.List<EmployeeFullDto>? = null,

    /* Specifies whether the group can be shared or not. */
    @Json(name = "shared")
    val shared: kotlin.Boolean? = null,

    /* The number of group members. */
    @Json(name = "membersCount")
    val membersCount: kotlin.Int? = null

) {


}

