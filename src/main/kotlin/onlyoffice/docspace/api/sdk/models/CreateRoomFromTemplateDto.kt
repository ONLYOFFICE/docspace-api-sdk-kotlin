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
import onlyoffice.docspace.api.sdk.models.RoomDataLifetimeDto
import onlyoffice.docspace.api.sdk.models.WatermarkRequestDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The parameters for creating a room from a template.
 *
 * @param templateId The template ID from which the room to be created.
 * @param title The room title.
 * @param logo The logo request parameters.
 * @param copyLogo Specifies whether to copy a logo or not.
 * @param tags The collection of tags.
 * @param color The color of the room to be created.
 * @param cover The cover of the room to be created.
 * @param quota The room quota.
 * @param indexing Specifies whether to create a room with indexing.
 * @param denyDownload Specifies whether to deny downloads from the room.
 * @param lifetime The room data lifetime information.
 * @param watermark The request parameters for adding watermarks.
 * @param `private` Specifies whether the room to be created is private or not.
 */


data class CreateRoomFromTemplateDto (

    @Json(name = "templateId")
    val templateId: kotlin.Int,

    @Json(name = "title")
    val title: kotlin.String?,

    @Json(name = "logo")
    val logo: LogoRequest? = null,

    @Json(name = "copyLogo")
    val copyLogo: kotlin.Boolean? = null,

    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "color")
    val color: kotlin.String? = null,

    @Json(name = "cover")
    val cover: kotlin.String? = null,

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

    @Json(name = "private")
    val `private`: kotlin.Boolean? = null

) {


}

