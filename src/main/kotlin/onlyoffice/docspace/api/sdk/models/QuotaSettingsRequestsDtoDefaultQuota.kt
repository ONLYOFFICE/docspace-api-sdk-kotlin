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
 * The starting limit, in bytes, written as a JSON number. It has to parse as a whole number and may not exceed  the portal total storage quota, nor, on a self-hosted installation with a portal-wide quota switched on, that  quota; anything larger is refused with 400. It is applied to objects created from now on and leaves the  limits of existing ones as they are.
 *
 */


class QuotaSettingsRequestsDtoDefaultQuota (

) {


}

