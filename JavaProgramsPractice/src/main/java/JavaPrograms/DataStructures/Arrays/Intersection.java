package JavaPrograms.DataStructures.Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection {
    public static void main(String[] args) {
        int []nums1= {1,2,2,1};
        int []nums2 = {2,2};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            ret[i] = list.get(i);
        }
        for(int i: ret){
            System.out.print(i + " ");
        }
    }
}
