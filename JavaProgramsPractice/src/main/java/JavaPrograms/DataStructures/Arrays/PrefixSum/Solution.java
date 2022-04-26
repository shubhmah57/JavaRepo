package JavaPrograms.DataStructures.Arrays.PrefixSum;

class Solution {
    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int left =1;
        int [] res = new int [nums.length];
        for(int i =0;i<nums.length;i++){
            res[i]=nums[i]*left;
            left = res[i];
        }
        for(int i =0;i <nums.length;i++){
            if(max<res[i] && res[i]>nums[i]){
                max=res[i];
            }
            else if(res[i]<nums[i]){
                max=nums[i];
            }
        }
        for(int i:res){
            System.out.print(i+" ");
        }
        return max;
    }

    public static void main(String[] args) {
        int []a = {0,2};
        System.out.println(maxProduct(a));
    }
}