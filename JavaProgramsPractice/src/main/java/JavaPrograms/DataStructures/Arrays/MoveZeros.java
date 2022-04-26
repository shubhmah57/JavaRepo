package JavaPrograms.DataStructures.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1};
        int i =0;int j=0;
        while(i < nums.length){
            if(nums[i]!=0){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
            i++;
        }
        for(int i1: nums){
            System.out.print(i1 + " ");
        }
    }
}
