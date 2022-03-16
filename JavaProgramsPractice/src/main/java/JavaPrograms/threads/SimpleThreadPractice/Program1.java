package JavaPrograms.Threads.SimpleThreadPractice;

import org.springframework.ui.context.Theme;

public class Program1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Counting(5));
        Thread t2 = new Thread(new Counting(6));
        t1.setName("First");
        t2.setName("second");
        // A new process has started u can imagine a new main method has started, it will directly go to the next statement
        // If you don't use sleep so what happens sout is printed before the
        t1.start();
        t2.start();
        Thread.sleep(100);
        System.out.println("Finished");
    }
}

class Counting implements Runnable{
    int n;
    Counting(int n){
        this.n = n;
    }
    public void printCount(){
        try {
            Thread.sleep(10000);

            for (int i = 1; i <= n; i++) {
                if (i == 2) {
                    wait();
                }
                notify();
                System.out.print(Thread.currentThread().getName() + " " + i + " ");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printCount();
    }
}
