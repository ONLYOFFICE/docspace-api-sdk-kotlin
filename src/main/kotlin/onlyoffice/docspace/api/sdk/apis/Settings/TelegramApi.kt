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
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TelegramStatusWrapper

interface TelegramApi {
    /**
     * GET api/2.0/settings/telegram/check
     * Check the Telegram connection
     * Checks if the current user is connected to the Telegram Bot or not.
     * Responses:
     *  - 200: Status if user is linked or not
     *  - 401: Unauthorized
     *
     * REST API Reference for checkTelegram Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-telegram/
     *
     *
     * @return [Call]<[TelegramStatusWrapper]>
     */
    @GET("api/2.0/settings/telegram/check")
    fun checkTelegram(): Call<TelegramStatusWrapper>

    /**
     * GET api/2.0/settings/telegram/link
     * Get the Telegram link
     * Returns a link that will connect the Telegram Bot to your account.
     * Responses:
     *  - 200: A link to connect Telegram account
     *  - 401: Unauthorized
     *
     * REST API Reference for linkTelegram Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/link-telegram/
     *
     *
     * @return [Call]<[StringWrapper]>
     */
    @GET("api/2.0/settings/telegram/link")
    fun linkTelegram(): Call<StringWrapper>

    /**
     * DELETE api/2.0/settings/telegram/link
     * Unlink Telegram
     * Unlinks the Telegram Bot from your account.
     * Responses:
     *  - 200: True if success
     *  - 401: Unauthorized
     *
     * REST API Reference for unlinkTelegram Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-telegram/
     *
     *
     * @return [Call]<[BooleanWrapper]>
     */
    @DELETE("api/2.0/settings/telegram/link")
    fun unlinkTelegram(): Call<BooleanWrapper>

}
