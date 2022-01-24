package JavaPrograms.DataStructures.Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PairSum {

    public static void main(String[] args) {
        int[] arr = {1,5,7,-1,5,3,3};
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i: arr){
            if(countMap.containsKey(i)){
                countMap.put(i, countMap.get(i)+1);
            }
            else {
                countMap.put(i, 1);
            }
        }
        int sum =6, count =0;
        for(int i =0 ; i < arr.length; i++){
            if(countMap.get(sum-arr[i])!=null){
                count = count + countMap.get(sum-arr[i]);
            }
            if(sum-arr[i]==arr[i]){
                count--;
            }
        }

        System.out.println(count/2);
    }
}
