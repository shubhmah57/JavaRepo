package JavaPrograms.DataStructures.DynamicProgramming;

public class Factorial {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.calculate(5));
    }

    private int calculate(int i) {
        if(i==0){
            return 1;
        }

        return i*calculate(i-1);
    }

}
