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
import onlyoffice.docspace.api.sdk.models.StringWrapper

import okhttp3.MultipartBody

interface LicenseApi {
    /**
     * POST api/2.0/settings/license/accept
     * Activate a license
     * Activates a license for the portal.
     * Responses:
     *  - 200: Message about the result of activating license
     *  - 401: Unauthorized
     *
     * REST API Reference for acceptLicense Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/accept-license/
     *
     *
     * @return [StringWrapper]
     */
    @POST("api/2.0/settings/license/accept")
    suspend fun acceptLicense(): Response<StringWrapper>

    /**
     * GET api/2.0/settings/license/required
     * Request a license
     * Requests a portal license if necessary.
     * Responses:
     *  - 200: Boolean value: true if the license is required
     *
     * REST API Reference for getIsLicenseRequired Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-license-required/
     *
     *
     * @return [BooleanWrapper]
     */
    @GET("api/2.0/settings/license/required")
    suspend fun getIsLicenseRequired(): Response<BooleanWrapper>

    /**
     * GET api/2.0/settings/license/refresh
     * Refresh the license
     * Refreshes the portal license.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
     *
     * REST API Reference for refreshLicense Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/refresh-license/
     *
     *
     * @return [BooleanWrapper]
     */
    @GET("api/2.0/settings/license/refresh")
    suspend fun refreshLicense(): Response<BooleanWrapper>

    /**
     * POST api/2.0/settings/license
     * Upload a license
     * Uploads a portal license specified in the request.
     * Responses:
     *  - 200: License
     *  - 400: The uploaded file could not be found
     *  - 403: Portal Access
     *  - 405: Your pricing plan does not support this option
     *  - 401: Unauthorized
     *
     * REST API Reference for uploadLicense Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-license/
     *
     *
     * @param files The list of license files to be uploaded.
     * @return [StringWrapper]
     */
    @Multipart
    @POST("api/2.0/settings/license")
    suspend fun uploadLicense(@Part files: List<MultipartBody.Part>): Response<StringWrapper>

}
