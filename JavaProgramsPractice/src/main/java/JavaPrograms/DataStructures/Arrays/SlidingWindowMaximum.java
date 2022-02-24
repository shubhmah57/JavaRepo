package JavaPrograms.DataStructures.Arrays;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        List<Integer> finalList = new ArrayList<>();
        for(int i =0; i<=nums.length-k;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i; j<i+k ;j++){
                if(nums[j]>max){
                    max = nums[j];
                }
            }
            finalList.add(max);
        }
        Integer[] array =finalList.toArray(new Integer[finalList.size()]);
        for(int i: array){
            System.out.println(i);
        }
         //fast method
        System.out.println("-------");
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> maxList = new ArrayList<>();
        int i =0;
        for(; i<k;i++)
            pq.add(nums[i]);
        maxList.add(pq.peek());
        pq.remove(nums[0]);

        for(;i<nums.length;i++){
            pq.add(nums[i]);
            maxList.add(pq.peek());
            pq.remove(nums[i-k+1]);
        }
        maxList.stream().forEach(x-> System.out.print(x + " "));
        }

    }
