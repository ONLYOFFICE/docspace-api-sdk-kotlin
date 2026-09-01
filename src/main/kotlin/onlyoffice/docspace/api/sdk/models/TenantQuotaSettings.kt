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
 * The tenant quota settings.
 *
 * @param enableQuota Specifies if the tenant quota is enabled or not.
 * @param quota The tenant quota.
 * @param lastRecalculateDate The date of the last tenant quota recalculation.
 * @param lastModified The timestamp indicating when the settings were last modified.
 */


data class TenantQuotaSettings (

    @Json(name = "enableQuota")
    val enableQuota: kotlin.Boolean? = null,

    @Json(name = "quota")
    val quota: kotlin.Long? = null,

    @Json(name = "lastRecalculateDate")
    val lastRecalculateDate: java.time.OffsetDateTime? = null,

    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null

) {


}

