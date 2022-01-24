package JavaPrograms.Threads;

class Counting {
    void printCounting(int i, String name){
        System.out.println(i + " " + name) ;
    }
}

class EvenCount implements Runnable{
    Counting countingref;
    EvenCount(Counting countingreff){
        this.countingref=countingreff;
    }
    @Override
    public void run() {

            for (int i =0;i <=10;i=i+2){
                synchronized (countingref){
                countingref.printCounting(i, Thread.currentThread().getName());
                try{
                    countingref.notify();
                    countingref.wait();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

class OddCount implements Runnable{
    Counting countingrefff;
    OddCount(Counting countingref){
        this.countingrefff=countingref;
    }
    @Override
    public void run() {
        try {
            //Thread.sleep(1000);
            for (int i = 1; i < 10; i = i + 2) {
                synchronized (countingrefff) {
                    countingrefff.printCounting(i, Thread.currentThread().getName());
                    countingrefff.notify();
                    countingrefff.wait();
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    }

public class countingUsingWaitandNotify {


    public static void main(String[] args) {
        Counting counting = new Counting();
        new Thread(new EvenCount(counting), "EvenThread").start();
        new Thread(new OddCount(counting), "OddThread").start();
    }

}
