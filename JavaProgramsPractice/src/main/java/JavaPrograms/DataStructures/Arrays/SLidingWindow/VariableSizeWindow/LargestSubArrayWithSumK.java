package JavaPrograms.DataStructures.Arrays.SLidingWindow.VariableSizeWindow;

public class LargestSubArrayWithSumK {
    public static void main(String[] args) {
        int [] a = {4,1,1,1,2,3,5,1,1,1,1,1};
        int i=0,j=0, k =5, max =0, sum =0;
        while(i<a.length){
            sum = sum + a[i];
            if(sum == k){
                max = Math.max(max,i-j+1);
                i++;
            }
            else if(sum > k){
                while(sum > k){
                    sum  = sum - a[j];
                    j++;
                }
                i++;
            }
            else if(sum <k){
                i++;
            }
        }
        System.out.println("The max window:" + max);
    }
}
