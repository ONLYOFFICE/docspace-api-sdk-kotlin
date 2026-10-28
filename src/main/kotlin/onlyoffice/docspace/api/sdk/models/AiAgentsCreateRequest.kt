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
 * 
 *
 * @param profileId Profile id bound to the agent.
 * @param prompt Agent system prompt; stored as the room's `chatSettings.prompt`.
 * @param `private` Whether the agent room is private.
 * @param share Initial share entries (`FileShareParams`).
 * @param attachDefaultTools Whether to attach the default DocSpace MCP tool server.
 * @param title Agent (room) title.
 * @param quota Room quota in bytes.
 * @param indexing Whether room content is indexed for search.
 * @param denyDownload Whether downloading room content is denied.
 * @param lifetime Room data lifetime policy (`RoomDataLifetimeDto`).
 * @param watermark Watermark settings (`WatermarkRequestDto`).
 * @param logo Room logo (`LogoRequest`).
 * @param tags Room tags.
 * @param color Room accent color.
 * @param cover Room cover image id.
 */


data class AiAgentsCreateRequest (

    @Json(name = "profileId")
    val profileId: kotlin.String,

    @Json(name = "prompt")
    val prompt: kotlin.String,

    @Json(name = "private")
    val `private`: kotlin.Boolean? = null,

    @Json(name = "share")
    val share: kotlin.collections.List<kotlin.Any>? = null,

    @Json(name = "attachDefaultTools")
    val attachDefaultTools: kotlin.Boolean? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "quota")
    val quota: java.math.BigDecimal? = null,

    @Json(name = "indexing")
    val indexing: kotlin.Boolean? = null,

    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    @Json(name = "lifetime")
    val lifetime: kotlin.Any? = null,

    @Json(name = "watermark")
    val watermark: kotlin.Any? = null,

    @Json(name = "logo")
    val logo: kotlin.Any? = null,

    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "color")
    val color: kotlin.String? = null,

    @Json(name = "cover")
    val cover: kotlin.String? = null

) {


}

