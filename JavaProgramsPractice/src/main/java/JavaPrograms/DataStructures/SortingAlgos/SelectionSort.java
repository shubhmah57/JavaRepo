package JavaPrograms.DataStructures.SortingAlgos;

public class SelectionSort {
    public static void main(String[] args) {
        int []p = {6,2,41,321,56,33};
        int n = p.length-1;
        int temp=0;
        for(int i = 0 ; i < n; i++ ){
            for (int j = 1; j<n; j++){
                 if(p[i] > p[j]){
                     temp = p[i];
                     p[i]= p[j];
                     p[j]=temp;
                 }
            }
        }
    }
}
