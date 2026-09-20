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
 * Which mobile device receives the Documents push notifications, and whether it is subscribed.
 *
 * @param firebaseDeviceToken The registration token Firebase issued to the mobile client for this device, obtained on the device itself.  It is kept as an opaque string of up to 255 characters and is never verified here; it identifies the device  and is matched but never changed, and a token belonging to another member or another portal matches nothing.
 * @param isSubscribed Whether the device is to receive the room activity messages - an invitation, a role change, an archived room,  a new document. On a first registration it is stored as given; on a registration that already exists it is  ignored, because registering does not update, and the subscription is changed with  `PUT api/2.0/settings/push/docsubscribe` instead.
 */


data class FirebaseRequestsDto (

    @Json(name = "firebaseDeviceToken")
    val firebaseDeviceToken: kotlin.String? = null,

    @Json(name = "isSubscribed")
    val isSubscribed: kotlin.Boolean? = null

) {


}

