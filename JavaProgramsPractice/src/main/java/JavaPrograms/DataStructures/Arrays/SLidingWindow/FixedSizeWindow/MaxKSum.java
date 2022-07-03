package JavaPrograms.DataStructures.Arrays.SLidingWindow.FixedSizeWindow;

public class MaxKSum {

    public static void main(String[] args) {
        int [] a = {800,0,-3000,-400};
        int i =0, j =0;
        int k=2;
        int sum = 0, maxSum =Integer.MIN_VALUE;
        while(j<a.length){
            sum = sum + a[j];
            if(k==j-i+1){
                maxSum = Math.max(maxSum,sum);
                sum= sum-a[i];
                i++;
            }
            j++;
        }

        System.out.println(maxSum);
    }
}
