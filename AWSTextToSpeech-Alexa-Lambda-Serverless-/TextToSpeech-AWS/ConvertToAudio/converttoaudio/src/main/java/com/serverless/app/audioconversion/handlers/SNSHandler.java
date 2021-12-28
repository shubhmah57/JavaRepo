package com.serverless.app.audioconversion.handlers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.model.UpdateItemResult;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import com.serverless.app.audioconversion.Factory.ObjectFactory;
import com.serverless.app.audioconversion.service.DynamoDBService;
import com.serverless.app.audioconversion.service.PollyService;
import com.serverless.app.audioconversion.service.S3Service;

import static com.serverless.app.audioconversion.Constants.AppConstants.PROCESSED_STATUS;

public class SNSHandler implements RequestHandler<SNSEvent, Object> {

    Map<String, Object> outPutMap = null;
    UpdateItemResult updateItemResult;

    public Object handleRequest(SNSEvent request, Context context) {
        DynamoDBService dynamoDBService = ObjectFactory.getDynamoDbService();
        PollyService pollyService = ObjectFactory.getPollyService();
        S3Service s3Service = ObjectFactory.getS3Service();
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").
                format(Calendar.getInstance().getTime());
        context.getLogger().log("Invocation started: " + timeStamp);
        context.getLogger().log(request.getRecords().get(0).getSNS().getMessage());
        String requestId = request.getRecords().get(0).getSNS().getMessage();
        Item outcome = dynamoDBService.queryDynamoDB(requestId);

        if (null != outcome) {
            outPutMap = outcome.getMap("info");
            context.getLogger().log("Map Size is" + outPutMap.size());
            context.getLogger().log("Values are:" +
                    outPutMap.get("voice") + outPutMap.get("text"));
            String voice = outPutMap.get("voice").toString();
            String text = outPutMap.get("text").toString();
            String path = pollyService.synthesizeSpeech(voice, text, requestId);
            context.getLogger().log("The path saved is :" + path);
            String location = s3Service.uploadTOS3(path, requestId);
            /*Need to update Dynamo DB here */
            if (null != location) {
                updateItemResult =
                        dynamoDBService.updateService(PROCESSED_STATUS, location, requestId);
            }

            context.getLogger().log("The Saved Location is :" + location);
            context.getLogger().log("The Update Item Result :" +
                    updateItemResult.getSdkHttpMetadata().getHttpStatusCode());

        } else {
            /* Need to Throw Exception to stop further flow*/
            context.getLogger().log("Map Size is" + outPutMap.size());
            context.getLogger().log("Values are:" + "Read Operation failed...");
        }

        timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        context.getLogger().log("Invocation completed: " + timeStamp);
        return null;
    }
} 