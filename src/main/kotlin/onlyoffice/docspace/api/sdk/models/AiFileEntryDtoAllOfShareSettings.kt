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
 * How many links of each kind currently exist for the entry, counted separately for the primary link and the  additional ones. Kinds with no links are left out, and the whole field is null when the caller may not change  the access or no link exists at all.
 *
 * @param user 
 * @param externalLink 
 * @param group 
 * @param invitationLink 
 * @param primaryExternalLink 
 */


data class AiFileEntryDtoAllOfShareSettings (

    @Json(name = "User")
    val user: kotlin.Int? = null,

    @Json(name = "ExternalLink")
    val externalLink: kotlin.Int? = null,

    @Json(name = "Group")
    val group: kotlin.Int? = null,

    @Json(name = "InvitationLink")
    val invitationLink: kotlin.Int? = null,

    @Json(name = "PrimaryExternalLink")
    val primaryExternalLink: kotlin.Int? = null

) {


}

