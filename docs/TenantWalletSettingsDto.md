
# TenantWalletSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **kotlin.Boolean** | Whether the payment method on file is charged automatically when the wallet balance runs low. |  [optional] |
| **minBalance** | **kotlin.Int** | The balance below which a top-up is charged, in `currency`; 0 while top-up has never been configured. |  [optional] |
| **upToBalance** | **kotlin.Int** | The balance a top-up brings the wallet up to, in `currency`; 0 while top-up has never been configured. |  [optional] |
| **currency** | **kotlin.String** | The three-letter ISO 4217 code both amounts are expressed in, or `null` while top-up has never been configured. |  [optional] |
| **lowBalanceThreshold** | **kotlin.Int** | The wallet balance below which the portal sends its low-balance warning. The portal maintains it; it cannot be  set by a request. |  [optional] |
| **lowBalanceNotified** | **kotlin.Boolean** | Whether the low-balance warning has already been sent for the current dip below `lowBalanceThreshold`. The  portal maintains it, and switching top-up on re-arms it. |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the settings were last stored; when they were never stored, the moment they were read instead. |  [optional] |



