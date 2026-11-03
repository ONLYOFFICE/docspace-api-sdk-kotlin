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

import onlyoffice.docspace.api.sdk.models.AiAssignmentsExpanded
import onlyoffice.docspace.api.sdk.models.AiProfile

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param assignments The bound profiles keyed by action type, as `GET api/2.0/ai/profiles/list` describes them. A binding whose profile no longer exists is left out.
 * @param profilesTotal How many profiles the portal has.
 * @param chatProfilesTotal How many of those profiles can chat; a profile without declared capabilities counts as one that can.
 */


data class AiAssignmentsGetAllAssignments200Response (

    @Json(name = "assignments")
    val assignments: kotlin.collections.Map<kotlin.String, AiProfile>,

    @Json(name = "profilesTotal")
    val profilesTotal: kotlin.Int,

    @Json(name = "chatProfilesTotal")
    val chatProfilesTotal: kotlin.Int

) {


}

