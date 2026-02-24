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


package onlyoffice.docspace.api.sdk.apis.Security

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.StringWrapper

interface OAuth2Api {
    /**
     * GET api/2.0/security/oauth2/token
     * Generate JWT token
     * Generates a JWT token for communication between login (client) and identity services.
     * Responses:
     *  - 200: Jwt Token
     *  - 401: Unauthorized
     *
     * REST API Reference for generateJwtToken Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/generate-jwt-token/
     *
     *
     * @return [Call]<[StringWrapper]>
     */
    @GET("api/2.0/security/oauth2/token")
    fun generateJwtToken(): Call<StringWrapper>

}
