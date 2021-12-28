package JavaPrograms.threads;

class  A12 implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        for (int i=1; i <=20; i=i+2){
            System.out.println(i + "odd");
        }
    }
}

class A13 implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        for(int i =0;i<20;i=i+2) {
            System.out.println(i + "com.demo.threads.Even");
        }
    }
}

public class demoThread  {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new A12());
        Thread thread2 = new Thread(new A13());
        thread1.start();
        thread2.start();
    }
}
