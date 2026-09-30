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
 * The wallet service being bought or scheduled, and the way its quantity is applied.
 *
 * @param quantity The wallet service and the number of units of it, as a single pair. The key is the `serviceName` of a service  from `GET api/2.0/portal/payment/walletservices`, and the value is read according to  `productQuantityType`: the units to add, or the total the service is to have in the next period. Minimum  quantities apply per service - disk storage starts at 100 units, the Docs Connect Dev Pack at 10, and the  administrators may not be fewer than the portal already has. Exactly one pair is accepted, and a null or zero  value cancels a change scheduled earlier rather than buying nothing.
 * @param productQuantityType How the number in `quantity` is applied. `Add` buys the units straight away and charges them to the portal  wallet, while `Set` charges nothing now and records the quantity the service is to have from the next period.  Only these two are accepted here; `Sub` and `Renew` are refused with 400.
 */


data class WalletQuantityRequestDto (

    @Json(name = "quantity")
    val quantity: kotlin.collections.Map<kotlin.String, kotlin.Int?>,

    @Json(name = "productQuantityType")
    val productQuantityType: ProductQuantityType? = null

) {


}

