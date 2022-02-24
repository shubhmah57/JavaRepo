package JavaPrograms;

import java.util.Arrays;

public class PassByReference {
    public static void main(String[] args) {
        PassByReference byReference = new PassByReference();
        int []a = {199999,3,4,552,90090};
        byReference.testFunction(a);
        for(int j:a){
            System.out.println(j);
        }
    }

    private void testFunction(int[] a) {
        Arrays.sort(a);
    }
}
