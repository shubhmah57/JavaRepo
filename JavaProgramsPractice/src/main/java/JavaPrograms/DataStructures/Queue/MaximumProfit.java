package JavaPrograms.DataStructures.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumProfit {
    public static void main(String[] args) {
        int [] seats = { 2, 3, 4, 5, 1 };
//        int[] seats = { 1, 1,1 };
        int n =4;
        int cost =0;
        PriorityQueue<Integer> seatsQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i: seats){
            seatsQueue.add(i);
        }
        while (n>0){
            int top = seatsQueue.remove();
            if(top==0)
                break;
            cost = cost + top;
            seatsQueue.add(top-1);
            n--;
        }
        System.out.println(cost);
    }
}
