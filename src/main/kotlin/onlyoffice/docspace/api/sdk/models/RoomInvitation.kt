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
 * One membership change in a room: an account or an email address, and the access level it is given.
 *
 * @param email The address of somebody who has no portal account yet. An invitation is sent to it and an account is created  once it is accepted, so this is the field to use instead of an account identifier when the person is new to  the portal.
 * @param id The account or the group the entry is about, taken from the portal people and group listings. Leave it out and  give an email address instead to invite somebody who has no account yet.
 * @param access What the subject may do in the room. The value 0 removes the subject from the room, and the levels on offer  depend on the kind of room.
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

