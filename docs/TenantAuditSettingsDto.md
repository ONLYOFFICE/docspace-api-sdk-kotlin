
# TenantAuditSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **loginHistoryLifeTime** | **kotlin.Int** | How many days login events are kept, from 1 to 180; 180 when the portal never changed it. |  [optional] |
| **auditTrailLifeTime** | **kotlin.Int** | How many days audit trail events are kept, from 1 to 180; 180 when the portal never changed it. |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the pair was last stored; when it never was, the moment it was read instead. |  [optional] |



