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
 * The response containing the scope information.
 *
 * @param name The scope name.
 * @param group The group the scope belongs to.
 * @param type The scope type.
 */


data class ScopeResponse (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "group")
    val group: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null

) {


}

