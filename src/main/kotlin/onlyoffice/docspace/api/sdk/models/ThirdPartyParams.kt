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

import onlyoffice.docspace.api.sdk.models.AuthData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The third-party account parameters.
 *
 * @param authData The authentication data.
 * @param corporate Specifies if this is a corporate account or not.
 * @param roomsStorage Specifies if this is a room storage or not.
 * @param customerTitle The customer title.
 * @param providerId The provider ID.
 * @param providerKey The provider key.
 */


data class ThirdPartyParams (

    @Json(name = "auth_data")
    val authData: AuthData? = null,

    @Json(name = "corporate")
    val corporate: kotlin.Boolean? = null,

    @Json(name = "roomsStorage")
    val roomsStorage: kotlin.Boolean? = null,

    @Json(name = "customer_title")
    val customerTitle: kotlin.String? = null,

    @Json(name = "provider_id")
    val providerId: kotlin.Int? = null,

    @Json(name = "provider_key")
    val providerKey: kotlin.String? = null

) {


}

