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

import onlyoffice.docspace.api.sdk.models.TenantTrustedDomainsType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Which email domains the portal treats as already verified, and how their users join.
 *
 * @param type How trusted domains are decided: no domain is trusted, every domain is, or only the ones listed in `domains`.  Only the custom mode reads `domains`; under the other two the list is ignored rather than refused.
 * @param domains The trusted domains, as bare hostnames such as `example.com` without a scheme or an `@`. This is the whole  list that is to hold afterwards and not a list of additions. Each entry is lowercased before it is stored,  and one entry that is not a valid hostname - or an empty list in the custom mode - fails the whole call  without saving anything.
 * @param inviteUsersAsVisitors What a user joining through a trusted domain becomes: `true` admits them as a guest, `false` as a full  member. It applies to joins made from now on and does not change anybody who has already joined.
 */


data class MailDomainSettingsRequestsDto (

    @Json(name = "type")
    val type: TenantTrustedDomainsType,

    @Json(name = "domains")
    val domains: kotlin.collections.List<kotlin.String>?,

    @Json(name = "inviteUsersAsVisitors")
    val inviteUsersAsVisitors: kotlin.Boolean

) {


}

