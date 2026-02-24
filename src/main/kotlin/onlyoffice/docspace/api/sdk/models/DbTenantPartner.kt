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
 * The database tenant partner parameters.
 *
 * @param tenantId The tenant ID.
 * @param partnerId The partner ID.
 * @param affiliateId The affiliate ID.
 * @param campaign The tenant partner campaign.
 */


data class DbTenantPartner (

    /* The tenant ID. */
    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    /* The partner ID. */
    @Json(name = "partnerId")
    val partnerId: kotlin.String? = null,

    /* The affiliate ID. */
    @Json(name = "affiliateId")
    val affiliateId: kotlin.String? = null,

    /* The tenant partner campaign. */
    @Json(name = "campaign")
    val campaign: kotlin.String? = null

) {


}

