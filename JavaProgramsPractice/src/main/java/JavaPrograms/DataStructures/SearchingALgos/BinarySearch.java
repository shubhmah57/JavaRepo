package JavaPrograms.DataStructures.SearchingALgos;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {3,2,1};
        int target =1;
        int low=0;
        int high=a.length-1;
        int index=-1;
        if(a[low]<a[high]){
            index = increasingBinarySearch(a, low, high, target);
        }
        else {
            index = decreasingBinarySearch(a,low, high, target);
        }
        System.out.println(index);
    }

    private static int decreasingBinarySearch(int[] a, int low, int high, int target) {
        int index =0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(a[mid]==target){
                index=mid;
            }

            if(a[mid]>target){
                low=mid+1;
            }
            else {
                high= mid-1;
            }
        }
        return index;
    }

    public static int increasingBinarySearch(int[] a, int low, int high, int target){
        int index =0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(a[mid]==target){
                index=mid;
            }

            if(a[mid]<target){
                low=mid+1;
            }
            else {
                high= mid-1;
            }
        }
        return index;
    }
}
