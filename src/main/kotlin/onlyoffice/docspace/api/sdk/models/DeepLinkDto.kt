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
 * What a mobile client needs to hand a portal link to the installed application instead of the browser.
 *
 * @param androidPackageName The package name to look for on Android, and to build a store link from when the application is missing.  All three fields are empty strings on an installation that ships no mobile application, which is the  signal to keep opening links in the browser.
 * @param url The address the client redirects a portal link through so that the application can claim it. It is the  installation's own deep-link host, not a link to any particular document.
 * @param iosPackageId The bundle identifier to look for on iOS, used the same way as `androidPackageName`.
 */


data class DeepLinkDto (

    @Json(name = "androidPackageName")
    val androidPackageName: kotlin.String?,

    @Json(name = "url")
    val url: kotlin.String?,

    @Json(name = "iosPackageId")
    val iosPackageId: kotlin.String?

) {


}

