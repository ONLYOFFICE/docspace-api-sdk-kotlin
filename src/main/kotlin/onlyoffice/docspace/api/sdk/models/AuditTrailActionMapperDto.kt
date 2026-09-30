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
 * One audit trail action, with the kind of change it stands for and the kind of object it applies to.
 *
 * @param messageAction The action name to send as the `action` filter of `GET api/2.0/security/audit/events/filter`, and the value  that comes back as `actionId` on an event.
 * @param actionType The kind of change the action makes, accepted by the `actionType` filter of the same operation.
 * @param entity The kind of object the action applies to, accepted by the `entryType` filter. It is `None` for an action  that targets no object, such as a settings change, and an action with a second object type reports only the  first one here.
 */


data class AuditTrailActionMapperDto (

    @Json(name = "messageAction")
    val messageAction: kotlin.String? = null,

    @Json(name = "actionType")
    val actionType: kotlin.String? = null,

    @Json(name = "entity")
    val entity: kotlin.String? = null

) {


}

