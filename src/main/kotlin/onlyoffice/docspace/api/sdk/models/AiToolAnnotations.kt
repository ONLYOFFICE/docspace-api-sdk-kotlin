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
 * MCP tool annotations (`Tool.annotations` in the protocol). All hints are advisory and optional; the protocol's defaults are `readOnlyHint: false` and `destructiveHint: true`, which is why an unannotated tool is treated as one that may destroy state.
 *
 * @param title 
 * @param readOnlyHint 
 * @param destructiveHint 
 * @param idempotentHint 
 * @param openWorldHint 
 */


data class AiToolAnnotations (

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "readOnlyHint")
    val readOnlyHint: kotlin.Boolean? = null,

    @Json(name = "destructiveHint")
    val destructiveHint: kotlin.Boolean? = null,

    @Json(name = "idempotentHint")
    val idempotentHint: kotlin.Boolean? = null,

    @Json(name = "openWorldHint")
    val openWorldHint: kotlin.Boolean? = null

) {


}

