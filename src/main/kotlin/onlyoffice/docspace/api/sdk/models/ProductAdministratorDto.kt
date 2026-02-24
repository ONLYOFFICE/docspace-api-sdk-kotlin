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
 * The product administrator parameters.
 *
 * @param productId The product ID.
 * @param userId The user unique identifier.
 * @param administrator Indicates whether the user has administrator privileges for the product.
 */


data class ProductAdministratorDto (

    /* The product ID. */
    @Json(name = "productId")
    val productId: java.util.UUID,

    /* The user unique identifier. */
    @Json(name = "userId")
    val userId: java.util.UUID,

    /* Indicates whether the user has administrator privileges for the product. */
    @Json(name = "administrator")
    val administrator: kotlin.Boolean

) {


}

