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
import onlyoffice.docspace.api.sdk.models.FormFillingStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The form role parameters.
 *
 * @param roleName The role name.
 * @param sequence The role sequence.
 * @param submitted Specifies if the role is submitted.
 * @param roleColor The role color.
 * @param user 
 * @param stopedBy 
 * @param history The role history.
 * @param roleStatus 
 */


data class FormRoleDto (

    /* The role name. */
    @Json(name = "roleName")
    val roleName: kotlin.String?,

    /* The role sequence. */
    @Json(name = "sequence")
    val sequence: kotlin.Int,

    /* Specifies if the role is submitted. */
    @Json(name = "submitted")
    val submitted: kotlin.Boolean,

    /* The role color. */
    @Json(name = "roleColor")
    val roleColor: kotlin.String? = null,

    @Json(name = "user")
    val user: EmployeeFullDto? = null,

    @Json(name = "stopedBy")
    val stopedBy: EmployeeFullDto? = null,

    /* The role history. */
    @Json(name = "history")
    val history: kotlin.collections.Map<kotlin.String, java.time.OffsetDateTime>? = null,

    @Json(name = "roleStatus")
    val roleStatus: FormFillingStatus? = null

) {


}

