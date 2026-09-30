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
 * Which access levels may be handed out on this entry, listed per kind of recipient, so that a client offers  only levels the entry actually supports - a room for filling forms and a plain folder do not accept the same  ones.
 *
 * @param user 
 * @param externalLink 
 * @param group 
 * @param invitationLink 
 * @param primaryExternalLink 
 */


data class AiFileEntryDtoAllOfAvailableShareRights (

    @Json(name = "User")
    val user: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "ExternalLink")
    val externalLink: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "Group")
    val group: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "InvitationLink")
    val invitationLink: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "PrimaryExternalLink")
    val primaryExternalLink: kotlin.collections.List<kotlin.String>? = null

) {


}

