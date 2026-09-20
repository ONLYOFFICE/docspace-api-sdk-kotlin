
# AuditTrailActionMapperDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageAction** | **kotlin.String** | The action name to send as the `action` filter of `GET api/2.0/security/audit/events/filter`, and the value  that comes back as `actionId` on an event. |  [optional] |
| **actionType** | **kotlin.String** | The kind of change the action makes, accepted by the `actionType` filter of the same operation. |  [optional] |
| **entity** | **kotlin.String** | The kind of object the action applies to, accepted by the `entryType` filter. It is `None` for an action  that targets no object, such as a settings change, and an action with a second object type reports only the  first one here. |  [optional] |



