package JavaPrograms.DataStructures.Arrays.SLidingWindow.FixedSizeWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        int k = 3;
        int []a = {-5, 1, 2, -6, -9,-2};
        LinkedList<Integer> values = new LinkedList<>();
        List<Integer> finalValues = new ArrayList<>();
        int i=0, j=0;
        int n = a.length;
        while(j<n){
             if(a[j]<0){
                 values.add(a[j]);
             }
              if(j-i+1==k){

                 if(values.size()==0){
                     finalValues.add(0);
                 }
                 else{
                     finalValues.add(values.getFirst());
                     if(values.getFirst()==a[i]){
                         values.removeFirst();
                     }
                 }

                 i++;
             }
             j++;
        }
        finalValues.forEach(System.out::println);
    }


}
