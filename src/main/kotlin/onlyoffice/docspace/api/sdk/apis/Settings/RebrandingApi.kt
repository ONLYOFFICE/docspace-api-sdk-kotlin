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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AdditionalWhiteLabelSettingsWrapper
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.CompanyWhiteLabelSettingsArrayWrapper
import onlyoffice.docspace.api.sdk.models.CompanyWhiteLabelSettingsWrapper
import onlyoffice.docspace.api.sdk.models.IsDefaultWhiteLabelLogosArrayWrapper
import onlyoffice.docspace.api.sdk.models.IsDefaultWhiteLabelLogosWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.WhiteLabelItemArrayWrapper
import onlyoffice.docspace.api.sdk.models.WhiteLabelRequestsDto

interface RebrandingApi {
    /**
     * DELETE api/2.0/settings/rebranding/additional
     * Delete the additional white label settings
     * Deletes the additional white label settings.
     * Responses:
     *  - 200: Default additional white label settings
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for deleteAdditionalWhiteLabelSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-additional-white-label-settings/
     *
     *
     * @return [Call]<[AdditionalWhiteLabelSettingsWrapper]>
     */
    @DELETE("api/2.0/settings/rebranding/additional")
    fun deleteAdditionalWhiteLabelSettings(): Call<AdditionalWhiteLabelSettingsWrapper>

    /**
     * DELETE api/2.0/settings/rebranding/company
     * Delete the company white label settings
     * Deletes the company white label settings.
     * Responses:
     *  - 200: Default company white label settings
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for deleteCompanyWhiteLabelSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-company-white-label-settings/
     *
     *
     * @return [Call]<[CompanyWhiteLabelSettingsWrapper]>
     */
    @DELETE("api/2.0/settings/rebranding/company")
    fun deleteCompanyWhiteLabelSettings(): Call<CompanyWhiteLabelSettingsWrapper>

    /**
     * GET api/2.0/settings/rebranding/additional
     * Get the additional white label settings
     * Returns the additional white label settings.
     * Responses:
     *  - 200: Additional white label settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getAdditionalWhiteLabelSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-additional-white-label-settings/
     *
     *
     * @return [Call]<[AdditionalWhiteLabelSettingsWrapper]>
     */
    @GET("api/2.0/settings/rebranding/additional")
    fun getAdditionalWhiteLabelSettings(): Call<AdditionalWhiteLabelSettingsWrapper>

    /**
     * GET api/2.0/settings/rebranding/company
     * Get the company white label settings
     * Returns the company white label settings.
     * Responses:
     *  - 200: Company white label settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getCompanyWhiteLabelSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-company-white-label-settings/
     *
     *
     * @return [Call]<[CompanyWhiteLabelSettingsWrapper]>
     */
    @GET("api/2.0/settings/rebranding/company")
    fun getCompanyWhiteLabelSettings(): Call<CompanyWhiteLabelSettingsWrapper>

    /**
     * GET api/2.0/settings/enablewhitelabel
     * Check the white label availability
     * Checks if the white label is enabled or not.
     * Responses:
     *  - 200: Boolean value: true if the white label is enabled
     *  - 401: Unauthorized
     *
     * REST API Reference for getEnableWhitelabel Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-enable-whitelabel/
     *
     *
     * @return [Call]<[BooleanWrapper]>
     */
    @GET("api/2.0/settings/enablewhitelabel")
    fun getEnableWhitelabel(): Call<BooleanWrapper>

    /**
     * GET api/2.0/settings/whitelabel/logotext/isdefault
     * Check the default white label logo text
     * Specifies if the white label logo text is default or not.
     * Responses:
     *  - 200: Request properties of white label logos
     *  - 401: Unauthorized
     *
     * REST API Reference for getIsDefaultWhiteLabelLogoText Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-white-label-logo-text/
     *
     *
     * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
     * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
     * @return [Call]<[IsDefaultWhiteLabelLogosWrapper]>
     */
    @GET("api/2.0/settings/whitelabel/logotext/isdefault")
    fun getIsDefaultWhiteLabelLogoText(@Query("IsDark") isDark: kotlin.Boolean? = null, @Query("IsDefault") isDefault: kotlin.Boolean? = null): Call<IsDefaultWhiteLabelLogosWrapper>

    /**
     * GET api/2.0/settings/whitelabel/logos/isdefault
     * Check the default white label logos
     * Specifies if the white label logos are default or not.
     * Responses:
     *  - 200: Request properties of white label logos
     *  - 401: Unauthorized
     *
     * REST API Reference for getIsDefaultWhiteLabelLogos Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-white-label-logos/
     *
     *
     * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
     * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
     * @return [Call]<[IsDefaultWhiteLabelLogosArrayWrapper]>
     */
    @GET("api/2.0/settings/whitelabel/logos/isdefault")
    fun getIsDefaultWhiteLabelLogos(@Query("IsDark") isDark: kotlin.Boolean? = null, @Query("IsDefault") isDefault: kotlin.Boolean? = null): Call<IsDefaultWhiteLabelLogosArrayWrapper>

    /**
     * GET api/2.0/settings/companywhitelabel
     * Get the licensor data
     * Returns the licensor data.
     * Responses:
     *  - 200: List of company white label settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getLicensorData Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-licensor-data/
     *
     *
     * @return [Call]<[CompanyWhiteLabelSettingsArrayWrapper]>
     */
    @GET("api/2.0/settings/companywhitelabel")
    fun getLicensorData(): Call<CompanyWhiteLabelSettingsArrayWrapper>

