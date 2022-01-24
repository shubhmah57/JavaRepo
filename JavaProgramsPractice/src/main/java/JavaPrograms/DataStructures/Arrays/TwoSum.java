package JavaPrograms.DataStructures.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int nums [] = {2, 7, 3 ,6, 9};
        int target = 9;
        for (int i = 0 ; i < nums.length ; i++){
            Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
            int complement = target - nums[i];
            if(maps.containsKey(complement)){
                System.out.println(new int[]{maps.get(complement), i});
            }
            maps.put(nums[i], i);
        }
        throw new IllegalArgumentException("No RomanToInteger");
    }
}

