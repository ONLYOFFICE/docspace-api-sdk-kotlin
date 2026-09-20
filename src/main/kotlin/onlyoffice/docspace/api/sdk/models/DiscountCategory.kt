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
 * Represents a discount category applied to the price.
 *
 * @param id The discount category unique identifier.
 * @param valueDiscount The discount value.
 * @param description The discount category description.
 * @param created The date and time when the discount category was created.
 */


data class DiscountCategory (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "valueDiscount")
    val valueDiscount: kotlin.Double? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null

) {


}

