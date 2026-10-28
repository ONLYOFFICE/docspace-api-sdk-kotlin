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
 * The group request parameters.
 *
 * @param groupName The name of the group, from 1 to 128 characters. It is required, it may not be blank, and it does not have to  be unique.
 * @param members The accounts to put into the new group. Every one of them has to be an active member that is not a guest,  otherwise the whole call is rejected. Omit it to create an empty group.
 * @param groupManager The account to make the manager of the new group. It is added to the group as well, so it does not have to be  repeated in `members`. Omit it to create a group without a manager.
 */


data class GroupRequestDto (

    @Json(name = "groupName")
    val groupName: kotlin.String?,

    @Json(name = "members")
    val members: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "groupManager")
    val groupManager: java.util.UUID? = null

) {


}

