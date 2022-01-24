package JavaPrograms.Threads.CallablePractice;

import java.time.Instant;
import java.util.concurrent.*;

public class FactorialCalculator {
    int n =10;
    public static void main(String[] args) throws InterruptedException {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        factorialCalculator.calculate();
    }
    int i =9;
    Callable<Long> callable = () ->{
        long result = 1;
        System.out.println("Inside the Asynch Flow!..." + Thread.currentThread().getName());
        try{
            Thread.sleep(60000);
            while (n != 0) {
                result = n * result;
                n = n - 1;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    };

    public void calculate() throws InterruptedException {
        /**
         * Executor called,
         * new way of thread calling
         * instead of traditional run method.
         * */
        ExecutorService es = Executors.newSingleThreadExecutor();

        /**
         * Here callable is the instanc e/name of the method which needs to be called
         * via thread and its returning a value which
         * traditional run method doesn't provides.
         */
        Future<Long> future = es.submit(callable);
        System.out.println("Reading from somewhere....");
       // Thread.sleep(100000);
        try{
            System.out.println(Instant.now() + Thread.currentThread().getName());
            System.out.println(future.get());
            System.out.println(Instant.now() + Thread.currentThread().getName());
            es.shutdown();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
