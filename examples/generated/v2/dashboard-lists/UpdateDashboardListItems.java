import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.DashboardListsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);
    Long dashboardListId = 56L; // Long | ID of the dashboard list to update items from.
    DashboardListUpdateItemsRequest body =
        new DashboardListUpdateItemsRequest(); // DashboardListUpdateItemsRequest | New dashboards
    // of the dashboard list.
    try {
      DashboardListUpdateItemsResponse result =
          apiInstance.updateDashboardListItems(dashboardListId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardListsApi#updateDashboardListItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
