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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.EmployeeDto
import onlyoffice.docspace.api.sdk.models.HistoryAction
import onlyoffice.docspace.api.sdk.models.HistoryData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One record of the activity log of a file or a folder.
 *
 * @param id The identifier of the record, which tells two records of the same action apart and stays stable as long as the  portal keeps the log.
 * @param action What happened - the kind of event the record stands for, such as a file being uploaded, renamed, moved or  shared - with the key a client can key its own wording off.
 * @param initiator Who caused the event. For an event caused by a visitor following an external link only the name they gave is  filled in, the account fields staying empty.
 * @param date When the event happened, written with the offset of the portal's time zone.
 * @param `data` The history data. Absent for actions that carry no payload of their own - changing a room's  logo, icon colour or cover, whose interpreter returns no data (see  `RoomLogoChangedInterpreter`). It used to be declared required, which put it in the  OpenAPI document's required list while the null-dropping serializer left it out of the  response, so a generated client threw on any history page holding one of those entries.
 * @param related The records folded into this one because they belong to the same action, the separate files of one upload for  instance. It is empty when the record stands alone, and the records inside it carry no further nesting.
 */


data class HistoryDto (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "action")
    val action: HistoryAction,

    @Json(name = "initiator")
    val initiator: EmployeeDto,

    @Json(name = "date")
    val date: ApiDateTime,

    @Json(name = "data")
    val `data`: HistoryData? = null,

    @Json(name = "related")
    val related: kotlin.collections.List<HistoryDto>? = null

) {


}

