package JavaPrograms.Threads;

class Even implements Runnable{
    @Override
    public void run() {
        for (int i =0;i <=20; i=i+2){
            System.out.println(i);
            Thread.yield();
        }
    }
}

class  Odd implements Runnable{
    @Override
    public void run() {
        try {
            for(int i=1; i<20; i=i+2){
                System.out.println(i);
                wait();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class countingUsingThread {

    public static void main(String[] args) {
        Thread thread = new Thread(new Even());
        Thread thread1 = new Thread(new Odd());
        thread.start();
        thread1.start();
    }
}
