
# UpdateWebhooksConfigRequestsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The human-readable name of the webhook configuration. |  |
| **uri** | **kotlin.String** | The destination URL where the webhook events will be sent. |  |
| **id** | **kotlin.Int** | The webhook configuration ID. |  |
| **secretKey** | **kotlin.String** | The webhook secret key used to sign the webhook payloads for the security verification. |  [optional] |
| **enabled** | **kotlin.Boolean** | Specifies whether the webhook configuration is active or not. |  [optional] |
| **ssl** | **kotlin.Boolean** | Specifies whether the SSL certificate verification is required or not. |  [optional] |
| **triggers** | [**WebhookTrigger**](WebhookTrigger.md) | The webhook trigger type. |  [optional] |
| **targetId** | **kotlin.String** | Target ID |  [optional] |



