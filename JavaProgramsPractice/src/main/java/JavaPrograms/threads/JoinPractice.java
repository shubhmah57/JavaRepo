package JavaPrograms.threads;

public class JoinPractice {
    public static void main(String[] args) {
        JoinPractice joinPracticen = new JoinPractice();
        joinPracticen.start();
    }

    public void start(){
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i = 0 ; i < 10000; i ++)
                    System.out.println("Produced" + i + "Items");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i <10000; i++)
                System.out.println("Consumed" + i + "Items");
            }
        });

        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        t2.start();
    }
}
