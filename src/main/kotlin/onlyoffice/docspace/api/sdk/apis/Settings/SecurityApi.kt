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


package onlyoffice.docspace.api.sdk.apis.Settings

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.EmployeeArrayWrapper
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.PasswordSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.PasswordSettingsWrapper
import onlyoffice.docspace.api.sdk.models.ProductAdministratorWrapper
import onlyoffice.docspace.api.sdk.models.SecurityArrayWrapper
import onlyoffice.docspace.api.sdk.models.SecurityRequestsDto
import onlyoffice.docspace.api.sdk.models.WebItemSecurityRequestsDto
import onlyoffice.docspace.api.sdk.models.WebItemsSecurityRequestsDto

interface SecurityApi {
    /**
     * GET api/2.0/settings/security/modules
     * Get the enabled modules
     * Returns a list of all the enabled modules.
     * Responses:
     *  - 200: List of enabled modules
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getEnabledModules Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-enabled-modules/
     *
     *
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/settings/security/modules")
    suspend fun getEnabledModules(): Response<ObjectWrapper>

    /**
     * GET api/2.0/settings/security/administrator
     * Check a product administrator
     * Checks if the selected user is an administrator of a product with the ID specified in the request.
     * Responses:
     *  - 200: Object with the user security information: product ID, user ID, administrator or not
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getIsProductAdministrator Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-product-administrator/
     *
     *
     * @param productid The ID of the product extracted from the query parameters.
     * @param userid The user ID extracted from the query parameters.
     * @return [ProductAdministratorWrapper]
     */
    @GET("api/2.0/settings/security/administrator")
    suspend fun getIsProductAdministrator(@Query("productid") productid: java.util.UUID, @Query("userid") userid: java.util.UUID): Response<ProductAdministratorWrapper>

    /**
     * GET api/2.0/settings/security/password
     * Get the password settings
     * Returns the portal password settings.
     * Responses:
     *  - 200: Password settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPasswordSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-password-settings/
     *
     *
     * @return [PasswordSettingsWrapper]
     */
    @GET("api/2.0/settings/security/password")
    suspend fun getPasswordSettings(): Response<PasswordSettingsWrapper>

    /**
     * GET api/2.0/settings/security/administrator/{productid}
     * Get the product administrators
     * Returns a list of all the administrators of a product with the ID specified in the request.
     * Responses:
     *  - 200: List of product administrators with the following parameters
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getProductAdministrators Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-product-administrators/
     *
     *
     * @param productid The ID of the product extracted from the route parameters.
     * @return [EmployeeArrayWrapper]
     */
    @GET("api/2.0/settings/security/administrator/{productid}")
    suspend fun getProductAdministrators(@Path("productid") productid: java.util.UUID): Response<EmployeeArrayWrapper>

    /**
     * GET api/2.0/settings/security/{id}
     * Get the module availability
     * Returns the availability of the module with the ID specified in the request.
     * Responses:
     *  - 200: Boolean value: true - module is enabled, false - module is disabled
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getWebItemSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-item-security-info/
     *
     *
     * @param id The ID extracted from the route parameters.
     * @return [BooleanWrapper]
     */
    @GET("api/2.0/settings/security/{id}")
    suspend fun getWebItemSecurityInfo(@Path("id") id: java.util.UUID): Response<BooleanWrapper>

    /**
     * GET api/2.0/settings/security
     * Get the security settings
     * Returns the security settings for the modules specified in the request.
     * Responses:
     *  - 200: Security settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getWebItemSettingsSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-item-settings-security-info/
     *
     *
     * @param ids The list of module identifiers for which to retrieve the security settings. (optional)
     * @return [SecurityArrayWrapper]
     */
    @GET("api/2.0/settings/security")
    suspend fun getWebItemSettingsSecurityInfo(@Query("ids") ids: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null): Response<SecurityArrayWrapper>

    /**
     * PUT api/2.0/settings/security/access
     * Set the security settings to modules
     * Sets the security settings to the modules with the IDs specified in the request.
     * Responses:
     *  - 200: Security settings
     *  - 403: Security settings are disabled for an open portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setAccessToWebItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-access-to-web-items/
     *
     *
     * @param webItemsSecurityRequestsDto  (optional)
     * @return [SecurityArrayWrapper]
     */
    @PUT("api/2.0/settings/security/access")
    suspend fun setAccessToWebItems(@Body webItemsSecurityRequestsDto: WebItemsSecurityRequestsDto? = null): Response<SecurityArrayWrapper>

    /**
     * PUT api/2.0/settings/security/administrator
     * Set a product administrator
     * Sets the selected user as an administrator of a product with the ID specified in the request.
     * Responses:
     *  - 200: Object with the user security information: product ID, user ID, administrator or not
     *  - 402: Your pricing plan does not support this option
     *  - 403: Only portal owner can set user as administrator
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setProductAdministrator Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-product-administrator/
     *
     *
     * @param securityRequestsDto  (optional)
     * @return [ProductAdministratorWrapper]
     */
    @PUT("api/2.0/settings/security/administrator")
    suspend fun setProductAdministrator(@Body securityRequestsDto: SecurityRequestsDto? = null): Response<ProductAdministratorWrapper>

    /**
     * PUT api/2.0/settings/security
     * Set the module security settings
     * Sets the security settings to the module with the ID specified in the request.
     * Responses:
     *  - 200: Security settings
     *  - 403: Security settings are disabled for an open portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setWebItemSecurity Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-web-item-security/
     *
     *
     * @param webItemSecurityRequestsDto  (optional)
     * @return [SecurityArrayWrapper]
     */
    @PUT("api/2.0/settings/security")
    suspend fun setWebItemSecurity(@Body webItemSecurityRequestsDto: WebItemSecurityRequestsDto? = null): Response<SecurityArrayWrapper>

    /**
     * PUT api/2.0/settings/security/password
     * Set the password settings
     * Sets the portal password settings.
     * Responses:
     *  - 200: Password settings
     *  - 400: MinLength
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updatePasswordSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-password-settings/
     *
     *
     * @param passwordSettingsRequestsDto  (optional)
     * @return [PasswordSettingsWrapper]
     */
    @PUT("api/2.0/settings/security/password")
    suspend fun updatePasswordSettings(@Body passwordSettingsRequestsDto: PasswordSettingsRequestsDto? = null): Response<PasswordSettingsWrapper>

}
