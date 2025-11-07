
# Tariff

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The tariff due date. |  |
| **quotas** | [**kotlin.collections.List&lt;Quota&gt;**](Quota.md) | The list of tariff quotas. |  |
| **id** | **kotlin.Int** | The tariff ID. |  [optional] |
| **state** | [**TariffState**](TariffState.md) |  |  [optional] |
| **delayDueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The tariff delay due date. |  [optional] |
| **licenseDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The tariff license date. |  [optional] |
| **customerId** | **kotlin.String** | The tariff customer ID. |  [optional] |
| **overdueQuotas** | [**kotlin.collections.List&lt;Quota&gt;**](Quota.md) | The list of overdue tariff quotas. |  [optional] |



