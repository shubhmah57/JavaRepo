package JavaPrograms.DataStructures.Arrays;

public class MinimumNumber {
    public static void main(String[] args) {
        int []a = {1,2,3,4};
        int min = Integer.MAX_VALUE;
        for(int i : a){
            if(Math.abs(i)<min){
                min = Math.abs(i);
            }
        }
        System.out.println(min);
    }
}
