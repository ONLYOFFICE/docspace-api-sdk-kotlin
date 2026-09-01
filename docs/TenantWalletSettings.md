
# TenantWalletSettings

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **kotlin.Boolean** | Specifies whether automatic top-up for the tenant wallet is enabled. |  [optional] |
| **minBalance** | **kotlin.Int** | The minimum wallet balance at which automatic top-up will be triggered. Must be between 5 and 1000. |  [optional] |
| **upToBalance** | **kotlin.Int** | The maximum wallet balance at which automatic top-up will be triggered. Must be between 6 and 5000. |  [optional] |
| **currency** | **kotlin.String** | The three-character ISO 4217 currency symbol. |  [optional] |
| **lowBalanceThreshold** | **kotlin.Int** | The wallet balance below which a low-balance notification is sent. Set internally, not user-configurable. |  [optional] |
| **lowBalanceNotified** | **kotlin.Boolean** | Specifies whether a low-balance notification has already been sent for the current dip below ASC.Core.Tenants.TenantWalletSettings.LowBalanceThreshold. |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the tenant wallet settings were last modified. |  [optional] |



