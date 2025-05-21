# SurveyManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**organizationsIdOrganizationAssignSurveySurveyIdPost**](SurveyManagementApi.md#organizationsIdOrganizationAssignSurveySurveyIdPost) | **POST** /organizations/{idOrganization}/assign-survey/{surveyId} | Assign a survey to a department or team |


<a id="organizationsIdOrganizationAssignSurveySurveyIdPost"></a>
# **organizationsIdOrganizationAssignSurveySurveyIdPost**
> organizationsIdOrganizationAssignSurveySurveyIdPost(idOrganization, surveyId)

Assign a survey to a department or team

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SurveyManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SurveyManagementApi apiInstance = new SurveyManagementApi(defaultClient);
    Integer idOrganization = 56; // Integer | 
    Integer surveyId = 56; // Integer | 
    try {
      apiInstance.organizationsIdOrganizationAssignSurveySurveyIdPost(idOrganization, surveyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyManagementApi#organizationsIdOrganizationAssignSurveySurveyIdPost");
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
| **surveyId** | **Integer**|  | |

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
| **200** | Survey assigned successfully |  -  |

