package JavaPrograms.DataStructures.Arrays;

//O(n) Soln using One Loop
public class FirstKMax {
    public static void main(String[] args) {
        int[] a = {24,26,28,1,45,48,94,3};
        int max = Integer.MIN_VALUE;
        int secondMax=0,thirdMax=0;
        for(int i =0;i<a.length;i++){

            if(max<a[i]){
                thirdMax=secondMax;
                secondMax = max;
                max=a[i];
            }
        }
        System.out.println(max + " " + secondMax + " "+ thirdMax);

    }
}
