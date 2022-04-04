package JavaPrograms.DataStructures.Arrays;/*package whatever //do not write package name here */

import java.io.*;

public class TrappingRainWater {
    public static void main (String[] args) {
        System.out.println("GfG!");
        int [] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        int count = 0;
        for(int i=1;i<a.length-1;i++){
            int left = a[i-1];
            int right = a[i+1];
            if(left==0 && right==0){
                continue;
            }
            else {
                if(a[i]<left && a[i]>right){
                    int min = Math.min(left,right);
                    count = count + min - a[i];
                }
            }
        }
        System.out.println(count);
    }

}