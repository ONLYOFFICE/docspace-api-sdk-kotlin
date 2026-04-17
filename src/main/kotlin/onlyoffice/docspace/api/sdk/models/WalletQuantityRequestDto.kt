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

import onlyoffice.docspace.api.sdk.models.ProductQuantityType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for specifying wallet payment quantity.
 *
 * @param quantity The mapping of item identifiers to their respective quantities in the payment.
 * @param productQuantityType 
 */


data class WalletQuantityRequestDto (

    /* The mapping of item identifiers to their respective quantities in the payment. */
    @Json(name = "quantity")
    val quantity: kotlin.collections.Map<kotlin.String, kotlin.Int?>? = null,

    @Json(name = "productQuantityType")
    val productQuantityType: ProductQuantityType? = null

) {


}

