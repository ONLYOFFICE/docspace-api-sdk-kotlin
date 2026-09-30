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
 * Whether the portal still lets its members invite new members and new guests.
 *
 * @param allowInvitingMembers Whether new DocSpace members may be invited through the Contacts section. Switching it off only stops new  invitations being created; links already issued keep working and members already invited stay.
 * @param allowInvitingGuests Whether every DocSpace member, and not only an administrator, may invite external guests into rooms.  Switching it off leaves the guests already invited in place.
 */


data class TenantUserInvitationSettingsRequestDto (

    @Json(name = "allowInvitingMembers")
    val allowInvitingMembers: kotlin.Boolean? = null,

    @Json(name = "allowInvitingGuests")
    val allowInvitingGuests: kotlin.Boolean? = null

) {


}

