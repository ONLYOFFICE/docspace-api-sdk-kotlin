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
 * The Firebase project a client initialises its SDK with to receive push notifications from this portal.
 *
 * @param apiKey The web API key of the project. Every field of this object is an empty string on an installation that  configures no Firebase project, and an empty `projectId` is the cheapest thing to test for before  initialising an SDK. None of these values is a secret - they are meant to be embedded in a client.
 * @param authDomain The host the Firebase SDK performs its own authentication against.
 * @param projectId The identifier of the Firebase project itself, which ties all the other fields together.
 * @param storageBucket The Cloud Storage bucket of the project. The portal does not store portal files there; it is part of the  SDK configuration.
 * @param messagingSenderId The sender ID that push messages of this project arrive under, which a client checks an incoming message  against.
 * @param appId The identifier of the Firebase application registration this client is to use.
 * @param measurementId The Google Analytics measurement ID of the project, empty when the project reports no analytics.
 * @param databaseURL The Realtime Database endpoint of the project, empty when the project has no such database.
 */


data class FirebaseDto (

    @Json(name = "apiKey")
    val apiKey: kotlin.String?,

    @Json(name = "authDomain")
    val authDomain: kotlin.String?,

    @Json(name = "projectId")
    val projectId: kotlin.String?,

    @Json(name = "storageBucket")
    val storageBucket: kotlin.String?,

    @Json(name = "messagingSenderId")
    val messagingSenderId: kotlin.String?,

    @Json(name = "appId")
    val appId: kotlin.String?,

    @Json(name = "measurementId")
    val measurementId: kotlin.String?,

    @Json(name = "databaseURL")
    val databaseURL: kotlin.String?

) {


}

