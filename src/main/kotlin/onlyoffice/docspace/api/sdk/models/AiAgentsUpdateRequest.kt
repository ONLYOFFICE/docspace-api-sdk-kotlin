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
 * @param profileId Profile id to rebind (optional).
 * @param chatSettings Chat settings (`ChatSettings`); requires a valid provider/model.
 * @param sendFormToExternalDB Whether form results are sent to an external DB.
 * @param saveFormAsXLSX Whether forms are saved as XLSX.
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


data class AiAgentsUpdateRequest (

    @Json(name = "profileId")
    val profileId: kotlin.String? = null,

    @Json(name = "chatSettings")
    val chatSettings: kotlin.Any? = null,

    @Json(name = "sendFormToExternalDB")
    val sendFormToExternalDB: kotlin.Boolean? = null,

    @Json(name = "saveFormAsXLSX")
    val saveFormAsXLSX: kotlin.Boolean? = null,

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

