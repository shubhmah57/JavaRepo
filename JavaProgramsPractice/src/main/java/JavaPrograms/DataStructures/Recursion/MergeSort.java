package JavaPrograms.DataStructures.Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int [] a= {45,3,11};
        MergeSort mergeSort = new MergeSort();
        mergeSort.performSort(a,0,a.length-1);
    }

    private void performSort(int[] a, int i, int j) {
        int mid = (i+j)/2;
        if(i>=j){
            return;
        }
        performSort(a,i,mid);
        System.out.println(mid+ " " + j);
        performSort(a,mid+1,j);
        merge(a,i,mid,j);
    }

    private void merge(int[] a, int i, int mid, int j) {

    }

}
