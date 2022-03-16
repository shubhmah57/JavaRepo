package JavaPrograms.DataStructures.Recursion;

import java.time.Instant;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibb = new Fibonacci();
        System.out.println(Instant.now());
        System.out.println(fibb.calculate(50));
        System.out.println(Instant.now());
    }

    private int calculate(int i) {
        if(i<=1){
            return i;
        }
        return calculate(i-1) + calculate(i-2);
    }


}
