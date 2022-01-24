package JavaPrograms.DataStructures.SearchingALgos;

public class RotatedBinarySearch {

    public static void main(String[] args) {
//        int []a= {2,3,2,2,2};
        int[] a ={ 4, 5, 6, 7, 8, 9, 1, 2, 3};
        int low = 0;
        int high = a.length-1;
        int mid = (low + high)/2;
        int pivot =0;
        int value = 6;
        while(mid!=a.length-1){
            if(a[mid]>a[mid+1]){
                pivot = mid;
                break;
            }
            mid++;
        }
        while(mid>0){
            if(a[mid]>a[mid-1]){
                pivot = mid;
                break;
            }
            mid--;
        }
//        System.out.println(pivot);
        performBinarySearch(a,pivot, value);

    }

    private static void performBinarySearch(int[] a, int pivot, int value) {
        int low = 0, high = pivot;
        int mid = (low + high)/2;
        while(low<high){
            if(a[mid]<value){
                low = mid +1;
            }
            else if(a[mid]>value){
                high = mid-1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }
        low =pivot+1;  high = a.length-1;
        while(low<high){
            if(a[mid]<value){
                low = mid +1;
            }
            else if(a[mid]>value){
                high = mid-1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
    }
}
