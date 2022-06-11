package JavaPrograms.DataStructures.Arrays.SLidingWindow;

public class MaxKSum {

    public static void main(String[] args) {
        int [] a = {1800,200,3000,400};
        int i =0, j =0;
        int k=2;
        int sum = 0, maxSum =0;
        while(j<a.length){
            sum = sum + a[j];
            if(j-i+1<k){
                j++;
            }
            if(k==j-i+1){
                maxSum = Math.max(maxSum,sum);
                sum=0;
                i++;
                j++;
            }
        }

        System.out.println(maxSum);
    }
}
