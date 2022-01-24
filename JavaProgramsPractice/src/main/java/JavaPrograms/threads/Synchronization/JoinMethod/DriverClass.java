package JavaPrograms.Threads.Synchronization.JoinMethod;

import javax.swing.plaf.TableHeaderUI;

public class DriverClass {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 =new Thread(new ClassA().runnable1);
        t1.start();
        Thread t2 =  new Thread(new ClassB().runnable2);
        t1.join();
        t2.start();
        Thread t3 = new Thread(new ClassC().runnable3);
        t2.join();
        t3.start();
    }
}
