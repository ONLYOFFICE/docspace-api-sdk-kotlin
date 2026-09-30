# CapabilitiesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getPortalCapabilities**](CapabilitiesApi.md#getPortalCapabilities) | **GET** api/2.0/capabilities | Get portal capabilities |



<a id="getPortalCapabilities"></a>
# **getPortalCapabilities**
> CapabilitiesWrapper getPortalCapabilities ()

Returns the sign-in methods this portal offers, which a login client needs before anyone has signed in: LDAP  authentication and its domain, the external identity providers to show, the SAML single sign-on URL and its  label, and whether the built-in identity server is available. No token is needed and nothing has to be called  first - the operation is open to unauthenticated callers, answers even while the portal's payment has lapsed,  and is read-only and idempotent. `providers` holds provider keys such as `google` or `facebook`, ordered for  the country detected from the caller's IP address and reduced to the ones this installation has configured;  pass one of them as `provider` to `POST api/2.0/authentication`. An empty `providers` means external sign-in  is off and an empty `ssoUrl` means single sign-on is off; a capability whose settings cannot be read is  reported as disabled rather than failing the call, so a false flag means the method is not offered, not that  it is unknown. The answer describes the portal and never a user, and carries none of the configuration behind  these methods: an administrator reads that from `GET api/2.0/settings/ssov2` and  `GET api/2.0/settings/authservice`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-capabilities/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CapabilitiesWrapper**](CapabilitiesWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CapabilitiesApi::class.java)

launch(Dispatchers.IO) {
    val result : CapabilitiesWrapper = webService.getPortalCapabilities()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

