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
 * What happened to one original form while the room was being exported to the external database.
 *
 * @param id The file of the original form whose collected data was exported. It is the form itself, not one of the filled  copies, so the same id can be read with the file operations of the portal.
 * @param title The name of that form file at the moment of the export. It is empty when the form file no longer exists, which  is also the case in which the export of that entry fails.
 * @param success Whether the data of this form reached the external database. One rejected form does not stop the others, so a  finished job can hold both successful and failed entries.
 * @param error Why this form was not exported. It is empty for a successful entry, and for a failed one it carries either the  message of the underlying failure or the generic export error of the portal.
 */


data class ExternalDbSyncFormResultDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    @Json(name = "error")
    val error: kotlin.String? = null

) {


}

