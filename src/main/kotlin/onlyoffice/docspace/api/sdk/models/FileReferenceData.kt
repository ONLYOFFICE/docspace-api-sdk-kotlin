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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The pair of values that names a document across portals, as it is written into a spreadsheet formula.
 *
 * @param fileKey The id of the document inside the portal named below.
 * @param instanceId The portal the document lives in. A reference whose value is not this portal cannot be resolved by the file  key and falls back to the path or the link.
 * @param roomId The room the document lies in. It is filled in only for a document opened in a virtual data room, and stays  empty everywhere else.
 * @param canEditRoom Whether the caller may manage the room named above; it is only meaningful together with it.
 */


data class FileReferenceData (

    @Json(name = "fileKey")
    val fileKey: kotlin.String? = null,

    @Json(name = "instanceId")
    val instanceId: kotlin.String? = null,

    @Json(name = "roomId")
    val roomId: kotlin.String? = null,

    @Json(name = "canEditRoom")
    val canEditRoom: kotlin.Boolean? = null

) {


}

