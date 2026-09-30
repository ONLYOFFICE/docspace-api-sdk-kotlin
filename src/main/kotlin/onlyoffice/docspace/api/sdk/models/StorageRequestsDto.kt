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

import onlyoffice.docspace.api.sdk.models.ItemKeyValuePairStringString

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Which storage provider the portal is pointed at, and the credentials it needs.
 *
 * @param module The storage provider to switch to, by the identifier the matching listing operation reports - `default` for  the built-in local storage. The provider has to be available on the server, which that listing reports as  `isSet`, otherwise the request is refused with 400; sending the module already in use changes nothing.
 * @param props The credentials the provider expects, as the name and value pairs it defines - a bucket, a region and an  access key for an Amazon S3 storage, for instance. Read the expected names from the entry of that provider in  the listing operation; they differ per provider, so there is no fixed set.
 */


data class StorageRequestsDto (

    @Json(name = "module")
    val module: kotlin.String?,

    @Json(name = "props")
    val props: kotlin.collections.List<ItemKeyValuePairStringString>? = null

) {


}

