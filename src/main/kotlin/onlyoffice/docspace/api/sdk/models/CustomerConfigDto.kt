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
 * The customer config parameters.
 *
 * @param address The address of the customer configuration.
 * @param logo The logo of the customer configuration.
 * @param logoDark The dark logo of the customer configuration.
 * @param mail The mail address of the customer configuration.
 * @param name The name of the customer configuration.
 * @param www The site web address of the customer configuration.
 */


data class CustomerConfigDto (

    /* The address of the customer configuration. */
    @Json(name = "address")
    val address: kotlin.String? = null,

    /* The logo of the customer configuration. */
    @Json(name = "logo")
    val logo: kotlin.String? = null,

    /* The dark logo of the customer configuration. */
    @Json(name = "logoDark")
    val logoDark: kotlin.String? = null,

    /* The mail address of the customer configuration. */
    @Json(name = "mail")
    val mail: kotlin.String? = null,

    /* The name of the customer configuration. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The site web address of the customer configuration. */
    @Json(name = "www")
    val www: kotlin.String? = null

) {


}

