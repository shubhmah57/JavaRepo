package JavaPrograms.DataStructures.Arrays;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
            int nums[] = {0,1,1,1,1,1,2,3,3};
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        System.out.println(i);
        for (int k=0; k<i;k++){
            System.out.print(nums[k] + " ");
        }
    }
        }
