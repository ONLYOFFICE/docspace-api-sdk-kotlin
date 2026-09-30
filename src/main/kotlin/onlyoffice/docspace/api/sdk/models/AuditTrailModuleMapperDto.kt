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

import onlyoffice.docspace.api.sdk.models.AuditTrailActionMapperDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The audit trail actions of one module.
 *
 * @param moduleType The location inside the product, as the `moduleType` filter of `GET api/2.0/security/audit/events/filter`  spells it.
 * @param actions Every action this module can record. Each action appears under exactly one module, so this tree is where a  caller learns which module a given action belongs to.
 */


data class AuditTrailModuleMapperDto (

    @Json(name = "moduleType")
    val moduleType: kotlin.String? = null,

    @Json(name = "actions")
    val actions: kotlin.collections.List<AuditTrailActionMapperDto>? = null

) {


}

