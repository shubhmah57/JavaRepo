package JavaPrograms.DesignPatterns.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Util
{
    // public instance initialized when loading the class
    public static Util instance = new Util();

    private Util()
    {

    }
}

enum LoggerUtil{

    INSTANCE;
    public static void addLogger(){
        System.out.println("LOGGER ADDING");
    }
}


public class Singleton {


    public static void main(String[] args) {
        Util util = Util.instance;
        Util util1 = null;
            Constructor[] constructors = Util.class.getDeclaredConstructors();
            for(Constructor constructor: constructors){
                constructor.setAccessible(true);
                try {
                    util1= (Util) constructor.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        System.out.println(util.hashCode());
        System.out.println(util1.hashCode());
    }

}
