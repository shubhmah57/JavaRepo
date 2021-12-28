package JavaPrograms.threads.Concurrenvy.ProducerConsumer;

import java.util.LinkedList;

public class PC {

    int capacity = 2;
    int value = 0;
    LinkedList<Integer> list = new LinkedList<>();

    public void produce(){
        while (true){
            try{
                synchronized (this) {
                    while (list.size() == capacity)
                        wait();
                    System.out.println("Produced:" + value);
                    list.add(value++);
                 notify();
                 Thread.sleep(1000);
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void consume(){
        while (true){
            try{
                synchronized (this){
                    while (list.size() == 0)
                        wait();
                 int val = list.removeFirst();
                 System.out.println("Consumed " + val);
                 notify();
                 Thread.sleep(10000);
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
