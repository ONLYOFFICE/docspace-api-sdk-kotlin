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
 * @param industry 
 * @param language The tenant language.
 * @param lastModified The date and time when the tenant was last modified.
 * @param mappedDomain The tenant mapped domain.
 * @param name The tenant name.
 * @param ownerId The tenant owner ID.
 * @param paymentId The tenant payment ID.
 * @param spam Specifies if the ONLYOFFICE newsletter is allowed or not.
 * @param status 
 * @param statusChangeDate The date and time when the tenant status was changed.
 * @param timeZone The tenant time zone.
 * @param trustedDomains The list of tenant trusted domains.
 * @param trustedDomainsRaw The tenant trusted domains in the string format.
 * @param trustedDomainsType 
 * @param version The tenant version
 * @param versionChanged The date and time when the tenant version was changed.
 * @param region The tenant AWS region.
 */


data class TenantDto (

    /* The affiliate ID. */
    @Json(name = "affiliateId")
    val affiliateId: kotlin.String? = null,

    /* The tenant alias. */
    @Json(name = "tenantAlias")
    val tenantAlias: kotlin.String? = null,

    /* Specifies if the calls are available for this tenant or not. */
    @Json(name = "calls")
    val calls: kotlin.Boolean? = null,

    /* The tenant campaign. */
    @Json(name = "campaign")
    val campaign: kotlin.String? = null,

    /* The tenant creation date and time. */
    @Json(name = "creationDateTime")
    val creationDateTime: java.time.OffsetDateTime? = null,

    /* The hosted region. */
    @Json(name = "hostedRegion")
    val hostedRegion: kotlin.String? = null,

    /* The tenant ID. */
    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    @Json(name = "industry")
    val industry: TenantIndustry? = null,

    /* The tenant language. */
    @Json(name = "language")
    val language: kotlin.String? = null,

    /* The date and time when the tenant was last modified. */
    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null,

    /* The tenant mapped domain. */
    @Json(name = "mappedDomain")
    val mappedDomain: kotlin.String? = null,

    /* The tenant name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The tenant owner ID. */
    @Json(name = "ownerId")
    val ownerId: java.util.UUID? = null,

    /* The tenant payment ID. */
    @Json(name = "paymentId")
    val paymentId: kotlin.String? = null,

    /* Specifies if the ONLYOFFICE newsletter is allowed or not. */
    @Json(name = "spam")
    val spam: kotlin.Boolean? = null,

    @Json(name = "status")
    val status: TenantStatus? = null,

    /* The date and time when the tenant status was changed. */
    @Json(name = "statusChangeDate")
    val statusChangeDate: java.time.OffsetDateTime? = null,

    /* The tenant time zone. */
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,

    /* The list of tenant trusted domains. */
    @Json(name = "trustedDomains")
    val trustedDomains: kotlin.collections.List<kotlin.String>? = null,

    /* The tenant trusted domains in the string format. */
    @Json(name = "trustedDomainsRaw")
    val trustedDomainsRaw: kotlin.String? = null,

    @Json(name = "trustedDomainsType")
    val trustedDomainsType: TenantTrustedDomainsType? = null,

    /* The tenant version */
    @Json(name = "version")
    val version: kotlin.Int? = null,

    /* The date and time when the tenant version was changed. */
    @Json(name = "versionChanged")
    val versionChanged: java.time.OffsetDateTime? = null,

    /* The tenant AWS region. */
    @Json(name = "region")
    val region: kotlin.String? = null

) {


}

