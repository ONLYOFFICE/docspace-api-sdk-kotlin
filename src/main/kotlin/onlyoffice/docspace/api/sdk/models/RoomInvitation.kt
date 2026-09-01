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

import onlyoffice.docspace.api.sdk.models.FileShare

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The room invitation parameters.
 *
 * @param email The email address.
 * @param id The ID of the user to share a room with.
 * @param access The room sharing rights.
 */


data class RoomInvitation (

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "access")
    val access: FileShare? = null

) {


}

