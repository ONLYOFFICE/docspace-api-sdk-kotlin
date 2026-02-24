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
 * The request parameters for handling sales and payment inquiries in the portal.
 *
 * @param email The contact email address for the sales inquiry.
 * @param message The details of the sales inquiry or payment request.
 * @param userName The name of the user submitting the sales request.
 */


data class SalesRequestsDto (

    /* The contact email address for the sales inquiry. */
    @Json(name = "email")
    val email: kotlin.String?,

    /* The details of the sales inquiry or payment request. */
    @Json(name = "message")
    val message: kotlin.String?,

    /* The name of the user submitting the sales request. */
    @Json(name = "userName")
    val userName: kotlin.String? = null

) {


}

