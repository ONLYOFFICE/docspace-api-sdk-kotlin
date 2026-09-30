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
 * The access rule stored for one portal module: whether it may be opened, and by whom.
 *
 * @param id The module the rule applies to, given as a GUID. A value that is not a GUID fails the request as invalid.
 * @param enabled Whether the module may be opened. It decides the outcome only while `subjects` names somebody: an empty  `subjects` array is stored as access for everyone whatever this flag says.
 * @param subjects The users and groups the rule is stored for, given by their IDs. This is the whole allow-list that is to hold  afterwards and not a list of additions - what was stored before is dropped. Leaving it out applies `enabled`  to everyone and skips the audit trail entry, while sending it empty stores access for everyone.
 */


data class WebItemSecurityRequestsDto (

    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "subjects")
    val subjects: kotlin.collections.List<java.util.UUID>? = null

) {


}

