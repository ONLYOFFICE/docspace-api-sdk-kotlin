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

import onlyoffice.docspace.api.sdk.models.TenantIndustry
import onlyoffice.docspace.api.sdk.models.TenantStatus
import onlyoffice.docspace.api.sdk.models.TenantTrustedDomainsType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The record of one portal: its name, owner, language, time zone and lifecycle state.
 *
 * @param affiliateId The partner the portal was signed up through, empty for a portal that came in directly. It is bookkeeping  for the vendor and has no bearing on what the portal may do.
 * @param tenantAlias The portal's own name within the installation, which together with the installation's base domain forms  the address it is reached at. A caller without the portal-settings right gets `tenantId` alone, so an  empty value here is the sign that the rest of this object was withheld rather than unset.
 * @param calls Whether telephony is switched on for the portal. It is carried over from portal registration and stays  `false` on a DocSpace portal, where the feature does not exist.
 * @param campaign The marketing campaign the portal was signed up under, empty for a portal that came in outside one. Like  `affiliateId`, it is bookkeeping only.
 * @param creationDateTime When the portal was created, in UTC rather than in the portal time zone.
 * @param hostedRegion The data-centre region written on the portal record itself, as opposed to `region`, which is looked up  from the hosting service. It is empty on a server installation.
 * @param tenantId The numeric identifier of the portal inside the installation. It is the one field every caller gets,  whatever their rights.
 * @param industry The line of business chosen when the portal was created. It only steers what the vendor suggests and  restricts nothing.
 * @param language The default language of the portal as a culture name, the same value `GET api/2.0/settings` reports as  `culture`. A member may have a language of their own, which this does not reflect.
 * @param lastModified When any field of this record last changed, in UTC. It does not move when portal settings outside this  record are changed.
 * @param mappedDomain The custom domain the portal answers on in addition to its own address, empty when none has been set up.
 * @param name The portal title as shown to people, which is what `GET api/2.0/settings` returns as  `greetingSettings`. It is free text, unlike `tenantAlias`, and empty until someone sets it.
 * @param ownerId The portal owner, the one account that cannot be removed or demoted.  `PUT api/2.0/settings/owner` hands the role over.
 * @param paymentId The portal's identifier in the billing system, empty for a portal that has never been billed. The  subscription itself is read with `GET api/2.0/portal/tariff`.
 * @param spam Whether the owner agreed to receive the vendor's newsletter. Despite the name it does not mark the portal  as a spammer and affects nothing but marketing mail.
 * @param status The lifecycle state of the portal. Anything other than active means most operations are refused for the  moment, because the portal is being transferred, restored, encrypted or removed.
 * @param statusChangeDate When `status` last changed, in UTC. For a portal pending removal it is the moment the countdown to  deletion started.
 * @param timeZone The portal time zone, which is the zone the dates this API calls portal time are expressed in. It may be  stored as a Windows identifier here, while `GET api/2.0/settings` always reports the IANA form.
 * @param trustedDomains The mail domains a new member may register or be invited from without confirming the address. It is empty  whenever `trustedDomainsType` is not `Custom`.
 * @param trustedDomainsRaw The same domains as the single stored string they are kept in, separated by commas. Read  `trustedDomains` instead; this one exists because it is what the record holds.
 * @param trustedDomainsType How the mail domains are applied: no domain trusted, every domain trusted, or only the listed ones. Only  the last of the three makes `trustedDomains` meaningful.
 * @param version The identifier of the portal version the installation pins this portal to, which is an internal number  and not the product version string that `GET api/2.0/settings` reports as `version`.
 * @param versionChanged When `version` last changed, in UTC. It stays at its zero value on a portal whose version has never been  switched.
 * @param region The data-centre region the portal is actually served from, looked up from the hosting service. It is  empty on a server installation and also whenever the installation's portal cache is switched off, so an  empty value does not mean the portal has no region - `hostedRegion` is the value from the record itself.
 */


data class TenantDto (

    @Json(name = "affiliateId")
    val affiliateId: kotlin.String? = null,

    @Json(name = "tenantAlias")
    val tenantAlias: kotlin.String? = null,

    @Json(name = "calls")
    val calls: kotlin.Boolean? = null,

    @Json(name = "campaign")
    val campaign: kotlin.String? = null,

    @Json(name = "creationDateTime")
    val creationDateTime: java.time.OffsetDateTime? = null,

    @Json(name = "hostedRegion")
    val hostedRegion: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    @Json(name = "industry")
    val industry: TenantIndustry? = null,

    @Json(name = "language")
    val language: kotlin.String? = null,

    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null,

    @Json(name = "mappedDomain")
    val mappedDomain: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "ownerId")
    val ownerId: java.util.UUID? = null,

    @Json(name = "paymentId")
    val paymentId: kotlin.String? = null,

    @Json(name = "spam")
    val spam: kotlin.Boolean? = null,

    @Json(name = "status")
    val status: TenantStatus? = null,

    @Json(name = "statusChangeDate")
    val statusChangeDate: java.time.OffsetDateTime? = null,

    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,

    @Json(name = "trustedDomains")
    val trustedDomains: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "trustedDomainsRaw")
    val trustedDomainsRaw: kotlin.String? = null,

    @Json(name = "trustedDomainsType")
    val trustedDomainsType: TenantTrustedDomainsType? = null,

    @Json(name = "version")
    val version: kotlin.Int? = null,

    @Json(name = "versionChanged")
    val versionChanged: java.time.OffsetDateTime? = null,

    @Json(name = "region")
    val region: kotlin.String? = null

) {


}

