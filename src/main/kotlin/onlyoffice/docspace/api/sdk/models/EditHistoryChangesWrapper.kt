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
import onlyoffice.docspace.api.sdk.models.EditHistoryAuthor

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One single change inside a saved revision of a file.
 *
 * @param user The account that made this change, as the editing service reported it; an account it could not name is  reported as a guest.
 * @param created When this change was made, written with the offset of the portal's time zone rather than as plain UTC.
 * @param documentSha256 The SHA-256 hash of the document as it stood after this change, where the editing service recorded one, so  that a client can check a stored copy against the change it claims to hold. Empty when the change record  carries no hash.
 */


data class EditHistoryChangesWrapper (

    @Json(name = "user")
    val user: EditHistoryAuthor? = null,

    @Json(name = "created")
    val created: ApiDateTime? = null,

    @Json(name = "documentSha256")
    val documentSha256: kotlin.String? = null

) {


}

