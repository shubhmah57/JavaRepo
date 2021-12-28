package JavaPrograms.threads;

public class YieildPractice {
    public static void main(String[] args) {
        YieildPractice  yieildPractice = new YieildPractice();
        yieildPractice.start();
    }

    public void start(){
        Thread t1 = new Thread(new Producer());
        Thread t2 = new Thread(new Consumer());
        t1.start();
        t2.start();
    }
}


class Producer implements Runnable{
    @Override
    public void run() {
        for (int i =0; i < 5; i ++)
        System.out.println("Produced" + i + "Item");
        Thread.yield();
    }
}


class Consumer implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ; i < 5; i ++)
        System.out.println("Consumed" + i + "Item");
        Thread.yield();
    }
}