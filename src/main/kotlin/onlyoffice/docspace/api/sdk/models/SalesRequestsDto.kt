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
 * Who is writing to the ONLYOFFICE sales team, and what about.
 *
 * @param userName The name the sales team should address the reply to. It is sent as written and is not matched against any  portal account; an empty value fails the request with 400.
 * @param email The address the answer is sent to. It has to be a well-formed email address and need not be the caller portal  address; an empty or malformed value fails the request with 400.
 * @param message What is being asked of the sales team - a quote, an invoice, or a plan that cannot be bought online. An empty  value fails the request with 400.
 */


data class SalesRequestsDto (

    @Json(name = "userName")
    val userName: kotlin.String,

    @Json(name = "email")
    val email: kotlin.String,

    @Json(name = "message")
    val message: kotlin.String

) {


}

