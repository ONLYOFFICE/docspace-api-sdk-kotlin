
# SetParticipantServiceLimitsRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The IDs of the portal users the limit is set for, as returned in `id` by the people operations. |  |
| **amountValue** | **kotlin.Double** | The most money the AI services may cost each user per period, in their currency, which cannot be chosen. Zero  blocks the AI services completely. |  [optional] |
| **quantityValue** | **kotlin.Int** | The largest quantity the AI services may consume per period for each user, in their common unit. Zero blocks the  AI services completely. |  [optional] |
| **period** | [**ServiceLimitPeriod**](ServiceLimitPeriod.md) | The window the thresholds apply to, in UTC. A day, week or month is calendar-aligned rather than rolling - a  daily limit resets at midnight UTC, a weekly one on Monday - while a lifetime limit counts from its creation and  never resets. |  [optional] |



