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
import onlyoffice.docspace.api.sdk.models.FileShareParams
import onlyoffice.docspace.api.sdk.models.LogoRequest
import onlyoffice.docspace.api.sdk.models.RoomDataLifetimeDto
import onlyoffice.docspace.api.sdk.models.WatermarkRequestDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request to create a new AI agent room.
 *
 * @param title The room name.
 * @param chatSettings 
 * @param quota The room quota.
 * @param indexing Specifies whether to create a room with indexing.
 * @param denyDownload Specifies whether to deny downloads from the room.
 * @param lifetime 
 * @param watermark 
 * @param logo 
 * @param tags The list of tags.
 * @param color The room color.
 * @param cover The room cover.
 * @param `private` Specifies whether the room to be created is private or not.
 * @param share The collection of sharing parameters.
 * @param attachDefaultTools Specifies whether to attach default tools to the agent or not.
 */


data class CreateAgentRequestDto (

    /* The room name. */
    @Json(name = "title")
    val title: kotlin.String?,

    @Json(name = "chatSettings")
    val chatSettings: ChatSettings,

    /* The room quota. */
    @Json(name = "quota")
    val quota: kotlin.Long? = null,

    /* Specifies whether to create a room with indexing. */
    @Json(name = "indexing")
    val indexing: kotlin.Boolean? = null,

    /* Specifies whether to deny downloads from the room. */
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

    /* Specifies whether the room to be created is private or not. */
    @Json(name = "private")
    val `private`: kotlin.Boolean? = null,

    /* The collection of sharing parameters. */
    @Json(name = "share")
    val share: kotlin.collections.List<FileShareParams>? = null,

    /* Specifies whether to attach default tools to the agent or not. */
    @Json(name = "attachDefaultTools")
    val attachDefaultTools: kotlin.Boolean? = null

) {


}

