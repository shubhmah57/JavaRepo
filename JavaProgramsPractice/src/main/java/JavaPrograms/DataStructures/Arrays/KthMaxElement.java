package JavaPrograms.DataStructures.Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthMaxElement {
    public static void main(String[] args) {
        //max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int [] a= {45,1,21,321,31,675};
        int k =4;
        for(int i =0; i <k;i++){
            pq.add(a[i]);
        }
        System.out.println(pq.peek());

        for(int j =k; j<a.length;j++){
            if(a[j]<pq.peek()){
                pq.poll();
                pq.add(a[j]);
            }
        }
        System.out.println(pq.peek());
    }
}
