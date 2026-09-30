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

import onlyoffice.docspace.api.sdk.models.CurrentLicenseInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Where to buy or extend the portal's subscription, and what the subscription in force looks like.
 *
 * @param salesEmail The vendor mailbox to write to about buying, extending or changing the subscription, picked for the portal  language. It is not the portal's own support address.
 * @param buyUrl The vendor page for buying or extending the subscription, chosen for the licence kind the installation was  built for and for the portal language. It is a page for a person to open, not an API to call.
 * @param standalone Whether this is a server installation someone administers themselves rather than a portal in the cloud,  which decides whether payment means uploading a licence file or a subscription in the vendor's store.
 * @param currentLicense The subscription in force, reduced to the two facts a payment page needs.
 * @param max The largest quantity of a paid item - members, storage - that may be bought in one go, `999` unless the  installation configures another cap. It bounds a single purchase, not the total a portal may hold.
 * @param feedbackAndSupportUrl Not populated: nothing fills this field in, so it always comes back empty. The help and support addresses  live in `externalResources` of `GET api/2.0/settings` instead.
 */


data class PaymentSettingsDto (

    @Json(name = "salesEmail")
    val salesEmail: kotlin.String?,

    @Json(name = "buyUrl")
    val buyUrl: kotlin.String?,

    @Json(name = "standalone")
    val standalone: kotlin.Boolean,

    @Json(name = "currentLicense")
    val currentLicense: CurrentLicenseInfo,

    @Json(name = "max")
    val max: kotlin.Int,

    @Json(name = "feedbackAndSupportUrl")
    val feedbackAndSupportUrl: kotlin.String? = null

) {


}

