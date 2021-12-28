package com.serverless.app.audioconversion.service;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.model.UpdateItemResult;

public interface DynamoDBService {

    public Item queryDynamoDB(String requestId);
    public UpdateItemResult updateService(String status, String url, String requesetId);
}
