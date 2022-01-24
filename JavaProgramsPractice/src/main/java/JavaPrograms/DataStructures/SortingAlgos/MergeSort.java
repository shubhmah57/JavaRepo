package JavaPrograms.DataStructures.SortingAlgos;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {5,6,7,8};
        int[] b = { 2,10,11,12,13};
        int [] c = new int [a.length + b.length];
        int i =0, j=0, k =0;
        while(i<a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
            }
            else {
                c[k]= b[j];
                j++;
            }
            k++;
        }
        while (i< a.length){
            c[k] = a[i];
            k++; i++;
        }
        while (j < b.length){
            c[k] = b[j];
            j++; k++;
        }
        for(int p: c){
            System.out.println(p);
        }

    }
}
