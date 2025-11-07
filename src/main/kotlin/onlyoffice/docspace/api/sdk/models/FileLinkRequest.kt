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
import onlyoffice.docspace.api.sdk.models.FileShare

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The external link request parameters.
 *
 * @param linkId The external link ID.
 * @param access 
 * @param expirationDate 
 * @param title The link name.
 * @param `internal` The link scope, whether it is internal or not.
 * @param primary Specifies whether the file link is primary or not.
 * @param denyDownload Specifies whether to deny downloading the file or not.
 * @param password Password for access via link.
 */


data class FileLinkRequest (

    /* The external link ID. */
    @Json(name = "linkId")
    val linkId: java.util.UUID? = null,

    @Json(name = "access")
    val access: FileShare? = null,

    @Json(name = "expirationDate")
    val expirationDate: ApiDateTime? = null,

    /* The link name. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The link scope, whether it is internal or not. */
    @Json(name = "internal")
    val `internal`: kotlin.Boolean? = null,

    /* Specifies whether the file link is primary or not. */
    @Json(name = "primary")
    val primary: kotlin.Boolean? = null,

    /* Specifies whether to deny downloading the file or not. */
    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    /* Password for access via link. */
    @Json(name = "password")
    val password: kotlin.String? = null

) {


}

