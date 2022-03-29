package JavaPrograms.DesignPatterns.Singleton.ThreadSafeSingleTon;

import JavaPrograms.DesignPatterns.Singleton.Singleton;

public class DriverClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println(CacheUtil.getInstance().accessCache().hashCode());
//        System.out.println(Singleton.);
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println(CacheUtil.getInstance().accessCache().hashCode());
    }
}