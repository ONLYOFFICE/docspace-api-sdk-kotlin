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
 * The tenant parameters.
 *
 * @param affiliateId The affiliate ID.
 * @param tenantAlias The tenant alias.
 * @param calls Specifies if the calls are available for this tenant or not.
 * @param campaign The tenant campaign.
 * @param creationDateTime The tenant creation date and time.
 * @param hostedRegion The hosted region.
 * @param tenantId The tenant ID.
 * @param industry The tenant industry.
 * @param language The tenant language.
 * @param lastModified The date and time when the tenant was last modified.
 * @param mappedDomain The tenant mapped domain.
 * @param name The tenant name.
 * @param ownerId The tenant owner ID.
 * @param paymentId The tenant payment ID.
 * @param spam Specifies if the ONLYOFFICE newsletter is allowed or not.
 * @param status The tenant status.
 * @param statusChangeDate The date and time when the tenant status was changed.
 * @param timeZone The tenant time zone.
 * @param trustedDomains The list of tenant trusted domains.
 * @param trustedDomainsRaw The tenant trusted domains in the string format.
 * @param trustedDomainsType The type of the tenant trusted domains.
 * @param version The tenant version
 * @param versionChanged The date and time when the tenant version was changed.
 * @param region The tenant AWS region.
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

