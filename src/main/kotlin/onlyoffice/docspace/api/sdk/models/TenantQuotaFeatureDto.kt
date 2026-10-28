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
 * One feature a quota switches on, with the limit it grants and how much of that limit is used.
 *
 * @param id The stable key of the feature - `total_size`, `manager`, `room`, `backup` and so on. It is the value to  branch on, since `title` is prose in the portal language.
 * @param title The feature described in the portal language, with its limit already substituted into the sentence, so it  can be printed as it is. It is empty when this build ships no wording for the feature.
 * @param image The feature's icon as SVG markup to render inline - not a URL to fetch. It is filled in only when the  quota comes from the catalogue, and left empty on the quota the portal is actually on, on a feature that  this quota switches off, and on a feature that ships no icon.
 * @param `value` 
 * @param type How to read `value` and `used`: `size` for bytes, `count` for a number of things, `flag` for a feature  that is merely on or off.
 * @param used How much of the limit is already used. It is present only on the quota the portal is actually on, and  only for a feature whose consumption is counted; a guest is shown none of these figures and a plain member  only the one for total size, so an absent value can mean the caller may not see it rather than that  nothing is used.
 * @param priceTitle What the feature is charged as, in the portal language - for instance the per-unit price of an add-on. It  is filled in only for a feature that costs money on top of the plan.
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

