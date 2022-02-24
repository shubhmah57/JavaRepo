package JavaPrograms.DataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ProductArray {
    public static void main(String[] args) {
        int [] a = {-1,1,0,-3,3};
        List<Integer> arr = new ArrayList<>();
//        for(int i =0;i <a.length;i++){
//            int mult =1;
//            for(int j=0; j<a.length;j++){
//                if(i==j)
//                    continue;
//                mult = mult*a[j];
//            }
//            arr.add(mult);
//        }
//        System.out.println(arr);
        for(int i: a){
            arr.add(i);
        }
        for(int j: a){
            if(arr.contains(j)){

            }
        }
    }
}
