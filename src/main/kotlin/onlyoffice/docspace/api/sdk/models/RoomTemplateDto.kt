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
 * The room template parameters.
 *
 * @param roomId The room template ID.
 * @param title The room template title.
 * @param logo The logo request parameters.
 * @param copyLogo Specifies whether to copy room logo or not.
 * @param share The collection of email addresses of users with whom to share a room.
 * @param groups The collection of groups with whom to share a room.
 * @param `public` Specifies whether the room template is public or not.
 * @param tags The collection of tags.
 * @param color The color of the room template.
 * @param cover The cover of the room template.
 * @param quota Room quota
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

