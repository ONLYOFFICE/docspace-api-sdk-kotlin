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
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

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
     * Returns a list of notification channels.
     * Responses:
     *  - 200: Notification settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getNotificationChannels Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-notification-channels/
     *
     *
     * @return [Call]<[NotificationChannelStatusWrapper]>
     */
    @GET("api/2.0/settings/notification/channels")
    fun getNotificationChannels(): Call<NotificationChannelStatusWrapper>

    /**
     * GET api/2.0/settings/notification/{type}
     * Check notification availability
     * Checks if the notification type specified in the request is enabled or not.
     * Responses:
     *  - 200: Notification settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getNotificationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-notification-settings/
     *
     *
     * @param type The type of notification to query, specified in the route.
     * @return [Call]<[NotificationSettingsWrapper]>
     */
    @GET("api/2.0/settings/notification/{type}")
    fun getNotificationSettings(@Path("type") type: NotificationType): Call<NotificationSettingsWrapper>

    /**
     * GET api/2.0/settings/notification/rooms
     * Get room notification settings
     * Returns a list of rooms with the disabled notifications.
     * Responses:
     *  - 200: Room notification settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomsNotificationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-notification-settings/
     *
     *
     * @return [Call]<[RoomsNotificationSettingsWrapper]>
     */
    @GET("api/2.0/settings/notification/rooms")
    fun getRoomsNotificationSettings(): Call<RoomsNotificationSettingsWrapper>

    /**
     * POST api/2.0/settings/notification
     * Enable notifications
     * Enables the notification type specified in the request.
     * Responses:
     *  - 200: Notification settings
     *  - 401: Unauthorized
     *
     * REST API Reference for setNotificationSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-notification-settings/
     *
     *
     * @param notificationSettingsRequestsDto  (optional)
     * @return [Call]<[NotificationSettingsWrapper]>
     */
    @POST("api/2.0/settings/notification")
    fun setNotificationSettings(@Body notificationSettingsRequestsDto: NotificationSettingsRequestsDto? = null): Call<NotificationSettingsWrapper>

    /**
     * POST api/2.0/settings/notification/rooms
     * Set room notification status
     * Sets a notification status for a room with the ID specified in the request.
     * Responses:
     *  - 200: Room notification settings
     *  - 401: Unauthorized
     *
     * REST API Reference for setRoomsNotificationStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-rooms-notification-status/
     *
     *
     * @param roomsNotificationsSettingsRequestDto  (optional)
     * @return [Call]<[RoomsNotificationSettingsWrapper]>
     */
    @POST("api/2.0/settings/notification/rooms")
    fun setRoomsNotificationStatus(@Body roomsNotificationsSettingsRequestDto: RoomsNotificationsSettingsRequestDto? = null): Call<RoomsNotificationSettingsWrapper>

}
