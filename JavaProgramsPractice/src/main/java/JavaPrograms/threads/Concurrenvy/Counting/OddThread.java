package JavaPrograms.Threads.Concurrenvy.Counting;

public class OddThread extends  Thread {

    int limit;
    SharedPrinter sharedPrinter;

    OddThread(int limit, SharedPrinter sharedPrinter){
        this.limit = limit;
        this.sharedPrinter = sharedPrinter;
    }

    @Override
    public void  run(){
        int oddNumber =1;
        while(oddNumber<limit){
            sharedPrinter.printOdd(oddNumber);
            oddNumber = oddNumber + 2;
        }
    }
}

