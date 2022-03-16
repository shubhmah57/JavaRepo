package JavaPrograms.MockingPractice;

import java.util.Date;

public class MockPrivateMethodExample {
    public String getDetails(){
        return "Mock Private Method example" + iAmPrivate();
    }

    private String iAmPrivate() {
        return new Date().toString();
    }
}
