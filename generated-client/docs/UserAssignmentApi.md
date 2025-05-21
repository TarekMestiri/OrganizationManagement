# UserAssignmentApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**organizationsIdOrganizationAssignUserUserIdPost**](UserAssignmentApi.md#organizationsIdOrganizationAssignUserUserIdPost) | **POST** /organizations/{idOrganization}/assign-user/{userId} | Assign a user to a department or team |
| [**organizationsIdOrganizationRemoveUserUserIdDelete**](UserAssignmentApi.md#organizationsIdOrganizationRemoveUserUserIdDelete) | **DELETE** /organizations/{idOrganization}/remove-user/{userId} | Remove a user from a department or team |


<a id="organizationsIdOrganizationAssignUserUserIdPost"></a>
# **organizationsIdOrganizationAssignUserUserIdPost**
> organizationsIdOrganizationAssignUserUserIdPost(idOrganization, userId)

Assign a user to a department or team

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAssignmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserAssignmentApi apiInstance = new UserAssignmentApi(defaultClient);
    Integer idOrganization = 56; // Integer | 
    Integer userId = 56; // Integer | 
    try {
      apiInstance.organizationsIdOrganizationAssignUserUserIdPost(idOrganization, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAssignmentApi#organizationsIdOrganizationAssignUserUserIdPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idOrganization** | **Integer**|  | |
| **userId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User assigned successfully |  -  |

<a id="organizationsIdOrganizationRemoveUserUserIdDelete"></a>
# **organizationsIdOrganizationRemoveUserUserIdDelete**
> organizationsIdOrganizationRemoveUserUserIdDelete(idOrganization, userId)

Remove a user from a department or team

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAssignmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserAssignmentApi apiInstance = new UserAssignmentApi(defaultClient);
    Integer idOrganization = 56; // Integer | 
    Integer userId = 56; // Integer | 
    try {
      apiInstance.organizationsIdOrganizationRemoveUserUserIdDelete(idOrganization, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAssignmentApi#organizationsIdOrganizationRemoveUserUserIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idOrganization** | **Integer**|  | |
| **userId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User removed successfully |  -  |

