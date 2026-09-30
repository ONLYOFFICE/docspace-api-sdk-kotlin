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

import onlyoffice.docspace.api.sdk.models.FileReferenceData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The file reference parameters.
 *
 * @param referenceData How this document is named when another spreadsheet refers to it. Send it back as it stands to resolve the  reference again.
 * @param error Filled in when the reference resolved to nothing; the rest of the descriptor is then empty and must not be  handed to the editors.
 * @param path The title of the document the reference resolved to.
 * @param url Where the content is fetched from. It is addressed to the host the document service can reach, which on a  deployment with a private editor network is not the address a browser should follow.
 * @param fileType The format the content is in, without the leading dot.
 * @param key Identifies the exact revision to the editors: two clients that receive the same key read the same co-editing  session, and the key changes as soon as the document is saved.
 * @param link The address of the document in the portal web editor - the link to put in front of a person, unlike the  download address above.
 * @param token Signs this descriptor so that the editors can trust it. It stays empty on a portal that has no signature  secret configured for the document service.
 */


data class FileReference (

    @Json(name = "referenceData")
    val referenceData: FileReferenceData? = null,

    @Json(name = "error")
    val error: kotlin.String? = null,

    @Json(name = "path")
    val path: kotlin.String? = null,

    @Json(name = "url")
    val url: java.net.URI? = null,

    @Json(name = "fileType")
    val fileType: kotlin.String? = null,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "link")
    val link: kotlin.String? = null,

    @Json(name = "token")
    val token: kotlin.String? = null

) {


}

