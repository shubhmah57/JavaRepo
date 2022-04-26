package JavaPrograms.DataStructures.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueWorking {
    public static void main(String[] args) {
        int [] a = {7,10,4,20,15};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i =0;i<a.length;i++){
            priorityQueue.add(a[i]);
        }

//        for(int i =1; i <=3;i++){
//            priorityQueue.poll();
//        }
//        System.out.println(priorityQueue.peek());
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
