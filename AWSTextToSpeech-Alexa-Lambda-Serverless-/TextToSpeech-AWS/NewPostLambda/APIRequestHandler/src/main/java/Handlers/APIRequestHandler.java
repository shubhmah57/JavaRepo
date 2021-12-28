package Handlers;

import Factory.ObjectFactory;
import Model.PersistenceResponse;
import Model.SNSResponse;
import Model.SearchResponse;
import com.amazonaws.HttpMethod;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import helper.ResponseHelper;
import service.DataBaseService;
import service.SNSService;

import static constants.RequestHandlerConstants.*;

public class APIRequestHandler implements RequestHandler<APIGatewayProxyRequestEvent,APIGatewayProxyResponseEvent> {

    APIGatewayProxyResponseEvent responseEvent;

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent,Context context) {
        DataBaseService dataBaseService = ObjectFactory.getDatabaseService();
        ResponseHelper responseHelper = new ResponseHelper();
        if(apiGatewayProxyRequestEvent.getHttpMethod().equals(HttpMethod.POST.toString())){
            context.getLogger().log("Entered handleRequest POST Method..");
            PersistenceResponse persistenceResponse = dataBaseService.
                                                persistDynamoDB(apiGatewayProxyRequestEvent);
            SNSResponse snsResponse= publishTopicSNS(persistenceResponse);
            responseEvent = responseHelper.
                    buildPersistenceResponse(persistenceResponse, snsResponse);
            context.getLogger().log("Exited handleRequest POST Method..");
        }
        if(apiGatewayProxyRequestEvent.getHttpMethod().equals(HttpMethod.GET.toString())){
            context.getLogger().log("Entered the Handle Request. GET Section");
            String postId = apiGatewayProxyRequestEvent.getQueryStringParameters().get("postId");
            System.out.println("The Post id is:" + postId);
            SearchResponse searchResponse = dataBaseService.queryDB(postId, context);
            responseEvent =
                    responseHelper.buildSearchResponse(searchResponse);
            context.getLogger().log("Exited the Handle Request. GET Section");
        }
        return responseEvent;
    }

    private SNSResponse publishTopicSNS(PersistenceResponse persistenceResponse) {

        SNSResponse snsResponse = null;

        if(persistenceResponse.getStatus() == SUCCESS_RESPONSE_CODE){
            SNSService snsService = ObjectFactory.getSNSService();
            snsResponse = snsService.pubTopic(persistenceResponse.getId());
        }

        return snsResponse;
    }


}