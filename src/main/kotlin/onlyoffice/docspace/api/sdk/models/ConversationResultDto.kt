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
 * The result of file convertion operation.
 *
 * @param id The conversion operation ID.
 * @param operation 
 * @param progress The conversion operation progress.
 * @param source The source file for the conversion.
 * @param result The resulting file after the conversion.
 * @param error The conversion operation error message.
 * @param processed Specifies if the conversion operation is processed or not.
 */


data class ConversationResultDto (

    /* The conversion operation ID. */
    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "Operation")
    val operation: FileOperationType,

    /* The conversion operation progress. */
    @Json(name = "progress")
    val progress: kotlin.Int,

    /* The source file for the conversion. */
    @Json(name = "source")
    val source: kotlin.String? = null,

    /* The resulting file after the conversion. */
    @Json(name = "result")
    val result: kotlin.Any? = null,

    /* The conversion operation error message. */
    @Json(name = "error")
    val error: kotlin.String? = null,

    /* Specifies if the conversion operation is processed or not. */
    @Json(name = "processed")
    val processed: kotlin.String? = null

) {


}

