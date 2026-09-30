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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The external link of a folder, as it is to be created or rewritten.
 *
 * @param linkId Which link the request addresses: the identifier of an existing link rewrites that link, while an identifier  that is not in use, the empty one included, creates a new link. Take an existing identifier from  `GET api/2.0/files/folder/{id}/links`.
 * @param access The rights a visitor following the link is given. The value that grants nothing revokes the link instead of  setting it, and the answer is then empty.
 * @param expirationDate The moment the link stops working, sent as an ISO-8601 stamp. A moment that lies in the past is ignored,  and leaving the field out gives the link no expiry.
 * @param title The name the link is listed under for the people who manage the folder; a visitor following it never sees the  name.
 * @param password The secret a visitor has to enter before the link opens. Leave it out for a link that opens without one; the  secret itself is never given back, only the fact that one is set.
 * @param denyDownload Whether visitors are left with viewing alone: with true downloading and copying through the link are blocked,  with false they are allowed.
 * @param `internal` Whether the link admits signed-in portal members only: with true a visitor has to sign in before the link  opens, with false anyone holding the address may follow it.
 * @param primary Whether this link becomes the primary link of the folder, the one the Copy link action of a client hands  out; a folder has one primary link at a time.
 */


data class FolderLinkRequest (

    @Json(name = "linkId")
    val linkId: java.util.UUID? = null,

    @Json(name = "access")
    val access: FileShare? = null,

    @Json(name = "expirationDate")
    val expirationDate: ApiDateTime? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    @Json(name = "internal")
    val `internal`: kotlin.Boolean? = null,

    @Json(name = "primary")
    val primary: kotlin.Boolean? = null

) {


}

