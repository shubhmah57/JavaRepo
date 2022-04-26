package JavaPrograms.DataStructures.Math;

public class TrailingZeros {
    public static void main(String[] args) {
        int n =12;
        int fact=1;
        int count=0;
        for(int i=n;i>=1;i--){
            fact = fact*i;
        }
        while(fact%10==0){
            fact = fact/10;
            count++;
        }
        System.out.println(count);
    }
}
