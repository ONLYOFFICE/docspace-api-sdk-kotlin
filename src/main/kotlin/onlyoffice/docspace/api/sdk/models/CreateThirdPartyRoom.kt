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
import onlyoffice.docspace.api.sdk.models.RoomType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The parameters for creating a third-party room.
 *
 * @param title The third-party room name to be created.
 * @param roomType The third-party room type to be created.
 * @param createAsNewFolder Specifies whether to create a third-party room as a new folder or not.
 * @param `private` Specifies whether to create the private third-party room or not.
 * @param indexing Specifies whether to create the third-party room with indexing.
 * @param denyDownload Specifies whether to deny downloads from the third-party room.
 * @param color The color of the third-party room.
 * @param cover The cover of the third-party room.
 * @param tags The list of tags of the third-party room.
 * @param logo The logo request parameters of the third-party room.
 */


data class CreateThirdPartyRoom (

    @Json(name = "title")
    val title: kotlin.String?,

    @Json(name = "roomType")
    val roomType: RoomType,

    @Json(name = "createAsNewFolder")
    val createAsNewFolder: kotlin.Boolean? = null,

    @Json(name = "private")
    val `private`: kotlin.Boolean? = null,

    @Json(name = "indexing")
    val indexing: kotlin.Boolean? = null,

    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    @Json(name = "color")
    val color: kotlin.String? = null,

    @Json(name = "cover")
    val cover: kotlin.String? = null,

    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "logo")
    val logo: LogoRequest? = null

) {


}

