package JavaPrograms.DataStructures.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int [] a = {2,0,2,1,1,0};
        int low=0;
        int mid =0;
        int high = a.length-1;
        while (mid<=high){
            if(a[mid]==2){
                int temp = a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
            else if(a[mid]==0){
                int temp =a[mid];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            }
            else {
                mid++;
            }
        }
        for(int p: a){
            System.out.print(p+" ");
        }
    }
}