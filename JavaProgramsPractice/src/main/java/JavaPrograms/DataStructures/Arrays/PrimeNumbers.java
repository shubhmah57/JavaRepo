package JavaPrograms.DataStructures.Arrays;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PrimeNumbers {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {30,15,10,30,6};
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i<a.length;i++){
            int mult=1;
            for (int j=0; j<a.length;j++){
                if(i==j)
                    continue;
                if(checkPrime(a[j])){
                   mult = mult*a[j];
                }
            }
            arr.add(mult);
        }
        System.out.println(arr);
    }

    private static boolean checkPrime(int i) {
        if(i<=2){
            return true;
        }
        boolean flag=false;
        for(int p =2; p<i;p++){
            if(i%p==0){
                flag = false;
                break;
            }
            else {
                flag = true;
            }
        }
        return flag;
    }
}
