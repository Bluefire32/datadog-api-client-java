import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.MetricsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    MetricBulkTagConfigCreateRequest body =
        new MetricBulkTagConfigCreateRequest(); // MetricBulkTagConfigCreateRequest |
    try {
      MetricBulkTagConfigResponse result = apiInstance.createBulkTagsMetricsConfiguration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#createBulkTagsMetricsConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}