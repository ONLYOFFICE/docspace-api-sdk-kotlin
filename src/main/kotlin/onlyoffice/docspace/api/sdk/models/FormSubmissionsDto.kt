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

import onlyoffice.docspace.api.sdk.models.FormMetadata
import onlyoffice.docspace.api.sdk.models.FormResultsDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * All completed copies of a form, together with the description of the fields they were filled into.
 *
 * @param metadata Describes the fields of the form version that is being filled - the key each value is stored under, the type  and format of the field and, where the field offers a fixed set of answers, those answers - in the order the  fields are laid out, which is the order to build a results table in. It comes back empty when the portal holds  no indexed description of that version.
 * @param submissions One entry per completed copy, ordered by the copy number that `formsData` carries. An empty list means nothing  has been completed for the version that is currently being filled; the copies of earlier versions of the form  are not reported here.
 */


data class FormSubmissionsDto (

    @Json(name = "metadata")
    val metadata: kotlin.collections.List<FormMetadata>? = null,

    @Json(name = "submissions")
    val submissions: kotlin.collections.List<FormResultsDto>? = null

) {


}

