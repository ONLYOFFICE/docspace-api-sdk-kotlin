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
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.FireBaseUserWrapper
import onlyoffice.docspace.api.sdk.models.FirebaseRequestsDto

interface FirebaseApi {
    /**
     * POST api/2.0/settings/push/docregisterdevice
     * Save the Documents Firebase device token
     * Saves the Firebase device token specified in the request for the Documents application.
     * Responses:
     *  - 200: FireBase user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for docRegisterPusnNotificationDevice Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/doc-register-pusn-notification-device/
     *
     *
     * @param firebaseRequestsDto  (optional)
     * @return [FireBaseUserWrapper]
     */
    @POST("api/2.0/settings/push/docregisterdevice")
    suspend fun docRegisterPusnNotificationDevice(@Body firebaseRequestsDto: FirebaseRequestsDto? = null): Response<FireBaseUserWrapper>

    /**
     * PUT api/2.0/settings/push/docsubscribe
     * Subscribe to Documents push notification
     * Subscribes to the Documents push notification.
     * Responses:
     *  - 200: FireBase user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for subscribeDocumentsPushNotification Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/subscribe-documents-push-notification/
     *
     *
     * @param firebaseRequestsDto  (optional)
     * @return [FireBaseUserWrapper]
     */
    @PUT("api/2.0/settings/push/docsubscribe")
    suspend fun subscribeDocumentsPushNotification(@Body firebaseRequestsDto: FirebaseRequestsDto? = null): Response<FireBaseUserWrapper>

}
