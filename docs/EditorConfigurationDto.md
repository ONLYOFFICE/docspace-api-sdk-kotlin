
# EditorConfigurationDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lang** | **kotlin.String** | The language of the editor configuration. |  |
| **mode** | **kotlin.String** | The mode of the editor configuration. |  |
| **callbackUrl** | [**java.net.URI**](java.net.URI.md) | The callback URL of the editor. |  [optional] |
| **coEditing** | [**CoEditingConfig**](CoEditingConfig.md) | The co-editing configuration parameters. |  [optional] |
| **createUrl** | **kotlin.String** | The creation URL of the editor. |  [optional] |
| **customization** | [**CustomizationConfigDto**](CustomizationConfigDto.md) | The customization configuration. |  [optional] |
| **embedded** | [**EmbeddedConfig**](EmbeddedConfig.md) | The configuration parameters for the embedded document type. |  [optional] |
| **encryptionKeys** | [**kotlin.collections.List&lt;EncryptionKeyDto&gt;**](EncryptionKeyDto.md) | The encryption keys of the editor configuration. |  [optional] |
| **modeWrite** | **kotlin.Boolean** | Specifies if the mode is write of the editor configuration. |  [optional] |
| **plugins** | [**PluginsConfig**](PluginsConfig.md) | The configuration settings to connect the special add-ons. |  [optional] |
| **recent** | [**kotlin.collections.List&lt;RecentConfig&gt;**](RecentConfig.md) | The recent configuration of the editor. |  [optional] |
| **templates** | [**kotlin.collections.List&lt;TemplatesConfig&gt;**](TemplatesConfig.md) | The templates of the editor configuration. |  [optional] |
| **user** | [**UserConfig**](UserConfig.md) | The configuration parameters of the user currently viewing or editing the document. |  [optional] |



