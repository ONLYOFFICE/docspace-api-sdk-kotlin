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
 * The request parameters for configuring security settings of a single web module.
 *
 * @param id The module ID.
 * @param enabled Controls whether the security restrictions are enforced for this module.
 * @param subjects The collection of user and group identifiers granted access to the module.
 */


data class WebItemSecurityRequestsDto (

    /* The module ID. */
    @Json(name = "id")
    val id: kotlin.String?,

    /* Controls whether the security restrictions are enforced for this module. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    /* The collection of user and group identifiers granted access to the module. */
    @Json(name = "subjects")
    val subjects: kotlin.collections.List<java.util.UUID>? = null

) {


}

