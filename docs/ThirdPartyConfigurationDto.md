
# ThirdPartyConfigurationDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **document** | [**DocumentConfigDto**](DocumentConfigDto.md) | The document as the editors address it: its revision key, title, type, download address and the permissions of  this caller on it. |  |
| **documentType** | **kotlin.String** | The editor family the file opens in - `word`, `cell`, `slide`, `pdf` or `diagram`. It comes back empty for a  format no editor handles. |  |
| **editorConfig** | [**EditorConfigurationDto**](EditorConfigurationDto.md) | How the editor is set up for this opening: the mode, the language, the interface customization, the callback  the editors save through, and the account they attribute changes to. |  |
| **editorType** | [**EditorType**](EditorType.md) | The layout the configuration was actually built for. It echoes the requested one except where the room  overruled it, as the templates folder does by forcing the embedded viewer. |  |
| **editorUrl** | [**java.net.URI**](java.net.URI.md) | The address of the editor api script the client has to load, with the shard key of this document already  appended. Load it as it is given rather than assembling it by hand. |  |
| **file** | [**ThirdPartyFileDto**](ThirdPartyFileDto.md) | The file the configuration was built for, in the same shape the file listings report it. |  |
| **token** | **kotlin.String** | Signs this whole configuration so that the editors can trust it; anything a client changes in the  configuration invalidates it. It stays empty on a portal that has no signature secret configured for the  document service. |  [optional] |
| **type** | **kotlin.String** | The layout spelled as a lowercase word - `desktop`, `mobile` or `embedded` - the same value the editor type  carries as a number. |  [optional] |
| **errorMessage** | **kotlin.String** | Filled in when the document could not be prepared for opening; the rest of the configuration should then not  be handed to the editors. |  [optional] |
| **startFilling** | **kotlin.Boolean** | Whether this caller may start a filling session on the form from inside the editor. It stays empty when the  file is not a form opened where starting is possible at all. |  [optional] |
| **fillingStatus** | **kotlin.Boolean** | True once the caller holds a role in the running filling session of this form. It stays empty outside a  virtual data room, where roles are the only place it is set. |  [optional] |
| **startFillingMode** | [**StartFillingMode**](StartFillingMode.md) | Which filling button the editor offers: none at all, sharing the form out for others to fill, starting a  filling session, or starting one inside the form-filling room. |  [optional] |
| **fillingSessionId** | **kotlin.String** | Identifies the filling session this opening belongs to, and is empty when the document is not opened as part  of one. Submissions made in the editor are collected under it. |  [optional] |
| **quotaExceededScope** | [**QuotaScope**](QuotaScope.md) | Names the quota that ran out - the user, the room or the portal - and is set only when the document had to be  opened read-only because of it. |  [optional] |
| **generationToolCallState** | [**EditorToolCallStateDto**](EditorToolCallStateDto.md) | The generation the editor should run as soon as the document opens. It is set only for a document an AI agent  produced and left waiting for its content, and is empty for every other file. |  [optional] |



