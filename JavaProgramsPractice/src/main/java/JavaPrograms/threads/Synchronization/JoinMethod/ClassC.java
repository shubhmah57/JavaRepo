package JavaPrograms.Threads.Synchronization.JoinMethod;

public class ClassC {
    Runnable runnable3 = ()->{
        int i=20;
        while(i<=30)
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
            i++;
        }
    };
}
