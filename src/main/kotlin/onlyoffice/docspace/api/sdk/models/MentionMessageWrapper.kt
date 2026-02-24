 /*
 * (c) Copyright Ascensio System SIA 2025
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

import onlyoffice.docspace.api.sdk.models.ActionLinkConfig

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The mention message parameters.
 *
 * @param actionLink 
 * @param emails A list of emails that will receive the mention message.
 * @param message The mention message.
 */


data class MentionMessageWrapper (

    @Json(name = "actionLink")
    val actionLink: ActionLinkConfig? = null,

    /* A list of emails that will receive the mention message. */
    @Json(name = "emails")
    val emails: kotlin.collections.List<kotlin.String>? = null,

    /* The mention message. */
    @Json(name = "message")
    val message: kotlin.String? = null

) {


}

