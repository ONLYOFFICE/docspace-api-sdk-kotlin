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

import onlyoffice.docspace.api.sdk.models.FileShareParams

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The rights to apply to a single file or folder, and how to announce them.
 *
 * @param share One record per account or group whose rights are being set, each naming the subject and the level it gets; a  level of `None` takes the access away. An empty collection makes the call change nothing.
 * @param notify Set to true to have every account named in `share` emailed about the access it just received; false changes  the rights without telling anyone.
 * @param sharingMessage The text put into that email, ignored while `notify` is false. Markup is stripped before sending, so only the  plain text of the value survives.
 */


data class SecurityInfoSimpleRequestDto (

    @Json(name = "share")
    val share: kotlin.collections.List<FileShareParams>? = null,

    @Json(name = "notify")
    val notify: kotlin.Boolean? = null,

    @Json(name = "sharingMessage")
    val sharingMessage: kotlin.String? = null

) {


}

