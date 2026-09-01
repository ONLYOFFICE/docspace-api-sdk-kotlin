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

import onlyoffice.docspace.api.sdk.models.FeatureUsedDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The tenant quota feature parameters.
 *
 * @param id The ID of the tenant quota feature.
 * @param title The title of the tenant quota feature.
 * @param image The image URL of the tenant quota feature.
 * @param `value` 
 * @param type The type of the tenant quota feature.
 * @param used The used space parameters of the tenant quota feature.
 * @param priceTitle The price title of the tenant quota feature.
 */


data class TenantQuotaFeatureDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "image")
    val image: kotlin.String? = null,

    @Json(name = "value")
    val `value`: kotlin.Any? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "used")
    val used: FeatureUsedDto? = null,

    @Json(name = "priceTitle")
    val priceTitle: kotlin.String? = null

) {


}

