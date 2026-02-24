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

import onlyoffice.docspace.api.sdk.models.DbTenantPartner
import onlyoffice.docspace.api.sdk.models.TenantIndustry
import onlyoffice.docspace.api.sdk.models.TenantStatus
import onlyoffice.docspace.api.sdk.models.TenantTrustedDomainsType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The database tenant parameters.
 *
 * @param id The tenant ID.
 * @param name The tenant name.
 * @param alias The tenant alias.
 * @param mappedDomain Mapped domain
 * @param version The tenant version.
 * @param versionChangedField The Version_changed field.
 * @param versionChanged The date and time when the version was changed.
 * @param language The tenant language.
 * @param timeZone The tenant time zone.
 * @param trustedDomainsRaw The tenant trusted domains raw.
 * @param trustedDomainsEnabled 
 * @param status 
 * @param statusChanged The date and time when the tenant status was changed.
 * @param statusChangedHack The hacked date and time when the tenant status was changed.
 * @param creationDateTime The tenant creation date.
 * @param ownerId The tenant owner ID.
 * @param paymentId The tenant payment ID.
 * @param industry 
 * @param lastModified The date and time when the tenant was last modified.
 * @param calls Specifies if the calls are available for the current tenant or not.
 * @param partner 
 */


data class DbTenant (

    /* The tenant ID. */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* The tenant name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The tenant alias. */
    @Json(name = "alias")
    val alias: kotlin.String? = null,

    /* Mapped domain */
    @Json(name = "mappedDomain")
    val mappedDomain: kotlin.String? = null,

    /* The tenant version. */
    @Json(name = "version")
    val version: kotlin.Int? = null,

    /* The Version_changed field. */
    @Json(name = "version_Changed")
    val versionChangedField: java.time.OffsetDateTime? = null,

    /* The date and time when the version was changed. */
    @Json(name = "versionChanged")
    val versionChanged: java.time.OffsetDateTime? = null,

    /* The tenant language. */
    @Json(name = "language")
    val language: kotlin.String? = null,

    /* The tenant time zone. */
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,

    /* The tenant trusted domains raw. */
    @Json(name = "trustedDomainsRaw")
    val trustedDomainsRaw: kotlin.String? = null,

    @Json(name = "trustedDomainsEnabled")
    val trustedDomainsEnabled: TenantTrustedDomainsType? = null,

    @Json(name = "status")
    val status: TenantStatus? = null,

    /* The date and time when the tenant status was changed. */
    @Json(name = "statusChanged")
    val statusChanged: java.time.OffsetDateTime? = null,

    /* The hacked date and time when the tenant status was changed. */
    @Json(name = "statusChangedHack")
    val statusChangedHack: java.time.OffsetDateTime? = null,

    /* The tenant creation date. */
    @Json(name = "creationDateTime")
    val creationDateTime: java.time.OffsetDateTime? = null,

    /* The tenant owner ID. */
    @Json(name = "ownerId")
    val ownerId: java.util.UUID? = null,

    /* The tenant payment ID. */
    @Json(name = "paymentId")
    val paymentId: kotlin.String? = null,

    @Json(name = "industry")
    val industry: TenantIndustry? = null,

    /* The date and time when the tenant was last modified. */
    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null,

    /* Specifies if the calls are available for the current tenant or not. */
    @Json(name = "calls")
    val calls: kotlin.Boolean? = null,

    @Json(name = "partner")
    val partner: DbTenantPartner? = null

) {


}

