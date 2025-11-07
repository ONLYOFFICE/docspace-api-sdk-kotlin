 /*
 * (c) Copyright Ascensio System SIA 2025
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

import onlyoffice.docspace.api.sdk.models.QuotaState

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The quota parameters.
 *
 * @param id The quota ID.
 * @param quantity The quota quantity.
 * @param wallet The quota applies to the wallet or not
 * @param dueDate The quota due date.
 * @param nextQuantity The quota next quantity.
 * @param state 
 */


data class Quota (

    /* The quota ID. */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* The quota quantity. */
    @Json(name = "quantity")
    val quantity: kotlin.Int? = null,

    /* The quota applies to the wallet or not */
    @Json(name = "wallet")
    val wallet: kotlin.Boolean? = null,

    /* The quota due date. */
    @Json(name = "dueDate")
    val dueDate: java.time.OffsetDateTime? = null,

    /* The quota next quantity. */
    @Json(name = "nextQuantity")
    val nextQuantity: kotlin.Int? = null,

    @Json(name = "state")
    val state: QuotaState? = null

) {


}

