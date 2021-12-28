package JavaPrograms.DataStructures;

public class Twopointers {
    public static void main(String[] args) {
        int a[] = {1,1,2};
        System.out.println("Returned length is: " + removeDuplicates (a));

    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0, s=0;
        if(nums.length ==1){
            return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] == nums[i] && i<nums.length-1) {
                if(nums[i] != nums[i+1]){
                    j++;
                    nums[j] = nums[i + 1];
                }
            }
            else {
                j++;
            }
        }
        for (int i : nums){
            System.out.println(i);
        }
            return j;
    }
}
