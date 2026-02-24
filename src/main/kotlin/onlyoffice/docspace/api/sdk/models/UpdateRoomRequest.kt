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
 * The request parameters for updating a room.
 *
 * @param title The room title.
 * @param quota The room quota.
 * @param indexing Specifies whether to create a third-party room with indexing.
 * @param denyDownload Specifies whether to deny downloads from the third-party room.
 * @param lifetime 
 * @param watermark 
 * @param logo 
 * @param tags The list of tags.
 * @param color The room color.
 * @param cover The room cover.
 * @param chatSettings 
 */


data class UpdateRoomRequest (

    /* The room title. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The room quota. */
    @Json(name = "quota")
    val quota: kotlin.Long? = null,

    /* Specifies whether to create a third-party room with indexing. */
    @Json(name = "indexing")
    val indexing: kotlin.Boolean? = null,

    /* Specifies whether to deny downloads from the third-party room. */
    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    @Json(name = "lifetime")
    val lifetime: RoomDataLifetimeDto? = null,

    @Json(name = "watermark")
    val watermark: WatermarkRequestDto? = null,

    @Json(name = "logo")
    val logo: LogoRequest? = null,

    /* The list of tags. */
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    /* The room color. */
    @Json(name = "color")
    val color: kotlin.String? = null,

    /* The room cover. */
    @Json(name = "cover")
    val cover: kotlin.String? = null,

    @Json(name = "chatSettings")
    val chatSettings: ChatSettings? = null

) {


}

