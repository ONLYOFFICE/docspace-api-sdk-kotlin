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
 * The deep link parameters.
 *
 * @param androidPackageName The Android package name.
 * @param url The deep link URL.
 * @param iosPackageId The deep link IOS package ID.
 */


data class DeepLinkDto (

    /* The Android package name. */
    @Json(name = "androidPackageName")
    val androidPackageName: kotlin.String?,

    /* The deep link URL. */
    @Json(name = "url")
    val url: kotlin.String?,

    /* The deep link IOS package ID. */
    @Json(name = "iosPackageId")
    val iosPackageId: kotlin.String?

) {


}

