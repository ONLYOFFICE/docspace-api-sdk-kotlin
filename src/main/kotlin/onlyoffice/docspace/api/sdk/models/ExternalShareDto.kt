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

import onlyoffice.docspace.api.sdk.models.FileEntryType
import onlyoffice.docspace.api.sdk.models.Status

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The external sharing information and validation data.
 *
 * @param status 
 * @param id The external data ID.
 * @param title The external data title.
 * @param tenantId The tenant ID.
 * @param shared Specifies whether to share the external data or not.
 * @param linkId The link ID of the external data.
 * @param isAuthenticated Specifies whether the user is authenticated or not.
 * @param type 
 * @param entityId The unique identifier of the shared entity.
 * @param entityTitle The title of the shared entity.
 * @param entityType 
 * @param isRoom Indicates whether the entity represents a room.
 * @param isRoomMember The room ID of the external data.
 */


data class ExternalShareDto (

    @Json(name = "status")
    val status: Status,

    /* The external data ID. */
    @Json(name = "id")
    val id: kotlin.String?,

    /* The external data title. */
    @Json(name = "title")
    val title: kotlin.String?,

    /* The tenant ID. */
    @Json(name = "tenantId")
    val tenantId: kotlin.Int,

    /* Specifies whether to share the external data or not. */
    @Json(name = "shared")
    val shared: kotlin.Boolean,

    /* The link ID of the external data. */
    @Json(name = "linkId")
    val linkId: java.util.UUID,

    /* Specifies whether the user is authenticated or not. */
    @Json(name = "isAuthenticated")
    val isAuthenticated: kotlin.Boolean,

    @Json(name = "type")
    val type: FileEntryType? = null,

    /* The unique identifier of the shared entity. */
    @Json(name = "entityId")
    val entityId: kotlin.String? = null,

    /* The title of the shared entity. */
    @Json(name = "entityTitle")
    val entityTitle: kotlin.String? = null,

    @Json(name = "entityType")
    val entityType: FileEntryType? = null,

    /* Indicates whether the entity represents a room. */
    @Json(name = "isRoom")
    val isRoom: kotlin.Boolean? = null,

    /* The room ID of the external data. */
    @Json(name = "isRoomMember")
    val isRoomMember: kotlin.Boolean? = null

) {


}

