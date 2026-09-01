
# Quota

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The quota ID. |  [optional] |
| **quantity** | **kotlin.Int** | The quota quantity. |  [optional] |
| **wallet** | **kotlin.Boolean** | The quota applies to the wallet or not |  [optional] |
| **dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The quota due date. |  [optional] |
| **nextQuantity** | **kotlin.Int** | The quota next quantity. |  [optional] |
| **additional** | **kotlin.Boolean** | Indicates whether the quota is primary or additional. |  [optional] |
| **nextQuota** | **kotlin.Int** | The quota ID to switch to at the next period. |  [optional] |
| **state** | [**QuotaState**](QuotaState.md) | The quota state. |  [optional] |



