package JavaPrograms.DataStructures.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class MergeArrays {
    public static void main(String[] args) {
        int a[] = {10, 5, 15};
        int b[] ={2, 3, 2, 20};
        int c [] = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            c[i]= a[i];
        }
        for (int i = a.length; i < a.length + b.length; i++){
            c[i] = b[i];
        }
        HashSet<Integer> merged = new HashSet<>();
        for (int i = 0 ; i< c.length; i++){
            merged.add(c[i]);
        }
        System.out.println(merged);
    }
}
