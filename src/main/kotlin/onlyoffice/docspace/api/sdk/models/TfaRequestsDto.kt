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

import onlyoffice.docspace.api.sdk.models.TfaRequestsDtoType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The portal two-factor policy: which method is in force, who must pass it, and from where it is waived.
 *
 * @param type The second factor the portal demands. The two methods are mutually exclusive, so switching one on switches  the other off, and any value outside the defined set is read as switching TFA off rather than refused.
 * @param id The account the request concerns, by portal user ID. Naming the portal owner is refused unless it is the  caller's own account. Where an operation detaches an authenticator application, the empty GUID and the  caller's own ID both mean the caller.
 * @param trustedIps The list of IP addresses that bypass TFA verification. Each entry is a single address, an inclusive  from-to range or a CIDR block. This is the whole list that is to hold afterwards, so send the addresses  already trusted along with a new one; an entry that cannot be parsed fails the call with 400, and accounts  named as mandatory still have to pass the challenge even from a trusted address.
 * @param mandatoryUsers The accounts that must pass the challenge whatever their address, by portal user ID. This is the whole list  that is to hold afterwards - leaving it out clears it rather than keeping it - and naming the portal owner is  refused unless the caller is the owner.
 * @param mandatoryGroups The groups whose members must pass the challenge whatever their address, by group ID. This is the whole list  that is to hold afterwards - leaving it out clears it rather than keeping it.
 */


data class TfaRequestsDto (

    @Json(name = "type")
    val type: TfaRequestsDtoType? = null,

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "trustedIps")
    val trustedIps: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "mandatoryUsers")
    val mandatoryUsers: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "mandatoryGroups")
    val mandatoryGroups: kotlin.collections.List<java.util.UUID>? = null

) {


}

