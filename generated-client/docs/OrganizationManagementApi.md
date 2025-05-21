# OrganizationManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**organizationsGet**](OrganizationManagementApi.md#organizationsGet) | **GET** /organizations | Get all organizations |
| [**organizationsIdOrganizationChildrenGet**](OrganizationManagementApi.md#organizationsIdOrganizationChildrenGet) | **GET** /organizations/{idOrganization}/children | Get child departments or teams of an organization |
| [**organizationsIdOrganizationDelete**](OrganizationManagementApi.md#organizationsIdOrganizationDelete) | **DELETE** /organizations/{idOrganization} | Delete an organization |
| [**organizationsIdOrganizationGet**](OrganizationManagementApi.md#organizationsIdOrganizationGet) | **GET** /organizations/{idOrganization} | Get details of an organization |
| [**organizationsIdOrganizationPut**](OrganizationManagementApi.md#organizationsIdOrganizationPut) | **PUT** /organizations/{idOrganization} | Update an organization |
| [**organizationsPost**](OrganizationManagementApi.md#organizationsPost) | **POST** /organizations | Create a new organization |
| [**organizationsSearchGet**](OrganizationManagementApi.md#organizationsSearchGet) | **GET** /organizations/search | Search organizations by name or type |


<a id="organizationsGet"></a>
# **organizationsGet**
> List&lt;Organization&gt; organizationsGet()

Get all organizations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    try {
      List<Organization> result = apiInstance.organizationsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of organizations |  -  |

<a id="organizationsIdOrganizationChildrenGet"></a>
# **organizationsIdOrganizationChildrenGet**
> List&lt;Organization&gt; organizationsIdOrganizationChildrenGet(idOrganization)

Get child departments or teams of an organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    Integer idOrganization = 56; // Integer | 
    try {
      List<Organization> result = apiInstance.organizationsIdOrganizationChildrenGet(idOrganization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsIdOrganizationChildrenGet");
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

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of child departments or teams |  -  |

<a id="organizationsIdOrganizationDelete"></a>
# **organizationsIdOrganizationDelete**
> organizationsIdOrganizationDelete(idOrganization)

Delete an organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    Integer idOrganization = 56; // Integer | 
    try {
      apiInstance.organizationsIdOrganizationDelete(idOrganization);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsIdOrganizationDelete");
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
| **204** | Organization deleted successfully |  -  |

<a id="organizationsIdOrganizationGet"></a>
# **organizationsIdOrganizationGet**
> Organization organizationsIdOrganizationGet(idOrganization)

Get details of an organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    Integer idOrganization = 56; // Integer | 
    try {
      Organization result = apiInstance.organizationsIdOrganizationGet(idOrganization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsIdOrganizationGet");
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

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization details |  -  |

<a id="organizationsIdOrganizationPut"></a>
# **organizationsIdOrganizationPut**
> organizationsIdOrganizationPut(idOrganization, organizationUpdate)

Update an organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    Integer idOrganization = 56; // Integer | 
    OrganizationUpdate organizationUpdate = new OrganizationUpdate(); // OrganizationUpdate | 
    try {
      apiInstance.organizationsIdOrganizationPut(idOrganization, organizationUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsIdOrganizationPut");
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
| **organizationUpdate** | [**OrganizationUpdate**](OrganizationUpdate.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization updated successfully |  -  |

<a id="organizationsPost"></a>
# **organizationsPost**
> Organization organizationsPost(organizationCreate)

Create a new organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    OrganizationCreate organizationCreate = new OrganizationCreate(); // OrganizationCreate | 
    try {
      Organization result = apiInstance.organizationsPost(organizationCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsPost");
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
| **organizationCreate** | [**OrganizationCreate**](OrganizationCreate.md)|  | |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Organization created successfully |  -  |

<a id="organizationsSearchGet"></a>
# **organizationsSearchGet**
> List&lt;Organization&gt; organizationsSearchGet(name, type)

Search organizations by name or type

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    String name = "name_example"; // String | 
    String type = "Company"; // String | 
    try {
      List<Organization> result = apiInstance.organizationsSearchGet(name, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#organizationsSearchGet");
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
| **name** | **String**|  | [optional] |
| **type** | **String**|  | [optional] [enum: Company, Department, Team] |

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Matching organizations |  -  |

