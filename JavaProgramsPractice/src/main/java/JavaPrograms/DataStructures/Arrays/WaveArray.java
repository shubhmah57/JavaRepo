package JavaPrograms.DataStructures.Arrays;

import JavaPrograms.DataStructures.SortingAlgos.QuickSort;

public class WaveArray {
    public static void main(String[] args) {
        int [] a = {5,31,1,55,11,9,7};
        QuickSort quickSort = new QuickSort();
        quickSort.sortArray(a,0,a.length-1);
        for(int i: a){
            System.out.print(i + " ");
        }


    }
}
