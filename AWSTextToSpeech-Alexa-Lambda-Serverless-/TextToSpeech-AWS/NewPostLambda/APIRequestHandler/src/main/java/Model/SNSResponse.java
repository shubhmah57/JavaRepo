package Model;

import java.util.Date;

public class SNSResponse {

    String messageId;

    Integer statusCode;

    Date date;

    public SNSResponse(String messageId, Integer statusCode, Date date) {
        this.messageId = messageId;
        this.statusCode = statusCode;
        this.date = date;
    }

    public String getMessageId() {
        return messageId;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public Date getDate() {
        return date;
    }
}
