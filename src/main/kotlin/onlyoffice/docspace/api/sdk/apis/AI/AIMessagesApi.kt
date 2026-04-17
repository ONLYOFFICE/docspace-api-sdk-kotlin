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


package onlyoffice.docspace.api.sdk.apis.AI

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ExportMessageRequestBody

interface AIMessagesApi {
    /**
     * POST api/2.0/ai/messages/{messageId}/export
     * Export a single AI message to a document
     * Exports a specific AI chat message as a document into the specified folder. The system verifies that the message exists  and belongs to a chat accessible by the current user, then publishes an asynchronous export task to the event bus.  The exported document will be created in the target folder with the given title once the background task completes.
     * Responses:
     *  - 200: The message export task has been successfully queued for background processing
     *  - 400: The message identifier is invalid (must be greater than 0)
     *  - 404: The specified message was not found or the current user does not have access to it
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for exportMessage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/export-message/
     *
     *
     * @param messageId The unique identifier of the AI chat message to export.
     * @param exportMessageRequestBody The export parameters including destination folder and file title.
     * @return [Unit]
     */
    @POST("api/2.0/ai/messages/{messageId}/export")
    suspend fun exportMessage(@Path("messageId") messageId: kotlin.Int, @Body exportMessageRequestBody: ExportMessageRequestBody): Response<Unit>

}
