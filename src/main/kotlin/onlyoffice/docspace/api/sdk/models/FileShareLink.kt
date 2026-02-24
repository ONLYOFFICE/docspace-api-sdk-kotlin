 /*
 * (c) Copyright Ascensio System SIA 2025
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
import onlyoffice.docspace.api.sdk.models.LinkType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A shareable link for a file with its configuration and status.
 *
 * @param id The unique identifier of the shared link.
 * @param title The title of the shared content.
 * @param shareLink The URL for accessing the shared content.
 * @param expirationDate 
 * @param linkType 
 * @param password The password protection for accessing the shared content.
 * @param denyDownload Indicates whether downloading of the shared content is prohibited.
 * @param isExpired Indicates whether the shared link has expired.
 * @param primary Indicates whether this is the primary shared link.
 * @param `internal` Indicates whether the link is for the internal sharing only.
 * @param requestToken The token for validating access requests.
 */


data class FileShareLink (

    /* The unique identifier of the shared link. */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    /* The title of the shared content. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The URL for accessing the shared content. */
    @Json(name = "shareLink")
    val shareLink: kotlin.String? = null,

    @Json(name = "expirationDate")
    val expirationDate: ApiDateTime? = null,

    @Json(name = "linkType")
    val linkType: LinkType? = null,

    /* The password protection for accessing the shared content. */
    @Json(name = "password")
    val password: kotlin.String? = null,

    /* Indicates whether downloading of the shared content is prohibited. */
    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    /* Indicates whether the shared link has expired. */
    @Json(name = "isExpired")
    val isExpired: kotlin.Boolean? = null,

    /* Indicates whether this is the primary shared link. */
    @Json(name = "primary")
    val primary: kotlin.Boolean? = null,

    /* Indicates whether the link is for the internal sharing only. */
    @Json(name = "internal")
    val `internal`: kotlin.Boolean? = null,

    /* The token for validating access requests. */
    @Json(name = "requestToken")
    val requestToken: kotlin.String? = null

) {


}

