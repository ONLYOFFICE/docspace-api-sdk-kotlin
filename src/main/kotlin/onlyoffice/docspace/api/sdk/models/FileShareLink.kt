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
import onlyoffice.docspace.api.sdk.models.LinkType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A sharing link of a file, a folder or a room, with everything set on it.
 *
 * @param id The identifier of the link, the one to send back as `linkId` to change or delete it.
 * @param title The name the link is listed under, which its author is free to choose and to leave empty.
 * @param shareLink The shortened address to hand out. Opening it is what turns the link into access; the address stays the same  while the link exists.
 * @param expirationDate The moment the link stops working, written with the offset of the portal time zone. Null when the link was  left without an end.
 * @param linkType Which of the two jobs the link does: letting somebody into the room as a member, or handing out the entry  itself. The counters of uses are filled in for the first kind only.
 * @param password The password a visitor has to send before the link resolves, readable only by those who may manage the link.  Empty when the link asks for none.
 * @param denyDownload Whether visitors coming through this link may only read the entry in the editor and not download or print it.
 * @param isExpired Whether the moment in `expirationDate` has already passed, which leaves the link in place but refuses  everybody who opens it.
 * @param primary Whether this is the one link the entry always keeps: a public or a form-filling room is given it at creation,  and deleting it there only makes a new one.
 * @param `internal` Whether the visitor has to sign in to the portal before the link resolves, as opposed to it being open to  anybody who has the address.
 * @param requestToken The key that stands for this link in the calls that resolve it, such as `GET api/2.0/files/share/{key}`. It is  filled in for links that hand out the entry, and empty for the ones that invite into a room.
 * @param maxUseCount How many accounts may still join the room through this invitation link in total. Null on a link that hands out  the entry, where nothing is counted.
 * @param currentUseCount How many accounts have already joined through this invitation link. Once it reaches `maxUseCount` the link  stops letting anybody else in. Null on a link that hands out the entry.
 */


data class FileShareLink (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "shareLink")
    val shareLink: kotlin.String? = null,

    @Json(name = "expirationDate")
    val expirationDate: ApiDateTime? = null,

    @Json(name = "linkType")
    val linkType: LinkType? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    @Json(name = "isExpired")
    val isExpired: kotlin.Boolean? = null,

    @Json(name = "primary")
    val primary: kotlin.Boolean? = null,

    @Json(name = "internal")
    val `internal`: kotlin.Boolean? = null,

    @Json(name = "requestToken")
    val requestToken: kotlin.String? = null,

    @Json(name = "maxUseCount")
    val maxUseCount: kotlin.Int? = null,

    @Json(name = "currentUseCount")
    val currentUseCount: kotlin.Int? = null

) {


}

