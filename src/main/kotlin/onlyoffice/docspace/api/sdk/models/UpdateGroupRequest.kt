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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request for updating a group.
 *
 * @param membersToAdd The list of user IDs to add to the group.
 * @param membersToRemove The list of user IDs to remove from the group.
 * @param groupManager The group manager ID.
 * @param groupName The group name.
 */


data class UpdateGroupRequest (

    /* The list of user IDs to add to the group. */
    @Json(name = "membersToAdd")
    val membersToAdd: kotlin.collections.List<java.util.UUID>? = null,

    /* The list of user IDs to remove from the group. */
    @Json(name = "membersToRemove")
    val membersToRemove: kotlin.collections.List<java.util.UUID>? = null,

    /* The group manager ID. */
    @Json(name = "groupManager")
    val groupManager: java.util.UUID? = null,

    /* The group name. */
    @Json(name = "groupName")
    val groupName: kotlin.String? = null

) {


}

