
# WalletServiceDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The quota ID. |  |
| **title** | **kotlin.String** | The quota title. |  |
| **price** | [**PriceDto**](PriceDto.md) |  |  |
| **nonProfit** | **kotlin.Boolean** | Specifies if the quota is nonprofit or not. |  |
| **free** | **kotlin.Boolean** | Specifies if the quota is free or not. |  |
| **trial** | **kotlin.Boolean** | Specifies if the quota is trial or not. |  |
| **features** | [**kotlin.collections.List&lt;TenantQuotaFeatureDto&gt;**](TenantQuotaFeatureDto.md) | The list of tenant quota features. |  |
| **usersQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) |  |  [optional] |
| **roomsQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) |  |  [optional] |
| **aiAgentsQuota** | [**TenantEntityQuotaSettings**](TenantEntityQuotaSettings.md) |  |  [optional] |
| **tenantCustomQuota** | [**TenantQuotaSettings**](TenantQuotaSettings.md) |  |  [optional] |
| **dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The due date. |  [optional] |
| **innerServices** | [**kotlin.collections.List&lt;QuotaDto&gt;**](QuotaDto.md) | The list of inner services. |  [optional] |



