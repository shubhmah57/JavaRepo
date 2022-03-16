package JavaPrograms.DesignPatterns.Singleton.ThreadSafeSingleTon;

public class CacheUtil {

    public volatile static CacheUtil instance;
    public static Object mutex = new Object();
    private CacheUtil(){

    }

    public static CacheUtil getInstance(){
        CacheUtil cacheUtil = instance;
        if(null==cacheUtil){
            synchronized (mutex) {
                cacheUtil = instance;
                if(cacheUtil==null)
                    cacheUtil = instance = new CacheUtil();
                }
            }
            return instance;
        }

        public String accessCache(){
        return "This is cache";
        }
}
