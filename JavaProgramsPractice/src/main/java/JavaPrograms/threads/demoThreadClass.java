package JavaPrograms.Threads;

class car extends Thread{

    @Override
    public void run() {
        for(int i=1;i <= 10;i=i+1){
            System.out.println("Printing odd");
            System.out.println(i);
        }

    }
}

public class demoThreadClass {


    public static void main(String[] args) {
        Thread thread = new Thread(new car(), "printingVaraibles");
        thread.setDaemon(true);
        thread.start();

        for (int i =1; i <1000; i=i+2)
        {
            System.out.println("Printing com.demo.threads.Even");
            System.out.println(i);
        }
    }
}
