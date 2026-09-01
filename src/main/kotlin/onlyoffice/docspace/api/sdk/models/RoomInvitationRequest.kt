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
 * The request parameters for inviting users to the room.
 *
 * @param invitations The collection of invitation parameters.
 * @param notify Specifies whether to notify users about the shared room or not.
 * @param message The message to send when notifying about the shared room.
 * @param culture The language of the room invitation.
 * @param force Specifies whether to forcibly delete a user with form roles from the room.
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

