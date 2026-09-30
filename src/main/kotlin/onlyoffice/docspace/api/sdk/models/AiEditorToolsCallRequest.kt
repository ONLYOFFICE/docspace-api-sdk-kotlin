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
 * 
 *
 * @param name Name of the tool to run, as listed by the tools endpoint. A name that is unknown or excluded from the editor is rejected with 400.
 * @param arguments Arguments for the tool, shaped by that tool's own input schema. Treated as empty when it is not an object.
 * @param entityId Room the call is scoped to. Left out for a portal-wide call.
 */


data class AiEditorToolsCallRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "arguments")
    val arguments: kotlin.collections.Map<kotlin.String, kotlin.Any?>? = null,

    @Json(name = "entityId")
    val entityId: kotlin.String? = null

) {


}

