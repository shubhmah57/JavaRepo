package JavaPrograms.DataStructures.SortingAlgos;

import JavaPrograms.OverridingIssue.Parent;

public class QuickSort {
    public static void main(String[] args) {
        int []a = {7,8,5,12,10,112};
        QuickSort quickSort = new QuickSort();
        quickSort.sortArray(a,0,a.length-1);
        for(int i: a){
            System.out.print(i +  " ");
        }
    }

    public void sortArray(int []a, int low, int high) {
        if(low<high) {
            int pivot = partition(a,low,high);
            sortArray(a,low, pivot-1);
            sortArray(a,pivot+1,high);
        }
    }

    private int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low;
        int j = high;
        while (i<j){
            while (a[i]<=pivot && i<j) i++;
            while (a[j]>pivot) j--;
            if(i<j){
                swapNumbers(a,i,j);
            }
        }
        swapNumbers(a,low,j);
        return j;
    }

    public void swapNumbers(int []a, int low, int high){
        int temp = a[low];
        a[low]=a[high];
        a[high]=temp;
    }
}
