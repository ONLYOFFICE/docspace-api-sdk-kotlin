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
 * Which past webhook deliveries are sent again.
 *
 * @param ids The delivery records to send again, by the identifiers `GET api/2.0/settings/webhooks/log` reports. An  identifier that exists nowhere, and one belonging to another member subscription when the caller is not a  DocSpace administrator, is skipped in silence rather than failing the call, so compare the number of records  that come back against the number sent. An empty list is accepted and queues nothing.
 */


data class WebhookRetryRequestsDto (

    @Json(name = "ids")
    val ids: kotlin.collections.List<kotlin.Int>? = null

) {


}

