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
 * The request for updating a group.
 *
 * @param membersToAdd The accounts to add to the group. An account that is a guest, is disabled or does not exist is skipped  without an error, so the answer has to be read to see what was applied.
 * @param membersToRemove The accounts to remove from the group. Removals are applied after the additions, so an account named in both  lists ends up removed, and an ID that is not a member is skipped without an error.
 * @param groupManager The account to make the manager of the group, which also adds it to the group. Omit it to keep the current  manager - it cannot be cleared through this operation.
 * @param groupName The new name of the group, up to 128 characters. Omit it to keep the current name.
 */


data class UpdateGroupRequest (

    @Json(name = "membersToAdd")
    val membersToAdd: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "membersToRemove")
    val membersToRemove: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "groupManager")
    val groupManager: java.util.UUID? = null,

    @Json(name = "groupName")
    val groupName: kotlin.String? = null

) {


}

