package JavaPrograms.Threads.Synchronization.JoinMethod;

public class ClassB {

    Runnable runnable2 = ()->{

        int i=11;
        while (i<=20){
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
            i++;
        }
    };
}
