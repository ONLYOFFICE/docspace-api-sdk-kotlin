
# RoomTemplateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int** | The identifier of the room the template is built from. Take it from the room listing of  `GET api/2.0/files/rooms`; a folder identifier is not accepted. |  |
| **title** | **kotlin.String** | The title the template is saved under in the Templates section. Characters that a folder name cannot contain  are replaced with an underscore on save, and two templates may share a title. |  |
| **logo** | [**LogoRequest**](LogoRequest.md) | A picture of the caller's own for the template, cropped out of an image already placed in the temporary  storage. |  [optional] |
| **copyLogo** | **kotlin.Boolean** | Whether the template takes over the picture already set on the source room. When false the template gets no  picture from that room. |  [optional] |
| **share** | **kotlin.collections.List&lt;kotlin.String&gt;** | The email addresses of the portal members who are granted read access to the finished template. |  [optional] |
| **groups** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The identifiers of the portal groups whose members are granted read access to the finished template. |  [optional] |
| **&#x60;public&#x60;** | **kotlin.Boolean** | Whether the finished template is shared with everyone allowed to create rooms. When false it stays reachable  only for the recipients named for it. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels attached to the template and shown next to it in listings. |  [optional] |
| **color** | **kotlin.String** | The accent colour of the generated cover, written as six hexadecimal digits with no leading hash sign. When it  is left empty a colour is picked at random. |  [optional] |
| **cover** | **kotlin.String** | The identifier of a built-in cover picture, as listed by `GET api/2.0/files/rooms/covers`. When it is left  empty the template gets no cover. |  [optional] |
| **quota** | **kotlin.Long** | The storage limit assigned to the template, in bytes. When it is not set the template keeps the limit of the  source room. |  [optional] |



