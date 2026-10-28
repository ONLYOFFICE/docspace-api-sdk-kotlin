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
 * The settings of an external link to a file.
 *
 * @param linkId The link to rewrite, as reported by `GET api/2.0/files/file/{id}/links`. An identifier that is not yet in use,  the empty one included, creates a link instead.
 * @param access The rights the link grants to whoever follows it. The value that denies everything revokes the link.
 * @param expirationDate The moment the link stops working, read in the time zone of the portal. A date more than a few years ahead is  rejected as an invalid request; left out, the link does not expire on its own.
 * @param title The name the link carries in the sharing list of the file, for the people who manage it; it is not shown to  whoever follows the link.
 * @param `internal` Who may follow the link: `true` admits only accounts that are signed in to the portal, `false` admits anybody  who has the address.
 * @param primary Whether this link becomes the primary link of the file - the one the Copy link action of a client hands out.  A file has one primary link at a time.
 * @param denyDownload What a visitor may do with the content: `true` leaves them with viewing in the browser, `false` lets them  download and print it as their rights allow.
 * @param password The secret a visitor has to type before the file opens; left out, the link opens without one.
 */


data class FileLinkRequest (

    @Json(name = "linkId")
    val linkId: java.util.UUID? = null,

    @Json(name = "access")
    val access: FileShare? = null,

    @Json(name = "expirationDate")
    val expirationDate: ApiDateTime? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "internal")
    val `internal`: kotlin.Boolean? = null,

    @Json(name = "primary")
    val primary: kotlin.Boolean? = null,

    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    @Json(name = "password")
    val password: kotlin.String? = null

) {


}

