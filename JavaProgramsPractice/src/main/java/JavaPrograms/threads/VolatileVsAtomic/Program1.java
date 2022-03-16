package JavaPrograms.Threads.VolatileVsAtomic;

public class Program1 {
    private static int counter =0;
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            int localCounter = counter;
            System.out.println(counter);
            while (localCounter<10){
                    System.out.println("Inside" + Thread.currentThread().getName());
                    localCounter = counter;

            }
        });

        Thread t2 = new Thread(()->{
            int localCounter = counter;
            while (localCounter<10){
                counter = ++localCounter;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.setName("firstTHread");
        t2.setName("SecondThread");
        t1.start();
        t2.start();

    }
}
