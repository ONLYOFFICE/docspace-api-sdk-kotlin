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
 * The custom domain the portal answers on, and whether that mapping is in force.
 *
 * @param dnsName The domain the portal is to be reachable under, as a bare hostname without a scheme. It must not collide with  the reserved base domain of the installation, and a name that fails validation is refused without disturbing  the mapping in force. It is read only while `enable` is true.
 * @param enable Whether the custom domain is put in force. Setting it false clears the mapping and ignores `dnsName`; setting  it true also stops the previous domain from answering and rewrites any Content Security Policy entry that  named it.
 */


data class DnsSettingsRequestsDto (

    @Json(name = "dnsName")
    val dnsName: kotlin.String? = null,

    @Json(name = "enable")
    val enable: kotlin.Boolean? = null

) {


}

