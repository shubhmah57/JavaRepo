package JavaPrograms.DataStructures.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int []a = {10, 20, 10, 5, 15};
        int [] b = new int[a.length];

        for(int i=0; i<a.length;i++){
            int sum =0;
            for(int j=0; j<=i;j++){
                sum = sum + a[j];
            }
            b[i] = sum ;
        }
        for (int g: b){
            System.out.println(g);
        }
    }
}
