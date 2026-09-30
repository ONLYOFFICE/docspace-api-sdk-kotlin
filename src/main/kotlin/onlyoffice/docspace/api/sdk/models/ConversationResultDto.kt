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

import onlyoffice.docspace.api.sdk.models.FileOperationType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The progress of one file conversion, together with the converted file once it exists.
 *
 * @param id The identifier of the conversion entry. The portal leaves it empty for file conversions, so a caller follows  its own conversion by the file it queued rather than by this value.
 * @param operation Tells which kind of file operation the entry describes, so that a conversion can be told apart from the copy,  move and download entries that share this envelope. A conversion entry reports the conversion type.
 * @param progress How far the conversion has got, counted in percent from 0 while it is only queued to 100 once it is over -  whether it ended with a converted file or with an error. 100 is the value a polling caller waits for.
 * @param source Describes what is being converted: the identifier of the source file, the version that was taken and whether  an existing result may be overwritten, packed as a JSON object inside a string. It is what identifies the  entry when several conversions of the same caller are in flight.
 * @param result 
 * @param error The reason the conversion stopped, in the language of the caller, and empty while it is running and after it  has succeeded. `progress` reaches 100 for a failure as well, so this field is what separates a converted file  from a broken conversion; a conversion still unfinished after ten minutes ends with a timeout reported here.
 * @param processed Reports whether the portal has taken the entry as far as it goes: `1` once the conversion has finished or  failed, and empty while it is still queued or still being converted. It is the bookkeeping of the conversion  queue rather than a result - what happened is in `progress`, `error` and `result`.
 */


data class ConversationResultDto (

    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "Operation")
    val operation: FileOperationType,

    @Json(name = "progress")
    val progress: kotlin.Int,

    @Json(name = "source")
    val source: kotlin.String? = null,

    @Json(name = "result")
    val result: kotlin.Any? = null,

    @Json(name = "error")
    val error: kotlin.String? = null,

    @Json(name = "processed")
    val processed: kotlin.String? = null

) {


}

