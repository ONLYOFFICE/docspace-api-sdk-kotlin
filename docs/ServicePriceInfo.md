
# ServicePriceInfo

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The price unique identifier. |  [optional] |
| **accountNumber** | **kotlin.Int** | The account number. |  [optional] |
| **serviceId** | **kotlin.Int** | The service ID. |  [optional] |
| **timeUnit** | [**PriceTimeUnit**](PriceTimeUnit.md) | The time unit the price is bound to. |  [optional] |
| **costPrice** | **kotlin.Double** | The cost price. |  [optional] |
| **extraCharge** | **kotlin.Double** | The extra charge added to the cost price. |  [optional] |
| **servicePrice** | **kotlin.Double** | The resulting service price. |  [optional] |
| **quota** | **kotlin.Double** | The quota the price is set for. |  [optional] |
| **timeBound** | [**TimeBound**](TimeBound.md) | The period the price is effective in. |  [optional] |
| **status** | [**PriceStatus**](PriceStatus.md) | The price status. |  [optional] |
| **created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the price was created. |  [optional] |
| **discountCategoryId** | **kotlin.Int** | The discount category ID. |  [optional] |
| **discountCategory** | [**DiscountCategory**](DiscountCategory.md) | The discount category. |  [optional] |