    /**
     * GET api/2.0/settings/whitelabel/logotext
     * Get the white label logo text
     * Returns the white label logo text.
     * Responses:
     *  - 200: Logo text
     *  - 401: Unauthorized
     *
     * REST API Reference for getWhiteLabelLogoText Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-white-label-logo-text/
     *
     *
     * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
     * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
     * @return [Call]<[StringWrapper]>
     */
    @GET("api/2.0/settings/whitelabel/logotext")
    fun getWhiteLabelLogoText(@Query("IsDark") isDark: kotlin.Boolean? = null, @Query("IsDefault") isDefault: kotlin.Boolean? = null): Call<StringWrapper>

    /**
     * GET api/2.0/settings/whitelabel/logos
     * Get the white label logos
     * Returns the white label logos.
     * Responses:
     *  - 200: White label logos
     *
     * REST API Reference for getWhiteLabelLogos Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-white-label-logos/
     *
     *
     * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
     * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
     * @return [Call]<[WhiteLabelItemArrayWrapper]>
     */
    @GET("api/2.0/settings/whitelabel/logos")
    fun getWhiteLabelLogos(@Query("IsDark") isDark: kotlin.Boolean? = null, @Query("IsDefault") isDefault: kotlin.Boolean? = null): Call<WhiteLabelItemArrayWrapper>

    /**
     * PUT api/2.0/settings/whitelabel/logotext/restore
     * Restore the white label logo text
     * Restores the white label logo text.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for restoreWhiteLabelLogoText Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-white-label-logo-text/
     *
     *
     * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
     * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/settings/whitelabel/logotext/restore")
    fun restoreWhiteLabelLogoText(@Query("IsDark") isDark: kotlin.Boolean? = null, @Query("IsDefault") isDefault: kotlin.Boolean? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/settings/whitelabel/logos/restore
     * Restore the white label logos
     * Restores the white label logos.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for restoreWhiteLabelLogos Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-white-label-logos/
     *
     *
     * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
     * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/settings/whitelabel/logos/restore")
    fun restoreWhiteLabelLogos(@Query("IsDark") isDark: kotlin.Boolean? = null, @Query("IsDefault") isDefault: kotlin.Boolean? = null): Call<BooleanWrapper>

    /**
     * POST api/2.0/settings/rebranding/additional
     * Save the additional white label settings
     * Saves the additional white label settings specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 400: Settings is empty
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for saveAdditionalWhiteLabelSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-additional-white-label-settings/
     *
     *
     * @param additionalWhiteLabelSettingsWrapper  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @POST("api/2.0/settings/rebranding/additional")
    fun saveAdditionalWhiteLabelSettings(@Body additionalWhiteLabelSettingsWrapper: AdditionalWhiteLabelSettingsWrapper? = null): Call<BooleanWrapper>

    /**
     * POST api/2.0/settings/rebranding/company
     * Save the company white label settings
     * Saves the company white label settings specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 400: Argument is empty or invalid
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for saveCompanyWhiteLabelSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-company-white-label-settings/
     *
     *
     * @param companyWhiteLabelSettingsWrapper  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @POST("api/2.0/settings/rebranding/company")
    fun saveCompanyWhiteLabelSettings(@Body companyWhiteLabelSettingsWrapper: CompanyWhiteLabelSettingsWrapper? = null): Call<BooleanWrapper>

    /**
     * POST api/2.0/settings/whitelabel/logotext/save
     * Save the white label logo text settings
     * Saves the white label logo text specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is sucessful
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for saveWhiteLabelLogoText Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-logo-text/
     *
     *
     * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
     * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
     * @param whiteLabelRequestsDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @POST("api/2.0/settings/whitelabel/logotext/save")
    fun saveWhiteLabelLogoText(@Query("IsDark") isDark: kotlin.Boolean? = null, @Query("IsDefault") isDefault: kotlin.Boolean? = null, @Body whiteLabelRequestsDto: WhiteLabelRequestsDto? = null): Call<BooleanWrapper>

    /**
     * POST api/2.0/settings/whitelabel/logos/save
     * Save the white label logos
     * Saves the white label logos specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is sucessful
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for saveWhiteLabelSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-settings/
     *
     *
     * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
     * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
     * @param whiteLabelRequestsDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @POST("api/2.0/settings/whitelabel/logos/save")
    fun saveWhiteLabelSettings(@Query("IsDark") isDark: kotlin.Boolean? = null, @Query("IsDefault") isDefault: kotlin.Boolean? = null, @Body whiteLabelRequestsDto: WhiteLabelRequestsDto? = null): Call<BooleanWrapper>

    /**
     * POST api/2.0/settings/whitelabel/logos/savefromfiles
     * Save the white label logos from files
     * Saves the white label logos from files.
     * Responses:
     *  - 200: Boolean value: true if the operation is sucessful
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *  - 409: No input files
     *
     * REST API Reference for saveWhiteLabelSettingsFromFiles Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-settings-from-files/
     *
     *
     * @param isDark Specifies if the white label logo is for the dark theme or not. (optional)
     * @param isDefault Specifies if the logo is for a default tenant or not. (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @POST("api/2.0/settings/whitelabel/logos/savefromfiles")
    fun saveWhiteLabelSettingsFromFiles(@Query("IsDark") isDark: kotlin.Boolean? = null, @Query("IsDefault") isDefault: kotlin.Boolean? = null): Call<BooleanWrapper>

}
