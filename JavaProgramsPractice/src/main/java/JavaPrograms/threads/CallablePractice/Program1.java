package JavaPrograms.Threads.CallablePractice;

import java.util.concurrent.*;

public class Program1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = ()->{
            int i =10;
            while (i<=20){
                System.out.println(i);
                i++;
            }
            return i;
        };
        int i =0;
        ExecutorService es = Executors.newSingleThreadExecutor();
        while (i<10){
            System.out.println(i);
            if(i==5){
                Future<Integer> fut  = es.submit(callable);
                fut.get();
                es.shutdown();
            }
            i++;
        }
    }
}
