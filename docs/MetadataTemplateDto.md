
# MetadataTemplateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The template ID. |  [optional] |
| **name** | **kotlin.String** | The template name. |  [optional] |
| **visible** | **kotlin.Boolean** | Specifies if the template is visible in the UI pickers. |  [optional] |
| **createBy** | [**EmployeeDto**](EmployeeDto.md) | The user who created the template. A user who has since left the portal comes back as the lost user placeholder. |  [optional] |
| **createOn** | [**ApiDateTime**](ApiDateTime.md) | The template creation date. |  [optional] |
| **modifiedBy** | [**EmployeeDto**](EmployeeDto.md) | The user who changed the template itself last: its name or its visibility. The creator until somebody changes  it; a change of a field is recorded on the field, not here. |  [optional] |
| **modifiedOn** | [**ApiDateTime**](ApiDateTime.md) | The date when the template was modified last. |  [optional] |
| **fields** | [**kotlin.collections.List&lt;MetadataFieldDto&gt;**](MetadataFieldDto.md) | The template metadata fields. |  [optional] |



