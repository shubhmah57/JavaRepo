package JavaPrograms.DataStructures.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibb = new Fibonacci();
        System.out.println(fibb.calculate(7));
    }

    private int calculate(int i) {
        if(i<=1){
            return i;
        }

        return calculate(i-1) + calculate(i-2);
    }


}
