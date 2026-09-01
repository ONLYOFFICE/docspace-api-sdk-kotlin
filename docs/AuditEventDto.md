
# AuditEventDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The audit event ID. |  [optional] |
| **date** | [**ApiDateTime**](ApiDateTime.md) | The API date and time parameters. |  [optional] |
| **user** | **kotlin.String** | The name of the user who triggered the audit event. |  [optional] |
| **userId** | [**java.util.UUID**](java.util.UUID.md) | The ID of the user who triggered the audit event. |  [optional] |
| **action** | **kotlin.String** | The audit event action. |  [optional] |
| **actionId** | [**MessageAction**](MessageAction.md) | The event action ID. |  [optional] |
| **ip** | **kotlin.String** | The audit event IP. |  [optional] |
| **country** | **kotlin.String** | The audit event country. |  [optional] |
| **city** | **kotlin.String** | The audit event city. |  [optional] |
| **browser** | **kotlin.String** | The audit event browser. |  [optional] |
| **platform** | **kotlin.String** | The audit event platform. |  [optional] |
| **page** | **kotlin.String** | The audit event page. |  [optional] |
| **actionType** | [**ActionType**](ActionType.md) | The type of action performed in the audit event (e.g., Create, Update, Delete). |  [optional] |
| **product** | [**ProductType**](ProductType.md) | The type of product related to the audit event. |  [optional] |
| **location** | [**LocationType**](LocationType.md) | The location where the audit event occurred. |  [optional] |
| **target** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of target objects affected by the audit event (e.g., document ID, user account). |  [optional] |
| **propertyEntries** | [**kotlin.collections.List&lt;EntryType&gt;**](EntryType.md) | The list of audit entry types (e.g., Folder, User, File). |  [optional] |
| **context** | **kotlin.String** | The audit event context. |  [optional] |



