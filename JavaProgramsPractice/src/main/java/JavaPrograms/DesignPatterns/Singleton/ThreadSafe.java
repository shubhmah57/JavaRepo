package JavaPrograms.DesignPatterns.Singleton;

import JavaPrograms.inheritancePractice.TypeVisibility.package3.C;

class CacheUtil{

    public static volatile CacheUtil cacheUtil;

    private static Object mutex = new Object();

    private CacheUtil(){

    }

    public static CacheUtil getInstance(){
        CacheUtil result = cacheUtil;
        if(result==null){
            synchronized (mutex){
                result = cacheUtil;
                if(result == null){
                    cacheUtil = new CacheUtil();
                }
            }
        }
        return result;
    }
}

public class ThreadSafe {
    public static void main(String[] args) {

    }
}
