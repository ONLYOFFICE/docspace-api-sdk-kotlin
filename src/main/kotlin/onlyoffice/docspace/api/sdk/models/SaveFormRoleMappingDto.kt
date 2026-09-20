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

import onlyoffice.docspace.api.sdk.models.FormRole

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The people who are to fill in the roles of a PDF form.
 *
 * @param formId The PDF form the roles belong to. This is the value the operation reads, rather than the identifier in its  route, and the two are to be sent the same.
 * @param roles The roles with the account taking each of them and the sequence number that decides the turn: the same number  means the roles may be filled in parallel, different ones make a queue. The whole set is replaced on every  call, and an empty set resets the filling.
 */


data class SaveFormRoleMappingDto (

    @Json(name = "formId")
    val formId: kotlin.Int,

    @Json(name = "roles")
    val roles: kotlin.collections.List<FormRole>?

) {


}

