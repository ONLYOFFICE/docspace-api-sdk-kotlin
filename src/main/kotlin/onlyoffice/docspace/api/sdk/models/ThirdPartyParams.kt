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
 * A third-party storage account connected to the portal.
 *
 * @param authData The stored credentials of the account. They are not filled in here: the portal does not give back credentials  once an account is saved.
 * @param corporate Whether the account is attached to the legacy Common section, which is the case only for accounts inherited  from an older portal.
 * @param roomsStorage Whether the account is attached to the Rooms section, room templates and the archive counted in. This is where  `POST api/2.0/files/thirdparty` puts every account it connects.
 * @param customerTitle The name the account is shown under in the portal, as it was saved when the account was connected.
 * @param providerId The account ID to send to `DELETE api/2.0/files/thirdparty/{providerId}`, or as `providerId` to  re-authenticate the account.
 * @param providerKey The storage service behind the account. `WebDav` stands for every WebDAV preset, so it does not tell which of  them was chosen when the account was connected.
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

