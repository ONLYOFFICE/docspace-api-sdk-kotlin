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
 * The company white label settings.
 *
 * @param companyName The company name.
 * @param site The company site.
 * @param email The company email address.
 * @param address The company address.
 * @param phone The company phone number.
 * @param isLicensor Specifies if a company is a licensor or not.
 * @param hideAbout Specifies if the About page is visible or not
 * @param lastModified The timestamp indicating when the settings were last modified.
 */


data class CompanyWhiteLabelSettings (

    @Json(name = "companyName")
    val companyName: kotlin.String? = null,

    @Json(name = "site")
    val site: java.net.URI? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "address")
    val address: kotlin.String? = null,

    @Json(name = "phone")
    val phone: kotlin.String? = null,

    @Json(name = "IsLicensor")
    val isLicensor: kotlin.Boolean? = null,

    @Json(name = "hideAbout")
    val hideAbout: kotlin.Boolean? = null,

    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null

) {


}

