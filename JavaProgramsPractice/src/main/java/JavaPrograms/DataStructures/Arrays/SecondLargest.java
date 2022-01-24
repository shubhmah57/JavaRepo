package JavaPrograms.DataStructures.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {6,7,9,8,3,2,4};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i : arr){
            if(i > largest){
                largest = i;
            }
        }
        System.out.println(largest);
        for(int i = 0 ; i <arr.length; i++){
            if(arr[i] != largest){
                if(arr[i] > secondLargest){
                    secondLargest = arr[i];
                }
            }
        }
        System.out.println("Second Largest:" + secondLargest);

    }
}
