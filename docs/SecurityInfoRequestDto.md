
# SecurityInfoRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **folderIds** | [**kotlin.collections.List&lt;DuplicateRequestDtoAllOfFileIds&gt;**](DuplicateRequestDtoAllOfFileIds.md) | The folders and rooms whose rights are being changed, identified as a listing operation returns them - a  number on the portal, a string on a connected third-party account. |  [optional] |
| **fileIds** | [**kotlin.collections.List&lt;DuplicateRequestDtoAllOfFileIds&gt;**](DuplicateRequestDtoAllOfFileIds.md) | The files whose rights are being changed, identified as a listing operation returns them - a number on the  portal, a string on a connected third-party account. |  [optional] |
| **share** | [**kotlin.collections.List&lt;FileShareParams&gt;**](FileShareParams.md) | One record per account or group whose rights are being set, each naming the subject and the level it gets on  all of the listed entries; a level of `None` takes the access away. An empty collection makes the call change  nothing. |  [optional] |
| **notify** | **kotlin.Boolean** | Set to true to have every account named in `share` emailed about the access it just received; false changes  the rights without telling anyone. |  [optional] |
| **sharingMessage** | **kotlin.String** | The text put into that email, ignored while `notify` is false. Markup is stripped before sending, so only the  plain text of the value survives. |  [optional] |



