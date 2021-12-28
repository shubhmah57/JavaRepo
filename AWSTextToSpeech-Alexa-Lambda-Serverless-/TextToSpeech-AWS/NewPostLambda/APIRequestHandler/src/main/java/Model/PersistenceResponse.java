package Model;

import java.util.Date;

public class PersistenceResponse {

    private String id;

    private String voice;

    private String text;

    private Date date;

    private Integer status;

    public PersistenceResponse(String id, String voice, String text, Date date, Integer status) {
        this.id = id;
        this.voice = voice;
        this.text = text;
        this.date = date;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getVoice() {
        return voice;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public Integer getStatus() {
        return status;
    }
}
