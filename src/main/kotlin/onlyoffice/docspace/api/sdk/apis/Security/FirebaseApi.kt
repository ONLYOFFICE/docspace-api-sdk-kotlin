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

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.FireBaseUserWrapper
import onlyoffice.docspace.api.sdk.models.FirebaseRequestsDto

interface FirebaseApi {
    /**
     * POST api/2.0/settings/push/docregisterdevice
     * Register a push device
     * Registers one mobile device of the calling user for the push notifications of the Documents application, by  storing the Firebase token that device was issued together with the initial `isSubscribed` state. The token is  handed out by Firebase to the mobile client, so obtain it there before calling: nothing here checks it, and it  is kept as an opaque string of up to 255 characters. Every signed-in member registers its own devices,  whatever its role - owner, administrator, user or guest - and a registration is bound to the caller and the  current portal, so another member's devices cannot be touched. The call is safe to repeat, but it is not an  update: a token already registered comes back as it stands and `isSubscribed` from the request is ignored, so  switch an existing registration on or off with `PUT api/2.0/settings/push/docsubscribe` instead. What comes  back is the stored registration, with `application` always `doc` and `isSubscribed` as stored. Only a  subscribed device is sent the room activity messages, such as an invitation to a room, a role change, an  archived room or a new document in a room, and only while the installation itself is configured with Firebase  credentials.
     * Responses:
     *  - 200: The stored device registration of the calling user, with the Firebase token, the `doc` application and the subscription state as they are kept
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
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
     * Set push subscription
     * Switches the push notifications of the Documents application on or off for one already registered device of  the calling user: send that device's Firebase token together with `isSubscribed` true to let the messages  through or false to stop them. The device has to be registered first with  `POST api/2.0/settings/push/docregisterdevice`, and only the subscription state is written - the token is  matched, never changed. Every signed-in member manages its own devices, whatever its role - owner,  administrator, user or guest - and a token that belongs to another member or to another portal is not matched  at all, so nothing of theirs can be switched. Repeating the call with the same pair leaves the registration as  it is. What comes back is the updated registration, while an empty response means no registration of the  caller carries that token and nothing was stored - register the device and call again. A device switched off  keeps its token stored but is left out of the delivery, and the other devices of the same member are  unaffected. Which kinds of notification the account receives at all is a separate setting, read with  `GET api/2.0/settings/notification/{type}`.
     * Responses:
     *  - 200: The device registration as it stands after the change, or an empty response when no registration of the calling user carries the token that was sent
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
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
