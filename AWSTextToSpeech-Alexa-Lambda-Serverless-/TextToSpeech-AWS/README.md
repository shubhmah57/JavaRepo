# TextToSpeech-AWS
AWS Services Used:
AWS Lambda 
AWS Polly
S3
Dynamo DB
SNS

AWS JAVA SDK

This Repository contains the code for AWS Lambda functions for Text to speech conversion.

The Project contains two lambda functions NewPostLambda & ConvertToAudioLambda Function which communicates using SNS Topic. 

AWS API Gateway is used as a trigger point for NewPostLambda Function, SNS(Simple Notification Service)topic is used for trigger point of the second Lambda Function.

--Lambda Function# 1---
1. NewPostLambda

It contains the code for persisting the input voice and Text and transeferring the record id to the next lambda function.

--Lambda Function# 2---

2. ConvertToAudioLambda

It contains the code for interacting with the AWS Polly Service for text conversion.
Also it saves the converted mp3 file to S3 bucket.