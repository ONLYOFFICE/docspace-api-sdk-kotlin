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
 * A dictionary representing the sharing settings for the file entry.
 *
 * @param user 
 * @param externalLink 
 * @param group 
 * @param invitationLink 
 * @param primaryExternalLink 
 */


data class FileEntryDtoIntegerAllOfShareSettings (

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

