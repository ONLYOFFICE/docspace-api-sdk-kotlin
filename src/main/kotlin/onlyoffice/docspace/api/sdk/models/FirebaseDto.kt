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
 * The Firebase parameters.
 *
 * @param apiKey The Firebase API key.
 * @param authDomain The Firebase authentication domain.
 * @param projectId The Firebase project ID.
 * @param storageBucket The Firebase storage bucket.
 * @param messagingSenderId The Firebase messaging sender ID.
 * @param appId The Firebase application ID.
 * @param measurementId The Firebase measurement ID.
 * @param databaseURL The Firebase database URL.
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

