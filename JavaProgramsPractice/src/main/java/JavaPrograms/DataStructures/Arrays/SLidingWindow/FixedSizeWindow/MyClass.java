package JavaPrograms.DataStructures.Arrays.SLidingWindow.FixedSizeWindow;

import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      int n =9;
      int [] a = {1,3,-1,-3,5,3,6,7};
      int j=0,i=0,k=3,max=0;
        int secondMax =0, maxIndex=0;
        ;

      List<Integer> values = new ArrayList<>();
      while(j<a.length){
          if(max<a[j]){
              secondMax=max;
              max = a[j];
              maxIndex = j;
          }
          else{
              if(secondMax<a[j]){
                  secondMax=a[j];
              }
          }
          
          if(j-i+1==k){
              values.add(max);
              i++;
              if(maxIndex<i){
                   max = secondMax;
                   secondMax =0;
              }
          }
          j++;
      }
      values.forEach(System.out::println);
    }
}