package JavaPrograms.Threads.Concurrenvy.Counting;

public class DriverClass {
    public static void main(String[] args) {

        SharedPrinter sharedPrinter = new SharedPrinter();
        OddThread oddThread = new OddThread(20, sharedPrinter);
        oddThread.setName("OddThread");
        EvenThread evenThread = new EvenThread(20, sharedPrinter);
        evenThread.setName("EvenThread");
        oddThread.start();
        evenThread.start();
    }
}
