
# UpcomingPaymentDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The quota ID. |  [optional] |
| **name** | **kotlin.String** | The quota name. |  [optional] |
| **title** | **kotlin.String** | The quota title. |  [optional] |
| **unitOfMeasure** | **kotlin.String** | The quota unit of measure. |  [optional] |
| **quantity** | **kotlin.Int** | The quantity that will be charged (the next quantity if set, otherwise the current quantity). |  [optional] |
| **wallet** | **kotlin.Boolean** | The quota applies to the wallet or not. |  [optional] |
| **dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The due date of the upcoming payment in the portal time zone. |  [optional] |
| **amount** | **kotlin.Double** | The amount that will be charged (unit price multiplied by the quantity). |  [optional] |
| **currency** | **kotlin.String** | The three-character ISO 4217 currency symbol of the amount. |  [optional] |



