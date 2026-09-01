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

import onlyoffice.docspace.api.sdk.models.CreateWebhooksConfigRequestsDto
import onlyoffice.docspace.api.sdk.models.UpdateWebhooksConfigRequestsDto
import onlyoffice.docspace.api.sdk.models.WebhookGroupStatus
import onlyoffice.docspace.api.sdk.models.WebhookRetryRequestsDto
import onlyoffice.docspace.api.sdk.models.WebhookTrigger
import onlyoffice.docspace.api.sdk.models.WebhookTriggerArrayWrapper
import onlyoffice.docspace.api.sdk.models.WebhooksConfigWithStatusArrayWrapper
import onlyoffice.docspace.api.sdk.models.WebhooksConfigWrapper
import onlyoffice.docspace.api.sdk.models.WebhooksLogArrayWrapper
import onlyoffice.docspace.api.sdk.models.WebhooksLogWrapper

interface WebhooksApi {
    /**
     * POST api/2.0/settings/webhook
     * Create a webhook
     * Creates a new tenant webhook with the parameters specified in the request.
     * Responses:
     *  - 200: Tenant webhook with its config parameters
     *  - 400: Invalid or empty parameters
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createWebhook Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-webhook/
     *
     *
     * @param createWebhooksConfigRequestsDto  (optional)
     * @return [WebhooksConfigWrapper]
     */
    @POST("api/2.0/settings/webhook")
    suspend fun createWebhook(@Body createWebhooksConfigRequestsDto: CreateWebhooksConfigRequestsDto? = null): Response<WebhooksConfigWrapper>

    /**
     * PUT api/2.0/settings/webhook/enable
     * Enable a webhook
     * Enables or disables a tenant webhook with the parameters specified in the request.
     * Responses:
     *  - 200: Enable or disable tenant webhook
     *  - 400: Invalid or empty parameters
     *  - 403: Access denied
     *  - 404: Item not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for enableWebhook Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/enable-webhook/
     *
     *
     * @param updateWebhooksConfigRequestsDto  (optional)
     * @return [WebhooksConfigWrapper]
     */
    @PUT("api/2.0/settings/webhook/enable")
    suspend fun enableWebhook(@Body updateWebhooksConfigRequestsDto: UpdateWebhooksConfigRequestsDto? = null): Response<WebhooksConfigWrapper>

    /**
     * GET api/2.0/settings/webhook
     * Get webhooks
     * Returns a list of the tenant webhooks.
     * Responses:
     *  - 200: List of tenant webhooks with their config parameters
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantWebhooks Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-webhooks/
     *
     *
     * @return [WebhooksConfigWithStatusArrayWrapper]
     */
    @GET("api/2.0/settings/webhook")
    suspend fun getTenantWebhooks(): Response<WebhooksConfigWithStatusArrayWrapper>

    /**
     * GET api/2.0/settings/webhook/triggers
     * Get webhook triggers
     * Returns a list of triggers for a webhook with their availability for the current user.
     * Responses:
     *  - 200: List of triggers with availability for the current user
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getWebhookTriggers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhook-triggers/
     *
     *
     * @return [WebhookTriggerArrayWrapper]
     */
    @GET("api/2.0/settings/webhook/triggers")
    suspend fun getWebhookTriggers(): Response<WebhookTriggerArrayWrapper>

    /**
     * GET api/2.0/settings/webhooks/log
     * Get webhook logs
     * Returns the logs of the webhook activities.
     * Responses:
     *  - 200: Logs of the webhook activities
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getWebhooksLogs Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhooks-logs/
     *
     *
     * @param deliveryFrom The delivery start time for filtering webhook logs. (optional)
     * @param deliveryTo The delivery end time for filtering webhook logs. (optional)
     * @param hookUri The destination URL where webhooks are delivered. (optional)
     * @param configId The webhook configuration identifier. (optional)
     * @param eventId The unique identifier of the event that triggered the webhook. (optional)
     * @param groupStatus The status of the webhook delivery group. (optional)
     * @param userId The identifier of the user associated with the webhook event. (optional)
     * @param trigger The type of event that triggered the webhook. (optional)
     * @param count The maximum number of webhook log records to return in the query response. (optional)
     * @param startIndex Specifies the starting index for retrieving webhook logs.  Used for pagination in the webhook delivery log queries. (optional)
     * @return [WebhooksLogArrayWrapper]
     */
    @GET("api/2.0/settings/webhooks/log")
    suspend fun getWebhooksLogs(@Query("deliveryFrom") deliveryFrom: java.time.OffsetDateTime? = null, @Query("deliveryTo") deliveryTo: java.time.OffsetDateTime? = null, @Query("hookUri") hookUri: kotlin.String? = null, @Query("configId") configId: kotlin.Int? = null, @Query("eventId") eventId: kotlin.Int? = null, @Query("groupStatus") groupStatus: WebhookGroupStatus? = null, @Query("userId") userId: java.util.UUID? = null, @Query("trigger") trigger: WebhookTrigger? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<WebhooksLogArrayWrapper>

    /**
     * DELETE api/2.0/settings/webhook/{id}
     * Remove a webhook
     * Removes a tenant webhook with the ID specified in the request.
     * Responses:
     *  - 200: Tenant webhook with its config parameters
     *  - 403: Access denied
     *  - 404: Item not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for removeWebhook Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-webhook/
     *
     *
     * @param id The ID extracted from the route parameters.
     * @return [WebhooksConfigWrapper]
     */
    @DELETE("api/2.0/settings/webhook/{id}")
    suspend fun removeWebhook(@Path("id") id: kotlin.Int): Response<WebhooksConfigWrapper>

    /**
     * PUT api/2.0/settings/webhook/{id}/retry
     * Retry a webhook
     * Retries a webhook with the ID specified in the request.
     * Responses:
     *  - 200: Logs of the webhook activities
     *  - 400: Id incorrect
     *  - 403: Access denied
     *  - 404: Item not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for retryWebhook Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhook/
     *
     *
     * @param id The ID extracted from the route parameters.
     * @return [WebhooksLogWrapper]
     */
    @PUT("api/2.0/settings/webhook/{id}/retry")
    suspend fun retryWebhook(@Path("id") id: kotlin.Int): Response<WebhooksLogWrapper>

    /**
     * PUT api/2.0/settings/webhook/retry
     * Retry webhooks
     * Retries all the webhooks with the IDs specified in the request.
     * Responses:
     *  - 200: Logs of the webhook activities
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for retryWebhooks Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhooks/
     *
     *
     * @param webhookRetryRequestsDto  (optional)
     * @return [WebhooksLogArrayWrapper]
     */
    @PUT("api/2.0/settings/webhook/retry")
    suspend fun retryWebhooks(@Body webhookRetryRequestsDto: WebhookRetryRequestsDto? = null): Response<WebhooksLogArrayWrapper>

    /**
     * PUT api/2.0/settings/webhook
     * Update a webhook
     * Updates a tenant webhook with the parameters specified in the request.
     * Responses:
     *  - 200: Updated tenant webhook with its config parameters
     *  - 400: Invalid or empty parameters
     *  - 403: Access denied
     *  - 404: Item not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateWebhook Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-webhook/
     *
     *
     * @param updateWebhooksConfigRequestsDto  (optional)
     * @return [WebhooksConfigWrapper]
     */
    @PUT("api/2.0/settings/webhook")
    suspend fun updateWebhook(@Body updateWebhooksConfigRequestsDto: UpdateWebhooksConfigRequestsDto? = null): Response<WebhooksConfigWrapper>

}
