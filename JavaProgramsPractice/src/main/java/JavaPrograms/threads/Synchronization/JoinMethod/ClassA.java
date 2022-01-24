package JavaPrograms.Threads.Synchronization.JoinMethod;

public class ClassA {
   public Runnable runnable1 =()->{
        int i=0;

        while (i<=100){
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
            i++;
        }
    };
}
