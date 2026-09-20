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

import onlyoffice.docspace.api.sdk.models.TenantWalletService

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Which wallet service is switched, and which way.
 *
 * @param service The service being switched, given by its catalogue name. Switching it on only makes it available to the  portal; its units are still bought with `PUT api/2.0/portal/payment/updatewallet`.
 * @param enabled Which way the service is switched: `true` makes it available to the portal, `false` withdraws it. Setting the  state the service already has changes nothing.
 */


data class ChangeWalletServiceStateRequestDto (

    @Json(name = "service")
    val service: TenantWalletService? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null

) {


}

