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

import onlyoffice.docspace.api.sdk.models.BackupPeriod

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for the time the scheduled backup runs.
 *
 * @param period How often the backup runs: `EveryDay`, `EveryWeek` or `EveryMonth`. It defaults to `EveryDay`.
 * @param hour The hour of the day the backup starts at, from 0 to 23. Minutes cannot be chosen - it always starts  on the hour.
 * @param day The day the backup runs on: the day of the week from 1 to 7, Sunday being 1, for `EveryWeek`, and the  day of the month from 1 to 31 for `EveryMonth`. Leave it out for `EveryDay` only - an omitted value is  stored as 0, which neither of the other two periods accepts, so a weekly or monthly schedule sent  without it fails.
 */


data class Cron (

    @Json(name = "period")
    val period: BackupPeriod? = null,

    @Json(name = "hour")
    val hour: kotlin.Int? = null,

    @Json(name = "day")
    val day: kotlin.Int? = null

) {


}

