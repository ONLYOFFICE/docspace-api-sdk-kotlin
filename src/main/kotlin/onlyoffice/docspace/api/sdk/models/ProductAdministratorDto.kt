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
 * Whether one user administers one portal module, echoing back the pair that was asked about.
 *
 * @param productId The module the verdict is about, echoed from the request. The all-zero GUID stands for the portal as a  whole rather than for any single module.
 * @param userId The user the verdict is about, echoed from the request unchanged - it is not checked for existing.
 * @param administrator Whether that user administers that module. It is `true` for a DocSpace administrator whatever the module,  since the portal-wide role covers every one of them. A `false` can also mean the identifiers name no user  or no module at all, so it is not proof that the user exists, and it says nothing about whether the module  is enabled for the portal - `GET api/2.0/settings/security/{id}` reports that.
 */


data class ProductAdministratorDto (

    @Json(name = "productId")
    val productId: java.util.UUID,

    @Json(name = "userId")
    val userId: java.util.UUID,

    @Json(name = "administrator")
    val administrator: kotlin.Boolean

) {


}

