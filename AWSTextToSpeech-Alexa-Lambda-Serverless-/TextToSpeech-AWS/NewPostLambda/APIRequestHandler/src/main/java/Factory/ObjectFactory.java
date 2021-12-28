package Factory;

import service.Impl.SNSServiceImpl;
import service.DataBaseService;
import service.Impl.DataBaseServiceImpl;
import service.SNSService;

public class ObjectFactory {

    public static DataBaseService getDatabaseService(){
        return new DataBaseServiceImpl();
    }

    public static SNSService getSNSService(){
        return new SNSServiceImpl();
    }

}
