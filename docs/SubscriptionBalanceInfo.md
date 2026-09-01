
# SubscriptionBalanceInfo

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **totalCost** | **kotlin.Double** | The total cost of the current billing period (the sum across all subscription items). |  [optional] |
| **currency** | **kotlin.String** | The three-character ISO 4217 currency symbol of the subscription. |  [optional] |
| **periodStart** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The start of the current billing period. |  [optional] |
| **periodEnd** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The end of the current billing period. |  [optional] |
| **periodUsedUntil** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The boundary of the used part of the period (the moment of the request). |  [optional] |
| **daysElapsed** | **kotlin.Int** | The number of days elapsed since the start of the period (inclusive). |  [optional] |
| **remainingBalance** | **kotlin.Double** | The unused balance of the subscription, in the subscription currency. |  [optional] |
| **remainingBalanceInWalletCurrency** | **kotlin.Double** | The unused balance of the subscription, converted to the wallet currency. |  [optional] |
| **walletCurrency** | **kotlin.String** | The three-character ISO 4217 currency symbol of the wallet. |  [optional] |



