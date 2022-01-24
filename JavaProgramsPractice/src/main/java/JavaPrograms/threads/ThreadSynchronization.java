package JavaPrograms.Threads;

class Printer{
    public void printDocuments(int no, String docName){
        for(int i=0 ; i < no; i++){
            System.out.println("Printing DOcs" + docName);
        }
    }
}

class MyThread extends Thread{

    Printer pref;
    MyThread(Printer preff){
        pref=preff;
    }

    @Override
    public void run() {
        pref.printDocuments(10, "ABC.pdf");
    }
}

class YourThread extends Thread{

    Printer pref;
    YourThread(Printer prefff){
        pref = prefff;
    }

    @Override
    public void run() {
        pref.printDocuments(10, "XYZ.pdf");
    }
}

public class ThreadSynchronization {

    public static void main(String[] args) {
        try {
            Printer printer = new Printer();
            Thread thread = new Thread(new MyThread(printer));
            thread.start();
            thread.join();
            Thread thread1 = new Thread(new YourThread(printer));
            thread1.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
