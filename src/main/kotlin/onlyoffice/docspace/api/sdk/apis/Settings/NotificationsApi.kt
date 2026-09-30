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

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.NotificationChannelStatusWrapper
import onlyoffice.docspace.api.sdk.models.NotificationSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.NotificationSettingsWrapper
import onlyoffice.docspace.api.sdk.models.NotificationType
import onlyoffice.docspace.api.sdk.models.RoomsNotificationSettingsWrapper
import onlyoffice.docspace.api.sdk.models.RoomsNotificationsSettingsRequestDto

interface NotificationsApi {
    /**
     * GET api/2.0/settings/notification/channels
     * Get notification channels
     * Lists the ways this installation can deliver a notification, each as the internal name of the channel together  with `isEnabled`: `email.sender` for letters and `telegram.sender` for Telegram messages. The list describes  the installation and the portal rather than the calling user, so every member gets the same answer, and the  call is read-only. Any signed-in member may ask for it, whatever its role, and no permission is demanded. A  channel appears only when the notification service of the running installation is configured with a sender of  that name, so the list can be shorter than the two names above, and an empty list means that configuration  names no channel this build implements. `email.sender` is reported as enabled whenever it is listed, while  `telegram.sender` is reported as enabled only while the portal has a Telegram bot name and token stored, which  is what `POST api/2.0/settings/authservice` writes. An enabled channel says nothing about the caller: a member  also has to connect their own Telegram account, for which `GET api/2.0/settings/telegram/link` hands out the  link and `GET api/2.0/settings/telegram/check` reports the outcome. Which kinds of notification a member  receives is a separate setting, read with `GET api/2.0/settings/notification/{type}`.
     * Responses:
     *  - 200: The notification channels this installation can deliver through, each with the flag that says whether it is enabled
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getNotificationChannels Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-notification-channels/
     *
     *
     * @return [NotificationChannelStatusWrapper]
     */
    @GET("api/2.0/settings/notification/channels")
    suspend fun getNotificationChannels(): Response<NotificationChannelStatusWrapper>

    /**
     * GET api/2.0/settings/notification/{type}
     * Check notification availability
     * Reports whether one kind of notification is switched on for the calling user, taking the kind as the integer  `type` in the route: 0 the new-item badges the Files responses carry, 1 the room activity letters, 2 the daily  feed digest, 3 the periodic tips letters. The answer describes the caller's own account only - there is no way  to read another member's settings - and the call is read-only and safe to repeat. Every signed-in member reads  its own settings: the portal owner, a DocSpace administrator, a room administrator, a user and a guest are all  accepted, and no permission is demanded. Badges come back switched on for an account that has not changed  them, while the kinds 1, 2 and 3 come back switched off until they are switched on with  `POST api/2.0/settings/notification`. What comes back is the kind that was asked for together with  `isEnabled`. A `type` outside 0-3 is not recognised and the call fails instead of falling back to a default.  The rooms silenced one by one are listed by `GET api/2.0/settings/notification/rooms`, and the delivery  channels of the installation by `GET api/2.0/settings/notification/channels`.
     * Responses:
     *  - 200: The notification kind that was asked for together with the flag that says whether it is switched on for the calling user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getNotificationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-notification-settings/
     *
     *
     * @param type The kind of notification being asked about. A value outside the defined set fails the call rather than  falling back to a default.
     * @return [NotificationSettingsWrapper]
     */
    @GET("api/2.0/settings/notification/{type}")
    suspend fun getNotificationSettings(@Path("type") type: NotificationType): Response<NotificationSettingsWrapper>

