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

import onlyoffice.docspace.api.sdk.models.FormsItemData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One completed copy of a form, with the values that were entered into it.
 *
 * @param createOn When the portal recorded this copy, in UTC: the moment the filled copy was completed and its data indexed, not  the moment the form itself was made.
 * @param formsData The values that were entered into this copy, one entry per field, preceded by an entry keyed `FormNumber` that  carries the number of the copy and is what the submissions are ordered by. Fields holding a picture or a  signature are left out of the record, so a field missing here was not necessarily left blank.
 */


data class FormResultsDto (

    @Json(name = "createOn")
    val createOn: java.time.OffsetDateTime? = null,

    @Json(name = "formsData")
    val formsData: kotlin.collections.List<FormsItemData>? = null

) {


}

