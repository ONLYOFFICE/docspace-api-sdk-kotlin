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

import onlyoffice.docspace.api.sdk.models.IPRestrictionArrayWrapper
import onlyoffice.docspace.api.sdk.models.IPRestrictionsSettingsWrapper
import onlyoffice.docspace.api.sdk.models.IpRestrictionsDto
import onlyoffice.docspace.api.sdk.models.IpRestrictionsWrapper

interface IPRestrictionsApi {
    /**
     * GET api/2.0/settings/iprestrictions
     * Get the IP portal restrictions
     * Returns the IP portal restrictions.
     * Responses:
     *  - 200: List of IP restrictions parameters
     *  - 401: Unauthorized
     *
     * REST API Reference for getIpRestrictions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ip-restrictions/
     *
     *
     * @return [Call]<[IPRestrictionArrayWrapper]>
     */
    @GET("api/2.0/settings/iprestrictions")
    fun getIpRestrictions(): Call<IPRestrictionArrayWrapper>

    /**
     * GET api/2.0/settings/iprestrictions/settings
     * Get the IP restriction settings
     * Returns the IP restriction settings.
     * Responses:
     *  - 200: IP restriction settings
     *  - 401: Unauthorized
     *
     * REST API Reference for readIpRestrictionsSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/read-ip-restrictions-settings/
     *
     *
     * @return [Call]<[IPRestrictionsSettingsWrapper]>
     */
    @GET("api/2.0/settings/iprestrictions/settings")
    fun readIpRestrictionsSettings(): Call<IPRestrictionsSettingsWrapper>

    /**
     * PUT api/2.0/settings/iprestrictions
     * Update the IP restrictions
     * Updates the IP restrictions with the parameters specified in the request.
     * Responses:
     *  - 200: Updated IP restriction settings
     *  - 401: Unauthorized
     *
     * REST API Reference for saveIpRestrictions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-ip-restrictions/
     *
     *
     * @param ipRestrictionsDto  (optional)
     * @return [Call]<[IpRestrictionsWrapper]>
     */
    @PUT("api/2.0/settings/iprestrictions")
    fun saveIpRestrictions(@Body ipRestrictionsDto: IpRestrictionsDto? = null): Call<IpRestrictionsWrapper>

    /**
     * PUT api/2.0/settings/iprestrictions/settings
     * Update the IP restriction settings
     * Updates the IP restriction settings with the parameters specified in the request.
     * Responses:
     *  - 200: Updated IP restriction settings
     *  - 401: Unauthorized
     *
     * REST API Reference for updateIpRestrictionsSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-ip-restrictions-settings/
     *
     *
     * @param ipRestrictionsDto  (optional)
     * @return [Call]<[IpRestrictionsWrapper]>
     */
    @PUT("api/2.0/settings/iprestrictions/settings")
    fun updateIpRestrictionsSettings(@Body ipRestrictionsDto: IpRestrictionsDto? = null): Call<IpRestrictionsWrapper>

}
