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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name The client name.
 * @param description The client description.
 * @param tenant The tenant ID associated with the client.
 * @param scopes The client scopes.
 * @param enabled Specifies if the client is currently enabled or not.
 * @param clientId The client identifier issued to the client during registration.
 * @param clientSecret The client secret issued to the client during registration.
 * @param websiteUrl The URL to the client's website.
 * @param termsUrl The URL to the client's terms of service.
 * @param policyUrl The URL to the client's privacy policy.
 * @param logo The URL to the client's logo.
 * @param authenticationMethods The authentication methods supported by the client.
 * @param redirectUris The list of allowed redirect URIs.
 * @param allowedOrigins The list of allowed CORS origins.
 * @param logoutRedirectUris The list of allowed logout redirect URIs.
 * @param createdOn The date and time when the client was created.
 * @param createdBy The user who created the client.
 * @param modifiedOn The date and time when the client was last modified.
 * @param modifiedBy The user who last modified the client.
 * @param isPublic Indicates whether the client is accessible by third-party tenants.
 */


data class ClientResponse (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "tenant")
    val tenant: kotlin.Long? = null,

    @Json(name = "scopes")
    val scopes: kotlin.collections.Set<kotlin.String>? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    @Json(name = "client_secret")
    val clientSecret: kotlin.String? = null,

    @Json(name = "website_url")
    val websiteUrl: kotlin.String? = null,

    @Json(name = "terms_url")
    val termsUrl: kotlin.String? = null,

    @Json(name = "policy_url")
    val policyUrl: kotlin.String? = null,

    @Json(name = "logo")
    val logo: kotlin.String? = null,

    @Json(name = "authentication_methods")
    val authenticationMethods: kotlin.collections.Set<kotlin.String>? = null,

    @Json(name = "redirect_uris")
    val redirectUris: kotlin.collections.Set<kotlin.String>? = null,

    @Json(name = "allowed_origins")
    val allowedOrigins: kotlin.collections.Set<kotlin.String>? = null,

    @Json(name = "logout_redirect_uris")
    val logoutRedirectUris: kotlin.collections.Set<kotlin.String>? = null,

    @Json(name = "created_on")
    val createdOn: java.time.OffsetDateTime? = null,

    @Json(name = "created_by")
    val createdBy: kotlin.String? = null,

    @Json(name = "modified_on")
    val modifiedOn: java.time.OffsetDateTime? = null,

    @Json(name = "modified_by")
    val modifiedBy: kotlin.String? = null,

    @Json(name = "is_public")
    val isPublic: kotlin.Boolean? = null

) {


}

