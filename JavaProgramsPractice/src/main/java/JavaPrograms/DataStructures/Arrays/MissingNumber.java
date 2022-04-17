package JavaPrograms.DataStructures.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int []nums = {0,1,3,4,5,7};
        int i=0, j = nums.length-1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == mid) {
                i = mid + 1;
            } else {
                j = mid-1;
            }
        }
        System.out.println(i + " " + j);
//        int sum = nums.length;
//        for (int i = 0; i < nums.length; i++)
//            sum += i - nums[i];
//        System.out.println(sum);
    }
}
