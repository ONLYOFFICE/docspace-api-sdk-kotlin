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
 * A single filled-in form submission.
 *
 * @param createOn The date and time when the form was created.
 * @param formsData The list of forms data.
 */


data class FormResultsDto (

    @Json(name = "createOn")
    val createOn: java.time.OffsetDateTime? = null,

    @Json(name = "formsData")
    val formsData: kotlin.collections.List<FormsItemData>? = null

) {


}

