 /*
 * (c) Copyright Ascensio System SIA 2025
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
 * The request parameters for tracking SMTP (Simple Mail Transfer Protocol) operation status.
 *
 * @param completed Specifies whether the SMTP operation has finished processing.
 * @param id The unique identifier for tracking the SMTP operation.
 * @param error The error message if the SMTP operation encountered issues.
 * @param status The current state of the SMTP operation.
 * @param percents The progress indicator showing completion percentage of the operation.
 */


data class SmtpOperationStatusRequestsDto (

    /* Specifies whether the SMTP operation has finished processing. */
    @Json(name = "completed")
    val completed: kotlin.Boolean? = null,

    /* The unique identifier for tracking the SMTP operation. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The error message if the SMTP operation encountered issues. */
    @Json(name = "error")
    val error: kotlin.String? = null,

    /* The current state of the SMTP operation. */
    @Json(name = "status")
    val status: kotlin.String? = null,

    /* The progress indicator showing completion percentage of the operation. */
    @Json(name = "percents")
    val percents: kotlin.Int? = null

) {


}

