package JavaPrograms.DataStructures.Arrays.SLidingWindow;

public class MaxKSumNaive {

    public static void main(String[] args) {
        int a[] = {2,3,5,2,9,7,19};
        int k =3;
        int maxSum = 0;
        for(int i =0 ; i <a.length-k+1;i++){
            int sum =0;
            for(int j=i; j<i+k;j++){
                sum = sum + a[j];
            }
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}
