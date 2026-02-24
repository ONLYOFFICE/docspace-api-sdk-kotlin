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

import onlyoffice.docspace.api.sdk.models.TenantDevToolsAccessSettingsWrapper

interface AccessToDevToolsApi {
    /**
     * GET api/2.0/settings/devtoolsaccess
     * Get the Developer Tools access settings
     * Returns the Developer Tools access settings for the portal.
     * Responses:
     *  - 200: Developer Tools access settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getTenantAccessDevToolsSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-access-dev-tools-settings/
     *
     *
     * @return [Call]<[TenantDevToolsAccessSettingsWrapper]>
     */
    @GET("api/2.0/settings/devtoolsaccess")
    fun getTenantAccessDevToolsSettings(): Call<TenantDevToolsAccessSettingsWrapper>

}
