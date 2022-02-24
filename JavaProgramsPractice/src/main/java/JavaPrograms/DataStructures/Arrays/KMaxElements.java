package JavaPrograms.DataStructures.Arrays;

import org.springframework.core.PriorityOrdered;

import java.util.PriorityQueue;

public class KMaxElements {
    public static void main(String[] args) {
        int[] a = {11, 3, 2, 1, 15, 5, 4,
                45, 88, 96, 50, 45};
        int k =4;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i < k;i++){
            pq.add(a[i]);
        }
        //System.out.println(pq);

        for(int i=k;i<a.length;i++){
            if(pq.peek()>a[i]){
                continue;
            }

            else {
                pq.poll();
                pq.add(a[i]);
            }
        }

        System.out.println(pq);
    }
}
