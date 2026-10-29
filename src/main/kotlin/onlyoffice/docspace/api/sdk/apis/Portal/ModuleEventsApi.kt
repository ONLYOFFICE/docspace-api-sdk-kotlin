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


package onlyoffice.docspace.api.sdk.apis.Portal

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.SendModuleEventRequest

interface ModuleEventsApi {
    /**
     * POST api/2.0/portal/moduleevents
     * Send a module event
     * Delivers one event from an integration module to the browsers of the portal named by the request host, over  the socket connection every open DocSpace page already keeps. No user session is needed: the caller  identifies itself with the module key in the `X-Module-Key` header, which the installation administrator  issues and allows for a list of portals. Set exactly one addressee - `user`, the e-mail of a portal user,  reaches only that user's open sessions without any subscription, and `room` reaches everyone in the portal  subscribed to `plugin-{module}-{room}`. Browsers receive `plugin:{module}:{event}` with `{ message }`, the  module name taken from the key, never from the body. The call only hands the event over: nothing is stored,  a user with no open session never sees it, and a repeated call delivers it again. Keep `message` a signal to  re-read, such as an unread count. The body is limited to 64 KB. A missing or unknown key fails with 401, a  portal the key is not allowed for with 403, an unknown or inactive user with 404, and invalid names or not  exactly one addressee with 400.
     * Responses:
     *  - 200: The event was handed to the socket service for delivery
     *  - 400: The body is missing, the event or room name is invalid, or there is not exactly one addressee
     *  - 401: The X-Module-Key header is missing or matches no configured module
     *  - 402: The portal's payment has lapsed
     *  - 403: The module key is not allowed for this portal
     *  - 404: No active user of this portal has the given e-mail
     *  - 413: The body is larger than 64 KB
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for sendModuleEvent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-module-event/
     *
     *
     * @param xModuleKey The secret key the installation administrator issued to the module. It is not a user or portal credential:  the module the event belongs to is the one this key is configured for, so the key is the module's identity. (optional)
     * @param sendModuleEventRequest The event to deliver. (optional)
     * @return [Unit]
     */
    @POST("api/2.0/portal/moduleevents")
    suspend fun sendModuleEvent(@Header("x-Module-Key") xModuleKey: kotlin.String? = null, @Body sendModuleEventRequest: SendModuleEventRequest? = null): Response<Unit>

}
