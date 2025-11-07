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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for managing user security and access permissions.
 *
 * @param productId The product ID for which permissions are being set.
 * @param userId The ID of the user whose permissions are being configured.
 * @param administrator Specifies whether the user has administrative privileges.
 */


data class SecurityRequestsDto (

    /* The product ID for which permissions are being set. */
    @Json(name = "productId")
    val productId: java.util.UUID,

    /* The ID of the user whose permissions are being configured. */
    @Json(name = "userId")
    val userId: java.util.UUID,

    /* Specifies whether the user has administrative privileges. */
    @Json(name = "administrator")
    val administrator: kotlin.Boolean? = null

) {


}

