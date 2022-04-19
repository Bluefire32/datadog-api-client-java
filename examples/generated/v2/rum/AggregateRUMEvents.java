import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.RumApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    RumApi apiInstance = new RumApi(defaultClient);
    RUMAggregateRequest body = new RUMAggregateRequest(); // RUMAggregateRequest |
    try {
      RUMAnalyticsAggregateResponse result = apiInstance.aggregateRUMEvents(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#aggregateRUMEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}