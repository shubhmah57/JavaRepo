package com.serverless.app.audioconversion.Factory;

import com.serverless.app.audioconversion.service.DynamoDBService;
import com.serverless.app.audioconversion.service.Implementation.DynamoDBServiceImpl;
import com.serverless.app.audioconversion.service.Implementation.PollyServiceImpl;
import com.serverless.app.audioconversion.service.Implementation.S3ServiceImpl;
import com.serverless.app.audioconversion.service.PollyService;
import com.serverless.app.audioconversion.service.S3Service;

public class ObjectFactory {

    public static DynamoDBService getDynamoDbService() {
        return new DynamoDBServiceImpl();
    }

    public static PollyService getPollyService() {
        return new PollyServiceImpl();
    }
    public static S3Service getS3Service() {
        return new S3ServiceImpl();
    }

}
