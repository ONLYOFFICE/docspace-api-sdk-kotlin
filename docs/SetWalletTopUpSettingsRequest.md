
# SetWalletTopUpSettingsRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **kotlin.Boolean** | Whether the payment method on file is charged automatically when the wallet balance runs low. |  [optional] |
| **minBalance** | **kotlin.Int** | The balance below which a top-up is charged, in `currency`. |  [optional] |
| **upToBalance** | **kotlin.Int** | The balance a top-up brings the wallet up to, in `currency`. |  [optional] |
| **currency** | **kotlin.String** | The three-letter ISO 4217 code both amounts are expressed in; it has to be the currency of the wallet. |  [optional] |
| **lowBalanceThreshold** | **kotlin.Int** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
| **lowBalanceNotified** | **kotlin.Boolean** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |



