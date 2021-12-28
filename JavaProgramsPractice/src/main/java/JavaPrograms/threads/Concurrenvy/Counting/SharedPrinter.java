package JavaPrograms.threads.Concurrenvy.Counting;

public class SharedPrinter {

    boolean isOddPrinted;

    synchronized void printOdd(int number){
        while (isOddPrinted) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            System.out.println("Number is :" + number);
            System.out.println(Thread.currentThread().getName());
            isOddPrinted = true;
            /*try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }*/
            notify();
    }

    synchronized void printEven(int evenNumber){
        while (!isOddPrinted) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            System.out.println("Number is :" + evenNumber);
            System.out.println(Thread.currentThread().getName());
            isOddPrinted = false;
           /* try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }*/
            notify();
    }
}
