 /*
 * (c) Copyright Ascensio System SIA 2025
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

import onlyoffice.docspace.api.sdk.models.EmployeeDto
import onlyoffice.docspace.api.sdk.models.GroupSummaryDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The security information.
 *
 * @param webItemId The module ID.
 * @param users The list of users with the access to the module.
 * @param groups The list of groups with the access to the module.
 * @param enabled Specifies if the security settings are enabled or not.
 * @param isSubItem Specifies if the module is a subitem or not.
 */


data class SecurityDto (

    /* The module ID. */
    @Json(name = "webItemId")
    val webItemId: kotlin.String? = null,

    /* The list of users with the access to the module. */
    @Json(name = "users")
    val users: kotlin.collections.List<EmployeeDto>? = null,

    /* The list of groups with the access to the module. */
    @Json(name = "groups")
    val groups: kotlin.collections.List<GroupSummaryDto>? = null,

    /* Specifies if the security settings are enabled or not. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    /* Specifies if the module is a subitem or not. */
    @Json(name = "isSubItem")
    val isSubItem: kotlin.Boolean? = null

) {


}

