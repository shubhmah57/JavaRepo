package JavaPrograms.DataStructures.Arrays;

import java.util.HashMap;

public class SubArrayWithK {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        int nums[] = {1,2,3};
        int k =3;
        HashMap < Integer, Integer > map = new HashMap< >();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
    }

