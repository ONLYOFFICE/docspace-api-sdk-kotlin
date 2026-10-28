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
 * The portal member named as the new owner of the portal.
 *
 * @param ownerId The member who is to become the portal owner, by user ID. They have to be an active member of this portal and  not a guest; a member who is not a DocSpace administrator yet is promoted to one as part of the transfer, so  the portal needs a paid seat for them.
 */


data class OwnerIdSettingsRequestDto (

    @Json(name = "ownerId")
    val ownerId: java.util.UUID

) {


}

