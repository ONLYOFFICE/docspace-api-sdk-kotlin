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

import onlyoffice.docspace.api.sdk.models.FileShareDto
import onlyoffice.docspace.api.sdk.models.RoomSecurityError

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The outcome of a change of the room membership.
 *
 * @param members The access entries of the subjects named in the request, read back after the change was applied. A subject the  caller may not see is missing from it, so comparing this list with the request is the way to learn who was  skipped; it is null when nothing was applied at all.
 * @param warning The reason the first subject that could not be handled was skipped, in the language of the request, while the  rest of the list was still applied. Null when every named subject went through. The text is meant to be shown  to a person, not matched against.
 * @param error Reports the one case in which nothing at all was changed: a member being removed still holds a role in a form  of the room, and the request did not ask to remove them anyway. Repeat the call with `force` to remove them  together with the role.
 */


data class RoomSecurityDto (

    @Json(name = "members")
    val members: kotlin.collections.List<FileShareDto>? = null,

    @Json(name = "warning")
    val warning: kotlin.String? = null,

    @Json(name = "error")
    val error: RoomSecurityError? = null

) {


}

