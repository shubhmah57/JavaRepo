package service.Impl;

import Model.PersistenceResponse;
import Model.SearchResponse;
import Repository.DynamoDBOperations;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import constants.OutputEnum;
import helper.StringHelper;
import org.apache.http.HttpStatus;
import service.DataBaseService;

import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import static constants.RequestHandlerConstants.*;

public class DataBaseServiceImpl implements DataBaseService {

    PersistenceResponse persistenceResponse;
    String voice;
    String text;
    Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    Context context;
    @Override
    public PersistenceResponse persistDynamoDB(APIGatewayProxyRequestEvent
                                                                    apiGatewayProxyRequestEvent) {
        try {
            String requestId = callPersistOperation(apiGatewayProxyRequestEvent);
            if(StringHelper.isStringNotEmptyNotNull(requestId))
                preparePersistenceSuccessResponse(requestId);
            else
                prepareFailureResponse();
        } catch (Exception e) {
            prepareFailureResponse();
            e.printStackTrace();
        }
        return persistenceResponse;
    }

    @Override
    public SearchResponse queryDB(String postId, Context context) {
        context.getLogger().log("query postId");
        DynamoDBOperations dbOperations = new DynamoDBOperations();
        Item outcome = null;
        SearchResponse searchResponse;
        try {
            System.out.println("Attempting to read the item...");
            outcome  = dbOperations.queryOperation(postId, context);
            System.out.println("The outcome is :" + outcome);

            if(null != outcome){
                searchResponse = prepareSearchResponse(outcome);
            }
            else{
                searchResponse = prepareSearchResponseFailureResponse();
            }
            System.out.println("GetItem succeeded: " + outcome);

        }
        catch (Exception e) {
            searchResponse = prepareSearchResponseFailureResponse();
            System.err.println(e.getMessage());
        }
        context.getLogger().log("completed query postId" + searchResponse.getHttpStatusCode()) ;
        return searchResponse;
    }

    private SearchResponse prepareSearchResponseFailureResponse() {
        System.out.println("Preparing Search Failure response....");
        SearchResponse searchResponse =
                new SearchResponse(NOT_APPLICABLE, NOT_APPLICABLE,
                        NOT_APPLICABLE, NOT_APPLICABLE, NOT_APPLICABLE,HttpStatus.SC_INTERNAL_SERVER_ERROR);
        return searchResponse;
    }

    private SearchResponse prepareSearchResponse(Item outcome) {
        System.out.println("Preparing Search Success Response");
        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setUrl(outcome.get("S3Location").toString());
        searchResponse.setId(outcome.get("id").toString());
        searchResponse.setStatus(outcome.get("status").toString());

        Map<String, Object> objectMap =  outcome.getMap("info");
        System.out.println("Map size is :" + objectMap.size());
        searchResponse.setText(objectMap.get("text").toString());
        searchResponse.setVoice(objectMap.get("voice").toString());
        searchResponse.setHttpStatusCode(HttpStatus.SC_OK);
        System.out.println("Finished Search Success Response");
        return searchResponse;
    }

    private String  callPersistOperation(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent) {
        String persistOutput = null;
        Map<String, String> queryStringParameters = apiGatewayProxyRequestEvent
                .getQueryStringParameters();
        DynamoDBOperations dynamoDB = new DynamoDBOperations();
        voice = queryStringParameters.get(VOICE);
        text = queryStringParameters.get(TEXT);
        if (StringHelper.isStringNotEmptyNotNull(voice) && StringHelper.isStringNotEmptyNotNull(text))
        {
            persistOutput = dynamoDB.persistOperation(voice, text);
        }
        return persistOutput;
    }

    public void prepareFailureResponse() {
        persistenceResponse = new
                PersistenceResponse(NOT_APPLICABLE, NOT_APPLICABLE,NOT_APPLICABLE, new Date(),INTERNAL_SERVER_ERROR);
    }

    public void preparePersistenceSuccessResponse(String requestId) {
        persistenceResponse =
                new PersistenceResponse(requestId, voice, text, new Date(), SUCCESS_RESPONSE_CODE);
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
