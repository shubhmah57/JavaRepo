package JavaPrograms.DataStructures.Arrays;

public class SquareDIfference {
    public static void main(String[] args) {
        int []a = {5, 8, 9, -4, -3};
        int sum = 0;
        for(int i=0; i<a.length-1;i++){
            int firstNumber = a[i];
            int secondNumber = a[i+1];
            int difference = firstNumber-secondNumber;
            int square = difference*difference;
            sum = sum + square;
        }
        System.out.println(sum);
    }
}
