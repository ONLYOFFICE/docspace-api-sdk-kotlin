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

import onlyoffice.docspace.api.sdk.models.ChatSettings
import onlyoffice.docspace.api.sdk.models.LogoRequest
import onlyoffice.docspace.api.sdk.models.RoomDataLifetimeDto
import onlyoffice.docspace.api.sdk.models.WatermarkRequestDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The fields of a room that a partial update changes.
 *
 * @param title The new name of the room. It is trimmed and sanitised the way a room title is at creation, and a blank or  missing value leaves the current name alone rather than clearing it.
 * @param quota The new storage limit of the room, in bytes. A value of -1 leaves the room with no limit of its own, any other  negative value puts it back on the portal default, and a positive one is accepted only while the per-room  quota feature is on.
 * @param indexing Whether the room keeps a manual order of its contents. With it on every file and folder carries a position  that listings follow and that `PUT api/2.0/files/rooms/{id}/reorder` compacts; with it off the contents are  ordered by the sorting of the request. Turning it on renumbers the existing contents at once.
 * @param denyDownload Whether members without editing rights are stopped from downloading and printing the contents of the room.  They can still open the documents in the editor.
 * @param lifetime How long files may stay in the room before they are deleted automatically. The countdown starts when the  setting is saved, and leaving the field out keeps the files forever. Sending it with the switch off stops the  automatic deletion.
 * @param watermark The watermark drawn over documents opened in the room. Leaving the field out adds no watermark, and sending it  with the switch turned off removes the one the room has.
 * @param logo The picture to use as the room logo, named by the path that `POST api/2.0/files/logos` returned for an image  uploaded beforehand, plus the crop to take from it. Leaving the field out keeps the room on its cover and  colour.
 * @param tags The labels the room is to carry from now on. The list replaces the whole tag set rather than adding to it, an  empty list clears it, and names the portal catalogue does not hold yet are added to it.
 * @param color The background colour the room is drawn with while it has no logo, as six hexadecimal digits with no leading  number sign. An empty value restores the default colour of the room type.
 * @param cover The picture drawn on the room while it has no logo, named by an identifier from  `GET api/2.0/files/rooms/covers`. Any other value is rejected, and an empty value leaves the room without a  cover.
 * @param chatSettings The model and the prompt an AI room answers with. It belongs to AI rooms only and is rejected for a room of  any other kind.
 * @param sendFormToExternalDB For a form filling room, whether the data of every completed submission is also pushed to the external  database configured for the portal. It is what `POST api/2.0/files/rooms/{id}/externaldbsync` re-runs for the  forms already collected.
 * @param saveFormAsXLSX For a form filling room, whether the collected submissions are also gathered into a spreadsheet stored next to  the completed forms. With it off the submissions are kept only as the filled documents themselves.
 */


data class UpdateRoomRequest (

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "quota")
    val quota: kotlin.Long? = null,

    @Json(name = "indexing")
    val indexing: kotlin.Boolean? = null,

    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    @Json(name = "lifetime")
    val lifetime: RoomDataLifetimeDto? = null,

    @Json(name = "watermark")
    val watermark: WatermarkRequestDto? = null,

    @Json(name = "logo")
    val logo: LogoRequest? = null,

    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "color")
    val color: kotlin.String? = null,

    @Json(name = "cover")
    val cover: kotlin.String? = null,

    @Json(name = "chatSettings")
    val chatSettings: ChatSettings? = null,

    @Json(name = "sendFormToExternalDB")
    val sendFormToExternalDB: kotlin.Boolean? = null,

    @Json(name = "saveFormAsXLSX")
    val saveFormAsXLSX: kotlin.Boolean? = null

) {


}

