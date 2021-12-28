package com.serverless.app.audioconversion.service.Implementation;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateItemResult;
import com.serverless.app.audioconversion.service.DynamoDBService;

import static com.serverless.app.audioconversion.Constants.AppConstants.*;

public class DynamoDBServiceImpl implements DynamoDBService {

    @Override
    public Item queryDynamoDB(String requestId) {
        Table table = getTable();
        Item outcome = null;
        int year = 2015;
        String title = "The Big New Movie";

        GetItemSpec spec = new GetItemSpec().
                withPrimaryKey("id", requestId);

        try {

            System.out.println("Attempting to read the item...");
            outcome = table.getItem(spec);
            System.out.println("GetItem succeeded: " + outcome);

        }
        catch (Exception e) {
            System.err.println("Unable to read item: " + year + " " + title);
            System.err.println(e.getMessage());
        }
        return outcome;
    }

    private Table getTable() {
        AmazonDynamoDB dbClient = getDynamoDBClient();
        DynamoDB dynamoDB = new DynamoDB(dbClient);
        Table table = dynamoDB.getTable(TABLE_NAME);
        return table;
    }

    @Override
    public UpdateItemResult updateService(String status, String url, String requestId) {
        AmazonDynamoDB dynamoDBClient = getDynamoDBClient();
        UpdateItemRequest updateItemRequest = new UpdateItemRequest()
                .withTableName(TABLE_NAME)
                .addKeyEntry("id",new AttributeValue().withS(requestId))
                .addAttributeUpdatesEntry("status", new AttributeValueUpdate()
                .withValue(new AttributeValue().withS(PROCESSED_STATUS )))
                .addAttributeUpdatesEntry("S3Location", new AttributeValueUpdate()
                .withValue(new AttributeValue().withS(url)));
        UpdateItemResult updateItemResult = dynamoDBClient.updateItem(updateItemRequest);
        return updateItemResult;
    }

    private AmazonDynamoDB getDynamoDBClient() {

        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withRegion(AWS_REGION)
                .build();
        return client;
    }
}
