package JavaPrograms.DataStructures.Arrays;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;

        System.out.println(threeSumClosest(nums, target));
    }

    public static  int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int value=0;
        int min = Integer.MAX_VALUE;
        for(int i =0; i<nums.length;i++){

            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }

            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(k<nums.length-2 && nums[k] == nums[k+1]){
                    continue;
                }
                int sum = nums[i] + nums[j] + nums[k];
                int diff = sum-target;
               // System.out.print(diff + " ");
                if(Math.abs(diff)<min){
                    min = Math.abs(diff);
                    value = sum;
                }
                if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return value;
    }
}

