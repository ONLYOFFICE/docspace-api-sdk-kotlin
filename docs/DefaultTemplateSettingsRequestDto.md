
# DefaultTemplateSettingsRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **selectedFile** | [**DefaultTemplateSettingsRequestDtoSelectedFile**](DefaultTemplateSettingsRequestDtoSelectedFile.md) |  |  |
| **fileExtension** | **kotlin.String** | The extension the blank is set for, written in lower case with the leading dot. Only the extensions the  portal's built-in template set covers are accepted, and `GET api/2.0/files/settings/defaulttemplate` returns  exactly that list; an extension outside it leaves the settings unchanged instead of failing. |  |



