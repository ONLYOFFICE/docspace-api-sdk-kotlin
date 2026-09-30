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
 * The two facts about the subscription in force that a payment page needs.
 *
 * @param trial Whether the portal is on a trial rather than a paid subscription. A trial expires at `dueDate` and is not  extended by paying - a plan has to be bought instead.
 * @param dueDate The day the subscription runs out, with the time of day cut off. The largest value a date can hold means  it never runs out, which is how a free or unlimited plan is expressed.
 */


data class CurrentLicenseInfo (

    @Json(name = "trial")
    val trial: kotlin.Boolean,

    @Json(name = "dueDate")
    val dueDate: java.time.OffsetDateTime

) {


}

