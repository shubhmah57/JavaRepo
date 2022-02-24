package JavaPrograms.Threads.Concurrenvy.ProducerConsumer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DriverClass {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Integer> list = new LinkedList<>();
        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

class Producer implements Runnable{
    LinkedList<Integer> integerList = null;

    Producer(LinkedList<Integer> list){
        this.integerList = list;
    }

    @Override
    public void run() {
        System.out.println("Started Producing");
        for(int i=0; i<5;i++){
            integerList.add(i);
            if(i>=2){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify();
        }

    }
}

class Consumer implements Runnable{
    LinkedList<Integer> integerList = null;

    Consumer(LinkedList<Integer> list){
        this.integerList = list;
    }

    @Override
    public void run() {

       if(integerList.size()==0){
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
        System.out.println("Started Consuming");
        System.out.println(integerList.removeFirst());
       notify();


    }
}
