
# UserConfig

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The account the changes are recorded under. Two sessions carrying the same value are taken by the editors for  the same person. |  [optional] |
| **name** | **kotlin.String** | The name shown next to the changes and in the list of participants. |  [optional] |
| **image** | **kotlin.String** | An absolute address of the avatar shown for this participant. |  [optional] |
| **roles** | **kotlin.collections.List&lt;kotlin.String&gt;** | The filling roles this participant holds in the form being filled out. It is set only for a form in a virtual  data room, where the role decides which fields open for them. |  [optional] |
| **customerId** | **kotlin.String** | Identifies the paying customer this participant belongs to, on deployments where the editors are licensed per  customer. |  [optional] |



