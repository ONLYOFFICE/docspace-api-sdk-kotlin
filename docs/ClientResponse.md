
# ClientResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The client name. |  [optional] |
| **description** | **kotlin.String** | The client description. |  [optional] |
| **tenant** | **kotlin.Long** | The tenant ID associated with the client. |  [optional] |
| **scopes** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The client scopes. |  [optional] |
| **enabled** | **kotlin.Boolean** | Specifies if the client is currently enabled or not. |  [optional] |
| **clientId** | **kotlin.String** | The client identifier issued to the client during registration. |  [optional] |
| **clientSecret** | **kotlin.String** | The client secret issued to the client during registration. |  [optional] |
| **websiteUrl** | **kotlin.String** | The URL to the client's website. |  [optional] |
| **termsUrl** | **kotlin.String** | The URL to the client's terms of service. |  [optional] |
| **policyUrl** | **kotlin.String** | The URL to the client's privacy policy. |  [optional] |
| **logo** | **kotlin.String** | The URL to the client's logo. |  [optional] |
| **authenticationMethods** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The authentication methods supported by the client. |  [optional] |
| **redirectUris** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The list of allowed redirect URIs. |  [optional] |
| **allowedOrigins** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The list of allowed CORS origins. |  [optional] |
| **logoutRedirectUris** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The list of allowed logout redirect URIs. |  [optional] |
| **createdOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the client was created. |  [optional] |
| **createdBy** | **kotlin.String** | The user who created the client. |  [optional] |
| **modifiedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the client was last modified. |  [optional] |
| **modifiedBy** | **kotlin.String** | The user who last modified the client. |  [optional] |
| **isPublic** | **kotlin.Boolean** | Indicates whether the client is accessible by third-party tenants. |  [optional] |



