package Repository;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;
import com.amazonaws.services.lambda.runtime.Context;
import constants.OutputEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import static constants.RequestHandlerConstants.*;

public class DynamoDBOperations {
    Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public String persistOperation(String voice, String text) {

        Table table = getTable();

        Map<String, Object> recordsMap = new HashMap<String, Object>();
        recordsMap.put("voice", voice);
        recordsMap.put("text", text);


        String id = UUID.randomUUID().toString();

        try {
            System.out.println("Adding a new item...");

            table.putItem(new Item().withPrimaryKey(String.valueOf(OutputEnum.id), id)
                    .withString(String.valueOf(OutputEnum.status), STATUS)
                    .withString(String.valueOf(OutputEnum.S3Location), "--")
                            .withMap(String.valueOf(OutputEnum.info), recordsMap));
            System.out.println("Inserted Successfully" +  id);

        } catch (Exception e) {
            System.err.println("Unable to add item: " + voice + " " + text);
            System.err.println(e.getMessage());
        }
        return id;
    }

    public Item queryOperation(String postId, Context context){
        context.getLogger().log("Inside queryOperation::" + postId);
        Item outItem = null;
        GetItemSpec spec = new GetItemSpec().withPrimaryKey("id", postId);
        try{
            Table table = getTable();
            outItem = table.getItem(spec);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        LOGGER.log(Level.FINEST, "Completed queryOperation::" + postId);
        return  outItem;
    }

    private Table getTable() {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(AWS_REGION).build();
        DynamoDB dynamoDB = new DynamoDB(client);
        Table table = dynamoDB.getTable(TABLE_NAME);
        return table;
    }
}