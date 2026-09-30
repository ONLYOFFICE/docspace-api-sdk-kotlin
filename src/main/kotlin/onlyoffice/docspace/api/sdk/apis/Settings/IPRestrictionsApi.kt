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


package onlyoffice.docspace.api.sdk.apis.Settings

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.IPRestrictionArrayWrapper
import onlyoffice.docspace.api.sdk.models.IPRestrictionsSettingsWrapper
import onlyoffice.docspace.api.sdk.models.IpRestrictionsDto
import onlyoffice.docspace.api.sdk.models.IpRestrictionsWrapper

interface IPRestrictionsApi {
    /**
     * GET api/2.0/settings/iprestrictions
     * Get IP restrictions
     * Returns the IP restriction list of the current portal - the addresses allowed to reach it, each with its `id`  and the `forAdmin` flag that narrows the entry to DocSpace administrators. The caller needs the  portal-settings right of a DocSpace administrator, otherwise the call is refused. The call is read-only and  honours `If-None-Match`: send back the `ETag` of an earlier answer and an unchanged list comes back as an  empty not-modified response rather than a body. The list has no defined order and is empty on a portal where  nobody has configured restrictions - and an empty list blocks nobody, whatever the enforcement flag says.  Whether the restrictions are enforced at all is not part of this answer: read that flag with  `GET api/2.0/settings/iprestrictions/settings`. The entries listed here apply to every user of the portal  except its owner. Replace the whole list with `PUT api/2.0/settings/iprestrictions`; single entries cannot be  added or deleted, and that update takes plain addresses rather than the IDs returned here.
     * Responses:
     *  - 200: The IP addresses allowed to reach the portal, each with its ID and administrators-only flag; an empty list when the portal has no restrictions
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getIpRestrictions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ip-restrictions/
     *
     *
     * @return [IPRestrictionArrayWrapper]
     */
    @GET("api/2.0/settings/iprestrictions")
    suspend fun getIpRestrictions(): Response<IPRestrictionArrayWrapper>

    /**
     * GET api/2.0/settings/iprestrictions/settings
     * Get IP restriction settings
     * Reports whether the IP restrictions of the current portal are enforced, as the `enable` flag together with the  `lastModified` stamp of the setting. The caller needs the portal-settings right of a DocSpace administrator,  otherwise the call is refused. The call is read-only and honours `If-Modified-Since`: send back the  `Last-Modified` value of an earlier answer and an unchanged setting comes back as an empty not-modified  response rather than a body. The flag is `false` on a portal nobody has configured. A `true` flag on its own  blocks nothing: enforcement also needs at least one stored address, which this answer does not carry - read  the addresses with `GET api/2.0/settings/iprestrictions` - and it is skipped entirely on an installation whose  configuration hides the IP security section. Even when enforced, the portal owner and the installation's own  networks are let through. Change the flag with `PUT api/2.0/settings/iprestrictions/settings`, which replaces  the address list in the same call, so resend the addresses in force when all that changes is the flag.
     * Responses:
     *  - 200: The enforcement flag of the IP restrictions and the date the setting was last modified
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for readIpRestrictionsSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/read-ip-restrictions-settings/
     *
     *
     * @return [IPRestrictionsSettingsWrapper]
     */
    @GET("api/2.0/settings/iprestrictions/settings")
    suspend fun readIpRestrictionsSettings(): Response<IPRestrictionsSettingsWrapper>

    /**
     * PUT api/2.0/settings/iprestrictions
     * Save IP restrictions
     * Replaces the whole IP restriction list of the current portal with the addresses from the request and stores  the enforcement flag in the same call. The caller needs the portal-settings right of a DocSpace administrator,  otherwise the call is refused. Every entry must be a single IPv4 or IPv6 address: `from-to` ranges and CIDR  blocks are matched by the portal but cannot be stored here and are rejected as an invalid request, as is  `enable: true` with an empty list. An omitted `enable` follows the list - on when addresses are sent, off when  the list is empty. The replacement is written in one transaction, applies to new requests without a restart  and is recorded in the audit trail; entries not repeated in the body are deleted, and sending the same body  twice leaves the portal as it is. Enforcement spares the portal owner and the installation's own networks  only, so a list without the caller's own address locks the remaining administrators out. The answer echoes the  request rather than the stored rows - no entry IDs, and `enable` exactly as sent, empty when it was omitted -  so read the result with `GET api/2.0/settings/iprestrictions`.
     * Responses:
     *  - 200: The saved addresses and enforcement flag echoed back exactly as sent, without the IDs of the stored entries
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveIpRestrictions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-ip-restrictions/
     *
     *
     * @param ipRestrictionsDto  (optional)
     * @return [IpRestrictionsWrapper]
     */
    @PUT("api/2.0/settings/iprestrictions")
    suspend fun saveIpRestrictions(@Body ipRestrictionsDto: IpRestrictionsDto? = null): Response<IpRestrictionsWrapper>

    /**
     * PUT api/2.0/settings/iprestrictions/settings
     * Update IP restriction settings
     * Stores the enforcement flag of the IP restrictions of the current portal together with the whole address list,  replacing the addresses saved before; this operation and `PUT api/2.0/settings/iprestrictions` are two routes  to the same handler and behave identically. The caller needs the portal-settings right of a DocSpace  administrator, otherwise the call is refused. Every entry must be a single IPv4 or IPv6 address: `from-to`  ranges and CIDR blocks are matched by the portal but cannot be stored here and are rejected as an invalid  request, as is `enable: true` with an empty list. An omitted `enable` follows the list - on when addresses are  sent, off when the list is empty - so the flag cannot be moved without resending the addresses that stay in  force. The new state applies to new requests without a restart, is recorded in the audit trail, and sending  the same body twice changes nothing further. Enforcement spares the portal owner and the installation's own  networks only, so a list without the caller's own address locks the remaining administrators out. The answer  echoes the request, so read the stored entries and their IDs with `GET api/2.0/settings/iprestrictions`.
     * Responses:
     *  - 200: The stored enforcement flag and addresses echoed back exactly as sent, without the IDs of the stored entries
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateIpRestrictionsSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-ip-restrictions-settings/
     *
     *
     * @param ipRestrictionsDto  (optional)
     * @return [IpRestrictionsWrapper]
     */
    @PUT("api/2.0/settings/iprestrictions/settings")
    suspend fun updateIpRestrictionsSettings(@Body ipRestrictionsDto: IpRestrictionsDto? = null): Response<IpRestrictionsWrapper>

}
