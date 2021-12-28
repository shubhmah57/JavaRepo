package service.Impl;

import Model.SNSResponse;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import service.SNSService;

import java.util.Date;

import static constants.RequestHandlerConstants.TOPIC_ARN;

public class SNSServiceImpl implements SNSService {
    @Override
    public SNSResponse pubTopic(String requestId) {

        AmazonSNS amazonSNSClient = AmazonSNSClient.builder()
                .withRegion(Regions.US_EAST_1)
                .build();
        PublishRequest publishRequest =
                new PublishRequest(TOPIC_ARN, requestId);

        PublishResult result = amazonSNSClient.publish(publishRequest);
        SNSResponse snsResponse = prepareSNSResponse(result);
        System.out.println(result.getMessageId() + " Message sent. Status was " +
                result.getSdkHttpMetadata().getHttpStatusCode());
         return  snsResponse;
    }

    private SNSResponse prepareSNSResponse(PublishResult result) {
        SNSResponse snsResponse = new SNSResponse(result.getMessageId(),
                result.getSdkHttpMetadata().getHttpStatusCode(), new Date());
        return  snsResponse;
    }
}
