package JavaPrograms.DataStructures.Arrays.SLidingWindow.FixedSizeWindow;

public class MaxWindowK {
    public static void main(String args[]) {
      int []a = {4,1,1,1,2,3,5};
      int i=0,j=0,max=0,sum=0, k=5;
      while(j<a.length){
          sum = sum + a[j];
          if(sum<k){
              j++;
          }
          else if(sum==k){
              max = Math.max(j-i+1, max);
              j++;
          }
          else if(sum>k){
              while(sum>k){
                  sum = sum-a[i];
                  i++;
              }
              j++;
          }
      }
      System.out.println(max);
    }
}