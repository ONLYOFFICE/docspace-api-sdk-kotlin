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

import onlyoffice.docspace.api.sdk.models.AiToolsBulkResultErrorsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Outcome of `ToolsEngine.replaceAllCustomServers` — either every entry persisted, or no entries persisted plus a per-key error report.
 *
 * @param success True when every custom MCP server was persisted.
 * @param errors What was rejected, per server. Present on failure - and then no server was persisted.
 */


data class AiToolsBulkResult (

    @Json(name = "success")
    val success: kotlin.Boolean,

    @Json(name = "errors")
    val errors: kotlin.collections.List<AiToolsBulkResultErrorsInner>? = null

) {


}

