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
import onlyoffice.docspace.api.sdk.models.EditHistoryChangesWrapper

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One saved revision of a file, as the editing service recorded it.
 *
 * @param id The file the revision belongs to; every entry of one history carries the same value.
 * @param key The document key of this revision, which the editing service uses to tell the revisions of a file apart and to  reuse the copy it has cached. Hand it back unchanged when asking the editor for this revision.
 * @param version The number of the revision, counting up from 1 in the order the revisions were saved. It is the value the  operations that show the changes of a revision or restore it expect.
 * @param versionGroup Groups the revisions written by one editing session: entries sharing this number were saved while the same  session was open, which is how a client collapses a long list of revisions into the versions a person would  recognise.
 * @param user The account that saved the revision. A revision saved by an account that no longer exists, or through an  anonymous link, is reported as a guest.
 * @param created When the revision was saved, written with the offset of the portal's time zone rather than as plain UTC. The  times of one history are consistent with each other, so order and display the revisions by them.
 * @param changesHistory The change record the editing service stored for this revision, as the raw JSON it was written in, and empty  for a revision the portal has no record for - one uploaded as a whole file, for instance. `changes` is the  same record already parsed.
 * @param changes The single changes this revision introduced - who made each of them and when - taken from the stored change  record. It comes back empty both for a revision whose changes were never recorded and for one whose record is  in a format the portal no longer reads, so an empty list is not proof that nothing changed.
 * @param serverVersion The build of the editing service that wrote the change record of this revision, taken from the record itself;  empty when the portal holds no record for the revision.
 */


data class EditHistoryDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "version")
    val version: kotlin.Int? = null,

    @Json(name = "versionGroup")
    val versionGroup: kotlin.Int? = null,

    @Json(name = "user")
    val user: EditHistoryAuthor? = null,

    @Json(name = "created")
    val created: ApiDateTime? = null,

    @Json(name = "changesHistory")
    val changesHistory: kotlin.String? = null,

    @Json(name = "changes")
    val changes: kotlin.collections.List<EditHistoryChangesWrapper>? = null,

    @Json(name = "serverVersion")
    val serverVersion: kotlin.String? = null

) {


}

