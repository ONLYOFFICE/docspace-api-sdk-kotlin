
# AuditTrailModuleMapperDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **moduleType** | **kotlin.String** | The location inside the product, as the `moduleType` filter of `GET api/2.0/security/audit/events/filter`  spells it. |  [optional] |
| **actions** | [**kotlin.collections.List&lt;AuditTrailActionMapperDto&gt;**](AuditTrailActionMapperDto.md) | Every action this module can record. Each action appears under exactly one module, so this tree is where a  caller learns which module a given action belongs to. |  [optional] |



