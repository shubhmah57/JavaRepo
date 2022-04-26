package JavaPrograms.DataStructures.Arrays;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int nums[] = {3,3};
        int target = 6;

        List<Integer> numbersList = new ArrayList<>();
        for (int i : nums) {
            numbersList.add(i);
        }
        int p = 0, q = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = target - numbersList.get(i);
            int index = numbersList.indexOf(value);
            if (index >= 0 && index != i) {
                p = i;
                q = index;
                break;
            }
        }
        System.out.println(p + " " + q);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}



