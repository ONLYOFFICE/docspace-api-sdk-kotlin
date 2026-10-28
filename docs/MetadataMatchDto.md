
# MetadataMatchDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Int** | The ID of the metadata template the matching field belongs to. Null for a custom field, which belongs to no  template the API shows. |  [optional] |
| **fieldId** | **kotlin.Int** | The ID of the matching template field. Null for a custom field, which is addressed by its name alone. |  [optional] |
| **fieldName** | **kotlin.String** | The name of the matching field: the template field or the custom field as it is shown in the entry metadata. |  [optional] |
| **&#x60;value&#x60;** | **kotlin.String** | The stored value that holds the searched text, as it was written, not only the matching part of it. |  [optional] |



