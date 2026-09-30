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
 * The account the editors attribute the changes of this session to.
 *
 * @param id The account the changes are recorded under. Two sessions carrying the same value are taken by the editors for  the same person.
 * @param name The name shown next to the changes and in the list of participants.
 * @param image An absolute address of the avatar shown for this participant.
 * @param roles The filling roles this participant holds in the form being filled out. It is set only for a form in a virtual  data room, where the role decides which fields open for them.
 * @param customerId Identifies the paying customer this participant belongs to, on deployments where the editors are licensed per  customer.
 */


data class UserConfig (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "image")
    val image: kotlin.String? = null,

    @Json(name = "roles")
    val roles: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "customerId")
    val customerId: kotlin.String? = null

) {


}

