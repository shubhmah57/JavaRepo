package JavaPrograms.DataStructures.Arrays.SLidingWindow.VariableSizeWindow;

import java.util.HashMap;

public class SubArrayWithK {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        int nums[] = {1,2,3,7,32,12};
        int k =32;
        HashMap < Integer, Integer > map = new HashMap< >();
        map.put(0, 1);
        int i =0, j =0;
        /**
         * But the below soln doesn't solves the array
         * elements with negative
         */
        while(i<nums.length){
            sum = sum + nums[i];
            if(sum==k){
                count = count +1;
                i++;
            }
            if(sum>k){
                while (sum>k){
                    sum = sum - nums[j];
                    j++;
                }
                if(sum==k){
                    count++;
                }
                i++;
            }
            if(sum<k){
                i++;
            }
        }
        System.out.println(count);
        /*for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);*/
    }
    }

