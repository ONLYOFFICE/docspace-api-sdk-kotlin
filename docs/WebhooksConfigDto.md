
# WebhooksConfigDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The webhook ID. |  |
| **name** | **kotlin.String** | The webhook name. |  [optional] |
| **uri** | **kotlin.String** | The webhook URI. |  [optional] |
| **enabled** | **kotlin.Boolean** | Specifies if the webhooks are enabled or not. |  [optional] |
| **ssl** | **kotlin.Boolean** | The webhook SSL verification (enabled or not). |  [optional] |
| **triggers** | [**WebhookTrigger**](WebhookTrigger.md) | The webhook trigger type. |  [optional] |
| **targetId** | **kotlin.String** | The webhook target ID. |  [optional] |
| **createdBy** | [**EmployeeDto**](EmployeeDto.md) | The user parameters. |  [optional] |
| **createdOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the webhook was created. |  [optional] |
| **modifiedBy** | [**EmployeeDto**](EmployeeDto.md) | The user parameters. |  [optional] |
| **modifiedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the webhook was modified. |  [optional] |
| **lastFailureOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time of the webhook last failure. |  [optional] |
| **lastFailureContent** | **kotlin.String** | The webhook last failure content. |  [optional] |
| **lastSuccessOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time of the webhook last success. |  [optional] |



