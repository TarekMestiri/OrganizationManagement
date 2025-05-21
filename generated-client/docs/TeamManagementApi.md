# TeamManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**teamsGet**](TeamManagementApi.md#teamsGet) | **GET** /teams | Get all teams |
| [**teamsIdTeamDelete**](TeamManagementApi.md#teamsIdTeamDelete) | **DELETE** /teams/{idTeam} | Delete a team |
| [**teamsIdTeamGet**](TeamManagementApi.md#teamsIdTeamGet) | **GET** /teams/{idTeam} | Get team details |
| [**teamsIdTeamPut**](TeamManagementApi.md#teamsIdTeamPut) | **PUT** /teams/{idTeam} | Update a team |
| [**teamsPost**](TeamManagementApi.md#teamsPost) | **POST** /teams | Create a team |


<a id="teamsGet"></a>
# **teamsGet**
> List&lt;Team&gt; teamsGet()

Get all teams

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamManagementApi apiInstance = new TeamManagementApi(defaultClient);
    try {
      List<Team> result = apiInstance.teamsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamManagementApi#teamsGet");
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

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of teams |  -  |

<a id="teamsIdTeamDelete"></a>
# **teamsIdTeamDelete**
> teamsIdTeamDelete(idTeam)

Delete a team

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamManagementApi apiInstance = new TeamManagementApi(defaultClient);
    Integer idTeam = 56; // Integer | 
    try {
      apiInstance.teamsIdTeamDelete(idTeam);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamManagementApi#teamsIdTeamDelete");
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
| **idTeam** | **Integer**|  | |

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
| **204** | Team deleted |  -  |

<a id="teamsIdTeamGet"></a>
# **teamsIdTeamGet**
> Team teamsIdTeamGet(idTeam)

Get team details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamManagementApi apiInstance = new TeamManagementApi(defaultClient);
    Integer idTeam = 56; // Integer | 
    try {
      Team result = apiInstance.teamsIdTeamGet(idTeam);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamManagementApi#teamsIdTeamGet");
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
| **idTeam** | **Integer**|  | |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team details |  -  |

<a id="teamsIdTeamPut"></a>
# **teamsIdTeamPut**
> teamsIdTeamPut(idTeam, teamUpdate)

Update a team

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamManagementApi apiInstance = new TeamManagementApi(defaultClient);
    Integer idTeam = 56; // Integer | 
    TeamUpdate teamUpdate = new TeamUpdate(); // TeamUpdate | 
    try {
      apiInstance.teamsIdTeamPut(idTeam, teamUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamManagementApi#teamsIdTeamPut");
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
| **idTeam** | **Integer**|  | |
| **teamUpdate** | [**TeamUpdate**](TeamUpdate.md)|  | |

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
| **200** | Team updated |  -  |

<a id="teamsPost"></a>
# **teamsPost**
> Team teamsPost(teamCreate)

Create a team

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TeamManagementApi apiInstance = new TeamManagementApi(defaultClient);
    TeamCreate teamCreate = new TeamCreate(); // TeamCreate | 
    try {
      Team result = apiInstance.teamsPost(teamCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamManagementApi#teamsPost");
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
| **teamCreate** | [**TeamCreate**](TeamCreate.md)|  | |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Team created |  -  |

