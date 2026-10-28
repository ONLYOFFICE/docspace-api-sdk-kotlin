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

import onlyoffice.docspace.api.sdk.models.RoomInvitation

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One batch of membership changes for a room.
 *
 * @param invitations Who is added, changed or removed, one entry per subject. The same subject named twice keeps the level of the  last entry, and an empty list is accepted and changes nothing.
 * @param notify Whether the subjects that gained access are told about it by email. With it off the change is silent, which is  the usual choice when membership is synchronised from another system.
 * @param message The line added to the invitation email. It is used only while the notification is on, and it reaches nobody  whose access was removed.
 * @param culture The language of the invitation email, as a portal culture name such as en-US. Leaving it out sends each  message in the language of its recipient.
 * @param force Whether a member who still holds a role in an unfinished form is removed anyway. With it off such a removal is  refused and reported through the error of the answer, so the form can be reassigned first.
 */


data class RoomInvitationRequest (

    @Json(name = "invitations")
    val invitations: kotlin.collections.List<RoomInvitation>? = null,

    @Json(name = "notify")
    val notify: kotlin.Boolean? = null,

    @Json(name = "message")
    val message: kotlin.String? = null,

    @Json(name = "culture")
    val culture: kotlin.String? = null,

    @Json(name = "force")
    val force: kotlin.Boolean? = null

) {


}

