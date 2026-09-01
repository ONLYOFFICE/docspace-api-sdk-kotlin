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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.FileShare
import onlyoffice.docspace.api.sdk.models.LinkType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The room link parameters.
 *
 * @param linkId The room link ID.
 * @param access The access rights type.
 * @param expirationDate The API date and time parameters.
 * @param `internal` The link scope, whether it is internal or not.
 * @param title The link name.
 * @param linkType The link type.
 * @param password The link password.
 * @param denyDownload Specifies if downloading the file from the link is disabled or not.
 * @param maxUseCount The maximum number of times the invitation link can be used.
 * @param currentUseCount The current number of times the invitation link has been used.
 */


data class RoomLinkRequest (

    @Json(name = "linkId")
    val linkId: java.util.UUID? = null,

    @Json(name = "access")
    val access: FileShare? = null,

    @Json(name = "expirationDate")
    val expirationDate: ApiDateTime? = null,

    @Json(name = "internal")
    val `internal`: kotlin.Boolean? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "linkType")
    val linkType: LinkType? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    @Json(name = "maxUseCount")
    val maxUseCount: kotlin.Int? = null,

    @Json(name = "currentUseCount")
    val currentUseCount: kotlin.Int? = null

) {


}

