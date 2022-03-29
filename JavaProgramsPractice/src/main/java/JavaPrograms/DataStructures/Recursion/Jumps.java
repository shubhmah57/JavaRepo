package JavaPrograms.DataStructures.Recursion;

public class JUmps {

    public static void main(String[] args) {

            int count=0, current=0;
         int []nums = {2,3,1,1,4};
         int destination = nums.length-1;
        while (current + nums[current] < destination) {
            int max = current;
            for (int i = current + 1; i <= destination && i <= current + nums[current]; i++)
                if (i + nums[i] > max + nums[max])
                    max = i;
            current = max;
            count++;
        }
        System.out.println(count+1);
    }

}
