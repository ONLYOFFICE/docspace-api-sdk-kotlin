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

import onlyoffice.docspace.api.sdk.models.LogoRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The parameters of a room template built from an existing room.
 *
 * @param roomId The identifier of the room the template is built from. Take it from the room listing of  `GET api/2.0/files/rooms`; a folder identifier is not accepted.
 * @param title The title the template is saved under in the Templates section. Characters that a folder name cannot contain  are replaced with an underscore on save, and two templates may share a title.
 * @param logo A picture of the caller's own for the template, cropped out of an image already placed in the temporary  storage.
 * @param copyLogo Whether the template takes over the picture already set on the source room. When false the template gets no  picture from that room.
 * @param share The email addresses of the portal members who are granted read access to the finished template.
 * @param groups The identifiers of the portal groups whose members are granted read access to the finished template.
 * @param `public` Whether the finished template is shared with everyone allowed to create rooms. When false it stays reachable  only for the recipients named for it.
 * @param tags The labels attached to the template and shown next to it in listings.
 * @param color The accent colour of the generated cover, written as six hexadecimal digits with no leading hash sign. When it  is left empty a colour is picked at random.
 * @param cover The identifier of a built-in cover picture, as listed by `GET api/2.0/files/rooms/covers`. When it is left  empty the template gets no cover.
 * @param quota The storage limit assigned to the template, in bytes. When it is not set the template keeps the limit of the  source room.
 */


data class RoomTemplateDto (

    @Json(name = "roomId")
    val roomId: kotlin.Int,

    @Json(name = "title")
    val title: kotlin.String,

    @Json(name = "logo")
    val logo: LogoRequest? = null,

    @Json(name = "copyLogo")
    val copyLogo: kotlin.Boolean? = null,

    @Json(name = "share")
    val share: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "groups")
    val groups: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "public")
    val `public`: kotlin.Boolean? = null,

    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "color")
    val color: kotlin.String? = null,

    @Json(name = "cover")
    val cover: kotlin.String? = null,

    @Json(name = "quota")
    val quota: kotlin.Long? = null

) {


}

