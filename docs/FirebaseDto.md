
# FirebaseDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **apiKey** | **kotlin.String** | The web API key of the project. Every field of this object is an empty string on an installation that  configures no Firebase project, and an empty `projectId` is the cheapest thing to test for before  initialising an SDK. None of these values is a secret - they are meant to be embedded in a client. |  |
| **authDomain** | **kotlin.String** | The host the Firebase SDK performs its own authentication against. |  |
| **projectId** | **kotlin.String** | The identifier of the Firebase project itself, which ties all the other fields together. |  |
| **storageBucket** | **kotlin.String** | The Cloud Storage bucket of the project. The portal does not store portal files there; it is part of the  SDK configuration. |  |
| **messagingSenderId** | **kotlin.String** | The sender ID that push messages of this project arrive under, which a client checks an incoming message  against. |  |
| **appId** | **kotlin.String** | The identifier of the Firebase application registration this client is to use. |  |
| **measurementId** | **kotlin.String** | The Google Analytics measurement ID of the project, empty when the project reports no analytics. |  |
| **databaseURL** | **kotlin.String** | The Realtime Database endpoint of the project, empty when the project has no such database. |  |



