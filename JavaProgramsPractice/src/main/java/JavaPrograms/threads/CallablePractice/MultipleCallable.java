package JavaPrograms.Threads.CallablePractice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallable {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<String>> callableList = Arrays.asList(
                ()->{return "task1";},
                ()->{return "task2";}
        );

        ExecutorService es = Executors.newFixedThreadPool(10);
        es.invokeAll(callableList).stream().forEach(x-> {
            try {
                System.out.println(x.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
