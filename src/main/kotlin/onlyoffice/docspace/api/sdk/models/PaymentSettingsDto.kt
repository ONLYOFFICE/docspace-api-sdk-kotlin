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

import onlyoffice.docspace.api.sdk.models.CurrentLicenseInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The payment settings parameters.
 *
 * @param salesEmail The email address for sales inquiries and support.
 * @param buyUrl The URL for purchasing or upgrading the product.
 * @param standalone Indicates whether the system is running in standalone mode.
 * @param currentLicense 
 * @param max The maximum quota quantity.
 * @param feedbackAndSupportUrl The URL for accessing the feedback and support resources.
 */


data class PaymentSettingsDto (

    /* The email address for sales inquiries and support. */
    @Json(name = "salesEmail")
    val salesEmail: kotlin.String?,

    /* The URL for purchasing or upgrading the product. */
    @Json(name = "buyUrl")
    val buyUrl: kotlin.String?,

    /* Indicates whether the system is running in standalone mode. */
    @Json(name = "standalone")
    val standalone: kotlin.Boolean,

    @Json(name = "currentLicense")
    val currentLicense: CurrentLicenseInfo,

    /* The maximum quota quantity. */
    @Json(name = "max")
    val max: kotlin.Int,

    /* The URL for accessing the feedback and support resources. */
    @Json(name = "feedbackAndSupportUrl")
    val feedbackAndSupportUrl: kotlin.String? = null

) {


}

