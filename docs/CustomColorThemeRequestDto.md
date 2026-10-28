
# CustomColorThemeRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The id of the custom theme to replace, or an id no stored theme has to add a new one. |  [optional] |
| **name** | **kotlin.String** | Accepted for compatibility with earlier clients and not read: a custom theme is always stored without a name. |  [optional] |
| **main** | [**ColorThemeColorsRequestDto**](ColorThemeColorsRequestDto.md) | The accent and button colours of the interface. Left out, a stored theme keeps its own. |  [optional] |
| **text** | [**ColorThemeColorsRequestDto**](ColorThemeColorsRequestDto.md) | The colours of the text shown on the accent and on the buttons. Left out, a stored theme keeps its own. |  [optional] |



