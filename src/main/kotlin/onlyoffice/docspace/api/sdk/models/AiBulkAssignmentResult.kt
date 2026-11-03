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

import onlyoffice.docspace.api.sdk.models.AiBulkAssignmentResultErrorsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The outcome of a bulk assign: either every entry was stored, or none was and the errors are reported per action. Every entry is validated before anything is written, so one bad entry never leaves the assignments half-written.
 *
 * @param success True when every entry was persisted.
 * @param errors What was rejected, per action. Present on failure - and then no entry was persisted.
 */


data class AiBulkAssignmentResult (

    @Json(name = "success")
    val success: kotlin.Boolean,

    @Json(name = "errors")
    val errors: kotlin.collections.List<AiBulkAssignmentResultErrorsInner>? = null

) {


}

