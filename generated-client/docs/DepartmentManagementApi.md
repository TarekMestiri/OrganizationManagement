# DepartmentManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**departmentsGet**](DepartmentManagementApi.md#departmentsGet) | **GET** /departments | Get all departments |
| [**departmentsIdDepartmentDelete**](DepartmentManagementApi.md#departmentsIdDepartmentDelete) | **DELETE** /departments/{idDepartment} | Delete a department |
| [**departmentsIdDepartmentGet**](DepartmentManagementApi.md#departmentsIdDepartmentGet) | **GET** /departments/{idDepartment} | Get department details |
| [**departmentsIdDepartmentPut**](DepartmentManagementApi.md#departmentsIdDepartmentPut) | **PUT** /departments/{idDepartment} | Update a department |
| [**departmentsPost**](DepartmentManagementApi.md#departmentsPost) | **POST** /departments | Create a department |


<a id="departmentsGet"></a>
# **departmentsGet**
> List&lt;Department&gt; departmentsGet()

Get all departments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DepartmentManagementApi apiInstance = new DepartmentManagementApi(defaultClient);
    try {
      List<Department> result = apiInstance.departmentsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentManagementApi#departmentsGet");
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

[**List&lt;Department&gt;**](Department.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of departments |  -  |

<a id="departmentsIdDepartmentDelete"></a>
# **departmentsIdDepartmentDelete**
> departmentsIdDepartmentDelete(idDepartment)

Delete a department

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DepartmentManagementApi apiInstance = new DepartmentManagementApi(defaultClient);
    Integer idDepartment = 56; // Integer | 
    try {
      apiInstance.departmentsIdDepartmentDelete(idDepartment);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentManagementApi#departmentsIdDepartmentDelete");
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
| **idDepartment** | **Integer**|  | |

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
| **204** | Department deleted |  -  |

<a id="departmentsIdDepartmentGet"></a>
# **departmentsIdDepartmentGet**
> Department departmentsIdDepartmentGet(idDepartment)

Get department details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DepartmentManagementApi apiInstance = new DepartmentManagementApi(defaultClient);
    Integer idDepartment = 56; // Integer | 
    try {
      Department result = apiInstance.departmentsIdDepartmentGet(idDepartment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentManagementApi#departmentsIdDepartmentGet");
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
| **idDepartment** | **Integer**|  | |

### Return type

[**Department**](Department.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Department details |  -  |

<a id="departmentsIdDepartmentPut"></a>
# **departmentsIdDepartmentPut**
> departmentsIdDepartmentPut(idDepartment, departmentUpdate)

Update a department

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DepartmentManagementApi apiInstance = new DepartmentManagementApi(defaultClient);
    Integer idDepartment = 56; // Integer | 
    DepartmentUpdate departmentUpdate = new DepartmentUpdate(); // DepartmentUpdate | 
    try {
      apiInstance.departmentsIdDepartmentPut(idDepartment, departmentUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentManagementApi#departmentsIdDepartmentPut");
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
| **idDepartment** | **Integer**|  | |
| **departmentUpdate** | [**DepartmentUpdate**](DepartmentUpdate.md)|  | |

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
| **200** | Department updated |  -  |

<a id="departmentsPost"></a>
# **departmentsPost**
> Department departmentsPost(departmentCreate)

Create a department

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DepartmentManagementApi apiInstance = new DepartmentManagementApi(defaultClient);
    DepartmentCreate departmentCreate = new DepartmentCreate(); // DepartmentCreate | 
    try {
      Department result = apiInstance.departmentsPost(departmentCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentManagementApi#departmentsPost");
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
| **departmentCreate** | [**DepartmentCreate**](DepartmentCreate.md)|  | |

### Return type

[**Department**](Department.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Department created |  -  |

