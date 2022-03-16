package JavaPrograms.Threads.VolatileVsAtomic.ConcurrencyInPractice;

import java.util.HashMap;
import java.util.Map;

public class Program1 {
    private static int number;
    private static boolean ready;

    private static class ReaderThread extends Thread{

        Map<Integer,Integer> maps = new HashMap<>();

        @Override
        public void run() {

            while (!ready){
                Thread.yield();
                System.out.println(number);
            }

        }
    }
    public static void main(String[] args) {
        new ReaderThread().start();
        number =42;
    }
}
