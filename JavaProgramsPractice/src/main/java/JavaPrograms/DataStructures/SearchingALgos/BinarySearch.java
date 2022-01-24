package JavaPrograms.DataStructures.SearchingALgos;

public class BinarySearch {
    public static void main(String[] args) {
        int [] a = { 5,6,7,8,9,10,11};
        int value = 990;
        int low =0, high = a.length-1;
        int mid =0;
//        for(int i =0; i <a.length; i++){
//            mid= (low + high)/2;
//            if(value<a[mid]){
//                high=mid-1;
//            }
//            else if(value > a[mid]){
//                low=mid+1;
//            }
//            else {
//                System.out.println(mid);
//                break;
//            }
//        }

        while(low<high){
            mid = (low + high)/2;
            if(value>a[mid]){
                low = mid+1;
            }
            else if( value < a[mid]){
                high = mid -1;
            }
            else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
    }
}
