package JavaPrograms.threads.CallablePractice;

import java.util.concurrent.*;

public class FactorialCalculator {
    int n =10;
    public static void main(String[] args) {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        factorialCalculator.calculate();
    }
    int i =9;
    Callable<Long> callable = () ->{
        long result = 1;
        try{
            while (n != 0) {
                result = n * result;
                n = n - 1;
                Thread.sleep(100);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    };

    public void calculate(){
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
        try{
            System.out.println(future.get());
            es.shutdown();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
