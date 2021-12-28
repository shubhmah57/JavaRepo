package JavaPrograms.threads.Concurrenvy;

public class MethodsOfThread {
    public static void main(String[] args) {
        MethodsOfThread methodsOfThread = new MethodsOfThread();
        methodsOfThread.check();
    }

    Runnable runnable  = ()->{
      for(int i = 0; i < 10; i ++){
          System.out.println(i);
      }
    };

    public void check(){
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}


