package JavaPrograms.DataStructures.Recursion;

public class Exponent {
    public static void main(String[] args) {
        Exponent exponent = new Exponent();
        System.out.println(exponent.calculateExponent(3,8));
        System.out.println("--------FAST EXPONENT-------");
        System.out.println(exponent.fastExponent(2,3));
    }

    private int fastExponent(int i, int j) {

        if(j==0){
            return 1;
        }

        int value= fastExponent(i,j/2);

        if(j%2==0){
            return value*value;
        }
        else{
            return i*value*value;
        }
    }

    private int calculateExponent(int n, int i) {
        if(i==0){
            return 1;
        }

        return n* calculateExponent(n,(i-1));
    }
}
