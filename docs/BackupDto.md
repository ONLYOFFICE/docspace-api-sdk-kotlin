
# BackupDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **storageType** | [**BackupStorageType**](BackupStorageType.md) | The storage the archive is written to. It defaults to `Documents`, and it decides which keys  `storageParams` has to carry. |  [optional] |
| **storageParams** | [**kotlin.collections.List&lt;ItemKeyValuePairObjectObject&gt;**](ItemKeyValuePairObjectObject.md) | The settings of the chosen storage, as an array of key and value pairs. `Documents` needs an integer  `folderId`, `ThridpartyDocuments` a provider-specific non-integer `folderId`, `Local` a `filePath`,  `ThirdPartyConsumer` a `module` plus the settings of that consumer, and `DataStore` none. The  `subdir` key is added by the operation itself and must not be sent. |  [optional] |
| **dump** | **kotlin.Boolean** | Backs up the whole server rather than this one portal. It requires the space access permission and  works on a standalone installation only. |  [optional] |



