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
 * Whether the portal currently lets anyone be invited into it, member and guest kept apart.
 *
 * @param allowInvitingMembers Whether new members may be invited through the Contacts section. Switching it off stops new invitations  from being created; links already handed out keep working and members already invited stay.
 * @param allowInvitingGuests Whether every member, and not only an administrator, may invite an outside guest into a room. It is  independent of `allowInvitingMembers`, and switching it off has the same forward-only effect.
 */


data class TenantUserInvitationSettingsDto (

    @Json(name = "allowInvitingMembers")
    val allowInvitingMembers: kotlin.Boolean,

    @Json(name = "allowInvitingGuests")
    val allowInvitingGuests: kotlin.Boolean

) {


}

