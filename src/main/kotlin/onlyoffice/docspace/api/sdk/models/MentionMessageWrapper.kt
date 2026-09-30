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

import onlyoffice.docspace.api.sdk.models.ActionLinkConfig

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The mention notification to send: what to say, whom to tell and where in the document the mention sits.
 *
 * @param actionLink The place in the document the notification link should open at, as the editor reports it when the mention is  made. Left out, the link opens the file at its beginning.
 * @param emails The addresses to notify. Only an address that belongs to a portal account receives a mail; an unknown address  is skipped, and the answer then carries the access list of the file so that the client can invite its owner.
 * @param message The note shown next to the link in the mail. Only its first 200 characters are sent, and a value longer than  the field allows is refused.
 */


data class MentionMessageWrapper (

    @Json(name = "actionLink")
    val actionLink: ActionLinkConfig? = null,

    @Json(name = "emails")
    val emails: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "message")
    val message: kotlin.String? = null

) {


}

