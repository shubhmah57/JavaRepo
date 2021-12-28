package helper;

import Model.PersistenceResponse;
import Model.SNSResponse;
import Model.SearchResponse;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static constants.RequestHandlerConstants.*;

public class ResponseHelper {

    JSONObject object = new JSONObject();
    APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
    Map<String, String> headersMap = new HashMap<>();


    public APIGatewayProxyResponseEvent buildPersistenceResponse(PersistenceResponse persistenceResponse,
                                                                 SNSResponse snsResponse) {
        headersMap.put(RESPONSE_HEADER, RESPONSE_HEADER_VALUE);
        if(persistenceResponse.getStatus() == SUCCESS_RESPONSE_CODE && null!= snsResponse){
            object.put("Post-Id", persistenceResponse.getId());
            object.put("Voice",persistenceResponse.getVoice());
            object.put("Text", persistenceResponse.getText());
            object.put("RecordCreationDate", persistenceResponse.getDate());
            object.put("SNSResponseID", snsResponse.getMessageId());
            object.put("TopicPublishedDate", snsResponse.getDate());
            responseEvent.setBody(object.toString());
            responseEvent.setHeaders(headersMap);
            responseEvent.setStatusCode(SUCCESS_RESPONSE_CODE);
        }
        else {
            responseEvent.setBody(object.toString());
            responseEvent.setHeaders(headersMap);
            responseEvent.setStatusCode(INTERNAL_SERVER_ERROR);
        }
        return  responseEvent;
    }

    public APIGatewayProxyResponseEvent buildSearchResponse(SearchResponse searchResponse){
        headersMap.put(RESPONSE_HEADER, RESPONSE_HEADER_VALUE);
        if(searchResponse.getHttpStatusCode() == SUCCESS_RESPONSE_CODE && null!= searchResponse){
            object.put("url", searchResponse.getUrl());
            object.put("id", searchResponse.getId());
            object.put("voice", searchResponse.getVoice());
            object.put("text", searchResponse.getText());
            object.put("status", searchResponse.getStatus());
            responseEvent.setBody(object.toString());
            responseEvent.setHeaders(headersMap);
            responseEvent.setStatusCode(SUCCESS_RESPONSE_CODE);
        }
        else{
            responseEvent.setBody(object.toString());
            responseEvent.setHeaders(headersMap);
            responseEvent.setStatusCode(INTERNAL_SERVER_ERROR);
        }
        return  responseEvent;
    }

}
