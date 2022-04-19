import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);
    String webhookName = "webhookName_example"; // String | The name of the webhook.
    WebhooksIntegrationUpdateRequest body =
        new WebhooksIntegrationUpdateRequest(); // WebhooksIntegrationUpdateRequest | Update an
    // existing Datadog-Webhooks integration.
    try {
      WebhooksIntegration result = apiInstance.updateWebhooksIntegration(webhookName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksIntegrationApi#updateWebhooksIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}