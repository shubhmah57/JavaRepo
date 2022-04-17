package JavaPrograms.DataStructures.SortingAlgos;

public class QuickSort {

    static  int[] a = {5,1,1,2,0,0};

    public static void main(String[] args) {

        int low = 0, high = a.length - 1;
        QuickSort quickSort = new QuickSort();
        quickSort.performSort(low, high);

        for(int h: a){
            System.out.print(h + " ");
        }

    }

    private void performSort(int low, int high) {
        if(low<high){
            int pivot = partition(low, high);
            performSort(low,pivot-1);
            performSort(pivot+1,high);
        }
    }

    private static int partition(int low, int high) {
        int pivot = a[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (a[i] <= pivot && i < high) i++;
            while (a[j] > pivot) j--;
            if (i < j) {
                swap(i, j);
            }
        }
        swap(low, j);
        return j;
    }

    private static void swap(int low, int high) {
        int temp = a[low];
        a[low] = a[high];
        a[high] = temp;
    }
}