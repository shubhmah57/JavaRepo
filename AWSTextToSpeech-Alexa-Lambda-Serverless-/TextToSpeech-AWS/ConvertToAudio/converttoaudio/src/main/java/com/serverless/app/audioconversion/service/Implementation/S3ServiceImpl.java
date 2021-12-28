package com.serverless.app.audioconversion.service.Implementation;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.serverless.app.audioconversion.service.S3Service;

import java.io.File;

import static com.serverless.app.audioconversion.Constants.AppConstants.BUCKET_NAME;
import static com.serverless.app.audioconversion.Constants.AppConstants.FILE_NAME;

public class S3ServiceImpl implements S3Service {
    String bucketName= "pollyfilessm9415";
    String fileName= "speech";
    String url_ending, location;
    @Override
    public String uploadTOS3(String path, String requestId) {
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard().
                    withRegion(Regions.US_EAST_1).build();
        File file = new File(path);
        fileName = "speech-" + requestId + ".mp3";
        System.out.println("The file name is:" + fileName);
        PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKET_NAME,fileName, file)
                .withCannedAcl(CannedAccessControlList.PublicRead);
        try{
            PutObjectResult putObjectResult =s3Client.putObject(putObjectRequest);
            System.out.println("The put object Result is :" + putObjectResult.toString() +
                    putObjectResult);
        }
        catch (Exception e){
            throw  e;
        }
        String region  =s3Client.getBucketLocation(bucketName);
        if(region != null){
            url_ending = ".s3.amazonaws.com/";
            location = "https://" + bucketName + url_ending + fileName;
        }
        return location;
        }
}
