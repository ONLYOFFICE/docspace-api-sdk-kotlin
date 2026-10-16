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

package onlyoffice.docspace.api.sdk.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One mobile device of the calling user registered for push notifications.
 *
 * @param id The id of the registration.
 * @param userId The account the device belongs to; always the caller.
 * @param tenantId The portal the registration belongs to; always the current one.
 * @param firebaseDeviceToken The Firebase token the device was issued, as it was sent at registration.
 * @param application The application the registration is for; `doc` for the Documents application.
 * @param isSubscribed Whether the device is currently sent push notifications.
 */


data class FirebaseDeviceDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    @Json(name = "firebaseDeviceToken")
    val firebaseDeviceToken: kotlin.String? = null,

    @Json(name = "application")
    val application: kotlin.String? = null,

    @Json(name = "isSubscribed")
    val isSubscribed: kotlin.Boolean? = null

) {


}

