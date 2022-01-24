package JavaPrograms.Threads.Concurrenvy.Counting;

public class EvenThread extends  Thread{

    int limit;
    SharedPrinter sharedPrinter;

    EvenThread(int limit, SharedPrinter sharedPrinter){
        this.limit = limit;
        this.sharedPrinter = sharedPrinter;
    }

    @Override
    public void run() {
        int evenNumber = 2;
        while (evenNumber< limit) {
            sharedPrinter.printEven(evenNumber);
            evenNumber = evenNumber + 2;
        }
    }
}
