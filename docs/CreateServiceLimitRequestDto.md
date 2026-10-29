
# CreateServiceLimitRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **scope** | [**ServiceLimitScope**](ServiceLimitScope.md) | Whom the limit applies to. |  [optional] |
| **userId** | [**java.util.UUID**](java.util.UUID.md) | The ID of the portal user a personal limit is set for, as returned in `id` by the people operations. |  [optional] |
| **amountValue** | **kotlin.Double** | The most money the AI services may cost per period, in their currency, which cannot be chosen. Zero blocks the  AI services completely. |  [optional] |
| **quantityValue** | **kotlin.Int** | The largest quantity the AI services may consume per period, in their common unit. Zero blocks the AI services  completely. |  [optional] |
| **period** | [**ServiceLimitPeriod**](ServiceLimitPeriod.md) | The window the thresholds apply to, in UTC. A day, week or month is calendar-aligned rather than rolling - a  daily limit resets at midnight UTC, a weekly one on Monday - while a lifetime limit counts from its creation and  never resets. |  [optional] |



