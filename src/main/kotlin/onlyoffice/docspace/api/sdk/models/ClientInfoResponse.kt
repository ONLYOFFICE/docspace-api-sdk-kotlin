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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The response containing public client information.
 *
 * @param name The client name.
 * @param description The client description.
 * @param scopes The client scopes.
 * @param clientId The client ID.
 * @param websiteUrl The URL to the client's website
 * @param termsUrl The URL to the client's terms of service.
 * @param policyUrl The URL to the client's privacy policy.
 * @param logo The client logo in base64 format.
 * @param authenticationMethods The authentication methods supported by the client.
 * @param isPublic Indicates whether the client is accessible by third-party tenants.
 * @param createdOn The date and time when the client was created.
 * @param createdBy The user who created the client.
 * @param modifiedOn The date and time when the client was last modified.
 * @param modifiedBy The user who last modified the client.
 */


data class ClientInfoResponse (

    /* The client name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The client description. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* The client scopes. */
    @Json(name = "scopes")
    val scopes: kotlin.collections.Set<kotlin.String>? = null,

    /* The client ID. */
    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    /* The URL to the client's website */
    @Json(name = "website_url")
    val websiteUrl: kotlin.String? = null,

    /* The URL to the client's terms of service. */
    @Json(name = "terms_url")
    val termsUrl: kotlin.String? = null,

    /* The URL to the client's privacy policy. */
    @Json(name = "policy_url")
    val policyUrl: kotlin.String? = null,

    /* The client logo in base64 format. */
    @Json(name = "logo")
    val logo: kotlin.String? = null,

    /* The authentication methods supported by the client. */
    @Json(name = "authentication_methods")
    val authenticationMethods: kotlin.collections.Set<kotlin.String>? = null,

    /* Indicates whether the client is accessible by third-party tenants. */
    @Json(name = "is_public")
    val isPublic: kotlin.Boolean? = null,

    /* The date and time when the client was created. */
    @Json(name = "created_on")
    val createdOn: java.time.OffsetDateTime? = null,

    /* The user who created the client. */
    @Json(name = "created_by")
    val createdBy: kotlin.String? = null,

    /* The date and time when the client was last modified. */
    @Json(name = "modified_on")
    val modifiedOn: java.time.OffsetDateTime? = null,

    /* The user who last modified the client. */
    @Json(name = "modified_by")
    val modifiedBy: kotlin.String? = null

) {


}

