package service;

import Model.PersistenceResponse;
import Model.SearchResponse;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public interface DataBaseService {

    public PersistenceResponse persistDynamoDB(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent);
    public SearchResponse queryDB(String postId, Context context);
}
