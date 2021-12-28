package Model;

public class SearchResponse {
    private String url;
    private String id;
    private String voice;
    private String text;
    private String status;
    private int httpStatusCode;

    public SearchResponse(){

    }

    public SearchResponse(String url, String id, String voice, String text, String status, int httpStatusCode) {
        this.url = url;
        this.id = id;
        this.voice = voice;
        this.text = text;
        this.status = status;
        this.httpStatusCode = httpStatusCode;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
