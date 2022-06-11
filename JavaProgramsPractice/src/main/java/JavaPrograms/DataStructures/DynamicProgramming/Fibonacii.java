package JavaPrograms.DataStructures.DynamicProgramming;



import java.time.Instant;

public class Fibonacii {
    long [] fib = new long[1000];
    public static void main(String[] args) {
        Fibonacii fibonacci = new Fibonacii();
        System.out.println(Instant.now());
        System.out.println(fibonacci.calculateNumber(50));
        System.out.println(Instant.now());
    }

    public  long calculateNumber(int n){
        if(n<=1){
            return n;
        }
        if(fib[n]!=0){
            return fib[n];
        }
        fib[n]= calculateNumber(n-1)+ calculateNumber(n-2);
        return fib[n];
    }
}
