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

import onlyoffice.docspace.api.sdk.models.AceShortWrapper
import onlyoffice.docspace.api.sdk.models.EditorType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The information config parameters.
 *
 * @param favorite Specifies if the file is favorite or not.
 * @param folder The folder of the file.
 * @param owner The file owner.
 * @param sharingSettings The sharing settings of the file.
 * @param type The editor type of the file.
 * @param uploaded The uploaded file.
 */


data class InfoConfigDto (

    @Json(name = "favorite")
    val favorite: kotlin.Boolean? = null,

    @Json(name = "folder")
    val folder: kotlin.String? = null,

    @Json(name = "owner")
    val owner: kotlin.String? = null,

    @Json(name = "sharingSettings")
    val sharingSettings: kotlin.collections.List<AceShortWrapper>? = null,

    @Json(name = "type")
    val type: EditorType? = null,

    @Json(name = "uploaded")
    val uploaded: kotlin.String? = null

) {


}

