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
 * [0 - None, 1 - Not sent, 2 - Status2xx, 4 - Status3xx, 8 - Status4xx, 16 - Status5xx]
 *
 * Values: None,NotSent,Status2xx,Status3xx,Status4xx,Status5xx
 */

@JsonClass(generateAdapter = false)
enum class WebhookGroupStatus(val value: kotlin.Int) {

    @Json(name = "0")
    None(0),

    @Json(name = "1")
    NotSent(1),

    @Json(name = "2")
    Status2xx(2),

    @Json(name = "4")
    Status3xx(4),

    @Json(name = "8")
    Status4xx(8),

    @Json(name = "16")
    Status5xx(16);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is WebhookGroupStatus) "$data" else null

        /**
         * Returns a valid [WebhookGroupStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): WebhookGroupStatus? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

