package helper;

public class StringHelper {
    private static  StringHelper stringHelper = null;

    private StringHelper(){

    }

    private static StringHelper getInstance(){
        if(null== stringHelper){
            stringHelper = new StringHelper();
        }
        return stringHelper;
    }

    public static Boolean isStringNotEmptyNotNull(String s){
        if(null!=s && s.length()!=0){
            return true;
        }
        return false;
    }
}
