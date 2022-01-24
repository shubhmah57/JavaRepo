package JavaPrograms.Threads.Concurrenvy.ProducerConsumer;

public class DriverClass {
    public static void main(String[] args) {

        PC pc = new PC();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                     pc.produce();
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.consume();
            }
        });

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
