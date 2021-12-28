package JavaPrograms.DataStructures;

import java.util.Arrays;

public class DuplicatesRemoval {
    public static void main(String[] args) {
        int nums []= {12, 34, 12, 534, 123, 12, 33};
        /*int nums []= {1,2,3,4,5};*/
        Arrays.sort(nums);
            int j =0, i =1;
            for(i =1; i < nums.length; i++){
                if(nums[j] != nums[i]){
                    j++;
                    nums[j] = nums[i];
                }
            }
        for (int i1 : nums){
            System.out.println(i1);
        }
        System.out.println("length :" +  ++j);
    }
}
