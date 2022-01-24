package JavaPrograms.DataStructures.Recursion;

import java.util.Arrays;

public class Spelling {
    public static void main(String[] args) {
        Spelling spelling = new Spelling();
        String s[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        spelling.printSpelling(432,s);
    }

    private void printSpelling(int i, String[] s) {
        if(i==0){
            return;
        }

        printSpelling(i/10,s);
        System.out.println(s[i%10]);
    }
}
