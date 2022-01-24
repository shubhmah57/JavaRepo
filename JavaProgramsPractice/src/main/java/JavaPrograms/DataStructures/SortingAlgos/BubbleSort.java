package JavaPrograms.DataStructures.SortingAlgos;

public class BubbleSort {
    public static void main(String[] args) {
        int[]  arr = {4,2,3,1};
//        int[] arr ={1,2,5};
        int temp =0, count =0;
        boolean alreadySorted = false;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            count++;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(count);
    }
}
