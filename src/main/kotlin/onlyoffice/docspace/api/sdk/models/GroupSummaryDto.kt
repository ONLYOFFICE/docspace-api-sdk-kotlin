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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The group summary parameters.
 *
 * @param id The group ID.
 * @param name The group name.
 * @param manager The group manager.
 * @param isSystem Indicates whether the group is a system group.
 */


data class GroupSummaryDto (

    /* The group ID. */
    @Json(name = "id")
    val id: java.util.UUID,

    /* The group name. */
    @Json(name = "name")
    val name: kotlin.String?,

    /* The group manager. */
    @Json(name = "manager")
    val manager: kotlin.String? = null,

    /* Indicates whether the group is a system group. */
    @Json(name = "isSystem")
    val isSystem: kotlin.Boolean? = null

) {


}

