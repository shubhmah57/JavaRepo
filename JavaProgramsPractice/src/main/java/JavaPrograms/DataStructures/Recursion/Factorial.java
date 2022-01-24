package JavaPrograms.DataStructures.Recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.calculate(3));
    }

    public int calculate(int n){
        if(n==1){
            return 1;
        }

      return n * calculate(n-1);
    }
}