    /**
     * GET api/2.0/settings/notification/rooms
     * Get muted rooms
     * Returns the rooms the calling user has silenced, as the `disabledRooms` list of their identifiers. The list  describes the caller's own account only, the call is read-only, and an empty list means nothing is silenced.  Every signed-in member reads its own list, whatever its role - owner, administrator, user or guest - and no  permission is demanded. The identifiers come back the way `POST api/2.0/settings/notification/rooms` stored  them, in the order they were added and without paging; they are kept as opaque values, so both the numeric  identifier of a portal room and the string identifier of a room on a connected third-party account appear  here, and an identifier stays in the list after the room itself is deleted. While a room is on this list its  activity is left out of the hourly room digest and of the daily feed, the letters that room would send at once  are not sent, and its new-item counters are hidden from the Files responses. Silencing a room changes nothing  for its other members. The kinds of notification this list is applied to are switched with  `POST api/2.0/settings/notification`.
     * Responses:
     *  - 200: The identifiers of the rooms the calling user has silenced
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRoomsNotificationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-notification-settings/
     *
     *
     * @return [RoomsNotificationSettingsWrapper]
     */
    @GET("api/2.0/settings/notification/rooms")
    suspend fun getRoomsNotificationSettings(): Response<RoomsNotificationSettingsWrapper>

    /**
     * POST api/2.0/settings/notification
     * Set notification status
     * Switches one kind of notification on or off for the calling user: send the kind as `type` - 0 the new-item  badges, 1 the room activity letters, 2 the daily feed digest, 3 the periodic tips letters - together with  `isEnabled`. The change touches the caller's own account only, and repeating the call with the same pair  leaves the account as it is. Every signed-in member configures its own settings: the portal owner, a DocSpace  administrator, a room administrator, a user and a guest are all accepted, and no permission is demanded. With  0 switched off the Files responses report `new` as 0 and mark files as muted; with 1 switched off both the  hourly room digest and the letters a room sends at once, such as an editor mention, stop; with 2 switched off  the daily digest stops; with 3 switched off the tips letters stop. What comes back is an echo of the request  rather than a re-read of the stored state, and a `type` outside 0-3 is echoed as well while nothing is stored,  so confirm the result with `GET api/2.0/settings/notification/{type}`. To silence a single room instead of a  whole kind use `POST api/2.0/settings/notification/rooms`.
     * Responses:
     *  - 200: The notification kind and state as they were sent in the request
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setNotificationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-notification-settings/
     *
     *
     * @param notificationSettingsRequestsDto  (optional)
     * @return [NotificationSettingsWrapper]
     */
    @POST("api/2.0/settings/notification")
    suspend fun setNotificationSettings(@Body notificationSettingsRequestsDto: NotificationSettingsRequestsDto? = null): Response<NotificationSettingsWrapper>

    /**
     * POST api/2.0/settings/notification/rooms
     * Mute or unmute a room
     * Adds one room to the calling user's silenced list or takes it off again: `mute` true silences the room, false  lets its notifications through. One call carries one room, so several rooms take several calls, and repeating  a call with the same pair changes nothing. The room is named by `roomsId` and kept as an opaque value: the  numeric identifier of a portal room and the string identifier of a room on a connected third-party account are  both accepted, and neither the room's existence nor the caller's access to it is checked, so a mistyped  identifier is stored as sent. Every signed-in member manages its own list, whatever its role, and the list of  another member cannot be touched. While a room is silenced its activity is left out of the hourly room digest  and of the daily feed, the letters it would send at once are not sent, and its new-item counters are hidden.  The Files responses stop offering the `mute` action on a room once badges, room activity and the daily feed  are all switched off, while this call keeps working. What comes back is the whole updated list, the same shape  `GET api/2.0/settings/notification/rooms` returns.
     * Responses:
     *  - 200: The identifiers of the rooms the calling user has silenced, as the list stands after the change
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setRoomsNotificationStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-rooms-notification-status/
     *
     *
     * @param roomsNotificationsSettingsRequestDto  (optional)
     * @return [RoomsNotificationSettingsWrapper]
     */
    @POST("api/2.0/settings/notification/rooms")
    suspend fun setRoomsNotificationStatus(@Body roomsNotificationsSettingsRequestDto: RoomsNotificationsSettingsRequestDto? = null): Response<RoomsNotificationSettingsWrapper>

}
