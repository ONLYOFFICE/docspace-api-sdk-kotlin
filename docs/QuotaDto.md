
# QuotaDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The quota ID. |  |
| **price** | [**PriceDto**](PriceDto.md) | The price parameters. |  |
| **nonProfit** | **kotlin.Boolean** | Specifies if the quota is nonprofit or not. |  |
| **free** | **kotlin.Boolean** | Specifies if the quota is free or not. |  |
| **trial** | **kotlin.Boolean** | Specifies if the quota is trial or not. |  |
| **features** | [**kotlin.collections.List&lt;TenantQuotaFeatureDto&gt;**](TenantQuotaFeatureDto.md) | The list of tenant quota features. |  |
| **title** | **kotlin.String** | The quota title. |  [optional] |
| **usersQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) | The user quota. |  [optional] |
| **roomsQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) | The room quota. |  [optional] |
| **aiAgentsQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) | The ai agent quota. |  [optional] |
| **tenantCustomQuota** | [**TenantQuotaSettings**](TenantQuotaSettings.md) | The tenant custom quota. |  [optional] |
| **dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The due date. |  [optional] |



