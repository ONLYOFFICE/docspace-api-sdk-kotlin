
# AiThreadMessageLikeContentAnyOfInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | **kotlin.String** | Part kind: `text`, `reasoning`, `source`, `image`, `file`, `audio`, `data` or `tool-call`. |  |
| **text** | **kotlin.String** | The text of a `text` or `reasoning` part. |  [optional] |
| **parentId** | **kotlin.String** | Id of the part this one belongs to, on `text`, `reasoning`, `source` and `tool-call` parts. On a `reasoning` part the chat library keeps the provider's thinking signature here. |  [optional] |
| **sourceType** | **kotlin.String** | A `source` part's source kind; always `url`. |  [optional] |
| **id** | **kotlin.String** | A `source` part's id. |  [optional] |
| **url** | **kotlin.String** | A `source` part's URL. |  [optional] |
| **title** | **kotlin.String** | A `source` part's title. |  [optional] |
| **image** | **kotlin.String** | An `image` part's picture, as a URL (usually a `data:` URL). For an image the user attached, a JSON string `{ ref, title, kind: image }` naming the stored attachment instead. |  [optional] |
| **mimeType** | **kotlin.String** | A `file` part's media type. For a file the user attached, a JSON string `{ ref, title, kind: file, path, type }` naming the stored attachment instead - the chat library carries the reference here. |  [optional] |
| **&#x60;data&#x60;** | **kotlin.String** | A `file` part's content; empty when the part references an attachment. (A `data` part would carry its payload here too, as any JSON value; neither the chat library nor this service writes one.) |  [optional] |
| **filename** | **kotlin.String** | The file name of a `file` or `image` part. |  [optional] |
| **name** | **kotlin.String** | An `image` part's display name, or a `data` part's name. |  [optional] |
| **audio** | [**AiThreadMessageLikeContentAnyOfInnerAudio**](AiThreadMessageLikeContentAnyOfInnerAudio.md) |  |  [optional] |
| **toolCallId** | **kotlin.String** | A `tool-call` part's call id. |  [optional] |
| **toolName** | **kotlin.String** | A `tool-call` part's tool name. |  [optional] |
| **args** | [**kotlin.Any**](.md) | A `tool-call` part's arguments. |  [optional] |
| **argsText** | **kotlin.String** | A `tool-call` part's arguments as the model streamed them, JSON text. |  [optional] |
| **result** | [**kotlin.Any**](.md) |  |  [optional] |
| **isError** | **kotlin.Boolean** | Whether a `tool-call` part's result is an error. |  [optional] |
| **artifact** | [**kotlin.Any**](.md) |  |  [optional] |
| **interrupt** | [**AiThreadMessageLikeContentAnyOfInnerInterrupt**](AiThreadMessageLikeContentAnyOfInnerInterrupt.md) |  |  [optional] |
| **messages** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) | Messages of a sub-agent run inside a `tool-call` part. |  [optional] |
| **metadata** | [**kotlin.Any**](.md) | Provider-specific data of a `tool-call` part - for a Gemini call, `{ thoughtSignature }`, which has to be sent back with the call. |  [optional] |



