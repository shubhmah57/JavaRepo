package JavaPrograms.DataStructures.SearchingALgos;

public class BitonicPoint {
    public static void main(String[] args) {
        int []a = {1,2,3};
        int low = 0;
        int high = a.length-1;
        int index=0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((mid==0 || a[mid]>a[mid-1]) && (mid +1 == a.length ||a[mid]>a[mid+1])){
                index = mid;
                break;
            }
            if(a[mid+1]>a[mid]){
                low = mid+1;
            }
            else {
                high= mid-1;
            }
        }
        System.out.println(index);
    }
}
