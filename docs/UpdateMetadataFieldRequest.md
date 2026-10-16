
# UpdateMetadataFieldRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The new field name. |  [optional] |
| **type** | [**MetadataFieldType**](MetadataFieldType.md) | The new field type. The type can be changed only while the field has no values. |  [optional] |
| **options** | [**kotlin.collections.List&lt;MetadataFieldOptionRequest&gt;**](MetadataFieldOptionRequest.md) | The new choice options of the field. The options in use cannot be removed. |  [optional] |
| **order** | **kotlin.Int** | The new display position of the field inside the template: the fields are shown by it ascending. |  [optional] |



